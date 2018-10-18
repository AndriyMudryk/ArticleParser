abstract class Matcher {
}

class HouseMatcher extends Matcher {

    static String[] roomNumberEx = {"кімнат", "кімнатами"};

    public boolean matchRoomNumber(String text) {
        for (String example : roomNumberEx) {
            if(text.contains(example)){
                return  true;
            }
        }
        return false;
    }
}
