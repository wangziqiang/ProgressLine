package com.wzq.progressline;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * 方向：1，横向；2，竖向
 * 状态：1，未到达；2，已到达
 * 线色：1，未到达；2，已到达
 * 开始或结束部分的间距
 * 自定义的显示进度线的View
 * Created by 王自强 on 2015/6/1.
 */
public class ProgressLine extends RelativeLayout{

    public ProgressLine(Context context) {
        super(context);
    }

    public ProgressLine(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ProgressLine(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}
