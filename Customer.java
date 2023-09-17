import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer implements Serializable
{
    private String name;
    private String contactEmail;

    private ArrayList<Booking> customerBookings;

    public Customer(String name, String contactEmail)
    {
        this.name = name;
        this.contactEmail = contactEmail;
        this.customerBookings = new ArrayList<>();
    }

    public void addBookingToCustomer(Booking booking)
    {
        this.customerBookings.add(booking);
    }


    public String getName()
    {
        return this.name;
    }


    public String getContactEmail()
    {
        return this.contactEmail;
    }


//    public String bookRoomForCustomer()
//    {
//        System.out.println("Please enter the type of the room you want");
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine();
//    }
}
