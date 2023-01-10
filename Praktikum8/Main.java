package Praktikum8;


public class Main {
    public static void main(String[] args) {

        // membuat object orderan pada pada kelas Order
        Order orderan1 = new Order(121123,"Paylatter",new OrderDetail("5%"));
        // object OrderDetail
        OrderDetail barang = new OrderDetail("5%");
        barang.setQuantity(new Item("harga barang           : 100000", (float)12121));

        // List data customer menggunakan setter
        orderan1.setDataCustomer(new Customer("Ambar","patio,Jawa Utara,12255"));

        /* callmethod menggunakan for dan Arrsday.asList pada infoOrderan
         beserta operasi class lain
         */
        orderan1.infoOrderan();
        orderan1.SubTotal();
        orderan1.TotalWeight();
        orderan1.Total();
        barang.calcSubTotal();
        barang.calcWeight();
        orderan1.calcTax();



    }
}
