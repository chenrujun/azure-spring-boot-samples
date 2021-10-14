package com.spring.sample.b2c.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * controller.
 */
@Controller
public class SampleController {

  @Autowired
  private WebClient webClient;

  @GetMapping(value = { "/resourceServerForScope1" })
  @ResponseBody
  public String getResourceServerForScope1(
          @RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient signUpOrSignIn) {
    return canVisitUri(signUpOrSignIn, "http://localhost:8081/helloForScope1");
  }

  @GetMapping(value = { "/resourceServerForScope2" })
  @ResponseBody
  public String getResourceServerForScope2(
          @RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient signUpOrSignIn) {
    return canVisitUri(signUpOrSignIn, "http://localhost:8081/helloForScope2");
  }

  /**
   * Check whether uri is accessible by provided client.
   *
   * @param client Authorized client.
   * @param uri The request uri.
   * @return "Get http response successfully." or "Get http response failed."
   */
  private String canVisitUri(OAuth2AuthorizedClient client, String uri) {
    if (null == client) {
      return "Get response failed.";
    }
    String body = this.webClient
            .get()
            .uri(uri)
            .attributes(ServletOAuth2AuthorizedClientExchangeFilterFunction
                    .oauth2AuthorizedClient(client))
            .retrieve()
            .bodyToMono(String.class)
            .block();
    return "Get response from " + uri + (null != body ? " successfully" : " failed\n");
  }
}
