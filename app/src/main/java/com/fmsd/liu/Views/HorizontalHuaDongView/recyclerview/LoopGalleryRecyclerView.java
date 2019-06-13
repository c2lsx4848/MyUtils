package com.fmsd.liu.Views.HorizontalHuaDongView.recyclerview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

/*类似画廊的recyclerview，并且前一个和后一个会有缩放的效果*/
public class LoopGalleryRecyclerView extends RecyclerView {
    Context mContext;

    public LoopGalleryRecyclerView(Context context) {
        super(context);
        init(context);
    }

    public LoopGalleryRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public LoopGalleryRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    public void init(Context context) {
        mContext = context;
        //渐变
        addOnScrollListener(new OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                int middle = (int) (getX() + getWidth() / 2);
                for (int i = 0; i < getChildCount(); i++) {
                    View child = getChildAt(i);
                    int childMiddle = (int) (child.getX() + child.getWidth() / 2);
                    int gap = Math.abs(middle - childMiddle);
                    float fraction = gap * 1.0f / getWidth() / 2;
                    scale(child, fraction);
                }
            }

            private void scale(View child, float fraction) {
                final float MIN_SCALE = 0.65f;
                float scaleFactor = MIN_SCALE + (1 - MIN_SCALE) * (1 - Math.abs(fraction));
                child.setScaleX(scaleFactor);
                child.setScaleY(scaleFactor);
            }
        });
    }
}
