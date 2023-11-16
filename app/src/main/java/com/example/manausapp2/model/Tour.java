package com.example.manausapp2.model;

public class Tour {
    int imgTour;
    String TourName;
    String TourDescription;

    public Tour(int imgTour, String tourName, String tourDescription) {
        this.imgTour = imgTour;
        TourName = tourName;
        TourDescription = tourDescription;
    }

    public int getImgTour() {
        return imgTour;
    }

    public String getTourName() {
        return TourName;
    }

    public String getFourDescription(){
        return TourDescription;
    }
}
