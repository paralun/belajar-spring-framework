package com.paralun.app.filter;

import com.paralun.app.constant.Constant;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

@Component
public class RouteValidator {

    public Predicate<ServerHttpRequest> isSecure = request -> Constant.AUTH_WHITELIST.stream()
            .noneMatch(uri -> request.getURI().getPath().contains(uri));

}
