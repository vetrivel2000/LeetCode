/*
Given an array of meeting time intervals intervals where intervals[i] = [start_i, end_i], determine if a person could attend all meetings.

A person cannot attend two meetings if they overlap. A meeting that ends exactly when the next one starts (e.g., [0, 10] and [10, 20]) is not considered an overlap.

Example 1:

Input: intervals = [[0, 30], [5, 10], [15, 20]]

Output: false (The meetings overlap.)

Example 2:

Input: intervals = [[7, 10], [2, 4]]

Output: true (No meetings overlap.)
*/
import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom {
    public static void main(String[] args)
    {
        int[][] intervals = {{0,10}, {10,25},{25,30}};

        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));

        System.out.println(Arrays.deepToString(intervals));

        boolean overlap = true;

        for (int i = 1; i < intervals.length; i++) {

            int prevMeetingEnd = intervals[i-1][1];
            int currMeetingStart = intervals[i][0];

            if(currMeetingStart<prevMeetingEnd)
            {
                overlap = false;
            }
        }
        System.out.print(overlap);
    }
}
