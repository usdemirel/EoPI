import java.util.Collections;
import java.util.List;

public class DutchNationalFlag {

    /*
    6.1 TODO This solution is something that I need to improve for sure
    Some test cases seem not to be passing but based on what I understood, there is something weird about the cases :)
    */

    public static void dutchNationalFlag(int p, List<Integer> A) {

        int pivot = A.get(p);
        int pntr = 0, dscvr = 0;

        while(dscvr<A.size()){
            System.out.print(A.toString());
            while(pntr<A.size() && A.get(pntr)<pivot) pntr++;
            dscvr = pntr+1;
            while(dscvr<A.size() && A.get(dscvr)>=pivot) dscvr++;
            if(dscvr<A.size()) Collections.swap(A,pntr++,dscvr);
        }
        System.out.println(A.toString());
        pntr = A.size()-1;
        while(dscvr>=0){
            while(pntr>=0 && A.get(pntr)>pivot) pntr--;
            dscvr = pntr-1;
            while(dscvr>=0 && A.get(dscvr)<=pivot) dscvr--;
            if(dscvr>=0) Collections.swap(A,pntr--,dscvr);
        }
        System.out.println(A.toString());

    }
}