package com.dymicSearchBar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * Created by ${巴黎没有摩天轮Li} on 2017/7/4.
 */

public class MyScrollView extends ScrollView {

        private OnScrollListener onScrollListener;
        public MyScrollView(Context context, AttributeSet attrs) {
            super(context, attrs);
        }
        public void setOnScrollListener(OnScrollListener scrollListener) {
            this.onScrollListener = scrollListener;
        }
        @Override
        protected void onScrollChanged(int l, int t, int oldl, int oldt) {
            super.onScrollChanged(l, t, oldl, oldt);
            if (onScrollListener!=null){
                onScrollListener.onScrollChanged(l,t,oldl,oldt);
            }
        }
        public interface OnScrollListener {
            void onScrollChanged(int x, int y, int oldX, int oldY);
        }

}
