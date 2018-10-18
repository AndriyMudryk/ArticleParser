abstract class Parser {

    abstract boolean regexParse(String text);
}

class HouseParser extends Parser {
    HouseInfo house;
    boolean isParsed;

    public HouseParser() {
        this.house = new HouseInfo();
        this.isParsed = false;
    }

    private int parseInt(String text) {
        try {
            return Integer.parseInt(text);
        } catch (Exception e) {
            return -1;
        }
    }

    public HouseInfo getHouse(){
        return this.house;
    }

    public boolean regexParse(String text) {
        boolean returnValue = true;
        //rooms
        String[] rooms = HouseMatcher.matchRoomNumber(text).split("\\s+");
        if (rooms.length > 1) {
            if (parseInt(rooms[0]) != -1) {
                house.setRoomNumber(parseInt(rooms[0]));
            } else if (parseInt(rooms[1]) != -1) {
                house.setRoomNumber(parseInt(rooms[1]));
            } else {
                returnValue = false;
            }
        } else {
            returnValue = false;
        }
        //address
        String[] address = HouseMatcher.matchAddress(text).split("\\s+");
        if(address.length > 1) {
            house.setAddress(address[1]);
        }
        else{
            returnValue = false;
        }
        //floor
        String[] floor = HouseMatcher.matchFloor(text).split("\\s+");
        if (floor.length > 1) {
            if (parseInt(floor[0]) != -1) {
                house.setFloor(parseInt(floor[0]));
            } else if (parseInt(floor[1]) != -1) {
                house.setFloor(parseInt(floor[1]));
            } else {
                returnValue = false;
            }
        } else {
            returnValue = false;
        }
        //type
        String type = HouseMatcher.matchType(text);
        if(type != "") {
            house.setType(type);
        }
        else {
            returnValue = false;
        }
        //roomType
        String[] roomType = HouseMatcher.matchRoomType(text).split("\\s+");
        if(roomType.length > 2){
            house.setRoomType(roomType[2]);
        }
        else{
            returnValue = false;
        }
        //kitchen
        String kitchen = HouseMatcher.matchKitchen(text);
        if(kitchen != ""){
            house.setKitchen(true);
        }
        else {
            house.setKitchen(false);
        }
        //area
        String[] area = HouseMatcher.matchArea(text).split("\\s+");
        if(area.length > 1){
            house.setArea(parseInt(area[0]));
        }
        else{
            returnValue = false;
        }
        //balcony
        String balcony = HouseMatcher.matchBalcony(text);
        if(balcony != ""){
            house.setBalcony(true);
        }
        else{
            house.setBalcony(false);
        }

        //style
        String style = HouseMatcher.matchStyle(text);
        if(style != ""){
            house.setStyle(true);
        }
        else{
            house.setStyle(false);
        }
        //price
        String[] price = HouseMatcher.matchPrice(text).split("\\s+");
        if(price.length > 1){
            house.setPrice(parseInt(price[0]));
        }
        else{
            returnValue = false;
        }
        return returnValue;
    }
}