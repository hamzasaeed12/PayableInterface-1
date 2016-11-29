// Tests interface Payable.

public class PayableInterfaceTest 
{
   public static void main( String args[] )
   {
      // create four-element Payable array
      Payable payableObjects[] = new Payable[ 4 ];
      
      // populate array with objects that implement Payable
      payableObjects[ 0 ] = new Invoice( "01234", "pc", 2, 399.99 );
      payableObjects[ 1 ] = new Invoice( "56789", "first aid kit", 4, 100.00 );
      payableObjects[ 2 ] = new SalariedEmployee( "Liz", "","Brown", "443-892-1727", 800.00 );
      payableObjects[ 3 ] = new SalariedEmployee( "David", "Adam", "Bowen", "585-24-7463", 1200.00 );

      System.out.println( "Processed Invoices and Employees:\n" ); 

      // generically process each element in array payableObjects
      for ( Payable currentPayable : payableObjects )
      {
         // output currentPayable and its appropriate payment amount
         System.out.printf( "%s \n%s: $%,.2f\n\n", 
            currentPayable.toString(), 
            "Payment", currentPayable.getPaymentAmount() ); 
      } 
   }
} 
