public class OnlineDecorator extends MovieDecorator {

   public OnlineDecorator(Movie decoratedMovie) {
      super(decoratedMovie);		
   }

   @Override
   public void stream() {
      decoratedMovie.stream();	       
      displayNext();
   }

    // additional functionality that loads the next movie
   private void displayNext(){
      System.out.println("Displaying the next movie");
   }
}