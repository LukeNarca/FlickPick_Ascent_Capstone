package mcm.edu.ph.flickpick_ascent_capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ElectronicScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronic_screen);
        Button back = findViewById(R.id.btnBuck);

        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(ElectronicScreen.this, MenuScreen.class);

        switch (v.getId()){
            case R.id.btnBuck:
                startActivity(i);
                break;

        }



    }
}