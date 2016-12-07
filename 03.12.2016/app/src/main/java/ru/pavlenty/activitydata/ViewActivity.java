package ru.pavlenty.activitydata;

import android.content.Intent;
import android.icu.util.ULocale;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    TextView recView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        recView = (TextView) findViewById(R.id.tvView);

        Intent intent = getIntent();

        String firstname = intent.getStringExtra("fname");
        String lastname = intent.getStringExtra("lname");

        recView.setText("Your name is: " + firstname + " " + lastname);

        Button buttonMin = (Button) findViewById(R.id.buttonMin);
        Button exit = (Button) findViewById(R.id.buttonExit);

        buttonMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_MAIN);
                intent1.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent1);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
    @Override
    protected void onDestroy(){
        Process.killProcess(Process.myPid());
        super.onDestroy();
    }
}
