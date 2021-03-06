package com.terryc7.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by terry.chen on 07/03/2015.
 */
public class CustomBall extends View {
    public float currentX = 40;
    public float currentY = 50;
    Paint p = new Paint();
    public CustomBall(Context context){
        super(context);
    }

    public CustomBall(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
    }

    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        p.setColor(Color.RED);
        canvas.drawCircle(currentX, currentY, 15, p);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent){
        currentX = motionEvent.getX();
        currentY = motionEvent.getY();
        invalidate();
        return true;
    }
}
