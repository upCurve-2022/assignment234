import java.util.*;
public class Swiggy {
    public static void check(String str) throws Undeliverable
    {
        try{

            if ((str.contentEquals("123")) ||
                    (str.contentEquals("456") ) ||
                    (str.contentEquals("789")) ){
                throw new Undeliverable("Delivery is not available at your zipcode....!!!!");
            }
            else if(str==" "){
                System.out.println("please enter zip code!!!!");
            }
            else{
                System.out.println("Delivery is available in your area! ");
            }
        }
        catch(Undeliverable e){
            System.out.println("Delivery is not  available in your area!");
            System.out.println("Please enter correct zip code!!!");
        }

    }

    public static void main(String[] args) {
        //Input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Zip code: ");
        String n=s.nextLine();
        try {
            check(n);
        }
        catch(Undeliverable e){
            System.out.println("Exception occured: "+e);
        }
    }
}