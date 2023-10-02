public class Rubles {
    double pricePerson;

    Rubles(double pricePerson){
        this.pricePerson=pricePerson;
    }
    void formatter(double pricePerson){
        String message = "Каждый человек должен заплатить: %.2f %s";
        double x = Math.floor(pricePerson)%10;
        double y = Math.floor(pricePerson)%100;
        if (y>10 && y<20 || x>4 && x<10 || x == 0 || y == 0){
            System.out.printf((message) + "%n",pricePerson,"рублей");
        } else if (x==1) {
            System.out.printf((message) + "%n",pricePerson,"рубль");
        } else {
            System.out.printf((message) + "%n",pricePerson,"рубля");
        }

    }
}


