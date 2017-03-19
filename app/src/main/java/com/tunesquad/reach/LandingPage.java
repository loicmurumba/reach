package com.tunesquad.reach;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LandingPage extends AppCompatActivity implements View.OnClickListener {

    private Button registerbutton;
    private EditText passwordtext;
    private EditText emailtext;
    private ProgressDialog registering;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_landing_page);

        registering = new ProgressDialog(this);
        registerbutton = (Button) findViewById(R.id.registerbutton);
        emailtext = (EditText) findViewById(R.id.emailtext);
        passwordtext = (EditText) findViewById(R.id.passwordtext);



    }

    @Override
  public void onClick(View view){
        if (view == registerbutton ){
            String email = emailtext.getText().toString().trim();
            String pass = passwordtext.getText().toString().trim();

            if (TextUtils.isEmpty(email) || TextUtils.isEmpty(pass)) {

                Toast.makeText(this, "Please fill in missing information", Toast.LENGTH_SHORT).show();
                return;
            }



        }

    }

}
