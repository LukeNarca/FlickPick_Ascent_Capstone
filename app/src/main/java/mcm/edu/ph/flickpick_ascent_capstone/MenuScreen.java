package mcm.edu.ph.flickpick_ascent_capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuScreen extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);

        ImageButton file = findViewById(R.id.acc);
        ImageButton set = findViewById(R.id.settings);
        Button elec = findViewById(R.id.btnElec);
        Button Merch = findViewById(R.id.btnMerch);
        Button school = findViewById(R.id.btnSchool);
        Button service = findViewById(R.id.btnService);

        file.setOnClickListener(this);
        school.setOnClickListener(this);
        service.setOnClickListener(this);
        Merch.setOnClickListener(this);
        elec.setOnClickListener(this);
        set.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent u = new Intent(MenuScreen.this, AccountScreen.class);
        Intent o = new Intent(MenuScreen.this, SettingScreen.class);
        Intent t = new Intent(MenuScreen.this, ElectronicScreen.class);
        Intent i = new Intent(MenuScreen.this, MerchScreen.class);
        Intent e = new Intent(MenuScreen.this, SchoolScreen.class);
        Intent a = new Intent(MenuScreen.this, ServicesScreen.class);

        switch (v.getId()){
            case R.id.btnService:
                startActivity(a);
                break;
            case R.id.btnSchool:
                startActivity(e);
                break;
            case R.id.btnMerch:
                startActivity(i);
                break;
            case R.id.btnElec:
                startActivity(t);
                break;
            case R.id.settings:
                startActivity(o);
                break;
            case R.id.acc:
                startActivity(u);
                break;

        }

    }
}