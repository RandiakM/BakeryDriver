package lk.ac.uwu.bakery.bakerydriver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //EditText username, password;

        EditText username = (EditText) findViewById(R.id.username_field);
        EditText password = (EditText) findViewById(R.id.password_field);
        Button loginBtn = (Button) findViewById(R.id.button_login);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this, "Success Login", Toast.LENGTH_SHORT).show();
            }
        });


    }
}