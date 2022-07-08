package start;

public class methods {

    public String ShowArr(int[] arr)
    {
        String res = "{";
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length-1)
            {
                res+=arr[i];
                res+=" ,";
            }
            else {
                res+=arr[i];
                res+="}";
            }
        }
        return res;
    }

    public int[] RotateArray(int[] arr, int n)
    {
        int[] arrRes = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrRes[i] = arr[i];
        }
        if (n > 0)
        {
            for (int i = 0; i < n; i++) {
                int last = arrRes[arrRes.length-1];
                for (int j = arrRes.length-1; j > 0; j--) {
                    arrRes[j] = arrRes[j-1];
                }
                arrRes[0] = last;
            }
        } else if (n < 0)
        {
            n = n * (-1);
            for (int i = 0; i < n; i++) {
                int first = arrRes[0];
                for (int j = 0; j < arrRes.length-1; j++) {
                    arrRes[j] = arrRes[j+1];
                }
                arrRes[arrRes.length-1] = first;
            }
        }
        return arrRes;
    }

}
