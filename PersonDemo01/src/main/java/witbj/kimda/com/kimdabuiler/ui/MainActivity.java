package witbj.kimda.com.kimdabuiler.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import witbj.kimda.com.kimdabuiler.R;
import witbj.kimda.com.kimdabuiler.builder.PersonBuilder;
import witbj.kimda.com.kimdabuiler.builder.TeacherBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void toast1(View view) {
        PersonBuilder personBuilder = new TeacherBuilder()
                .setName("WUKIMDA, ")
                .setAge(21)
                .setSex(", 男 ");
        Toast.makeText(this, personBuilder.toString(), Toast.LENGTH_SHORT).show();

    }

}
