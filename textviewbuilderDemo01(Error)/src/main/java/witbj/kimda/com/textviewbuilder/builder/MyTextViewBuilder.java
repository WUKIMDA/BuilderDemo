package witbj.kimda.com.textviewbuilder.builder;

import android.content.Context;
import android.content.res.ColorStateList;

import witbj.kimda.com.textviewbuilder.view.MyTextView;

/**
 * Created by BUTTON on 2017-05-22.
 */

public class MyTextViewBuilder extends  BaseBuilder {

    private MyTextView mMyTextView;

    public MyTextViewBuilder(Context context){
        mMyTextView = new MyTextView(context);
    }

    @Override
    public BaseBuilder setText(CharSequence text, BufferType type) {
        mMyTextView.mText = text;
        return this;
    }

    public BaseBuilder setText(CharSequence text) {
        setText(text,BufferType.NORMAL);
        return this;
    }


    @Override
    public BaseBuilder setTextColor(int textColor) {
        mMyTextView.mTextColor =  ColorStateList.valueOf(textColor);
        return this;
    }

    public MyTextView builder(){
       return  mMyTextView;
    }

}
