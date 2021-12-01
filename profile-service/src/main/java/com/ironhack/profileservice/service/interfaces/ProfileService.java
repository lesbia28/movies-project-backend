package com.ironhack.profileservice.service.interfaces;

import com.ironhack.profileservice.model.Profile;

import java.util.List;

public interface ProfileService {
    List<Profile> getAllProfile();
    Profile addProfile(Profile profile);
    Profile getProfile(String username);
    void deleteProfile(String username);
    Profile updateProfile(String username, Profile profile);
}
