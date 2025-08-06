package com.tutorsdude.youtubeprojet;

import com.tutorsdude.youtubeprojet.dto.VideoDto;

import com.tutorsdude.youtubeprojet.service.YoutubeService;

import java.util.List;

public class YoutubeRunner {


    public static void main(String[] args) {



        VideoDto video1 = new VideoDto("Bangari Music", 100, 900, 800, 240, 480, "Classical song");
        VideoDto video2 = new VideoDto("Melodic Raag", 150, 850, 750, 360, 640, "Indian classical");
        VideoDto video3 = new VideoDto("Sunset Symphony", 200, 780, 650, 480, 720, "Instrumental music");
        VideoDto video4 = new VideoDto("Morning Vibes", 80, 920, 450, 240, 480, "Folk song");
        VideoDto video5 = new VideoDto("River Dance", 120, 650, 300, 360, 640, "Traditional dance");
        VideoDto video6 = new VideoDto("Moonlight Serenade", 300, 400, 250, 720, 1280, "Jazz music");
        VideoDto video7 = new VideoDto("Guitar Strings", 180, 560, 180, 480, 854, "Acoustic guitar");
        VideoDto video8 = new VideoDto("Piano Dreams", 250, 320, 420, 720, 1280, "Piano solo");
        VideoDto video9 = new VideoDto("Flute Melody", 90, 780, 350, 240, 480, "Wind instrument");
        VideoDto video10 = new VideoDto("Tabla Beats", 160, 450, 280, 360, 640, "Percussion music");




        YoutubeService youtubeService = new YoutubeService();

        youtubeService.validateAndSave(video2);
        youtubeService.validateAndSave(video1);
        youtubeService.validateAndSave(video3);
        youtubeService.validateAndSave(video4);
        youtubeService.validateAndSave(video5);
        youtubeService.validateAndSave(video6);
        youtubeService.validateAndSave(video7);
        youtubeService.validateAndSave(video8);
        youtubeService.validateAndSave(video9);
        youtubeService.validateAndSave(video10);



        List<VideoDto> result = youtubeService.searchByVideoTitle("music");
        System.out.println("Search Result: " + result);


        List<VideoDto> read= youtubeService.ReadAll();
        System.out.println(read);


















    }








}
