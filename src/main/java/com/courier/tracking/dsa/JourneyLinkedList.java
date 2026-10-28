package com.courier.tracking.dsa;
import com.courier.tracking.model.JourneyEvent; import java.util.*;
public class JourneyLinkedList {
 private static class Node { JourneyEvent event; Node next; Node(JourneyEvent e){event=e;} }
 private Node head,tail;
 public void add(JourneyEvent e){Node n=new Node(e);if(head==null)head=tail=n;else{tail.next=n;tail=n;}}
 public List<JourneyEvent> toList(){List<JourneyEvent> out=new ArrayList<>();for(Node n=head;n!=null;n=n.next)out.add(n.event);return out;}
}
