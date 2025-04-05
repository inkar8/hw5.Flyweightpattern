public class MarkerStyle {
    private String iconType;
    private String color;
    private String labelStyle;

    // Конструктор для инициализации стиля маркера
    public MarkerStyle(String iconType, String color, String labelStyle) {
        this.iconType = iconType;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    // Геттеры
    public String getIconType() {
        return iconType;
    }

    public String getColor() {
        return color;
    }

    public String getLabelStyle() {
        return labelStyle;
    }

    // Отображение информации о маркере
    public void displayStyle() {
        System.out.println("Icon: " + iconType + ", Color: " + color + ", Label: " + labelStyle);
    }
}
