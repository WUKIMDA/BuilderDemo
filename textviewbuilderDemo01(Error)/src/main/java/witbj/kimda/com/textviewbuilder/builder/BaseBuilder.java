package witbj.kimda.com.textviewbuilder.builder;

import android.support.annotation.ColorInt;
import android.view.View;

/**
 * Created by BUTTON on 2017-05-22.
 */

public abstract class BaseBuilder {

    public enum BufferType {
        NORMAL, SPANNABLE, EDITABLE,
    }


    public abstract  BaseBuilder setText(CharSequence text, BufferType type);

    public abstract BaseBuilder setTextColor(@ColorInt int color);

    public abstract View builder();

}
