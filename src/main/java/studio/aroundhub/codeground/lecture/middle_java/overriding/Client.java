package studio.aroundhub.codeground.lecture.middle_java.overriding;

public class Client {

  public Client() {
    FoodMarket foodMarket = new FoodMarket();
    foodMarket.stack("빵", 5, 1200);
    foodMarket.buy("빵");
    foodMarket.stack("김치", 2, 5000);
    foodMarket.buy("김치");
    foodMarket.buy("김치");
    foodMarket.buy("김치");

    FishMarket fishMarket = new FishMarket();
    fishMarket.stack("고등어", 5, 1200);
    fishMarket.buy("고등어");
    fishMarket.buy("참치");
    fishMarket.stack("꽁치", 2, 5000);
    fishMarket.buy("꽁치");
    fishMarket.buy("꽁치");
    fishMarket.buy("꽁치");
  }

  public static void main(String[] args) {
    new Client();
  }
}
