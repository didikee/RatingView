package didikee.ratingview.sample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.RippleDrawable;
import android.util.Log;
import android.view.View;

/**
 * Created by didikee on 2017/10/18.
 */

public class RatingView extends View {
    private static final String TAG = "RatingView";
    // eg: 1,2,3,4,5
    private int star;
    private Paint mBackgroundPaint;
    private Paint mTextPaint;
    private int textColor = Color.BLUE;
    private int backgroundColor = Color.GRAY;
    private boolean isChecked = false;


    public RatingView(Context context) {
        super(context);
        init();
    }

//    public RatingView(Context context, @Nullable AttributeSet attrs) {
//        super(context, attrs);
//    }
//
//    public RatingView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//    }
//
//    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
//    public RatingView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }


    private void init() {
        mBackgroundPaint = new Paint();
        mBackgroundPaint.setColor(backgroundColor);

        mTextPaint = new Paint();
        mTextPaint.setColor(textColor);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        drawDuo(canvas);
        drawText(canvas,star);

    }

    private void drawDuo(Canvas canvas) {
        int corner = UIUtil.dp2px(getContext(), 4);
        mBackgroundPaint.setPathEffect(new CornerPathEffect(corner));
        mBackgroundPaint.setStyle(Paint.Style.STROKE);//设置空心

        //画背景的形状
        int height = getMeasuredHeight();
        int width = getMeasuredWidth();

        Log.d(TAG,"width: "+ width +"  height: "+height);

        double tan = Math.tan(Math.toRadians(36));
        Log.d(TAG,"tan: "+ tan );
        float centerHeight = (float) ((width * 1.0f) / (2 * tan));
        Log.d(TAG,"centerHeight: "+ centerHeight );

        Path path = new Path();
        path.moveTo(width /2 ,0);
        path.lineTo(width, height - centerHeight);
        path.lineTo(width /2 ,height);
        path.lineTo(0,height - centerHeight);
        path.close();
        canvas.drawPath(path,mBackgroundPaint);

    }

    public void drawText(Canvas canvas,int star){
        // TODO 根据star 确定位置，并画出文字
//        canvas.drawText();

        RippleDrawable
    }

    public void setCheck(boolean isCheck){
        if (this.isChecked == isCheck){
            return;
        }
        isChecked = !isChecked;
        // TODO draw ripple
        if (isChecked){

        }
    }

    public void setStar(int star){
        this.star = star;
    }
}
