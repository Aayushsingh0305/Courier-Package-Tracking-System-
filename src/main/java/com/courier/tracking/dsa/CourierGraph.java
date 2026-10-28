package com.courier.tracking.dsa;
import java.util.*;
public class CourierGraph {
 private final Map<String,Map<String,Integer>> adj=new HashMap<>();
 public void addRoute(String a,String b,int km){adj.computeIfAbsent(a,k->new HashMap<>()).put(b,km);adj.computeIfAbsent(b,k->new HashMap<>()).put(a,km);}
 public record RouteResult(List<String> path,int distance){}
 public RouteResult shortestRoute(String start,String end){
  if(!adj.containsKey(start)||!adj.containsKey(end))return new RouteResult(List.of(),-1);
  Map<String,Integer>d=new HashMap<>();Map<String,String>prev=new HashMap<>();for(String n:adj.keySet())d.put(n,Integer.MAX_VALUE);d.put(start,0);
  PriorityQueue<String> q=new PriorityQueue<>(Comparator.comparingInt(n->d.getOrDefault(n,Integer.MAX_VALUE)));Set<String>done=new HashSet<>();q.add(start);
  while(!q.isEmpty()){String u=q.poll();if(!done.add(u))continue;if(u.equals(end))break;for(var e:adj.getOrDefault(u,Map.of()).entrySet()){int nd=d.get(u)+e.getValue();if(nd<d.getOrDefault(e.getKey(),Integer.MAX_VALUE)){d.put(e.getKey(),nd);prev.put(e.getKey(),u);q.add(e.getKey());}}}
  if(d.get(end)==Integer.MAX_VALUE)return new RouteResult(List.of(),-1);LinkedList<String> path=new LinkedList<>();for(String at=end;at!=null;at=prev.get(at)){path.addFirst(at);if(at.equals(start))break;}return new RouteResult(path,d.get(end));
 }
}
