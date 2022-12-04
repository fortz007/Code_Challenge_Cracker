package simple;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Challenge {
    public static boolean classPhotos(List<Integer> blueShirtHeights, List<Integer> redShirtHeights) {
        Boolean colour = true;
            for (int i = 0; i < redShirtHeights.size(); ++i) {
                if (redShirtHeights.get(i) > blueShirtHeights.get(i)) {
                    return false;
                }
            }
            return colour;
        }
    }
