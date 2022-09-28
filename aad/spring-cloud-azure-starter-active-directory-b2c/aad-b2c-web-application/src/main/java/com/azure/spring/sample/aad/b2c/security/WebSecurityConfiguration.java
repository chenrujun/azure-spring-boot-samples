// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.sample.aad.b2c.security;

import com.azure.spring.cloud.autoconfigure.aadb2c.AadB2cOidcLoginConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import static org.springframework.security.config.Customizer.withDefaults;

@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final AadB2cOidcLoginConfigurer configurer;

    public WebSecurityConfiguration(AadB2cOidcLoginConfigurer configurer) {
        this.configurer = configurer;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off

        http
                .formLogin(withDefaults())
                .apply(configurer)
                    .and()
                .authorizeRequests()
                    .antMatchers("/login", "/forgot-password/**", "/reset-password/**","/oAuth2")
                        .permitAll()
                    .anyRequest()
                        .authenticated()
                    .and()
        ;
        // @formatter:on
    }
}
