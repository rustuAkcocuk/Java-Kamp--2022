public class Main {

    public static void main(String[] args) {
	// write your code here
        BaseKrediManager [] baseKrediManagers=new BaseKrediManager[]
                {new TarimKrediManager(),new OgretmenKrediManager(),new OgrenciKrediManager()};

        for(BaseKrediManager krediManager:baseKrediManagers){
            System.out.println(krediManager.hesapla(1000));
        }
    }
}
