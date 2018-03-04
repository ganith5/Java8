package com.java8.interviews.parker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Pavithra Sachidananda on 2/3/18.
 */
public class MergeMeetings {

    public static void main(String[] args) {
        List<Meeting> meetingList = new ArrayList<Meeting>();
        Meeting meeting = new Meeting(1, 10);
        meetingList.add(meeting);

        meeting = new Meeting(2, 6);
        meetingList.add(meeting);
        meeting = new Meeting(3, 5);
        meetingList.add(meeting);
        meeting = new Meeting(7, 9);
        meetingList.add(meeting);

        List<Meeting> sortedMeeting = new ArrayList<>();
        for(Meeting tempMeeting: meetingList) {
            sortedMeeting.add(tempMeeting);
        }

        Collections.sort(sortedMeeting, Comparator.comparing(Meeting::getStartDate));
        System.out.println("Sorted list - " + sortedMeeting);

        List<Meeting> mergedList = new ArrayList<>();
        mergedList.add(sortedMeeting.get(0));
        for (Meeting current: sortedMeeting) {

            Meeting lastMergedMeeting = mergedList.get(mergedList.size()-1);

            if(lastMergedMeeting.getEndDate() >= current.getStartDate()) {

                //mergedList.add(new Meeting(lastMergedMeeting.getStartDate(), current.getEndDate()));
                lastMergedMeeting.setEndDate(Math.max(lastMergedMeeting.getEndDate(), current.getEndDate()));
            } else {
                mergedList.add(current);
            }

            //lastMergedMeeting = current;
        }


        System.out.println("merged meeting = " + mergedList);


    }


    static final class Meeting {
        private  int startDate;
        private  int endDate;

        public Meeting(int startDate, int endDate) {
            this.startDate = startDate;
            this.endDate = endDate;
        }

        public int getStartDate() {
            return startDate;
        }


        public int getEndDate() {
            return endDate;
        }

        public void setStartDate(int startDate) {
            this.startDate = startDate;
        }

        public void setEndDate(int endDate) {
            this.endDate = endDate;
        }

        @Override
        public String toString() {
            return startDate + " - " + endDate;
        }
    }
}
