package com.ironhack.playlistservice.controller.impl;

import com.ironhack.playlistservice.controller.interfaces.PlaylistController;
import com.ironhack.playlistservice.model.Playlist;
import com.ironhack.playlistservice.service.interfaces.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlaylistControllerImpl implements PlaylistController {

    @Autowired
    PlaylistService playlistService;

    @GetMapping("/playlists")
    @ResponseStatus(HttpStatus.OK)
    public List<Playlist> getAllPlaylist() {
        return playlistService.getAllPlaylist();
    }

    @PostMapping("/playlists")
    @ResponseStatus(HttpStatus.CREATED)
    public Playlist AddPlaylist(@RequestBody Playlist playlist) {
        return playlistService.addPlaylist(playlist);
    }

    @GetMapping("playlists/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Playlist getPlaylist(@PathVariable String id) {
        return playlistService.getPlaylist(id);
    }

    @DeleteMapping("playlists/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePlaylist(@PathVariable String id) {
        playlistService.deletePlaylist(id);
    }

    @PutMapping("playlists/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Playlist updatePlaylist(@PathVariable String id, @RequestBody Playlist playlist) {
        return playlistService.updatePlaylist(id, playlist);
    }


}



