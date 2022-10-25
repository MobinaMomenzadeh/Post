package Classes;

import java.util.ArrayList;

public class House extends Data
{
    public static ArrayList<String> allHousesKey = new ArrayList<String>();
    public static ArrayList<House> allHouses = new ArrayList<House>();
    private String owner_nationalId;
    private String price;
    private String postalCode;
    private String area;
    private String address;

    public House(String owner_nationalId, String price, String postalCode, String area, String address) {
        this.owner_nationalId = owner_nationalId;
        this.price = price;
        this.postalCode = postalCode;
        this.area = area;
        this.address = address;
        this.key = postalCode;

        allHouses.add(this);
        allHousesKey.add(postalCode);
    }


    public static ArrayList<House> getAllHouses() {return allHouses;}
    public String getOwner_nationalId() {return owner_nationalId;}
    public String getPrice() {return price;}
    public String getPostalCode() {return postalCode;}
    public String getArea() {return area;}
    public String getAddress() {return address;}
    public String getKey(){return (String) key;}


    @Override
    public String toString() {
        return "Classes.House{" +
                "owner_nationalId='" + owner_nationalId + '\'' +
                ", price='" + price + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", area='" + area + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
