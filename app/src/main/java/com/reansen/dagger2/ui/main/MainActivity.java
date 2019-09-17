package com.reansen.dagger2.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.reansen.dagger2.R;
import com.reansen.dagger2.ui.detail.DetailActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainActivityViewModel mainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.action_goto);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

        Toast.makeText(this, mainActivityViewModel.getMe(), Toast.LENGTH_SHORT).show();
    }

}
