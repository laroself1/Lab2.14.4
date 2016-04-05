/**
 * Created by LaroSelf on 06.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        Integer arr1[] = {1,2,3,4,5,6,7,8,9};
        String arr2[] = {"one","two","three","four","five","six"};
     MyMixer.shuffle(arr1);
        MyMixer.shuffle(arr2);
        for (Integer t:arr1 ) {
            System.out.print(t);
        }
        System.out.println();
        System.out.println("----------------------");
        for (String t:arr2){
            System.out.print(t+" ");
        }
    }
}
