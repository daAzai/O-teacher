package com.example.o_teacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArrangeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arrange_layout);

        Button arrange_early = findViewById(R.id.arrange_early_button);
        arrange_early.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ArrangeActivity.this, EarlyReadingActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button arrange_normal = findViewById(R.id.arrange_normal_button);
        arrange_normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ArrangeActivity.this, NormalCourseActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button arrange_evening = findViewById(R.id.arrange_evening_button);
        arrange_evening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ArrangeActivity.this, EveningSelfStudyActivity.class);
                startActivity(intent);
                finish();
            }
        });


        /*Button arrange_next = findViewById(R.id.arrange_next_button);
        arrange_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(.this, .class);
                Intent intent_early = getIntent();
                Bundle bundle_early = intent_early.getExtras();
                Intent intent_early = getIntent();
                Bundle bundle_early = intent_early.getExtras();
                Intent intent_early = getIntent();
                Bundle bundle_early = intent_early.getExtras();
                startActivity(intent);
                finish();
            }
        });*/
    }
}
