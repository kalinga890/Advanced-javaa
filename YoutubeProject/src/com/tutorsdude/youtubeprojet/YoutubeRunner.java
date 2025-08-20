package com.tutorsdude.youtubeprojet;

import com.tutorsdude.youtubeprojet.dto.VideoDto;
import com.tutorsdude.youtubeprojet.exception.VideoCommentsException;
import com.tutorsdude.youtubeprojet.exception.VideoLikesException;
import com.tutorsdude.youtubeprojet.exception.VideoQualityException;
import com.tutorsdude.youtubeprojet.service.YoutubeService;

import java.util.List;
import java.util.Scanner;

public class YoutubeRunner {

    public static void main(String[] args) {

        YoutubeService youtubeService = new YoutubeService();
        Scanner sc = new Scanner(System.in);

        // Print menu first
        while (true) {
            System.out.println("1. Create VideoDto");
            System.out.println("show list of videoDto");
            System.out.print("Choose number: ");

            int choose = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choose) {
                case 1:
                    System.out.print("Enter video musicName: ");
                    String musicName = sc.nextLine();

                    System.out.print("Enter number of comments: ");
                    int noOfComments = sc.nextInt();

                    System.out.print("Enter number of likes: ");
                    int noOfLikes = sc.nextInt();

                    System.out.print("Enter number of shares: ");
                    int noOfShare = sc.nextInt();

                    System.out.print("Enter number of views: ");
                    int noOfViews = sc.nextInt();

                    System.out.print("Enter video quality: ");
                    int quality = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter video title: ");
                    String title = sc.nextLine();


                    VideoDto dto = new VideoDto(musicName, noOfComments, noOfLikes, noOfShare, noOfViews, quality, title);

                    try {
                        youtubeService.validateAndSave(dto);

                    } catch (VideoCommentsException | VideoQualityException | VideoLikesException e) {
                        System.err.println("Caught custom exception: " + e.getMessage());
                    }

                    System.out.println("Program continues after handling exception...");

                case 2:

                  List<VideoDto>  result = youtubeService.ReadAll();
                    System.out.println(result);

            }





        }
    }
}

