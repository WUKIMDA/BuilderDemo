package witbj.kimda.com.kimdabuiler.bean;

/**
 * Created by BUTTON on 2017-05-22.
 */

public abstract class Person {
    public String mName;
    public int mAge;
    public String mSex;


    public abstract void setName(String name);
    public abstract void setAge(int age);
    public abstract void setSex(String sex);

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "  : " +
                "mName='" + mName + '\'' +
                ", mAge=" + mAge +
                ", mSex=" + mSex +
                '}';
    }
}
