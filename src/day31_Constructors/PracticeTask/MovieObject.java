package day31_Constructors.PracticeTask;

public class MovieObject {

    public static void main(String[] args) {

        String title ="Journey to SDET: Cydeo Batch 25";
        String genre = "Adventure, Comedy, Thriller";
        Movie movie1 = new Movie("USA",title,genre,"10/25/2021","Kuzzat Altay");
        String[] casts= {"Asiya","Adam","Muhtar","Halo","Umut"};

        movie1.addCasts(casts);

        System.out.println(movie1);


    }
}
/*
4. 2create a class called MovieObjects
1. create an object of the movie:
title: Journey to SDET: Cydeo Batch 25
country: USA
Genre: Adventure, Comedy, Thriller
release date: 10/25/2021
director: Kuzzat Altay
Casts: Asiya, Adam, Muhtar and 5 more students from
your group
print the full info of the movie
 */
