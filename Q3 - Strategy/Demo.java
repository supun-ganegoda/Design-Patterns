public class Demo {
   public static void main(String[] args) {
      Context context = new Context(new VictoryDance1());		
      context.perform();

      context = new Context(new VictoryDance2());		
      context.perform();

      context = new Context(new VictoryDance3());		
      context.perform();
   }
}