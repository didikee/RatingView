package didikee.ratingview.sample;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by didikee on 2017/10/18.
 */

public class RatingLayout extends ViewGroup {
    private static final String TAG = "RatingLayout";
    private ArrayList<RatingView> mRatingViews =new ArrayList<>();
    public RatingLayout(Context context) {
        super(context);
        initRatingView();
    }

    public RatingLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RatingLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public RatingLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    /**
     * 5星好评
     */
    private void initRatingView(){
        int starSize = 5;
        int width = UIUtil.dp2px(getContext(),56);
        int height = UIUtil.dp2px(getContext(),124);
        for (int i = 1; i <= starSize; i++) {
            RatingView ratingView =new RatingView(getContext());
            LayoutParams layoutParams = ratingView.getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = height;
            ratingView.setLayoutParams(layoutParams);

            ratingView.setStar(i);

        }
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }
}
