import java.util.ArrayList;


public class Tasks extends House {

    static void showAll(int countOfRooms, int minLayer, int maxLayer,
        int area) {
        fillObjects();
        showData();

        showTasks(task1(countOfRooms));

        showTasks(task2(countOfRooms, minLayer, maxLayer));

        showTasks(task3(area));
    }

    static private void showTasks(ArrayList<Integer> array) {

        for (int el : array) {
            System.out.println("\tКвартира №" + el);
        }
    }

    static private void showData() {

        for (int i = 0; i < apartments.length; i++) {
            System.out.print("House №" + (i + 1) + ":\n");
            System.out.print(apartments[i].toString());
        }
    }

    static private ArrayList<Integer> task1(int count) {

        System.out.print("\nКвартири з числом кімнат " + count + " :\n");

        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < apartments.length; i++) {
            if (apartments[i].getCountOfRooms() == count) {
                array.add(i + 1);
            }
        }

        return array;
    }

    static private ArrayList<Integer> task2(int count, int min, int max) {

        System.out.print(
            "\nКвартири з числом кімнат " + count + " та на поверсі в проміжку від " + min + " до "
                + max + " :\n");

        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < apartments.length; i++) {
            if ((apartments[i].getCountOfRooms() == count) && apartments[i].getLayer() >= min
                && apartments[i].getLayer() <= max) {
                array.add(i + 1);
            }
        }

        return array;
    }

    static private ArrayList<Integer> task3(int area) {

        System.out.print("\nКвартири, площа яких перевищує " + area + " :\n");

        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < apartments.length; i++) {
            if (apartments[i].getArea() > area) {
                array.add(i + 1);
            }
        }

        return array;
    }
}
