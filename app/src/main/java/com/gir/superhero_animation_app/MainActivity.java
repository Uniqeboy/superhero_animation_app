package com.gir.superhero_animation_app;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ImageView ironmanImage = findViewById(R.id.ironmanImage);
        ironmanImage.setOnClickListener(v -> {

            // Forward animation
            ironmanImage.animate()
                    .alpha(0.5f)
                    .scaleX(1.5f)
                    .scaleY(1.5f)
                    .translationX(0f)
                    .setDuration(1000)
                    .withEndAction(() -> {

                        // Reverse animation
                        ironmanImage.animate()
                                .alpha(1f)
                                .scaleX(1f)
                                .scaleY(1f)
                                .translationX(0f)
                                .setDuration(1000);

                    });

        });
    }
}