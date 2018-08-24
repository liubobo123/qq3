package jiyun_qq1.com.myapplication2.intent;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;

import jiyun_qq1.com.myapplication2.R;

public class tewMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tew_main);
        TextView textView = findViewById(R.id.text);
        textView.setText("你还不哈");
        String s = textView.getText().toString();
        Intent intent = getIntent();
        intent.putExtra("a", s);
        tewMainActivity.this.setResult(0,intent);
        tewMainActivity.this.finish();
    }
}
