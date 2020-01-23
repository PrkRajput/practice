package collection;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;



class Result {

    /*
     * Complete the 'missingReservations' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY firstReservationList
     *  2. 2D_INTEGER_ARRAY secondReservationList
     */

    public static List<Integer> missingReservations(List<List<Integer>> firstReservationList, List<List<Integer>> secondReservationList) {
    // Write your code here
        List<Integer> ans = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<firstReservationList.size();i++){
               List<Integer> a =  firstReservationList.get(i);
               map.put(a.get(0),a.get(1));
            } 
        for(int i=0;i<secondReservationList.size();i++){
              if(map.containsKey(secondReservationList.get(i).get(0))){
                  if(map.get(secondReservationList.get(i).get(0)).intValue() !=secondReservationList.get(i).get(1).intValue())
                    ans.add(secondReservationList.get(i).get(0));
              }
              else
                ans.add(secondReservationList.get(i).get(0));
            }    

        return ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int firstReservationListRows = Integer.parseInt(bufferedReader.readLine().trim());
        int firstReservationListColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> firstReservationList = new ArrayList<>();

        IntStream.range(0, firstReservationListRows).forEach(i -> {
            try {
                firstReservationList.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int secondReservationListRows = Integer.parseInt(bufferedReader.readLine().trim());
        int secondReservationListColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> secondReservationList = new ArrayList<>();

        IntStream.range(0, secondReservationListRows).forEach(i -> {
            try {
                secondReservationList.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.missingReservations(firstReservationList, secondReservationList);

       

        bufferedReader.close();
    }
}
