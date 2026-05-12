import java.util.*;

public class Merge_intervals_56 {
    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    public static int[][] merge(int[][] intervals){
        if(intervals.length<=1){
            return  intervals;
        }
         Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
        List<int[]> result=new ArrayList<>();
        int [] newintervals= intervals[0];
        result.add(newintervals);

        for(int[] interval:intervals){
            if(interval[0]<=newintervals[1]){
                newintervals[1]=Math.max(interval[1],newintervals[1]);
            }
            else{
                newintervals=interval;
                result.add(newintervals);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
