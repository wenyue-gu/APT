import java.util.Arrays;
import java.util.Comparator;

public class ClientsList {
    public String[] dataCleanup(String[] names) {
        // fill in code here
        int k = names.length;
        Person[] list = new Person[k];
        for(int i = 0; i< names.length; i++){
            list[i] = new Person(names[i]);
        }
        Comparator<Person> comp = Comparator.comparing(Person::getLast);
        comp = comp.thenComparing(Person::getFirst);
        Arrays.sort(list,comp);
        for (int j = 0; j<names.length; j++){
            names[j] = list[j].toString();
        }
        return names;

    }

    public class Person{
        private String First;
        private String Last;

        public Person(String k) {
            int t = k.indexOf(",");
            if (t != -1) {
                First = k.substring(t + 2);
                Last = k.substring(0, t);
            }
            else{
                First = k.substring(0, k.indexOf(" "));
                Last = k.substring(k.indexOf(" ")+1);
            }
        }
        public String getFirst(){
            return First;
        }
        public String getLast(){
            return Last;
        }
        @Override
        public String toString(){
            return First + " " + Last;
        }

    }
}