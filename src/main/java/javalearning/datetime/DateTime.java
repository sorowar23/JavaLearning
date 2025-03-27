package javalearning.datetime;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {

        //Date class is old Date class which is
        //Ambiguity in pacakage selection
        //No thread safe, have date format issue need to use SimpleDateFormat which which also not thread safe
        //Time Zone conversion also difficult
        /*
        Date currentDate = new Date();
        System.out.println(currentDate);

        SimpleDateFormat timeformat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeformat.format(currentDate));

        SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateformat.format(currentDate));

        SimpleDateFormat dayoftheWeek = new SimpleDateFormat("EEEE");
        System.out.println(dayoftheWeek.format(currentDate));
         */

        LocalDate localdate = LocalDate.now();
        System.out.println(localdate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

      //  LocalDate sld = LocalDate.of(1975, 10,30);
        LocalDate sld = LocalDate.of(1975, Month.APRIL,30);
        System.out.println(sld);

        DateTimeFormatter dft = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String dateFormat = sld.format(dft);
        System.out.println(dateFormat);

        LocalDate parsedDate = LocalDate.parse(dateFormat, dft);
        System.out.println(parsedDate);

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        ZonedDateTime arizonaDateTime = LocalDateTime.now().atZone(ZoneId.of("US/Arizona"));
        System.out.println("Arizona Time: "+arizonaDateTime);

        for (String zone: ZoneId.getAvailableZoneIds()) {
            System.out.println(zone);
        }


    }
}
