package com.ironhack.playlistservice.repository;

import com.ironhack.playlistservice.model.Playlist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistRepository extends MongoRepository<Playlist,String> {
}
