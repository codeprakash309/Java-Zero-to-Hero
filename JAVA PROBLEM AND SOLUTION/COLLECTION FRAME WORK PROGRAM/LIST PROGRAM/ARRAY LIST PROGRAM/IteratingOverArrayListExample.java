import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingOverArrayListExample {
    public static void main(String[] args) {
        List<String> tvShows=new ArrayList<String>();
        tvShows.add("Breaking Bad");
        tvShows.add("game Of Thrones");
        tvShows.add("friends");
        tvShows.add("Prison break");
        System.out.println("=== Iterate using java 8 forEach and lambda ===");
        tvShows.forEach(tvShow->{
            System.out.println(tvShow);
        });
        System.out.println("\n ===Iterate using an iterator()===");
        Iterator<String>tvShowIterator=tvShows.iterator();
        while (tvShowIterator.hasNext()) {
            String tvShow=tvShowIterator.next();
            System.out.println(tvShow);            
        }
        System.out.println("\n=== Iterate  using an iterator() and java 8 forEachRemaining() method===");
        tvShowIterator =tvShows.iterator();
        tvShowIterator.forEachRemaining(tvShow->{
            System.out.println(tvShow);
        });

        System.out.println("\n === Iterate using a listIterator() to traverse in both directions ===");
        //here , we start from the end of the list and traverse backwards.
        ListIterator<String> tvShowListIterator=tvShows.listIterator(tvShows.size());
        while(tvShowListIterator.hasPrevious()){
            String tvShow=tvShowListIterator.previous();
            System.out.println(tvShow);
        }

        System.out.println("\n === Iterate using simple for-each loop ===");
        for(String tvShow: tvShows){
            System.out.println(tvShow);
        }
        System.out.println("\n ===Itearte using for loop with index ===");
        for(int i=0;i<tvShows.size();i++){
            System.out.println(tvShows.get(i));
        }
    }
}
