public class Rubles {
    double pricePerson;

    Rubles(double pricePerson){
        this.pricePerson=pricePerson;
    }
    void formatter(double pricePerson){
        String message = "Каждый человек должен заплатить: %.2f %s";
        switch ((int) pricePerson%10){
            case 1:
                System.out.printf((message) + "%n",pricePerson,"рубль");
                break;
            case 2,3,4:
                System.out.printf((message) + "%n",pricePerson,"рубля");
                break;
            default:
                System.out.printf((message) + "%n",pricePerson,"рублей");
                break;
        }
    }
}


