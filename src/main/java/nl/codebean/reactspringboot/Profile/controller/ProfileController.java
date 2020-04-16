package nl.codebean.reactspringboot.Profile.controller;

import nl.codebean.reactspringboot.Profile.model.Profile;
import nl.codebean.reactspringboot.Profile.services.ProfileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @RequestMapping("/profiles")
    public List<Profile> getAllprofiles(){
        return profileService.getAllProfiles();
    }

    @RequestMapping("/profiles{id}")
    public Profile getProfile(@PathVariable Long id){
        return profileService.getProfile(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/profiles")
    public void addProfile(@RequestBody Profile profile){
        profileService.addProfile(profile);

    }
    @RequestMapping(method = RequestMethod.PUT, value = "/profiles/{id}")
    public void updateProfile(@RequestBody Profile profile, @PathVariable String id){
        profileService.updateProfile(id, profile);

    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/profiles/{id}")
    public void deleteProfile(@PathVariable String id){
        profileService.deleteProfile(id);
    }
}

