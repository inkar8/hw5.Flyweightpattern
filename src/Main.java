public class Main {
    public static void main(String[] args) {
        // Пример использования паттерна Flyweight для маркеров
        System.out.println("==== Работа с маркерами (Flyweight) ====");

        // Создаем стили для маркеров
        MarkerStyle hospitalStyle = MarkerStyleFactory.getStyle("hospital", "red", "bold");
        MarkerStyle restaurantStyle = MarkerStyleFactory.getStyle("restaurant", "green", "italic");

        // Создаем маркеры с этими стилями
        Marker marker1 = new Marker("Gas Station, City Center", hospitalStyle);
        Marker marker2 = new Marker("Restaurant, Downtown", restaurantStyle);
        Marker marker3 = new Marker("Hospital, North Side", hospitalStyle); // тот же стиль, что и marker1

        // Отображаем маркеры
        marker1.displayMarker();
        marker2.displayMarker();
        marker3.displayMarker();

        // Показываем количество уникальных стилей
        System.out.println("Количество уникальных стилей: " + MarkerStyleFactory.getUniqueStylesCount());
    }
}
