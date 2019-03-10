package com.example.o_teacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EveningSelfStudyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evening_self_study_layout);

        Button evening_back_button = findViewById(R.id.evening_back_button);
        evening_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EveningSelfStudyActivity.this, ArrangeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
