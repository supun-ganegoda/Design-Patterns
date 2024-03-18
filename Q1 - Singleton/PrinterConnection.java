public class PrinterConnection {
    private static volatile PrinterConnection connection;

    private PrinterConnection(){}

    public static PrinterConnection getInstance(){
        if(connection == null){
            synchronized (PrinterConnection.class){
                connection = new PrinterConnection();
                return connection;
            }
        }
        return connection;
    }
}
