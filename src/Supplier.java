public class Supplier {
    private int id;
    private String name;
    private SupplierDetail supplierDetail;

    public Supplier(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SupplierDetail getSupplierDetail() {
        return supplierDetail;
    }

    public void setSupplierDetail(SupplierDetail supplierDetail) {
        this.supplierDetail = supplierDetail;
    }
}
