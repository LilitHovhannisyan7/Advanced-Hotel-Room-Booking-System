import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        Operator operator = Operator.getInstance();
        AdvancedHotel hotel = new AdvancedHotel(operator);
        Room room1 = new Room(101, "Single");
        Room room2 = new Room(102, "Double");
        Room room3 = new Room(103, "Deluxe");
        operator.addRoom(room1);
        operator.addRoom(room2);
        operator.addRoom(room3);

        Customer customer1 = new Customer("Elen Antonyan", "elenAntonyan@gmail.com");
        Customer customer2 = new Customer("Sahak Babayan", "SB@gmail.com");
        Customer customer3 = new Customer("Karen Arabyan", "KarenA@gmail.com");

        operator.addCustomer(customer1);
        operator.addCustomer(customer2);
        operator.addCustomer(customer3);


        LocalDate date = LocalDate.of(2023, 3, 10);
        LocalDate date1 = LocalDate.of(2023, 3, 17);

        operator.bookRoom(customer1, room1, date, date1);

        Operator operator2 = operator.loadSystemStateFromFile("bill.txt");
        operator2.generateRoomBookingHistoryReport(101, "a.txt");

        LocalDate date2 = LocalDate.of(2023, 2, 10);
        LocalDate date3 = LocalDate.of(2023, 2, 17);

        operator.bookRoom(customer2, room2, date2, date3);

        Operator operator3 = operator.loadSystemStateFromFile("bill.txt");
        operator3.generateRoomBookingHistoryReport(102, "a.txt");



    }
}