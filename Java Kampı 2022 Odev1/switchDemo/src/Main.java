public class Main {

    public static void main(String[] args) {
	// write your code here
        char grade='B';

        switch(grade){
            case 'A':
                System.out.println("Mükkemmel : Geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Malesef : Kaldınız");
                break;
            default:
                System.out.println("Geçerli not giriniz");
        }
    }
}
