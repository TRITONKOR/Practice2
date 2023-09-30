public class House {

    static House[] apartments = new House[20];
    private String address;
    private int layer;
    private int countOfRooms;
    private int area;

    static protected void fillObjects() {

        for (int i = 0; i < apartments.length; i++) {
            apartments[i] = new House();
            apartments[i].setArea((int) (10 + Math.random() * 20));
            apartments[i].setCountOfRooms((int) (1 + Math.random() * 3));
            apartments[i].setAddress("Uzhgorod");
            apartments[i].setLayer((int) (1 + Math.random() * 9));
        }
    }

    @Override
    public String toString() {
        String message = "";

        message += "\tArea: " + getArea() + "\n";
        message += "\tLayer: " + getLayer() + "\n";
        message += "\tCount of rooms: " + getCountOfRooms() + "\n";
        message += "\tAdress: " + getAdress() + "\n";

        return message;
    }

    public int getArea() {

        return area;
    }

    public void setArea(int area) {

        this.area = area;
    }

    public int getCountOfRooms() {

        return countOfRooms;
    }

    public void setCountOfRooms(int countOfRooms) {

        this.countOfRooms = countOfRooms;
    }

    public String getAdress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public int getLayer() {

        return layer;
    }

    public void setLayer(int layer) {

        this.layer = layer;
    }
}
