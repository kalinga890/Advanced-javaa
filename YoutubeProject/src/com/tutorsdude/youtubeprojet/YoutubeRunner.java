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
            System.out.println("2.show list of videoDto");
            System.out.println("3.find by title name");
            System.out.println("4.update the music name");
            System.out.println("5.delete the value using video title");
            System.out.println("6. update the likes count using video title");
            System.out.print("Choose number: ");

            int choose = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choose) {
                case 1:
                    System.out.print("Enter  videoTitle: ");
                    String videoTitle = sc.nextLine();

                    System.out.print("Enter the musicName: ");
                    String musicName = sc.nextLine();

                    System.out.print("Enter number of noLikes: ");
                    int noLikes = sc.nextInt();

                    System.out.print("Enter videoQuality: ");
                    int videoQuality = sc.nextInt();

                    System.out.print("Enter number of noComments: ");
                    int noComments = sc.nextInt();

                    System.out.print("Enter noShare: ");
                    int noShare = sc.nextInt();


                    System.out.print("Enter noViewes: ");
                    int noViewes = sc.nextInt();


                    VideoDto videoDto = new VideoDto(videoTitle, musicName, noLikes, videoQuality, noComments, noShare, noViewes);

                    try {
                        youtubeService.validateAndSave(videoDto);

                    } catch (VideoCommentsException | VideoQualityException | VideoLikesException e) {
                        System.err.println("Caught custom exception: " + e.getMessage());
                    }

                    System.out.println("Program continues after handling exception...");

                    break;


                case 2:

                    List<VideoDto> result = youtubeService.readAll();
                    System.out.println(result);

                    break;

                case 3:

                    List<VideoDto> vlogBali = youtubeService.searchByVideoTitle("Travel Vlog Bali");

                    System.out.println(vlogBali);

                    break;

                case 4:

                    boolean updated = youtubeService.update("Pump Up Track", "Travel Vlog Bali");

                    System.out.println(updated);

                    break;

                case 5:

                    boolean deleted = youtubeService.delete("melodic");

                    System.out.println(deleted);

                    break;


                case 6:

                     String videoTitle1 = "love song";

                    boolean count = youtubeService.likeVideo(videoTitle1);

                    System.out.println(count);

                    break;


                default:
                    System.out.println("Invalid choice. Please try again.");


            }






        }
    }
}

