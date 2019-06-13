package com.fmsd.liu.Views.HorizontalHuaDongView.recyclerview;

/**
 * @author carl
 */
public interface SnappyScrollCalculator {
    int computeScrollToItemIndex(int velocityX, int velocityY);
}
