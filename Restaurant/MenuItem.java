package Restaurant;

import java.util.Date;
import java.util.Objects;

public class MenuItem {
    public String foodName;
    public double price;
    public String description;
    public String category;
    public boolean isNew; // Tells if the menu item is new to the menu
    public Date dateAdded; // Date menu item is added so that we can tell if it isNew


    public MenuItem(String foodName, double price, String description, String category) {
        this.foodName = foodName;
        this.price = price;
        this.description = description;
        this.dateAdded = dateAdded;
        this.category = category;
        this.isNew = false;
    }

    public void setDateAdded(Date uDateAdded) {
        this.dateAdded = uDateAdded;
    }


    // Getters
    public String getFoodName() {
        return foodName;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    // Convert to string
    public String toString() {
        return foodName + "\n" + description + "\n" + price + "\nIs New:  " + isNew + "\nDate added? " + getDateAdded();
    }
}