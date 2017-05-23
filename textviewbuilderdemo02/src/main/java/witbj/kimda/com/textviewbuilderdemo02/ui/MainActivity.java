package witbj.kimda.com.textviewbuilderdemo02.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import witbj.kimda.com.textviewbuilderdemo02.R;
import witbj.kimda.com.textviewbuilderdemo02.builder.TextViewBuilder;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }




    private void initView() {
        mLayout = (RelativeLayout) findViewById(R.id.layout);
    }


    public void btn(View view) {
        TextView textView = new TextViewBuilder(this)
                .setText("我是纯洁的黄色")
                .setColor(Color.YELLOW)
                .build();

        mLayout.addView(textView);
    }
}
