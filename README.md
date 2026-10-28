# Courier Package Tracking System — Java + Frontend

## Requirements
- JDK 17+
- Maven 3.8+ (or import this Maven project into IntelliJ IDEA)

## Run
Open a terminal in this folder and run `mvn spring-boot:run`. Then visit `http://localhost:8080`.

## DSA used
- **Binary Search Tree:** searches packages by tracking ID.
- **Linked List:** stores shipment journey events.
- **Graph (adjacency list):** represents connected courier hubs.
- **Dijkstra's algorithm:** finds the shortest-distance hub route.

Packages are kept in memory and reset when the server restarts. Hub distances are sample demonstration values.
