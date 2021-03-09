package exapmle02;


import java.time.*;

public class Zoo {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2020, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);

        Period period = Period.ofMonths(1);
        performanimalEnrichmet(start, end, period);
    }

    private static void performanimalEnrichmet(LocalDate start, LocalDate end, Period period){
        LocalDate upTo = start;

        while(upTo.isBefore(end)){
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);
        }





    }
}
