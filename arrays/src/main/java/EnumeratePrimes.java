import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EnumeratePrimes {

    /*
    6.8 Note-Serkan When compared there's not a huge diff between the first solution from the book and this one
    but the second solution is a bit different since it's using 2i+3 to derive prime nums.
    This can be solved again but mandatory.
    */

    public static List<Integer> enumeratePrimes(int n) {
        if(n<2) return new ArrayList<>();
        List<Integer> list= new ArrayList<>(Collections.nCopies(n+1,null));
        for(int i=2; i<=n/2+1;i++){
            if(list.get(i)!=null || i%2==0) continue;
            int multiplier = 2;
            while(i*multiplier<=n){
                list.set(i*multiplier++,1);
            }
        }
        List<Integer> result= new ArrayList<>(Arrays.asList(2));
        for(int i=3; i<list.size(); i=i+2){
            if(list.get(i)==null) result.add(i);
        }
        return result;
    }
}
