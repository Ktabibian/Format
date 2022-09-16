public class Forming {
    public static String printReceipt(String product, int qty, double price, float miles){
        double fee;
        double total = qty * price;
        if(miles <= 4){
            fee = 2.00f;
            total =total + fee;
        }else if(miles > 4 && miles <= 15){
            fee = 5.00f;
            total = total + fee;
        }else if(miles > 15 && miles <= 25){
            fee = 10.00f;
            total = total + fee;
        }else if(miles > 25 && miles <= 50){
            fee = 5.00f;
            total = total + fee;
        }else{
            fee = 20.00f;
            total = total + fee;
        }
        String results = String.format("%s %8s %10s %10s %14s %11s %10s %10s %14s %11s %10.1f %9.1f %,10.1f %s", "Product", "Qty", "Price", "Miles", "Total\n" + "----", "---", "-----", "-----", "-----\n" + product, qty, price, miles, total, "\n\t\t\t  Thank you. Come Again!!!");
        return results;
        //return String.format("Product      Qty      Price       Miles      Total" + "\n" + "----         ---      -----      -----      -----" + "\n" + "%s          %d        %.1f       %.1f      %.1f" + "\n" + "\t\t      Thank you. Come Again!!!", product, qty, price, miles, total);
    }

    public static void main(String[] args) {
        System.out.println(printReceipt("Rice", 20, 5.00, 10.00f));
    }
}
//cake 200 5.75 102.78

