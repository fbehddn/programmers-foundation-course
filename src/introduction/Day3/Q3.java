package introduction.Day3;

public class Q3 {
    public int solution(int[] array) {
        int answer = 0;
        int max=0;
        int []arr = new int[1001];

        for(int i=0; i<array.length; i++){
            arr[array[i]]++;
        }


        for(int i=0; i<=arr.length-1; i++){
            if(max < arr[i]){
                max=arr[i];
                answer=i;
            }else if(max==arr[i]){
                answer= -1;
            }
        }
        return answer;
    }
}
