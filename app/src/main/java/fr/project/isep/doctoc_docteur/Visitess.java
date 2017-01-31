package fr.project.isep.doctoc_docteur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Visitess extends AppCompatActivity {

    Button button;
    Button button2;
    Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visites);
    }
    public void OnClickWork (View v) {
        startActivity(new Intent(this, Prescription.class));
    }

    public void OnClickView(View v) {
        if (v.getId() == R.id.button) {
            Intent intent = new Intent(Visitess.this, Visitesdetails.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.button2){
            Intent intent = new Intent(Visitess.this, Visitesdetails.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.button3){
            Intent intent = new Intent(Visitess.this, Visitesdetails.class);
            startActivity(intent);

        }
    }
}
