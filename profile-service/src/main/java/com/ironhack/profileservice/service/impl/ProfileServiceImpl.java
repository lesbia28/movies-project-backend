package com.ironhack.profileservice.service.impl;

import com.ironhack.profileservice.model.Profile;
import com.ironhack.profileservice.repository.ProfileRepository;
import com.ironhack.profileservice.service.interfaces.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileServiceImpl implements ProfileService {
    @Autowired
    ProfileRepository profileRepository;


    public List<Profile> getAllProfile() {
        return profileRepository.findAll() ;
    }


    public Profile addProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    public Profile getProfile(String username) {
        Optional<Profile> optionalProfile = profileRepository.findById(username);
        if(optionalProfile.isPresent()){
            return optionalProfile.get();
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The profile with username "+username+" is not found");
        }
    }

    public void deleteProfile(String username) {
        Optional<Profile> optionalProfile = profileRepository.findById(username);
        if(optionalProfile.isPresent()){
            profileRepository.deleteById(username);
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The profile with username "+username+" is not found");
        }
    }

    @Override
    public Profile updateProfile(String username, Profile profile) {
        Optional<Profile> optionalProfile = profileRepository.findById(username);
        if(optionalProfile.isPresent()){
            Profile newProfile = optionalProfile.get();
            newProfile.setPassword(profile.getPassword());
            newProfile.setEmail(profile.getEmail());
            newProfile.setImage(profile.getImage());
            newProfile.setBiography(profile.getBiography());
            profileRepository.save(newProfile);
            return newProfile;
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The profile with username "+username+" is not found");
        }

    }
}
