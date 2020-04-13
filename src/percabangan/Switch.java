package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch(nilai){
            case 'A':
                System.out.println("Mhs     :\"Terima kasih banyak pak\"");
                System.out.println("Dosen   :\"Iya Sama-sama !\"");
                break;
            case 'B':
                System.out.println("Mhs     :\"Kenapa ulun kada dapat A pak\"");
                System.out.println("Dosen   :\"Kenapa yooo??\"");
                break;
            case 'C':
                System.out.println("Mhs     :\"Ulun ngmpul tarus tugas pa\"");
                System.out.println("Dosen   :\"iyalah\"");
                break;
            default:
                System.out.println("Mhs     :\"Bapa!\"");
                System.out.println("Dosen   :\"Kenapa??\"");
                System.out.println("Mhs     :\"Kpp,kd jadi wkwkwk\"");
                System.out.println("Dosen   :\"Nginih handak cari masalah kah!?\"");
                System.out.println("Mhs     :\"Hehehe... :'( \"");
        }
    }
}
