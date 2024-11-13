package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;

        ProductOrder[] productOrders = {order1, order2, order3};

        int sum = 0;
        for (ProductOrder productOrder : productOrders) {
            sum += (productOrder.price * productOrder.quantity);
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
