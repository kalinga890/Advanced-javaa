package com.tutorsdude.youtubeprojet.dto;

public class VideoDto {

    private String title;
    private String musicName;
    private int noOfLikes;
    private int quality;
    private int noOfComments;
    private int noOfShare;
    private int noOfViews;

    public VideoDto(String musicName, int noOfComments, int noOfLikes, int noOfShare, int noOfViews, int quality, String title) {
        this.musicName = musicName;
        this.noOfComments = noOfComments;
        this.noOfLikes = noOfLikes;
        this.noOfShare = noOfShare;
        this.noOfViews = noOfViews;
        this.quality = quality;
        this.title = title;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public int getNoOfComments() {
        return noOfComments;
    }

    public void setNoOfComments(int noOfComments) {
        this.noOfComments = noOfComments;
    }

    public int getNoOfLikes() {
        return noOfLikes;
    }

    public void setNoOfLikes(int noOfLikes) {
        this.noOfLikes = noOfLikes;
    }

    public int getNoOfShare() {
        return noOfShare;
    }

    public void setNoOfShare(int noOfShare) {
        this.noOfShare = noOfShare;
    }

    public int getNoOfViews() {
        return noOfViews;
    }

    public void setNoOfViews(int noOfViews) {
        this.noOfViews = noOfViews;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "VideoDto{" +
                "musicName='" + musicName + '\'' +
                ", title='" + title + '\'' +
                ", noOfLikes=" + noOfLikes +
                ", quality=" + quality +
                ", noOfComments=" + noOfComments +
                ", noOfShare=" + noOfShare +
                ", noOfViews=" + noOfViews +
                '}';
    }
}
