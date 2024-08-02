import java.util.Calendar;

public class TelevisionController {
    private Television television;

    public double calcPrice(){
        rebatebyYear();
        rebateisAndroid();
        rebatebySupplier();
        return television.getPrice();
    }
    public double rebatebyYear(){
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        if (television.getYear()==currentYear){
            television.setPrice(television.getPrice());
        }
        else if (currentYear-television.getYear()>=1 && currentYear-television.getYear()<=2){
            television.setPrice(0.8*television.getPrice());
        }
        else if (currentYear-television.getYear()>2){
            television.setPrice(0.6*television.getPrice());
        }
        return television.getPrice();
    }
    public double rebateisAndroid(){
        if(television.isAndroid() == true){
            television.setPrice(television.getPrice()-100);
        }
        else{
            television.setPrice(television.getPrice());
        }
        return television.getPrice();
    }
    public double rebatebySupplier(){
        if (television.getSupplier().getName().equals("Sony Melaka")){
            television.setPrice(television.getPrice()-300);
        }
        else if (television.getSupplier().getName().equals("LG Melaka")){
            television.setPrice(television.getPrice()-200);
        }
        else if (television.getSupplier().getName().equals("Samsung Melaka")){
            television.setPrice(television.getPrice()-100);
        }
        else{
            television.setPrice(television.getPrice()-400);
        }
        return television.getPrice();
    }

    public Television getTelevision() {
        return television;
    }

    public void setTelevision(Television television) {
        this.television = television;
    }
}
