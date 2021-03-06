package nylecpsc481.skihillhci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMap(View view){

        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }

    public void openRentals(View view){

        Intent intent = new Intent(this, RentalScreenActivity.class);
        startActivity(intent);
    }

    public void openEmergency(View view){

        Intent intent = new Intent(this, EmergencyActivity.class);
        startActivity(intent);
    }

    public void openLiftTickets(View view){

        Intent intent = new Intent(this, LiftTicketActivity.class);
        startActivity(intent);
    }

    public void changeHill(View view){

        Intent intent = new Intent(this, ChangeHillActivity.class);
        startActivity(intent);
    }

    public void directionsToHill(View view){

        Intent intent = new Intent(this, DirectionsActivity.class);
        startActivity(intent);
    }
}