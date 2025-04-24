package ch07_java_base.lecture.date;

import java.util.Calendar;
import java.util.Date;

public class Application1 {

    public static void main(String[] args) {

        Date legacyDate = new Date();
        legacyDate.setYear(2025);
        System.out.println("Date setYesr(2025) -> 실제 출력 : " + legacyDate); // 1900 + 되서 출력함

        // Calendar 0월부터 시작
        Calendar cal = Calendar.getInstance();
        cal.set(2024,4,24);
        System.out.println("Calender.set(2025,3,23) -> 실제 월 : " + cal.getTime());
    }
}
