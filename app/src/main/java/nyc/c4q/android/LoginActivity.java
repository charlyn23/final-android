package nyc.c4q.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    String email;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = (Button)findViewById(R.id.login);
        final EditText passwordEditText = (EditText)findViewById(R.id.password);
        final EditText emailEditText = (EditText)findViewById(R.id.email);



        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, EmailListActivity.class);
                email = String.valueOf(emailEditText.getText());
                password = String.valueOf(passwordEditText.getText());
                if (!email.equals(null) && !password.equals(null)) {
                    startActivity(intent);
                } else{
                    Toast.makeText(getBaseContext(), "Please enter email and password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
