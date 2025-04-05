public class Marker {
    private String location;   // Координаты или описание местоположения
    private MarkerStyle style; // Стиль маркера (иконка, цвет и т.п.)

    // Конструктор
    public Marker(String location, MarkerStyle style) {
        this.location = location;
        this.style = style;
    }

    // Отображение маркера
    public void displayMarker() {
        System.out.println("Маркер на локации: " + location);
        style.displayStyle(); // Показываем стиль маркера
    }
}
