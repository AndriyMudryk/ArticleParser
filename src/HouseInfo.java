import org.json.simple.JSONObject;

public class HouseInfo {
    int roomNumber;
    String address;
    int floor;
    String type;
    String roomType;
    boolean kitchen;
    double area;
    boolean balcony;
    String style;
    double price;

    public HouseInfo() {
        this.roomNumber = -1;
        this.address = "";
        this.floor = -1;
        this.type = "";
        this.roomType = "";
        this.kitchen = false;
        this.area = -1.0;
        this.balcony = false;
        this.style = "";
        this.price = -1;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setKitchen(boolean kitchen) {
        this.kitchen = kitchen;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFullPrice() {
        if (this.area > 0 && this.price > 0) {
            return this.area * this.price;
        }
        return -1;
    }

    public String toString() {
        return this.toJSON().toString();
    }

    public JSONObject toJSON() {
        JSONObject obj = new JSONObject();

        obj.put("roomNumber", this.roomNumber);
        obj.put("address", this.address);
        obj.put("floor", this.floor);
        obj.put("type", this.type);
        obj.put("roomType", this.roomType);
        obj.put("kitchen", (this.kitchen) ? "Yes" : "No");
        obj.put("area", this.area);
        obj.put("balcony", (this.balcony) ? "Yes" : "No");
        obj.put("style", this.style);
        obj.put("price", this.price);
        obj.put("fullPrice", this.getFullPrice());

        return obj;
    }

}
