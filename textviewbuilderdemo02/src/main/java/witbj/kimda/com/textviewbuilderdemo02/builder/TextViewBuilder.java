package witbj.kimda.com.textviewbuilderdemo02.builder;

import android.content.Context;
import android.widget.TextView;

/**
 * Created by BUTTON on 2017-05-22.
 */

public class TextViewBuilder {
    private Context mContext;
    private String mText;
    private int mColor;

    public TextViewBuilder(Context context) {
        mContext = context;
    }

    public TextViewBuilder setText(String text) {
        mText = text;
        return this;
    }

    public TextViewBuilder setColor(int color) {
        mColor = color;
        return this;
    }

    public TextView build() {
        TextView textView = new TextView(mContext);
        setTextView(textView);
        return textView;
    }

    //手动设置TextView对象
    private void setTextView(TextView textView) {
        textView.setText(mText);
        if (mColor != 0) {
            textView.setTextColor(mColor);
        }
    }

}
