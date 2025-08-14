package com.nandy.springMaster.service;

import com.nandy.springMaster.exception.OurException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class AwsS3Service {

    //    private final String bucketName = "phegon-hotel-images";
    @Value("${aws.s3.access.key}")
    private String awsS3AccessKey;

    @Value("${aws.s3.secret.key}")
    private String awsS3SecretKey;

    public String saveImageToS3(MultipartFile photo) {
    try {
        // Fake logic – simulate "upload"
        String fakeFileName = photo.getOriginalFilename();
        System.out.println("Simulating upload of: " + fakeFileName);

        // Return dummy S3 URL
        return "https://dummy-bucket.s3.amazonaws.com/" + fakeFileName;

    } catch (Exception e) {
        e.printStackTrace();
        throw new OurException("Dummy S3 Upload Failed: " + e.getMessage());
    }
}

}
