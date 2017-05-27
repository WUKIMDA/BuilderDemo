package googleplay.kimda.com.persondemo02.ui;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import googleplay.kimda.com.persondemo02.R;
import googleplay.kimda.com.persondemo02.bean_builder.Teacher;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.show();

    }

    public void toast1(View view) {
        Teacher build = new Teacher.Builder()
                .mAge(21)
                .mName("KIMDA")
                .mSex("Boy")
                .build();

        Toast.makeText(this, build.toString(), Toast.LENGTH_SHORT).show();

    }


}
