import java.util.Scanner;

class Invoice
{
    String partNumber;
    String partDescription;
    int quantity;
    double price;

    Invoice(String pNo, String pDesc, int q, double pr)
    {
        partNumber = pNo;
        partDescription = pDesc;
        quantity = (q > 0) ? q : 0;
        price = (pr > 0) ? pr : 0.0;
    }

    double getInvoiceAmount()   //method
    {
        return quantity * price;
    }
}

class Q02_InvoiceTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Part Number : ");
        String pNo = sc.nextLine();

        System.out.println("Enter the Descripiction : ");
        String pDesc = sc.nextLine();

        System.out.println("Enter the quanitiy of item : ");
        int q = sc.nextInt() ;

        System.out.println("Enter the price of item : ");
        double pr = sc.nextDouble();


        Invoice inv = new Invoice(pNo, pDesc, q, pr);

        System.out.println("Invoice Amount = " + inv.getInvoiceAmount());
        sc.close();
        
    }

  
}
