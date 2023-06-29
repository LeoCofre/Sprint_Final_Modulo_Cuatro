package cl.awakelab.sprintfinalmodulocuatro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.awakelab.sprintfinalmodulocuatro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding;
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}