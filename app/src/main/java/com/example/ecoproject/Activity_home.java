package com.example.ecoproject;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import com.example.ecoproject.databinding.ActivityHomeBinding;
import com.example.ecoproject.fragment.HomeFragment;
import com.example.ecoproject.fragment.ProfileFragment;
import com.example.ecoproject.fragment.SettingsFragment;


public class Activity_home extends AppCompatActivity {

    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment( new HomeFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {
                case R.id.home_item:
                    replaceFragment( new HomeFragment() );
                    break;
                case R.id.profile_item:
                    replaceFragment( new ProfileFragment() );
                    break;
                case R.id.settings_item:
                    replaceFragment( new SettingsFragment());
                    break;
            }
            return true;
        });
    }
     private void replaceFragment(Fragment fragment) {
         FragmentManager fragmentManager = getSupportFragmentManager();
         FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
         fragmentTransaction.replace(R.id.frame_layout_principal, fragment);
         fragmentTransaction.commit();
     }
}