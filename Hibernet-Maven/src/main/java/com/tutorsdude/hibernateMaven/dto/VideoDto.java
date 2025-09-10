package com.tutorsdude.hibernateMaven.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

@Entity
@Table(name = "video_dto")
public class VideoDto {

    @Id
    private String video_title;
    private String music_name;
    private int no_likes;
    private int video_quality;
    private int no_comments;
    private int no_share;
    private int no_viewes;



    }

