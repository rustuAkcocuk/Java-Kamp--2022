public class Main {

    public static void main(String[] args) {
	// write your code here
        char harf ='I';

        switch(harf){
            case 'A':
            case 'I':
            case 'U':
            case 'O':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce seli harf");
        }
    }
}
