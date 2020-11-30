package com.springAdvanced.Securityexecise.config;


import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.logout.LogoutFilter;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
class CustomSpringSecurityFilterChain extends FilterChainProxy {

    CustomSpringSecurityFilterChain() {
        super(filterChains());
    }

    private static List<SecurityFilterChain> filterChains() {
        final List<SecurityFilterChain> filterChain = new ArrayList<>();

        final LogoutFilter customLogoutFilter =
                new LogoutFilter(new CustomLogoutSuccessHandler(), new SecurityContextLogoutHandler());
        customLogoutFilter.setFilterProcessesUrl("/customlogout");
        filterChain.add(new DefaultSecurityFilterChain(
                new AntPathRequestMatcher("/customlogout**"), customLogoutFilter));
        return filterChain;
    }

}
