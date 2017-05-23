package witbj.kimda.com.kimdabuiler.builder;

import witbj.kimda.com.kimdabuiler.bean.Teacher;

/**
 * Created by BUTTON on 2017-05-22.
 */

public class TeacherBuilder extends PersonBuilder {

    public TeacherBuilder() {
        this.mPerson = new Teacher();
    }

    @Override
    public PersonBuilder setName(String name) {
        mPerson.mName = name;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        mPerson.mAge = age;
        return this;
    }

    @Override
    public PersonBuilder setSex(String sex) {
        mPerson.mSex = sex;
        return this;
    }


    @Override
    public String toString() {
        return mPerson.toString();
    }

}
