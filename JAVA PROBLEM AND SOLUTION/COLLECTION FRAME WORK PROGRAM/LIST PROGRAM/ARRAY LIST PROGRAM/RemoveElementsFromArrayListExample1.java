//Removing elements from an ArrayList
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class RemoveElementsFromArrayListExample1 {
    public static void main(String[] args) {
        List<String> programmingLanguage=new ArrayList<String>();
        programmingLanguage.add("C");
        programmingLanguage.add("C++");
        programmingLanguage.add("Java");
        programmingLanguage.add("Kotlin");
        programmingLanguage.add("Python");
        programmingLanguage.add("Perl");
        programmingLanguage.add("Ruby");
        System.out.println("Initial List :  "+programmingLanguage);

        //Remove the element at index '5'
        programmingLanguage.remove(6);
        System.out.println("After remove(5) : "+programmingLanguage);
        //remove the first occurrance of the given elment from the ArrayList
        //(the remove() method returns false if the elements does not exist in the ArrayList)
        boolean isRemoved=programmingLanguage.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\") : "+programmingLanguage);
        System.out.println(isRemoved);  //it returns ture becoz elements is reomoved from the list
        //Remove all the elements that exist in a given collection
        List<String>scriptingLanguage=new ArrayList<String>();
        scriptingLanguage.add("Python");
        scriptingLanguage.add("Ruby");
        scriptingLanguage.add("Perl");

        programmingLanguage.removeAll(scriptingLanguage);
        System.out.println("After removalAll(ScriptingLanguage) : "+programmingLanguage);
        //Remove all the elements that satisfy the given predicate
        programmingLanguage.removeIf(new Predicate<String>() {
            public boolean test(String s){
                return s.startsWith("C");
            }
        });
        /*
         * the above removeIf() call can also be written using lambda expression like this -
         * programmingLanguages.removeIf(s->s.startsWith("C"))
         */
        System.out.println("After Removing all elements that start with \"C\" : "+programmingLanguage);
        //Remove all elements from the ArrayList
        programmingLanguage.clear();
        System.out.println("After clear() : "+programmingLanguage);
    }
}
