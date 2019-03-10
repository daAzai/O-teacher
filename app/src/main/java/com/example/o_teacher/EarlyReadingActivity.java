package com.example.o_teacher;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EarlyReadingActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "EarlyReadingActivity";

    private Button button_Monday;

    private Button button_Tuesday;

    private Button button_Wednesday;

    private Button button_Thursday;

    private Button button_Friday;

    private Button early_back_button = findViewById(R.id.early_back_button);

    private Bundle data = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.early_reading_layout);
        initview();

        early_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EarlyReadingActivity.this, ArrangeActivity.class);
                intent.putExtras(data);
                startActivity(intent);
                finish();
            }
        });
    }

    private void initview() {
        button_Monday = findViewById(R.id.early_Monday_button);
        button_Tuesday = findViewById(R.id.early_Tuesday_button);
        button_Wednesday = findViewById(R.id.early_Wednesday_button);
        button_Thursday = findViewById(R.id.early_Thursday_button);
        button_Friday = findViewById(R.id.early_Friday_button);
        button_Monday.setOnClickListener(this);
        button_Tuesday.setOnClickListener(this);
        button_Wednesday.setOnClickListener(this);
        button_Thursday.setOnClickListener(this);
        button_Friday.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.early_Monday_button) {
            dialogChoice(v);
        }
        else if (v.getId() == R.id.early_Tuesday_button) {
            dialogChoice(v);
        }
        else if (v.getId() == R.id.early_Wednesday_button) {
            dialogChoice(v);
        }
        else if (v.getId() == R.id.early_Thursday_button) {
            dialogChoice(v);
        }
        else if (v.getId() == R.id.early_Friday_button) {
            dialogChoice(v);
        }
    }


    public void dialogChoice(final View v) {
        final String items[] = {"专业", "语文", "历史", "英语"};
        final AlertDialog.Builder builder = new AlertDialog.Builder(this,4);
        builder.setTitle("单选");
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(EarlyReadingActivity.this, items[which],
                        Toast.LENGTH_SHORT).show();
                switch (v.getId()) {
                    case R.id.early_Monday_button:
                        button_Monday.setText(items[which]);
                        data.putInt("Monday", which);
                        break;
                    case R.id.early_Tuesday_button:
                        button_Tuesday.setText(items[which]);
                        data.putInt("Tuesday", which);
                        break;
                    case R.id.early_Wednesday_button:
                        button_Wednesday.setText(items[which]);
                        data.putInt("Wednesday", which);
                        break;
                    case R.id.early_Thursday_button:
                        button_Thursday.setText(items[which]);
                        data.putInt("Thursday", which);
                        break;
                    case R.id.early_Friday_button:
                        button_Friday.setText(items[which]);
                        data.putInt("Friday", which);
                        break;
                    default:
                        break;
                }
            }
        });
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                Toast.makeText(EarlyReadingActivity.this, "确定", Toast.LENGTH_SHORT)
                        .show();
            }
        });
        builder.create().show();
    }

    /*protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String tempData = data[3];
        outState.putString("early_data", tempData);
    }*/
}
