package FindTheParityOutlier;

public class FindApp {
    public static int ParityOutlier(int[] arr)
    {
         for (int i = 0; i < arr.length; i++) {
            if(Math.sqrt(arr[i])%2 != Math.sqrt(arr[i+1])%2)
            {
                if(i == 0)
                {
                    if(Math.sqrt(arr[i+1])%2 != Math.sqrt(arr[i+2])%2)
                        return arr[i+1];
                    else
                        return  arr[i];
                }
                else
                {
                    if(Math.sqrt(arr[i-1])%2 != Math.sqrt(arr[i])%2)
                        return arr[i];
                    else
                        return  arr[i+1];
                }

             }
        }
return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{-44,-1,1};
        System.out.println(ParityOutlier(arr));

    }
}
