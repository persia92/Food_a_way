package com.example.food_a_way;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

    private Button registerButton, loginButton, entryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerButton = (Button)findViewById(R.id.register);
        loginButton = (Button)findViewById(R.id.login);
        entryButton = (Button)findViewById(R.id.entry);

        registerButton.setOnClickListener(this);
        loginButton.setOnClickListener(this);
        entryButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

           if(view.getId() == R.id.register)
           {
               Intent registerIntent = new Intent(this, RegisterActivity.class);
               this.startActivity(registerIntent);
           }
            else if(view.getId() == R.id.login)
           {
               Intent loginIntent = new Intent(this, LoginActivity.class);
               this.startActivity(loginIntent);
           }
            else if(view.getId() == R.id.entry)
           {
               Intent entryIntent = new Intent(this, RegisterActivity.class);
               this.startActivity(entryIntent);
           }
    }


    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
