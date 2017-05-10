package com.example.jh.timecountdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
    Button btn_choose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

        btn_choose = (Button) this.findViewById(R.id.btn_choose);
        btn_choose.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TimeCountActivity.class);
                startActivity(intent);
                //MainActivity.this.finish();
            }
        });
    }
}
