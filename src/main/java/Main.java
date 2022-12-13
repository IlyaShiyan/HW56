import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> symbols = new ArrayList<>(Arrays.asList("A","B","C","D","I"));

        ListIterator<String> listIterator = symbols.listIterator();
        while (listIterator.hasNext())
            listIterator.set(listIterator.next());

        while (listIterator.hasPrevious()) {
            String i = listIterator.previous();
            System.out.print(i + " ");
        }

        while (listIterator.hasNext()) {
            listIterator.next();
            listIterator.remove();
        }


        System.out.println("\n" + symbols.isEmpty());
    }
}
