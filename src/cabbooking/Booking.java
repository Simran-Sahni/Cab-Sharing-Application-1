/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabbooking;

/**
 *
 * @author Amogh saxena
 */
public class Booking {
    private String referenceNumber;
    private String userName;
    private int driverId;
    private String pickUpLocation;
    private String dropLocation;
    private String tripStartTime;
    private String tripEndTime;
    private int isTripEnded;
    private int rating;

    public Booking(String referenceNumber, String userName, int driverId, String pickUpLocation, String dropLocation, String tripStartTime, String tripEndTime, int isTripEnded, int rating) {
        this.referenceNumber = referenceNumber;
        this.userName = userName;
        this.driverId = driverId;
        this.pickUpLocation = pickUpLocation;
        this.dropLocation = dropLocation;
        this.tripStartTime = tripStartTime;
        this.tripEndTime = tripEndTime;
        this.isTripEnded = isTripEnded;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "{" +
            " referenceNumber='" + getReferenceNumber() + "'" +
            ", userName='" + getUserName() + "'" +
            ", driverId='" + getDriverId() + "'" +
            ", pickUpLocation='" + getPickUpLocation() + "'" +
            ", dropLocation='" + getDropLocation() + "'" +
            ", tripStartTime='" + getTripStartTime() + "'" +
            ", tripEndTime='" + getTripEndTime() + "'" +
            ", isTripEnded='" + getIsTripEnded() + "'" +
            ", rating='" + getRating() + "'" +
            "}";
    }

    public String getReferenceNumber() {
        return this.referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getDriverId() {
        return this.driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getPickUpLocation() {
        return this.pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public String getDropLocation() {
        return this.dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public String getTripStartTime() {
        return this.tripStartTime;
    }

    public void setTripStartTime(String tripStartTime) {
        this.tripStartTime = tripStartTime;
    }

    public String getTripEndTime() {
        return this.tripEndTime;
    }

    public void setTripEndTime(String tripEndTime) {
        this.tripEndTime = tripEndTime;
    }

    public int getIsTripEnded() {
        return this.isTripEnded;
    }

    public void setIsTripEnded(int isTripEnded) {
        this.isTripEnded = isTripEnded;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    
   
    
}
