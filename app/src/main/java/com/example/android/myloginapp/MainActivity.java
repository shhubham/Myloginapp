package com.example.android.myloginapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b=(Button)findViewById(R.id.button);
        final EditText id=(EditText)findViewById(R.id.username);
        final EditText password=(EditText)findViewById(R.id.password);

        b.setOnClickListener(new View.OnClickListener()
        {@Override
        public void onClick(View view)
        {

            input (id.getText().toString(),password.getText().toString());
        }

        });}

    private void input(String name,String pass)
    {
        if((name.equals("jss"))&&(pass.equals("nibble")))
        {
            Intent intent=new Intent(MainActivity.this,Activity.class);
            startActivity(intent);
        }
    }

}

