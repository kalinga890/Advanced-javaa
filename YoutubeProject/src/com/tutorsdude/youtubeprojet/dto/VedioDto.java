package com.tutorsdude.youtubeprojet.dto;

public class VedioDto {

    private String title;
    private String musicname;
    private int nooflikes;
    private int quality;
    private int noofcomments;

    public VedioDto(String musicname, int noofcomments, int nooflikes, int quality, String title) {
        this.musicname = musicname;
        this.noofcomments = noofcomments;
        this.nooflikes = nooflikes;
        this.quality = quality;
        this.title = title;
    }

    public String getMusicname() {
        return musicname;
    }

    public void setMusicname(String musicname) {
        this.musicname = musicname;
    }

    public int getNoofcomments() {
        return noofcomments;
    }

    public void setNoofcomments(int noofcomments) {
        this.noofcomments = noofcomments;
    }

    public int likes(){
        return nooflikes++;
    }



    public int getNooflikes() {
        return nooflikes;
    }

    public void setNooflikes(int nooflikes) {
        this.nooflikes = nooflikes;
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

}
