package com.example.demo;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class UserAuthManager implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        PreAuthenticatedAuthenticationToken token = (PreAuthenticatedAuthenticationToken)(authentication);
        System.out.println("In userAuth -----");
        System.out.println(token.getPrincipal());
        return new PreAuthenticatedAuthenticationToken(token.getPrincipal(), StringUtils.EMPTY);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
