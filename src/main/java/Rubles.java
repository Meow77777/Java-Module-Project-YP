public class Rubles {
    double pricePerson;

    Rubles(double pricePerson){
        this.pricePerson=pricePerson;
    }
    void formatter(double pricePerson){
        String message = "Каждый человек должен заплатить: %.2f %s";
        if (pricePerson == 1 || Math.floor(pricePerson)%10==1){
            System.out.println(String.format(message,pricePerson,"рубль"));
        } else if (pricePerson == 2 || pricePerson == 3 || pricePerson == 4 || Math.floor(pricePerson)%10==2 ||
                Math.floor(pricePerson)%10==3 || Math.floor(pricePerson)%10==4) {
            System.out.println(String.format(message,pricePerson,"рубля"));
        } else {
            System.out.println(String.format(message,pricePerson,"рублей"));
        }
    }
}


