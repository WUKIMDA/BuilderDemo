package witbj.kimda.com.textviewbuilder.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.annotation.ColorInt;
import android.util.AttributeSet;

/**
 * Created by BUTTON on 2017-05-22.
 */

public class MyTextView extends android.support.v7.widget.AppCompatTextView {
    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context,  AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context,AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    public CharSequence mText;
    public ColorStateList mTextColor;

    @Override
    public void setText(CharSequence text, BufferType type) {
        mText = text;
        super.setText(text, type);
    }

    @Override
    public void setTextColor(@ColorInt int color) {
        mTextColor = ColorStateList.valueOf(color);
        super.setTextColor(color);
    }

    @Override
    public String toString() {
        return "MyTextView{" +
                "mText=" + mText +
                ", mTextColor=" + mTextColor +
                '}';
    }
}
