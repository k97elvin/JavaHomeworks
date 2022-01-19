package Day30_Custom_Class;

public class MovieObject {
    public static void main(String[] args) {
        Movie movie1 = new Movie("USA", "Journey to SDET: Cydeo Batch 23",
                "10/25/2021", "Kuzzat");
        String casts[] = {"Asiya", "Adam", "Enes", "Vick"};
        System.out.println(movie1);
    }
}
/*1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 23
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie

 */