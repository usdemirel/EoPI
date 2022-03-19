import java.util.List;

public class IncrementArbitraryPrecisionInteger {

    /*
    6.2 This seems fine
    */

    public static List<Integer> incrementInteger(List<Integer> A) {
        int carryover=1;
        for(int i=A.size()-1; i>=0; i--){
            int newVal = A.get(i) + carryover;
            carryover = newVal/10;
            A.set(i, newVal%10);
        }

        if(carryover==1){
            A.add(0,1);
        }

        return A;
    }
}
