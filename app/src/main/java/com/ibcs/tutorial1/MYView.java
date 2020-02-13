package com.ibcs.tutorial1;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class MYView extends AppCompatTextView {
    public MYView(Context context) {
        super(context);
    }

    public MYView(Context context, AttributeSet attrs) {
        super(context, attrs);

        setText("Always Same");

    }
}
