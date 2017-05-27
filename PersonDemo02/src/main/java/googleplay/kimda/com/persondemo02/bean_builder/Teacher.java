package googleplay.kimda.com.persondemo02.bean_builder;

/**
 * Created by BUTTON on 2017-05-22.
 */

public class Teacher extends  Person {


    private Teacher(Builder builder) {
        mName = builder.mName;
        mAge = builder.mAge;
        mSex = builder.mSex;
    }

    public static final class Builder {
        private String mName;
        private int mAge;
        private String mSex;

        public Builder() {
        }

        public Builder mName(String val) {
            mName = val;
            return this;
        }

        public Builder mAge(int val) {
            mAge = val;
            return this;
        }

        public Builder mSex(String val) {
            mSex = val;
            return this;
        }

        public Teacher build() {
            return new Teacher(this);
        }
    }
}
