package com.courier.tracking.dsa;
import com.courier.tracking.model.CourierPackage; import java.util.*;
public class PackageBST {
 private static class Node {CourierPackage value;Node left,right;Node(CourierPackage v){value=v;}} private Node root;
 public void insert(CourierPackage p){root=insert(root,p);}
 private Node insert(Node n,CourierPackage p){if(n==null)return new Node(p);int c=p.getTrackingId().compareToIgnoreCase(n.value.getTrackingId());if(c<0)n.left=insert(n.left,p);else if(c>0)n.right=insert(n.right,p);else n.value=p;return n;}
 public CourierPackage search(String id){Node n=root;while(n!=null){int c=id.compareToIgnoreCase(n.value.getTrackingId());if(c==0)return n.value;n=c<0?n.left:n.right;}return null;}
 public List<CourierPackage> inOrder(){List<CourierPackage> out=new ArrayList<>();walk(root,out);return out;}
 private void walk(Node n,List<CourierPackage> out){if(n==null)return;walk(n.left,out);out.add(n.value);walk(n.right,out);}
}
