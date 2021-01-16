public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        double result = 0.0;
        int size = 0;

        for(double[] arr : mat){
            for(double a : arr){
                result += a;
                size ++;
            }
        }

        return result / size;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 

        if(mat.length == 0 || mat[0].length == 0)   return 0.0;
        int size = mat.length * mat[0].length;
        double median = 0;

        int[] idx = {(size - 1) / 2, size / 2};

        median += mat[idx[0]/mat[0].length][idx[0] % mat[0].length];
        median += mat[idx[1]/mat[0].length][idx[1] % mat[0].length];
        median /= 2;
        return median;
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        double mode = mat[0][0];
        double pre = mat[0][0];
        int maxNum = 0;
        int num = 0;

        for(double[] arr:mat){
            for(double d:arr){
                if(d == pre){
                    num ++;
                }else{
                    if(num > maxNum){
                        maxNum = num;
                        mode = pre;
                    }
                    num = 1;
                    pre = d;
                }
            }
        }
        return mode;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
