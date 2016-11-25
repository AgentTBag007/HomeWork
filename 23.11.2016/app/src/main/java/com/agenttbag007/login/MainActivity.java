package com.agenttbag007.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// import static android.R.id.edit;
// import static com.agenttbag007.login.R.string.success;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edLogin = (EditText) findViewById(R.id.editTextLogin);
        final EditText edPass = (EditText) findViewById(R.id.editText2);
        Button buttonLogin = (Button) findViewById(R.id.buttonLogin);
        final TextView success = (TextView) findViewById(R.id.textViewSuccess);
        success.setVisibility(View.INVISIBLE);

        final String Login = getString(R.string.login);
        final String pass = getString(R.string.password);



        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edLogin.getText().toString().equals(Login) && edPass.getText().toString().equals(pass)){
                    success.setVisibility(TextView.VISIBLE);
                }
            }
        });
    }
}
