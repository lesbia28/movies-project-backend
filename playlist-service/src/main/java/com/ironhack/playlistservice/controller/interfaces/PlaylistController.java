package com.ironhack.playlistservice.controller.interfaces;

import com.ironhack.playlistservice.model.Playlist;

import java.util.List;
// getById, delete, update
public interface PlaylistController {
    List <Playlist> getAllPlaylist();
    Playlist AddPlaylist(Playlist playlist);
    Playlist getPlaylist(String id);
    void deletePlaylist(String id);
    Playlist updatePlaylist(String id, Playlist playlist);
}
