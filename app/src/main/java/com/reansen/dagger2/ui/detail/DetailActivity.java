package com.reansen.dagger2.ui.detail;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.reansen.dagger2.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class DetailActivity extends AppCompatActivity {

    @Inject
    DetailActivityViewModel detailActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toast.makeText(this, detailActivityViewModel.getMe(), Toast.LENGTH_SHORT).show();
    }

}
