package warmup.pkg1_nearhundred;

public class WarmUp1_NearHundred {

    public static void main(String[] args) {
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
        System.out.println(nearHundred(190));
        System.out.println(nearHundred(189));
    }
    
    public static boolean nearHundred(int n){
        if ((n >= 90) && (n <= 100)){
            return true;
        }
        return (n >= 190) && (n <= 200);
        }    
    }

