public class Demo {
   public static void main(String[] args) {

      PrinterConnection connection1 = PrinterConnection.getInstance();
      System.out.println(connection1);

      PrinterConnection connection2 = PrinterConnection.getInstance();
      System.out.println(connection2);

      if(connection1 == connection2)
        System.out.println("Printer connection using same link");

   }
}