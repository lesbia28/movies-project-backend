package com.ironhack.profileservice.controller.interfaces;

import com.ironhack.profileservice.model.Profile;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//getById = getByName, update, delete

@RestController
public interface ProfileController  {
    List<Profile> getAllProfile();
    Profile addProfile(Profile profile);
    Profile getProfile(String username);
    void deleteProfile(String username);
    Profile updateProfile(String username, Profile profile);

}
