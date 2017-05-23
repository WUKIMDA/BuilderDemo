package witbj.kimda.com.textviewbuilder.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import witbj.kimda.com.textviewbuilder.R;
import witbj.kimda.com.textviewbuilder.builder.MyTextViewBuilder;

public class MainActivity extends AppCompatActivity {


    private RelativeLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    public void btn(View view) {
        View textView = new MyTextViewBuilder(this).setText("我怎么变绿了").setTextColor(Color.GREEN).builder();

        mLayout.addView(textView);

        //Toast.makeText(this, textView.toString(), Toast.LENGTH_SHORT).show();

    }


    private void initView() {
        mLayout = (RelativeLayout) findViewById(R.id.layout);
    }
}
