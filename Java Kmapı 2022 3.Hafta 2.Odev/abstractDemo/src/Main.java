public class Main {

    public static void main(String[] args) {
	// write your code here
        CustomerManager customerManager=new CustomerManager();
        customerManager.databaseManager=new MySqlDatabaseManager();
        customerManager.getCustomer();
    }
}
