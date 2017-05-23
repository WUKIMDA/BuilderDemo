package witbj.kimda.com.kimdabuiler.bean;

/**
 * Created by BUTTON on 2017-05-22.
 */

public class Teacher extends  Person {


    @Override
    public void setName(String name) {
        this.mName=name;
    }

    @Override
    public void setAge(int age) {
        this.mAge=age;
    }

    @Override
    public void setSex(String sex) {
        this.mSex=sex;
    }



}
