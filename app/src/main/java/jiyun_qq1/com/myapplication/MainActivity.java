package jiyun_qq1.com.myapplication;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData() {
        CheckBox byId = findViewById(R.id.xieyi_img);
        CheckBox byId2 = findViewById(R.id.imageView);
        CheckBox byId3 = findViewById(R.id.imageView2);
        CheckBox byId4 = findViewById(R.id.imageView3);
        byId.setButtonDrawable(new ColorDrawable(Color.TRANSPARENT));
        byId2.setButtonDrawable(new ColorDrawable(Color.TRANSPARENT));
        byId3.setButtonDrawable(new ColorDrawable(Color.TRANSPARENT));
        byId4.setButtonDrawable(new ColorDrawable(Color.TRANSPARENT));
    }
}
