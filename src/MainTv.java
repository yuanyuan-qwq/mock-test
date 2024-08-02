public class MainTv {
    public static void main(String[] args) {
        Television tvSony = new Television();

        Supplier sonyMelaka = new Supplier();
        sonyMelaka.setName("Sony Melaka");
        SupplierDetail sonyMelakaDetail = new SupplierDetail();
        sonyMelakaDetail.setEmail("sonymelaka@sony.my");

        sonyMelaka.setSupplierDetail(sonyMelakaDetail);
        tvSony.setSupplier(sonyMelaka);
        tvSony.setSerialNo("Sony0321");
        tvSony.setBrand("Sony");
        tvSony.setAndroid(false);
        tvSony.setYear(2019);
        tvSony.setPrice(3000.00);


        System.out.println("Supplier name is :"+tvSony.getSupplier().getName());
        System.out.println("Supplier email : "+tvSony.getSupplier().getSupplierDetail().getEmail());
        TelevisionController tvController = new TelevisionController();
        tvController.setTelevision(tvSony);
        System.out.println("The price is :"+tvController.calcPrice());

        System.out.println("\n***************************************************\n");

        Television tvLg = new Television();

        Supplier lgMelaka = new Supplier();
        lgMelaka.setName("LG Melaka");
        SupplierDetail lgMelakaDetail = new SupplierDetail();
        lgMelakaDetail.setEmail("lgmelaka@lg.my");



        lgMelaka.setSupplierDetail(lgMelakaDetail);
        tvLg.setSupplier(lgMelaka);
        tvLg.setSerialNo("lgAbc123");
        tvLg.setBrand("LG");
        tvLg.setAndroid(true);
        tvLg.setYear(2015);
        tvLg.setPrice(4000);

        System.out.println("Supplier name is :"+tvLg.getSupplier().getName());
        System.out.println("Supplier email : "+tvLg.getSupplier().getSupplierDetail().getEmail());

        tvController.setTelevision(tvLg);
        System.out.println("The price is :"+tvController.calcPrice());

    }

}
