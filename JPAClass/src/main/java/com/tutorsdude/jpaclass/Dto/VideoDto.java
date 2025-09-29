package com.tutorsdude.jpaclass.Dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "video_dto")
public class VideoDto {

    @Id
    private int id;

    private String video_title;
    private String music_name;
    private int no_likes;
    private int video_quality;
    private int no_comments;
    private int no_share;
    private int no_viewes;
}
