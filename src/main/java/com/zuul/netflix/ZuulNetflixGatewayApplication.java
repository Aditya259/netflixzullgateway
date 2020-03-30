package com.zuul.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.zuul.netflix.filter.ErrorFilter;
import com.zuul.netflix.filter.PostFilter;
import com.zuul.netflix.filter.PreFilter;
import com.zuul.netflix.filter.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class ZuulNetflixGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulNetflixGatewayApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
