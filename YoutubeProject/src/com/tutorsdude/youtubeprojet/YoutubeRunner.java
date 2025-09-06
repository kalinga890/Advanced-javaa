package com.tutorsdude.youtubeprojet;

import com.tutorsdude.youtubeprojet.dto.VideoDto;
import com.tutorsdude.youtubeprojet.exception.VideoCommentsException;
import com.tutorsdude.youtubeprojet.exception.VideoLikesException;
import com.tutorsdude.youtubeprojet.exception.VideoQualityException;
import com.tutorsdude.youtubeprojet.service.YoutubeServiceImp;

import java.util.List;
import java.util.Scanner;

public class YoutubeRunner {

    public static void main(String[] args) {

        YoutubeServiceImp youtubeService = new YoutubeServiceImp();
        Scanner sc = new Scanner(System.in);

        // Print menu continuously
        while (true) {
            System.out.println("===== Youtube Project Menu =====");
            System.out.println("1. Create VideoDto");
            System.out.println("2. Show list of VideoDto");
            System.out.println("3. Find by title name");
            System.out.println("4. Update the music name by video title");
            System.out.println("5. Delete video by title");
            System.out.println("6. Update the likes count by video title");
            System.out.println("0. Exit");

            System.out.print("Choose number: ");

            int choose = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choose) {
                case 1: // Create
                    System.out.print("Enter videoTitle: ");
                    String videoTitle = sc.nextLine();

                    System.out.print("Enter musicName: ");
                    String musicName = sc.nextLine();

                    System.out.print("Enter number of likes: ");
                    int noLikes = sc.nextInt();

                    System.out.print("Enter videoQuality: ");
                    int videoQuality = sc.nextInt();

                    System.out.print("Enter number of comments: ");
                    int noComments = sc.nextInt();

                    System.out.print("Enter number of shares: ");
                    int noShare = sc.nextInt();

                    System.out.print("Enter number of views: ");
                    int noViewes = sc.nextInt();

                    VideoDto videoDto = new VideoDto(videoTitle, musicName, noLikes, videoQuality, noComments, noShare, noViewes);

                    try {
                        youtubeService.validateAndSave(videoDto);
                        System.out.println(" Video saved successfully.");
                    } catch (VideoCommentsException | VideoQualityException | VideoLikesException e) {
                        System.err.println(" Error: " + e.getMessage());
                    }
                    break;

                case 2: // Read all
                    List<VideoDto> result = youtubeService.readAll();
                    System.out.println(result);
                    break;

                case 3: // Search by title
                    System.out.print("Enter video title to search: ");
                    String searchTitle = sc.nextLine();
                    List<VideoDto> searchResult = youtubeService.searchByVideoTitle(searchTitle);
                    System.out.println(searchResult);
                    break;

                case 4: // Update music name
                    System.out.print("Enter video title to update: ");
                    String updateTitle = sc.nextLine();
                    System.out.print("Enter new music name: ");
                    String newMusicName = sc.nextLine();
                    boolean updated = youtubeService.update(newMusicName, updateTitle);
                    System.out.println(updated ? " Updated successfully." : " Update failed.");
                    break;

                case 5: // Delete
                    System.out.print("Enter video title to delete: ");
                    String deleteTitle = sc.nextLine();
                    boolean deleted = youtubeService.delete(deleteTitle);
                    System.out.println(deleted ? " Deleted successfully." : " Delete failed.");
                    break;

                case 6: // Like
                    System.out.print("Enter video title to like: ");
                    String likeTitle = sc.nextLine();
                    boolean liked = youtubeService.likeVideo(likeTitle);
                    System.out.println(liked ? " Like added successfully." : "Failed to like video.");
                    break;

                case 0: // Exit
                    System.out.println("Exiting program... ");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
