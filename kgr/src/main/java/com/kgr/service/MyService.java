package com.kgr.service;

import com.kgr.domain.RouteRequest;

import java.util.*;

public class MyService {

    public List<RouteRequest> getRouteRequestList() {

        List<RouteRequest> routeRequestList = new ArrayList<>();
        routeRequestList.add(new RouteRequest("1112223334", "1112223334", "01", 10, "L", 11, 1, 2));
        routeRequestList.add(new RouteRequest("1112223331", "1112223331", "01", 10, "L", 11, 1, 3));
        routeRequestList.add(new RouteRequest("1112223332", "1112223332", "01", 10, "L", 11, 1, 1));
        routeRequestList.add(new RouteRequest("1112223333", "1112223333", "01", 10, "L", 11, 2, 1));
        routeRequestList.add(new RouteRequest("1112223336", "1112223336", "01", null, "L", 11, 2, 2));
        routeRequestList.add(new RouteRequest("1112223335", "1112223335", "01", 0, "L", 11, 2, 3));
        routeRequestList.add(new RouteRequest("1112223337", "1112223337", "01", null, "L", null, 2, 4));
        routeRequestList.add(new RouteRequest("1112223338", "1112223338", "01", 0, "L", null, 2, 5));
        routeRequestList.add(new RouteRequest("1112223339", "1112223339", "01", 0, "L", 0, 2, 6));
        routeRequestList.add(new RouteRequest("1112223342", "1112223339", "05", 10, "L", 0, 2, 6));

        return routeRequestList;
    }


    public List<RouteRequest> sortRouteRequestList() {
        MyService myService = new MyService();
        List<RouteRequest> routeRequestList = myService.getRouteRequestList();

        Comparator<RouteRequest> compare = Comparator.comparing(RouteRequest::getSubDept, Comparator.nullsLast(Comparator.naturalOrder()))
                .thenComparing(RouteRequest::getAisleNumber, Comparator.nullsLast(Comparator.naturalOrder()))
                .thenComparing(RouteRequest::getAisleSide, Comparator.nullsLast(Comparator.naturalOrder()))
                .thenComparing(RouteRequest::getBayNumber, Comparator.nullsLast(Comparator.naturalOrder()))
                .thenComparing(RouteRequest::getShelfNumber, Comparator.nullsLast(Comparator.naturalOrder()))
                .thenComparing(RouteRequest::getPositionNumber, Comparator.nullsLast(Comparator.naturalOrder()));

        Collections.sort(routeRequestList, compare);


        return routeRequestList;
    }

    public static void main(String[] args) {
        MyService myService = new MyService();
        //System.out.println(myService.sortRouteRequestList());

        myService.sortRouteRequestList().forEach(System.out::println);
    }
}
