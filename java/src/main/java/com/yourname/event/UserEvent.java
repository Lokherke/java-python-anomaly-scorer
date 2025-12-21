package com.yourname.event;

public class UserEvent {

    private int userId;
    private String eventType;
    private long timestamp;
    private String ipAddress;

    // Optional: Parameterized constructor for convenience
    public UserEvent(int userId, String eventType, long timestamp, String ipAddress) {
        this.userId = userId;
        this.eventType = eventType;
        this.timestamp = timestamp;
        this.ipAddress = ipAddress;
    }

    // Getters
    public int getUserId() {return userId;}
    public String getEventType() {return eventType;}
    public long getTimestamp() {return timestamp;}
    public String getIpAddress() {return ipAddress;}
     

     // Setters
    public void setUserId(int userId) {this.userId = userId;}
    public void setEventType(String eventType) {this.eventType = eventType;}        
    public void setTimestamp(long timestamp) {this.timestamp = timestamp;}
    public void setIpAddress(String ipAddress) {this.ipAddress = ipAddress;}

    // Convert to JSON string
    public String toJson() {
        return String.format(
            "{\"user_id\": %d, \"event_type\": \"%s\", \"timestamp\": %d, \"ip_address\": \"%s\"}",
            userId, eventType, timestamp, ipAddress
        );
    }

    // toString() method for debugging
    @Override
    public String toString() {
        return String.format(
            "UserEvent{userId=%d, eventType='%s', timestamp=%d, ipAddress='%s'}",
            userId, eventType, timestamp, ipAddress
        );
    }

    // Example usage
    public static void main(String[] args) {
    // Create a few UserEvent objects
    UserEvent loginEvent = new UserEvent(12345, "login", 1627849923L, "127.0.0.1");
    UserEvent logoutEvent = new UserEvent(67890, "logout", 1627853523L, "192.168.1.1");
    UserEvent purchaseEvent = new UserEvent(54321, "purchase", 1627857123L, "10.0.0.1");

    // Print all events using toString() (for debugging)
    System.out.println("=== Debugging Output (toString()) ===");
    System.out.println(loginEvent);
    System.out.println(logoutEvent);
    System.out.println(purchaseEvent);

    // Print all events using toJson() (for data exchange)
    System.out.println("\n=== JSON Output (toJson()) ===");
    System.out.println(loginEvent.toJson());
    System.out.println(logoutEvent.toJson());
    System.out.println(purchaseEvent.toJson());

    // Example: Modify an event using setters
    loginEvent.setEventType("failed_login");
    loginEvent.setTimestamp(1627850000L);
    System.out.println("\n=== After Modification ===");
    System.out.println(loginEvent);
    System.out.println(loginEvent.toJson());
}

}