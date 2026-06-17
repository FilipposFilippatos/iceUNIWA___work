package citiesapp;


public class Entity {
    private int id;
    private String name;
    private String address;
    private String category;
    private int cityId;

    public Entity(int id, String name, String address, String category, int cityId) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.category = category;
        this.cityId = cityId;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getCategory() { return category; }
    public int getCityId() { return cityId; }
}
