package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalbelanja = 30000;
        double uangDompet = 85000;

        if(uangDompet<totalbelanja){
            System.out.println("Uang Kurang");
        }else if(uangDompet>totalbelanja){
            double angsul = uangDompet-totalbelanja;
            System.out.println("Uang Cukup :"+angsul);
        }else{
            System.out.println("Uang pas..");
        }
    }
}
