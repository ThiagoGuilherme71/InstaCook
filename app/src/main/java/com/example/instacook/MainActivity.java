package com.example.instacook;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;

import com.example.instacook.fragments.HomeFragment;
import com.example.instacook.fragments.IngredientsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        setStatusBarColor();

        if (savedInstanceState == null) {
            navigateToFragment(new HomeFragment());
        }

        ImageView btnHome = findViewById(R.id.btn_home);
        ImageView btnRecipes = findViewById(R.id.btn_recipes);

        btnHome.setOnClickListener(v -> navigateToFragment(new HomeFragment()));
        btnRecipes.setOnClickListener(v -> navigateToFragment(new IngredientsFragment()));

    }

    public void navigateToFragment(Fragment fragment) {

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit();

    }

    public void setStatusBarColor() {

        Window window = getWindow();
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.yellow_75));

    }

}