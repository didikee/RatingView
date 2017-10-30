package didikee.ratingview.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ViewGroup container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container = (ViewGroup) findViewById(R.id.container);

        addRatingView(0);

    }

    private void addRatingView(int star){
        RatingView ratingView =new RatingView(this);
        int width = UIUtil.dp2px(this, 48);
        int height = UIUtil.dp2px(this, 88);
        LinearLayout.LayoutParams params =new LinearLayout.LayoutParams(width,height);
        container.addView(ratingView,params);
    }
}
