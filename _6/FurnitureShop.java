package _6;
import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> furnitureList;

    public FurnitureShop() {
        furnitureList = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public void displayFurniture() {
        for (Furniture furniture : furnitureList) {
            furniture.displayInfo();
        }
    }
}
