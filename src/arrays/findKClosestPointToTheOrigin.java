package arrays;

import java.util.Arrays;

public class findKClosestPointToTheOrigin {

    public static void main(String[] args) {

        int points[][] = { { 3, 3 },
                { 5, -1 },
                { -2, 4 } };

        int K = 2;

        findClosetPointToTheOrigin(points, K);
    }


    public static void findClosetPointToTheOrigin(int [][] points, int k){

        int pointLength = points.length;
        int [] distance = new int[pointLength];

        for (int i = 0; i < pointLength; i++){

            int x = points[i][0] , y = points[i][1];
            distance[i] = (x * x) + (y * y);
        }

        Arrays.sort(distance);

        int distanceK = distance[k - 1];

        //print all distances which are smaller than k-th distance

        for (int i = 0; i < pointLength; i++) {

            int x = points[i][0] , y = points[i][1];
            int dist = (x * x) + (y * y);

            if (dist <= distanceK)
                System.out.println("[" + x + "," + y + "]");
        }
    }
}
