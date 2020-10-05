package adarsh.example.navigationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import adarsh.example.navigationapp.ui.useraccount.UserAccountFragment;

public class UserAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_account_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, UserAccountFragment.newInstance())
                    .commitNow();
        }
    }
}
