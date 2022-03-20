import java.util.List;

public class DeleteDuplicates {

    /*
    6.5 Same thing is achieved with only one if statement.
    TODO Try this again later.
    */

    public static int deleteDuplicates(List<Integer> A) {
        int numOfValid = 1;
        for(int i=0; i<A.size()-1; i++){
            if(A.get(i)!=A.get(i+1)){
                A.set(numOfValid++,A.get(i+1));
            }
            if(i>=numOfValid) A.set(i, null);
        }
        if(A.size()>numOfValid) A.set(A.size()-1, null);
        return numOfValid;
    }
}
