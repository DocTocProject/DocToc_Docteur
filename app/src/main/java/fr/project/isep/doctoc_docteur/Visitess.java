package fr.project.isep.doctoc_docteur;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Visitess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visites);
    }
    public void OnClickWork (View v) {
        startActivity(new Intent(this, MapsActivity.class));
    }
}
