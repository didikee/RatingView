package didikee.ratingview.sample;

import android.content.Context;

/**
 * Created by didikee on 2017/10/18.
 */

public class UIUtil {
    public static int dp2px(Context context, float dp) {
        return (int) (context.getResources().getDisplayMetrics().density * dp + 0.5f);
    }
}
