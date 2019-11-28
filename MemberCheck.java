import java.util.*;
import java.io.*;
public class MemberCheck {
    public String[] whosDishonest(String[] club1,
                                  String[] club2,
                                  String[] club3) {
        // TODO: fill in code here

        Set<String> r = new HashSet<>();
        Set<String> s1 = new HashSet<>(Arrays.asList(club1));
        Set<String> s2 = new HashSet<>(Arrays.asList(club2));
        Set<String> s3 = new HashSet<>(Arrays.asList(club3));


        Set<String> s11 = new HashSet<>(s1);
        s11.retainAll(s2);
        Set<String> s21 = new HashSet<>(s2);
        s21.retainAll(s3);
        Set<String> s31 = new HashSet<>(s3);
        s31.retainAll(s1);


        //r.addAll(Sets.intersection(s1,s2));
        //r.addAll(Sets.intersection(s3,s2));
        //r.addAll(Sets.intersection(s1,s2));

        r.addAll(s11);
        r.addAll(s21);
        r.addAll(s31);

        String[] ret = r.toArray(new String[0]);
        Arrays.sort(ret);
        return ret;
    }
}