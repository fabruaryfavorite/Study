package Programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShuttleBus {
    public static void main(String[] args) {

        int n = 10;//number of trip
        int t = 60;//service intervel
        int m = 45;//maximum number of crew on one shuttle bus
        String[] timetable = {"23:59","23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"};

        Arrays.sort(timetable);
        Queue<String> tt = new LinkedList<>();

        int table_num = 0;
        for (int i = 0; i < n; i++) {

            while (table_num < timetable.length && 540 + (i * t) >= (60 * Integer.parseInt(timetable[table_num].substring(0, 2)) + Integer.parseInt(timetable[table_num].substring(3, 5)))) {

                tt.add(timetable[table_num]);
                table_num++;
            }


            if (i == n - 1) {
                if (tt.size() >= m) {
                    for (int j = 0; j < m - 1; j++) {
                        tt.poll();
                    }

                    int trans_int = 60 * Integer.parseInt(tt.peek().substring(0, 2)) + Integer.parseInt(tt.peek().substring(3, 5)) - 1;

                    System.out.printf(String.format("%02d:%02d", trans_int / 60, trans_int % 60));

                } else {
                    System.out.printf(String.format("%02d:%02d", (540 + (n - 1) * t) / 60, (540 + (n - 1) * t) % 60));
                }
            } else {
                for (int j = 0; j < m; j++) {
                    tt.poll();
                }
            }

        }
    }
}