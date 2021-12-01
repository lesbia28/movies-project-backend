package com.ironhack.edge.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("profile-service")
public interface ProfileClient {



}
