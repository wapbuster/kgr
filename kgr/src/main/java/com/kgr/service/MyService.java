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
        routeRequestList.add(new RouteRequest("1112223336", "1112223336", "01", 9999, "L", 11, 2, 2));
        routeRequestList.add(new RouteRequest("1112223335", "1112223335", "01", 0, "L", 11, 2, 3));
        routeRequestList.add(new RouteRequest("1112223337", "1112223337", "01", 9999, "L", 9999, 2, 4));
        routeRequestList.add(new RouteRequest("1112223338", "1112223338", "01", 0, "L", 9999, 2, 5));
        routeRequestList.add(new RouteRequest("1112223339", "1112223339", "01", 0, "L", 0, 2, 6));
        routeRequestList.add(new RouteRequest("1112223342", "1112223339", "05", 10, "L", 0, 2, 6));

        return routeRequestList;
    }


    public List<RouteRequest> sortRouteRequestList() {
        MyService myService = new MyService();
        List<RouteRequest> routeRequestList = myService.getRouteRequestList();

        /*Comparator<RouteRequest> compare = Comparator.comparing(RouteRequest::getSubDept)
                .thenComparing(RouteRequest::getAisleNumber)
                .thenComparing(RouteRequest::getAisleSide)
                .thenComparing(RouteRequest::getAisleSide)
                .thenComparing(RouteRequest::getBayNumber)
                .thenComparing(RouteRequest::getShelfNumber)
                .thenComparing(RouteRequest::getPositionNumber);

        Collections.sort(routeRequestList, compare);*/

        /*final Integer[] searchList = new Integer[]{5, 2, 3, 8, 0, 1};
        Arrays.sort(searchList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if (o1 == 0) {
                    return 1;
                }
                if (o2 == 0) {
                    return -1;
                }
                return o1.compareTo(o2);
            }
        });*/

        routeRequestList.sort((item1, item2) -> {
            if (item1.getAisleNumber() == 9999) {
                return 1;
            }
            if (item2.getAisleNumber() == 9999) {
                return -1;
            }
            if (item1.getAisleNumber() == 0) {
                return 1;
            }
            if (item2.getAisleNumber() == 0) {
                return -1;
            }

            return item1.getAisleNumber().compareTo(item2.getAisleNumber());
        });

        return routeRequestList;
    }

    public static void main(String[] args) {
        MyService myService = new MyService();
        //System.out.println(myService.sortRouteRequestList());

        for (RouteRequest rr : myService.sortRouteRequestList()) {
            System.out.println(rr.getBaseUpc() + ", " + rr.getConsumerUpc() + ", " + rr.getSubDept() + ", " + rr.getAisleNumber() + ", " + rr.getAisleSide() + ", " + rr.getBayNumber() + ", " + rr.getPositionNumber() + ", " + rr.getShelfNumber());
        }
    }
}
