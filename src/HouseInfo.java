import org.json.simple.JSONObject;

public class HouseInfo {
    int roomNumber;
    String address;
    int floor;
    String type;
    String roomType;
    boolean kitchen;
    int area;
    boolean balcony;
    boolean style;
    int price;

    public HouseInfo() {
        this.roomNumber = -1;
        this.address = "";
        this.floor = -1;
        this.type = "";
        this.roomType = "";
        this.kitchen = false;
        this.area = -1;
        this.balcony = false;
        this.style = false;
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

    public void setArea(int area) {
        this.area = area;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public void setStyle(boolean style) {
        this.style = style;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFullPrice() {
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

        obj.put("roomNumber", new Integer(this.roomNumber));
        obj.put("address", this.address);
        obj.put("floor", new Integer(this.floor));
        obj.put("type", this.type);
        obj.put("roomType", this.roomType);
        obj.put("kitchen", (this.kitchen) ? "Yes" : "No");
        obj.put("area", new Integer(this.area));
        obj.put("balcony", (this.balcony) ? "Yes" : "No");
        obj.put("style", (this.style) ? "Yes" : "No");
        obj.put("price", new Integer(this.price));
        obj.put("fullPrice", new Integer(this.getFullPrice()));

        return obj;
    }

}
