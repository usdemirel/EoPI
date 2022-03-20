import java.util.List;

public class AdvanceThroughArray {

    /*
       6.4 2/20/2022 serkan
    */

    public static boolean arrayAdvance(List<Integer> A) {
        int furthest=0;
        for(int i=0;i<A.size() && i<=furthest;i++){
            furthest = (i+A.get(i)>furthest) ? i+A.get(i) : furthest;
            if(furthest>=A.size()-1) return true;
        }
        return false;
    }
}
