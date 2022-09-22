package com.example.apptheb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.nav_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.filme_menu:
                        Toast.makeText(MainActivity.this, "You clicked Home filme icon", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.music:
                        Toast.makeText(MainActivity.this, "You clicked music icon", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.sinal:
                        Toast.makeText(MainActivity.this, "Your clicked sinal icon", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.mais:
                        Toast.makeText(MainActivity.this, "Your clicked mais icon", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return false;
                }

            }
        });

    }
}