package com.example.sisteminformasi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout menu1, menu2, menu3, menu4, menu5, menu6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //BottomNavigationView navView = findViewById(R.id.nav_view);

        menu1 = findViewById(R.id.menu1);
        menu2 = findViewById(R.id.menu2);
        menu3 = findViewById(R.id.menu3);
        menu4 = findViewById(R.id.menu4);
        menu5 = findViewById(R.id.menu5);
        menu6 = findViewById(R.id.menu6);

        menu1.setOnClickListener(this);
        menu2.setOnClickListener(this);
        menu3.setOnClickListener(this);
        menu4.setOnClickListener(this);
        menu5.setOnClickListener(this);
        menu6.setOnClickListener(this);


        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        /*AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);*/
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menu1:
                dataambulans();
                break;

            case R.id.menu2:
                fasilitas();
                break;

            case R.id.menu3:
                layanan();
                break;

            case R.id.menu4:
                Dokter();
                break;

            case R.id.menu5:
                apotik();
                break;

            case R.id.menu6:
                bantuan();
                break;
        }
    }

    private void dataambulans() {
        Intent intent = new Intent(this, ambulansActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    private void fasilitas() {
        Intent intent = new Intent(this, fasilitasActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    private void layanan() {
        Intent intent = new Intent(this, layananActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    private void Dokter() {
        Intent intent = new Intent(this, dokterActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    private void apotik() {
        Intent intent = new Intent(this, apotikActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    private void bantuan() {
        Intent intent = new Intent(this, bantuanActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }
}
