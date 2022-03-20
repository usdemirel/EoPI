import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class BuySellStockTwice {

    /*
    6.7 Note-Serkan: The book has a similar but better solution on this one. If you try this one again, use an array instead
    of a map.
    */

    public static int buySellStockTwice(List<Integer> A) {

        HashMap<Integer, Integer> maxMap = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = 0;
        int maxProfit=0;

        //n time
        for(int i=0; i<A.size(); i++){
            maxProfit = Math.max(A.get(i) - min,maxProfit);
            maxMap.put(i+1,maxProfit);
            min=Math.min(min,A.get(i));
        }

        //n time
        maxProfit=0;
        for(int i=A.size()-1; i>=0; i--){
            maxProfit = Math.max(max-A.get(i),maxProfit);
            maxMap.put(i,maxProfit+maxMap.getOrDefault(i,0));
            max = Math.max(max,A.get(i));
        }

        //n time
        return maxMap.values().stream().max(Comparator.comparingInt(Integer::intValue)).get();
    }

}
