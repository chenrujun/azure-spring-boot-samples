import com.microsoft.azure.credentials.AzureCliCredentials;
import com.nimbusds.jwt.JWT;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.JWTParser;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.KafkaException;
import org.apache.kafka.common.security.auth.AuthenticateCallbackHandler;
import org.apache.kafka.common.security.oauthbearer.OAuthBearerToken;
import org.apache.kafka.common.security.oauthbearer.OAuthBearerTokenCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.AppConfigurationEntry;
import java.io.IOException;
import java.net.URI;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class CustomAuthenticateCallbackHandler implements AuthenticateCallbackHandler {

    final static AzureCliCredentials CREDENTIALS;

    static {
        try {
            CREDENTIALS = AzureCliCredentials.create();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // final static MSICredentials CREDENTIALS = new MSICredentials();
    // Use AppServiceMSICredentials instead for App Service deployment.
    // final static AppServiceMSICredentials CREDENTIALS = new AppServiceMSICredentials(AzureEnvironment.AZURE);

    private String sbUri;

    @Override
    public void configure(Map<String, ?> configs, String mechanism, List<AppConfigurationEntry> jaasConfigEntries) {
        String bootstrapServer = Arrays.asList(configs.get(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG)).get(0).toString();
        bootstrapServer = bootstrapServer.replaceAll("\\[|\\]", "");
        URI uri = URI.create("https://" + bootstrapServer);
        this.sbUri = uri.getScheme() + "://" + uri.getHost();
    }

    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        for (Callback callback: callbacks) {
            if (callback instanceof OAuthBearerTokenCallback) {
                try {
                    OAuthBearerToken token = getOAuthBearerToken();
                    OAuthBearerTokenCallback oauthCallback = (OAuthBearerTokenCallback) callback;
                    oauthCallback.token(token);
                } catch (InterruptedException | ExecutionException | TimeoutException | ParseException e) {
                    e.printStackTrace();
                }
            } else {
                throw new UnsupportedCallbackException(callback);
            }
        }
    }

    OAuthBearerToken getOAuthBearerToken() throws InterruptedException, ExecutionException, TimeoutException, IOException, ParseException
    {
        String accessToken = CREDENTIALS.getToken(sbUri);
        JWT jwt = JWTParser.parse(accessToken);
        JWTClaimsSet claims = jwt.getJWTClaimsSet();

        return new OAuthBearerTokenImp(accessToken, claims.getExpirationTime());
    }

    public void close() throws KafkaException {
        // NOOP
    }
}