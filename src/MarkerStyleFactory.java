import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {
    private static Map<String, MarkerStyle> styles = new HashMap<>();

    // Метод для получения стиля маркера по ключу
    public static MarkerStyle getStyle(String iconType, String color, String labelStyle) {
        String key = iconType + "-" + color + "-" + labelStyle;

        // Если стиль уже существует, возвращаем его, иначе создаем новый
        if (!styles.containsKey(key)) {
            MarkerStyle newStyle = new MarkerStyle(iconType, color, labelStyle);
            styles.put(key, newStyle);
        }

        return styles.get(key);
    }

    // Метод для получения общего количества созданных уникальных стилей
    public static int getUniqueStylesCount() {
        return styles.size();
    }
}
