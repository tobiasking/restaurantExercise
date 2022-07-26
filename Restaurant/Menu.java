package Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastUpdated;
    private ArrayList<MenuItems> menuList;

    public Menu(Date lastUpdated, ArrayList<MenuItems> menuList) {
        this.lastUpdated = lastUpdated;
        this.menuList = menuList;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItems> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<MenuItems> menuList) {
        this.menuList = menuList;
    }
}
