package googleplay.kimda.com.persondemo02.bean_builder;

/**
 * Created by BUTTON on 2017-05-22.
 */

public abstract class Person {
    public String mName;
    public int mAge;
    public String mSex;


    @Override
    public String toString() {
        return getClass().getSimpleName()+ "  : " +
                "mName='" + mName + '\'' +
                ", mAge=" + mAge +
                ", mSex=" + mSex +
                '}';
    }
}
