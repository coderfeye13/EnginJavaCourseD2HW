public class Product {
    public Product(int id, String name, String description, Double price, int stockAmount, String renk){

        System.out.println("Default olarak atanan constructor class çalışıyor");
        this._id = id;
        this._renk = renk;
        this._name = name;
        this._description = description;
        this._price = price;
        this._stockAmount = stockAmount;
    }
    public Product(){

    }

    //Attribute or field
    private int _id;
    private String _name;
    private String _description;
    private Double _price;
    private int _stockAmount;
    private String _renk;
    private String _kod;

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public Double getPrice() {
        return _price;
    }

    public void setPrice(Double price) {
        _price = price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }

    public String getRenk() {
        return _renk;
    }

    public void setRenk(String renk) {
        _renk = renk;
    }

    public String getKod() {
        return _kod;
    }

    public void setKod(String kod) {
        _kod = kod;
    }
}
