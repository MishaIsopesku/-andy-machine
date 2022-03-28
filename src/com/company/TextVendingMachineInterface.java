package com.company;

public class TextVendingMachineInterface implements VendingMachineInterface {

    private VendingMachineController controller = new SimpleVendingMachineController();
    private int selectedProduct;
    private CoinBundle change;


    @Override
    public void displayProducts() {
        System.out.println(" *********************************************");
        System.out.println("               ЛАСКАВО ПРОСИМО                ");
        System.out.println("              ЦУКЕРОЧНИЙ АВТОМАТ              ");
        System.out.println(" *********************************************");
        System.out.println("              Доступні продукти:              ");
        System.out.println("                                              ");
        for(Product product: Product.values()){
            if(!Product.EMPTY.equals(product)) {
                System.out.println("     " + product.getSelectionNumber() + "  " + product.name() + " - Ціна: " + product.getPrice() + " Монет");
            }
        }
        System.out.println("                                              ");
        System.out.println(" Будь ласка, виберіть свій продукт: ");


    }

    @Override
    public void selectProduct(int product) {
        this.selectedProduct = product;
    }

    @Override
    public void displayEnterCoinsMessage() {
        System.out.println(" Будь ласка, введіть монети таким чином: ");
        System.out.println(" кількість монет номіналом 5 центів, кількість монет номіналом 10 центів, кількість монет номіналом 20 центів, кількість монет номіналом 50 центів, кількість монет номіналом 100 центів  ");
        System.out.println("                                              ");
        System.out.println(" Приклад: якщо ви хочете ввести 2 монети по десять центів: 0,2,0,0,0");
        System.out.println("Будь ласка,введіть монети:");

    }

    @Override
    public void enterCoins(int... coins) {
        VendingMachineRequest request = new VendingMachineRequest(selectedProduct, coins);
        change = controller.calculateChange(request);

    }

    @Override
    public void displayChangeMessage() {
        System.out.println("                                              ");
        System.out.println("Ваша зміна: " + change.getTotal() + " центи розподіляються таким чином: ");
        System.out.println("    100 cents coins: "+ change.number100CentsCoins);
        System.out.println("    50 cents coins: "+ change.number50CentsCoins);
        System.out.println("    20 cents coins: "+ change.number20CentsCoins);
        System.out.println("    10 cents coins: "+ change.number10CentsCoins);
        System.out.println("    5 cents coins: "+ change.number5CentsCoins);

    }
}
