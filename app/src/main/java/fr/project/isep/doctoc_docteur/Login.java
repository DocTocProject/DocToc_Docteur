package fr.project.isep.doctoc_docteur;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by martinezeva on 30/01/2017.
 */

public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
    public void OnClickLog (View v) {
        startActivity(new Intent(this, Visites.class));
    }
}