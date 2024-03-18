public abstract class MovieDecorator implements Movie {
   protected Movie decoratedMovie;

   public MovieDecorator(Movie decoratedMovie){
      this.decoratedMovie = decoratedMovie;
   }

   public void stream(){
      decoratedMovie.stream();
   }	
}