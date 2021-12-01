package com.ironhack.playlistservice.service.interfaces;

import com.ironhack.playlistservice.model.Playlist;

import java.util.List;

public interface PlaylistService {
    List<Playlist> getAllPlaylist();
    Playlist addPlaylist(Playlist playlist);
    Playlist getPlaylist(String id);
    void deletePlaylist(String id);
    Playlist updatePlaylist(String id, Playlist playlist);

}
