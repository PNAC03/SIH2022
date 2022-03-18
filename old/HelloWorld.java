//Java Program to demonstrate LocalDate.now() method
/*import java.time.*;

class HelloWorld{
    public static void main(String[] args)
    {
        //creating LocalDate object
        LocalDate It = LocalDate.now();
        //printing result
        System.out.println("LocalDate: " + It);
    }
}*/

/*import java.time.*;

class HelloWorld{
    public static void main(String[] args)
    {
        ZoneId zid= ZoneId.of("Australia/Darwin");
        LocalDate It = LocalDate.now(zid);
        System.out.println("LocalDate : " + It);
    }
}*/


/*
import java.time.*;

public class HelloWorld{
    public static void main(String[] args){
    LocalDate localdate = LocalDate.of(2020,5,13);
    System.out.println("Date: " + localdate);
    }
}*/

/*
import java.time.*;
public class HelloWorld{
    public static void main(String[] args)
    {
        LocalDate It = LocalDate.parse("2020-05-14");
        System.out.println("LocalDate : " + It);

    }
}*/

/*
import java.time.*;

public class HelloWorld{
    public static void main(String[] args)
    {
        //creating LocalDate object
        LocalTime It = LocalTime.now();
        //printing result
        System.out.println("LocalTime: " + It);
    }
}
*/

/*
import java.time.*;

class HelloWorld{
    public static void main(String[] args)
    {
        ZoneId zid= ZoneId.of("Asia/Kolkata");
        LocalTime It = LocalTime.now(zid);
        System.out.println("LocalTime : " + It);
    }
}*/


/*
import java.time.*;

public class HelloWorld{
    public static void main(String[] args){
    LocalTime localtime = LocalTime.of(6,5,40,50);
    System.out.println("Time: " + localtime);
    }
}*/

/*
import java.time.*; 
public class HelloWorld { 
	public static void main(String[] args) 
	{ 
		// create an LocalTime object 
		LocalTime lt = LocalTime.parse("10:15:45"); 
		// print result 
		System.out.println("LocalTime : "+ lt); 
	} 
} */


import java.time.*;
public class HelloWorld{
    public static void main(String[] args)
    {
        of(2005, 8, 24, 13, 35);
    }

    public static LocalDateTime of(int year, int mnth, int day, int hour, int mint)
    {
        System.out.println(day + ' ' + mnth + ' ' + year + ' ' + hour + ":" + mint);
        
    }
}