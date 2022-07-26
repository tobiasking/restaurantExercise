package Restaurant;

import java.util.Date;

public class MenuItems {

    private double price;
    private String description;
    private String category;
    private Date dateAdded;
    private boolean isNew;

    public MenuItems(double price, String description, String category, Date dateAdded, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
        this.isNew = isNew;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    }
