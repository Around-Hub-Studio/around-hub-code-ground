package studio.aroundhub.codeground.lecture.middle_java.overriding;

import java.util.ArrayList;

public class FoodMarket implements Market {

    private ArrayList<String> productList;
    private ArrayList<Integer> size, value;

    public FoodMarket(){
        System.out.println("음식가게에 도착했습니다.");
        System.out.println();

        productList = new ArrayList<>();
        size = new ArrayList<>();
        value = new ArrayList<>();
    }

    @Override
    public void stack(String product, int quantity, int value) {
        this.productList.add(product);
        this.size.add(quantity);
        this.value.add(value);
    }

    @Override
    public void buy(String product) {
        String prd = "";
        int index = 0;
        for(int i = 0 ; i < productList.size(); i++){
            if(productList.get(i).equalsIgnoreCase(product)){
                prd = productList.get(i);
                index = i;
            }
        }
        if(prd.equalsIgnoreCase("")){
            System.out.println("해당 상품이 없습니다.");
            return;
        }

        if (size.get(index) > 0) {
            int s = size.get(index);
            s--;
            size.set(index, s);

            System.out.println("음식을 구매하였습니다. 상품명 : " + prd + ", 남은 재고 : " + s + ", 금액 : " + value.get(index));
        }else {
            System.out.println("재고가 없습니다.");
        }
        System.out.println();
    }

}
