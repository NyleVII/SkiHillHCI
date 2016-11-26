package nylecpsc481.skihillhci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import static nylecpsc481.skihillhci.R.id.liftTicketSpinner;
import static nylecpsc481.skihillhci.R.id.skiSpinner;

public class LiftTicketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lift_ticket);

        /*Ski spinner*/
        Spinner liftTicketSpinner = (Spinner)findViewById(R.id.liftTicketSpinner);
        String[] liftTickets = new String[]{"0","1", "2", "3", "4", "5"};
        ArrayAdapter<String> liftTicketAdapt = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, liftTickets);
        liftTicketSpinner.setAdapter(liftTicketAdapt);
    }
}
