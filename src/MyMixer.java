/**
 * Created by LaroSelf on 05.04.2016.
 */
public class MyMixer<T> {
    T [] arr;
    public MyMixer(T [] arr){this.arr=arr;}
    public static <T>T[] shuffle(T[]arr){
        int n = arr.length;
        for (int i=0; i<n; i++){
            int random = (int)(Math.random()*(n-i));

            T randomElement = arr[random];
            arr[random]=arr[i];
            arr[i]=randomElement;

        }



        return arr;
    }
}
