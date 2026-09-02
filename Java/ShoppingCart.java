public class ShoppingCart {
    private String[] products;
    private int index = 0;

    public ShoppingCart() {
        products = new String[5];
        // Initialize the array with a size of 5
    }

    public void addToCart(String product) {
        if (index >= 0 && index < products.length) {
            products[index] = product;
            index++;
        } else {
            System.out.println("Cart is full.");
        }
    }

    public void checkout() {
        System.out.println("Checking out the following products:");

        for (String product : products) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addToCart("Marker");
        cart.addToCart("Duster");
        cart.addToCart("Pen");

        cart.checkout();
    }
}