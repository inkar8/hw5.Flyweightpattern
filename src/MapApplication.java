public class MapApplication {
    public static void main(String[] args) {
        // Создание и отображение маркеров с использованием стилей
        MarkerStyle hospitalStyle = MarkerStyleFactory.getStyle("hospital", "red", "bold");
        MarkerStyle restaurantStyle = MarkerStyleFactory.getStyle("restaurant", "green", "italic");

        // Создаем маркеры с разными стилями
        Marker marker1 = new Marker("Gas Station, City Center", hospitalStyle);
        Marker marker2 = new Marker("Restaurant, Downtown", restaurantStyle);
        Marker marker3 = new Marker("Hospital, North Side", hospitalStyle); // тот же стиль, что и marker1

        // Отображаем маркеры
        marker1.displayMarker();
        marker2.displayMarker();
        marker3.displayMarker();

        // Показываем количество уникальных стилей
        System.out.println("Количество уникальных стилей: " + MarkerStyleFactory.getUniqueStylesCount());

        // Логируем количество маркеров и уникальных стилей
        logMarkerStatistics();
    }

    private static void logMarkerStatistics() {
        int totalMarkers = 3; // В примере три маркера
        int uniqueStyles = MarkerStyleFactory.getUniqueStylesCount();
        System.out.println("Общее количество маркеров: " + totalMarkers);
        System.out.println("Уникальных стилей: " + uniqueStyles);
    }
}
