public class Demo {
   public static void main(String[] args) {

      Movie moviesOnline = new MoviesOnline();
      moviesOnline.stream();

      Movie objectVilleMovies = new OnlineDecorator(new ObjectVilleMovies());
      objectVilleMovies.stream();

   }
}