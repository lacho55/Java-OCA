package example03;

import com.sun.security.jgss.GSSUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        //example0
         String s = "Hello";
         String t = new String(s);
         if ("Hello".equals(s)) System.out.println("one");
         if (t == s) System.out.println("two");
         if (t.equals(s)) System.out.println("three");
         if ("Hello" == s) System.out.println("four");
         if ("Hello" == t) System.out.println("five");

        //example1
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);

        //example2
        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");
        //if (s1 == s2) Error due to String and StringBuilder ==
            System.out.println("1");
        if (s1.equals(s2))
            System.out.println("2");


        //example3
        String letters = "abcdef";
        System.out.println(letters.length()); //6
        System.out.println(letters.charAt(3)); //d
        //System.out.println(letters.charAt(6)); // An exception is thrown

        //example4
        String numbers = "012345678";
        System.out.println(numbers.substring(1,3)); //12
        System.out.println(numbers.substring(7,7)); // blank line
        System.out.println(numbers.substring(7)); // 78

        //example5
        String str = "purr";
        str.toUpperCase(); //PURR
        str.trim(); // PURR
        str.substring(1,3); //PURR
        str += " two";//PURR two
        System.out.println(str.length()); //8

        //example6
        String a = "";
        a += 2;
        a += 'c';
        a += false;
        if(a == "2cfalse") System.out.println("==");
        if(a.equals("2cfalse")) System.out.println("equals");

        //example7
        int total = 0;
        StringBuilder lettes = new StringBuilder("abcdefg");
        total += lettes.substring(1, 2).length(); //1
        total += lettes.substring(6,6).length(); //1
        //total += lettes.substring(6,5).length(); // exception
        System.out.println(total);

        //example8
        StringBuilder numbers1 = new StringBuilder("0123456789");
        numbers1.delete(2, 8); //0189
        numbers1.append("-").insert(2 , "+"); //0189- > 01+89-
        System.out.println(numbers1);

        //example9
        StringBuilder be = new StringBuilder("rumble");
        be.append(4).deleteCharAt(3).delete(3, be.length() - 1);
        System.out.println(be);

        //example10
        StringBuilder puzzle = new StringBuilder("Java");
        // INSERT CODE HERE
        //puzzle.reverse();
        puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
         System.out.println(puzzle);

         //example11
        int[][] scores = new int[5][];
        Object[][][] cubbies = new Object[3][0][5];
        //String beans[] = new beans[6]; not legal
        java.util.Date[] dates[] = new java.util.Date[2][];
        //int[][] types = new int[]; not legal

        //example12
         List<String> list = new ArrayList<String>();
         list.add("one");
         list.add("two");
         //list.add(7); error
         //for(String s : list) System.out.print(s);

        //example13
        ArrayList<Integer> values = new ArrayList<>();
         values.add(4);//4
         values.add(5);//45
         values.set(1, 6);//46
         values.remove(0);//6
         for (Integer v : values) System.out.println(v);

         //example14
        int[] random = { 6, -4, 12, 0, -10 };
        int x = 12;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);

        //example15
        List<Integer> list1 = Arrays.asList(10, 4, -1, 5);
        Collections.sort(list1); // -1 4 5 10
        Integer array[] = list1.toArray(new Integer[4]);
        System.out.println(array[0]); // -1

        //example16
        String [] names = {"Tom", "Dick", "Harry"};
        //List<String> list2 = names.asList();
        list.set(0, "Sue");
        System.out.println(names[0]);

        //example17
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex); // 30 3A 8 FF
        System.out.println(hex);
        int x1 = Collections.binarySearch(hex, "8"); // 2
        int y1 = Collections.binarySearch(hex, "3A"); //1
        int z1 = Collections.binarySearch(hex, "4F"); //-4
        System.out.println(x1 + " " + y1 + " " + z1);

        //example18
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        //ages.add(null); throws exception
        for (int age : ages) System.out.print(age);

        //example19
        List<String> one = new ArrayList<String>();
        one.add("abc");
        List<String> two = new ArrayList<>();
        two.add("abc");
        if (one == two)
            System.out.println("A");
        else if (one.equals(two))
            System.out.println("B");
        else
            System.out.println("C");

        //example20
        LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
        date.plusDays(2);
        //date.plusHours(3); It wont compile
        System.out.println(date.getYear() + " " + date.getMonth() + " "
                + date.getDayOfMonth());

        //example21
        /*LocalDate date1 = LocalDate.of(2018, Month.APRIL, 40);
        System.out.println(date1.getYear() + " " + date1.getMonth() + " "
                + date1.getDayOfMonth());*/

        //example22
        LocalDate date1 = LocalDate.of(2018, Month.APRIL, 30);
        date1 = date1.plusDays(2);
        date1 = date1.plusYears(3);
        System.out.println(date1.getYear() + " " + date1.getMonth() + " "
                + date1.getDayOfMonth());

        //example23
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.of(1, 2, 3);
        d = d.minus(p); //2014 3 7
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(d.format(f));

        //example24
        LocalDateTime d1 = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p1 = Period.ofDays(1).ofYears(2);
        d1 = d1.minus(p1);
        DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(f1.format(d1));
    }
}
