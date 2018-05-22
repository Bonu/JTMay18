package com.aptiva.corp.jt;

enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class EnumDemo {
    public static void main(String[] args) {
        System.out.println(Week.MONDAY.name());
        System.out.println(Week.TUESDAY.name());
    }
}

class Week1 {

    public static final String MONDAY  = "MONDAY";
    public static final String TUESDAY  = "TUESDAY";
    public static final String WEDNESDAY  = "WEDNESDAY";
    public static final String THURSDAY  = "THURSDAY";
    public static final String FRIDAY  = "FRIDAY";
}
