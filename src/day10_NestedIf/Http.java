package day10_NestedIf;

public class Http {

    public static void main(String[] args) {

        int number = 500;
       String mean = "";

        String mean2 = (number==200)? "Ok" :(number==201)? "Created" :(number==202)? "Accepted" :(number==301)? "Moved Permanently" :(number==303)? "See Other"
                :(number==304)? "Not Modified" :(number==307)? "Temporary Redirect" :(number==400)? "Bad Request" :(number==401)? "Unauthorized"
                :(number==403)? "Forbidden" :(number==404)? "Not Found" :(number==410)? "Gone" :(number==500)? "Internal Server Error"
                : "Service Unavailable";

        System.out.println(mean2);
    }
}
