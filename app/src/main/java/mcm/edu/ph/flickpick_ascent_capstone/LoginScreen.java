package mcm.edu.ph.flickpick_ascent_capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        Button Log = findViewById(R.id.logIn);

        Log.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent r = new Intent(LoginScreen.this, MenuScreen.class);

        switch (v.getId()){

            case R.id.logIn:
                startActivity(r);
                break;
        }
    }
}