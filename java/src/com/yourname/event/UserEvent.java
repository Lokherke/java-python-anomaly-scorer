package com.yourname.event;

public class UserEvent {

    private int userId;
    private String eventType;
    private long timestamp;
    private String ipAddress;

    // Default constructor (useful for frameworks like Jackson, Hibernate, etc.)
    public UserEvent() {
    }

    // Optional: Parameterized constructor for convenience
    public UserEvent(int userId, String eventType, long timestamp, String ipAddress) {
        this.userId = userId;
        this.eventType = eventType;
        this.timestamp = timestamp;
        this.ipAddress = ipAddress;
    }

    // Getters
    public int getUserId() {
        return userId;
    }

    public String getEventType() {
        return eventType;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    // Setters (THIS WAS MISSING — this is likely causing your issue)
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

}