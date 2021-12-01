package com.ironhack.profileservice.controller.impl;

import com.ironhack.profileservice.controller.interfaces.ProfileController;
import com.ironhack.profileservice.model.Profile;
import com.ironhack.profileservice.service.interfaces.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileControllerImpl  implements ProfileController {
    @Autowired
    ProfileService profileService;

    @GetMapping("/profiles")
    @ResponseStatus(HttpStatus.OK)
    public List<Profile> getAllProfile() {
        return profileService.getAllProfile();
    }

    @PostMapping("/profiles")
    @ResponseStatus(HttpStatus.CREATED)
    public Profile addProfile(@RequestBody Profile profile) {
        return profileService.addProfile(profile) ;
    }

    @GetMapping("/profiles/{username}")
    @ResponseStatus(HttpStatus.OK)
    public Profile getProfile(@PathVariable String username) {
        return profileService.getProfile(username);
    }

    @DeleteMapping("profiles/{username}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProfile(@PathVariable String username) {
        profileService.deleteProfile(username);
    }

    @PutMapping("profiles/{username}")
    @ResponseStatus(HttpStatus.OK)
    public Profile updateProfile(@PathVariable String username, @RequestBody Profile profile) {
        return profileService.updateProfile(username,profile);
    }
}
