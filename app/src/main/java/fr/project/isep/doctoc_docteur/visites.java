package fr.project.isep.doctoc_docteur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Visites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visites);
    }
    public void OnClickWork (View v) {
        startActivity(new Intent(this, Attente.class));
    }
}


