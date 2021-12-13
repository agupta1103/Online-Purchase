/**
 * The purpose of this program is to write a code that will print
 * an e-Receipt based on the information that you provide during 
 * the input of the Scanner class. This code must be a variety of 
 * all that we learned during Module 3, so that it can truly test
 * whether or not students know how to use and operate different
 * types of codes to get the expected output/result. This incorporation
 * includes parsing, scanner class, replace string features, input string
 * features per line of input or more, basic mathematical caluclations 
 * based on double values, basic print statements with additional
 * input of variable definitions and sometimes the futher continuation
 * of the print statements, and the creation of string variables for
 * different multi-use interconnected incorporation.
 *
 * @author Anish Gupta
 * @version 2/25/21
 */
import java.util.Scanner;
public class BuyMovieTickets
{
    public static void main (String[] args)
    {
        // Initiate variable values
        double tax = 0.0725;                   // Tax rate for the state of California
        double ticketPrice = 8.25;             // Price of an individual movie ticket for everyone, including children
        double doubleTicketOrTicketsPurchased; // String converted to double
        Scanner in = new Scanner (System.in);  // Construct a Scanner object called in
        
        // Gather input
        System.out.println("Welcome to Purchase Movie Tickets Online at moviemaniac.com");
        System.out.print("\nPlease enter your full name (first and last): ");
        String firstName = in.next();
        String lastName = in.nextLine();
        System.out.print("\nPlease enter movie that you would like to buy tickets to: ");
        String movieName = in.nextLine();
        System.out.print("\nPlease enter the date in (mm/dd/yyyy) form when you would like to watch " + "\"" +  movieName + "\": ");
        String movieDateWithSlash = in.nextLine();
        System.out.print("\nPlease enter the date of today in (mm/dd/yyyy) form: ");
        String todayDateWithSlash = in.nextLine();
        System.out.print("\nPlease choose movie time (only by the hour ranging from 12 P.M. to 11 P.M., only enter a number since showtimes are all P.M. (e.g. 6): ");
        String movieTime = in.nextLine();
        System.out.print("\nMovie tickets cost $8.25 per person including children without tax");
        System.out.print("\n\nHow many tickets would you like to purchase: ");
        String amountOfTicketsPurchased = in.nextLine();
        doubleTicketOrTicketsPurchased = Double.parseDouble(amountOfTicketsPurchased); // String parsed to double
        double totalPriceOrPurchaseTotal = (ticketPrice * doubleTicketOrTicketsPurchased * tax) + (ticketPrice * doubleTicketOrTicketsPurchased);
        System.out.print("\nYour total is $" + totalPriceOrPurchaseTotal + " (tax included):");
        System.out.print("\n\nPlease enter your debit or credit card number (####-####-####-####): ");
        String cardNumber = in.nextLine();
        System.out.print("\nPlease enter your security code/pin on card (###): ");
        String securityPinOrCode = in.nextLine();
        System.out.println();
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println();
        
        // Print output
        System.out.println("Your e-Receipt:");
        System.out.println();
        System.out.println("Thank you for your purchase!");
        System.out.println();
        String todayDateWithDash = todayDateWithSlash.replaceAll("[/]", "-");                                                              // Replace slash characters in date with dash characters
        System.out.println("Date of Purchase: " + todayDateWithDash);
        String orderNumber = lastName.substring(0, 3) + cardNumber.substring(5, 9);
        System.out.println("Order Number: " + orderNumber);
        System.out.println();
        String firstInitialOfFirstName = firstName.substring(0, 1);                                                                        // Get first initial of first name for receipt
        System.out.println("\t" + firstInitialOfFirstName + "." + lastName);
        String firstThreeBlockNumbersOnCard = cardNumber.substring(0, 15);                                                                 // Starting proccess to conceal majority of card numbers
        String fourthBlockNumbersOnCard = cardNumber.substring(15, 19);
        String firstThreeCardNumberBlockNumbersConcealment = firstThreeBlockNumbersOnCard.replaceAll("[0123456789]", "#");                 // Will replace with "#" for first three blocks or segments of card numbers in the receipt print output
        System.out.println("\tAccount: " + (firstThreeCardNumberBlockNumbersConcealment + fourthBlockNumbersOnCard));                      // Successfully added the concealed first three blocks or segments of card numbers and numerical last block or segment (fourth block or segment) of card numbers in the receipt print output
        System.out.println("\tMovie: " + movieName);
        String movieDateWithDash = movieDateWithSlash.replaceAll("[/]", "-");                                                              // Replace slash characters in date with dash characters
        System.out.println("\tMovie Date: " + movieDateWithDash);
        System.out.println("\tNumber of Tickets: " + amountOfTicketsPurchased);
        System.out.println("\tTicket Price: $" + ticketPrice);
        System.out.println("\tTax Rate: 7.25%");
        System.out.println();
        System.out.println("\tThe purchase total of $" + totalPriceOrPurchaseTotal + " was made and will be deducted from your bank or credit card account.");
        System.out.println();
        System.out.println("\tThank you, and enjoy your movie, " + movieName + ", on " + movieDateWithDash + " at " + movieTime + " P.M.");
        System.out.println();
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
    }
}
