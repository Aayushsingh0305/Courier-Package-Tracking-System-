package com.courier.tracking.model;
public class JourneyEvent {
 private String status, location, timestamp;
 public JourneyEvent() {}
 public JourneyEvent(String status,String location,String timestamp){this.status=status;this.location=location;this.timestamp=timestamp;}
 public String getStatus(){return status;} public void setStatus(String v){status=v;}
 public String getLocation(){return location;} public void setLocation(String v){location=v;}
 public String getTimestamp(){return timestamp;} public void setTimestamp(String v){timestamp=v;}
}
