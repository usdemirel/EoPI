import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultipleArbitraryPrecisionIntegers {

    /*
    6.3 I am not very happy with this solution but I at least was able to produce some result.
    TODO: Do this again later..
    */

    public static List<Integer> multiply(List<Integer> a, List<Integer> b) {

        int multiplier = (a.get(0)*b.get(0))==0 ? 1 : (a.get(0)*b.get(0))/Math.abs((a.get(0)*b.get(0)));
        System.out.println(multiplier);

        List<List<Integer>> allList = new ArrayList<>();
        for (int i=0; i<=b.size(); i++){
            List<Integer> temp = new ArrayList<>(a.size()+b.size());
            for(int j=0; j<(a.size()+b.size()); j++){
                temp.add(j,0);
            }
            allList.add(temp);
        }

        int col =0;
        for(int i=b.size()-1; i>=0; i--){
            int carryover = 0;
            List<Integer> curr = allList.get(i);
            for(int j=a.size()-1; j>=0; j--){
                int val = Math.abs(b.get(i)*a.get(j))+carryover;
                carryover = val/10;
                curr.set(j+b.size()-col,val%10);
            }
            if(carryover!=0) curr.set(b.size()-col-1,carryover);
            col++;
        }

        List<Integer> result = addAll(allList);

        int i=0;
        while(i==0){
            if(result.get(i)==0 && result.size()!=1) result.remove(i);
            else result.set(i, result.get(i++)*multiplier);
        }

        System.out.println("result: " + result);

        return result;
    }

    private static List<Integer> addAll(List<List<Integer>> allList){
        int carryOver =0;
        for(int col = allList.get(0).size()-1; col>=0; col--){
            int tempSum = 0;

            for(int row=0; row<allList.size(); row++){
                tempSum += allList.get(row).get(col);
            }
            tempSum += +carryOver;
            carryOver = tempSum/10;
            allList.get(allList.size()-1).set(col,tempSum%10);
        }

        for (List<Integer> list: allList
        ) {
            System.out.println(list.toString());
        }

        return allList.get(allList.size()-1);
    }

}
