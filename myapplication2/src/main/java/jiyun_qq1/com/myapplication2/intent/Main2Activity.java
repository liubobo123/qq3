package jiyun_qq1.com.myapplication2.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import jiyun_qq1.com.myapplication2.R;

public class Main2Activity extends AppCompatActivity {

    private Button butten2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button butten1 = findViewById(R.id.butten1);
        butten2 = findViewById(R.id.butten2);
        butten1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,oneMainActivity.class));
            }
        });
        butten2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, tewMainActivity.class);
                startActivityForResult(intent,0);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==0&&requestCode==0){
            Bundle bundle = data.getExtras();
            String a = bundle.getString("a");
            butten2.setText(a);
        }
    }
}
