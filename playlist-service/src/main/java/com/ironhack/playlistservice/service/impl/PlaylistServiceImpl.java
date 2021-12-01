package com.ironhack.playlistservice.service.impl;

import com.ironhack.playlistservice.model.Playlist;
import com.ironhack.playlistservice.repository.PlaylistRepository;
import com.ironhack.playlistservice.service.interfaces.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
 public class PlaylistServiceImpl implements PlaylistService {

     @Autowired
     PlaylistRepository playlistRepository;



    public List<Playlist> getAllPlaylist() {
          return playlistRepository.findAll();
      }


    public Playlist addPlaylist(Playlist playlist) {
        return playlistRepository.save(playlist);
    }

    @Override
    public Playlist getPlaylist(String id) {
        Optional<Playlist> optionalPlaylist = playlistRepository.findById(id);
        if(optionalPlaylist.isPresent()){
            return optionalPlaylist.get();
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The playlist with id "+id+" is not found");
        }
    }

    @Override
    public void deletePlaylist(String id) {
        Optional<Playlist> optionalPlaylist = playlistRepository.findById(id);
        if(optionalPlaylist.isPresent()){
            playlistRepository.deleteById(id);
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The playlist with id "+id+" is not found");
        }
    }

    // Works with id in the body or without
    @Override
    public Playlist updatePlaylist(String id, Playlist playlist) {
        Optional<Playlist> optionalPlaylist = playlistRepository.findById(id);
        if(optionalPlaylist.isPresent()){
            Playlist newPlaylist = optionalPlaylist.get();
            newPlaylist.setName(playlist.getName());
            newPlaylist.setAuthor(playlist.getAuthor());
            newPlaylist.setMovieList(playlist.getMovieList());
            playlistRepository.save(newPlaylist);
            return newPlaylist;
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The playlist with id "+id+" is not found");
        }
    }


}

