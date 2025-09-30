package com.tutorsdude.jpaclass.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "video_dto")
@NamedQuery(name = "readQuery",   query = "select dto from VideoDto dto")
@NamedQuery(name = "updateQuery", query = "update VideoDto dto set dto.music_name  = :mname where dto.video_title = :ntitle")
@NamedQuery(name = "deleteQuery", query = "delete  from VideoDto dto where dto.video_title = :ntitle")
@NamedQuery(name = "findByTitle", query = "select dto from VideoDto dto where dto.video_title = :ntitle")
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
