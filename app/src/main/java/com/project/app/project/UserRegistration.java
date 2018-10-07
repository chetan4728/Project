package com.project.app.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

import es.dmoral.toasty.Toasty;

public class UserRegistration extends AppCompatActivity {

    EditText name,mother_name,email,prn,reg_no,Address,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);
        name = findViewById(R.id.name);
        mother_name = findViewById(R.id.mother_name);
        email = findViewById(R.id.email);
        prn = findViewById(R.id.prn);
        reg_no = findViewById(R.id.reg_no);
        Address = findViewById(R.id.Address);
        password = findViewById(R.id.password);
        TextView register = findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().isEmpty())
                {
                    Toasty.error(getApplicationContext(), "Enter First Name", Toast.LENGTH_SHORT, true).show();

                }
                else if(mother_name.getText().toString().isEmpty())
                {
                    Toasty.error(getApplicationContext(), "Enter Mother Name", Toast.LENGTH_SHORT, true).show();
                }
                else if(email.getText().toString().isEmpty() ||!isValidEmaillId(email.getText().toString().trim()) )
                {
                    Toasty.error(getApplicationContext(), "Enter Valid Email", Toast.LENGTH_SHORT, true).show();
                }

                else if(prn.getText().toString().isEmpty())
                {
                    Toasty.error(getApplicationContext(), "Enter PRN Number", Toast.LENGTH_SHORT, true).show();
                }

                else if(reg_no.getText().toString().isEmpty())
                {
                    Toasty.error(getApplicationContext(), "Enter Registration Number", Toast.LENGTH_SHORT, true).show();
                }
                else if(Address.getText().toString().isEmpty())
                {
                    Toasty.error(getApplicationContext(), "Enter Address", Toast.LENGTH_SHORT, true).show();
                }
                else if(!password.getText().toString().isEmpty())
                {
                    Toasty.error(getApplicationContext(), "Entered Password ", Toast.LENGTH_SHORT, true).show();
                }
                else
                {

                }
            }
        });


    }

    private boolean isValidEmaillId(String email){

        return Pattern.compile("^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$").matcher(email).matches();
    }
}
