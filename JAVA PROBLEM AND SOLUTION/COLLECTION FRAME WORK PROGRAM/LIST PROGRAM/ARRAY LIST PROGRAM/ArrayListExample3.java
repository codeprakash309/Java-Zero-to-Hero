//Accessing elements from an ArrayList
import java.util.ArrayList;
import java.util.List;
public class ArrayListExample3 {
    public static void main(String[] args) {
        List<String>topCompanies=new ArrayList<String>();
        //check if an ArrayList is empty 
        System.out.println("Is the topCompanies list Empty : "+topCompanies);
        //add elemnts into ArrayList
        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amzone");
        topCompanies.add("Facebook");
        System.out.println("Name of the to company name are : "+topCompanies);
        //find the size of th ArrayLit
        System.out.println("Here are the top : "+topCompanies.size()+" Companies in the world");
        //Retrieve the element at a given index
        String bestCompany=topCompanies.get(0);
        String secondBestCompany=topCompanies.get(1);
        String lastCompany=topCompanies.get(topCompanies.size()-1);
        System.out.println("Best Company : "+bestCompany);
        System.out.println("Second Best Company : "+secondBestCompany);
        System.out.println("Last Best Company in the List : "+lastCompany);
        //modify the element at a given index
        topCompanies.set(4,"TCS");
        System.out.println("Modify top companies list : "+topCompanies);


        
       
    }
}
