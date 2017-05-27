package witbj.kimda.com.kimdabuiler.builder;

import witbj.kimda.com.kimdabuiler.bean.Person;

/**
 * Created by BUTTON on 2017-05-22.
 */

public abstract class PersonBuilder {
    public Person mPerson;

    public abstract PersonBuilder setName(String name);
    public abstract PersonBuilder setAge(int age);
    public abstract PersonBuilder setSex(String sex);


    @Override
    public String toString() {
        if (mPerson != null){
            mPerson.toString();
        }
        return super.toString();
    }
}
