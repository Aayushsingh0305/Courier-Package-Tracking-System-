package com.courier.tracking.model;
import java.util.*;
public class CourierPackage {
 private String trackingId,sender,receiver,origin,destination,currentLocation,status;
 private List<JourneyEvent> history=new ArrayList<>(); private List<String> shortestRoute=new ArrayList<>(); private int routeDistance=-1;
 public CourierPackage(){}
 public CourierPackage(String id,String s,String r,String o,String d,String loc,String st){trackingId=id;sender=s;receiver=r;origin=o;destination=d;currentLocation=loc;status=st;}
 public String getTrackingId(){return trackingId;} public void setTrackingId(String v){trackingId=v;}
 public String getSender(){return sender;} public void setSender(String v){sender=v;}
 public String getReceiver(){return receiver;} public void setReceiver(String v){receiver=v;}
 public String getOrigin(){return origin;} public void setOrigin(String v){origin=v;}
 public String getDestination(){return destination;} public void setDestination(String v){destination=v;}
 public String getCurrentLocation(){return currentLocation;} public void setCurrentLocation(String v){currentLocation=v;}
 public String getStatus(){return status;} public void setStatus(String v){status=v;}
 public List<JourneyEvent> getHistory(){return history;} public void setHistory(List<JourneyEvent> v){history=v;}
 public List<String> getShortestRoute(){return shortestRoute;} public void setShortestRoute(List<String> v){shortestRoute=v;}
 public int getRouteDistance(){return routeDistance;} public void setRouteDistance(int v){routeDistance=v;}
}
