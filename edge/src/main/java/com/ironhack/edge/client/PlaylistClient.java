package com.ironhack.edge.client;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("playlist-service")
public interface PlaylistClient {
}
