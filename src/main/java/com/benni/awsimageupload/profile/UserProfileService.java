package com.benni.awsimageupload.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Service
public class UserProfileService {

    private final UserProfileDataAccessService userProfileDataAccessService;

    @Autowired
    public UserProfileService ( UserProfileDataAccessService userProfileDataAccessService){
        this.userProfileDataAccessService = userProfileDataAccessService;
    }

    List<UserProfile> getUserProfiles(){
        return userProfileDataAccessService.getUserProfiles();
    }

    public void uploadUserProfileImage(UUID userProfileId, MultipartFile file){
        // 1 check if image is not empty
        // 2 if file is an image
        // 3 user exists in our db
            // grab metadata from file if any
        // 4 store the image in s3 and update db with s3 image link
    }

    public byte[] downloadUserProfileImage(UUID userProfileId) {
        return null;
    }
}
