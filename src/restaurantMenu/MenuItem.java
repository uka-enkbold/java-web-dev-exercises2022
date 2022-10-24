package restaurantMenu;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean IsNew;

    private String name;

    public MenuItem(double price, String description, String category, boolean IsNew, String name) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.IsNew = IsNew;
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

    public boolean isNew() {
        return IsNew;
    }

    public void setNew(boolean aNew) {
        IsNew = aNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
