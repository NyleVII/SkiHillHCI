package nylecpsc481.skihillhci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;

public class RentalScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rental_screen);


        /*Ski spinner*/
        Spinner skiSpinner = (Spinner)findViewById(R.id.skiSpinner);
        String[] ski = new String[]{"0","1 ($15)", "2 ($30)", "3 ($45)", "4 ($60)", "5 ($75)"};
        ArrayAdapter<String> skiAdapt = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, ski);
        skiSpinner.setAdapter(skiAdapt);

        /*Snowboard spinner*/
        Spinner snowboardSpinner = (Spinner)findViewById(R.id.snowboardSpinner);
        String[] snowboard = new String[]{"0","1 ($15)", "2 ($30)", "3 ($45)", "4 ($60)", "5 ($75)"};
        ArrayAdapter<String> snowboardAdapt = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, snowboard);
        snowboardSpinner.setAdapter(snowboardAdapt);

        /*Helmet spinner*/
        Spinner helmetSpinner = (Spinner)findViewById(R.id.helmetSpinner);
        String[] helmet = new String[]{"0","1 ($5)", "2 ($10)", "3 ($15)", "4 ($20)", "5 ($25)"};
        ArrayAdapter<String> helmetAdapt = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, helmet);
        helmetSpinner.setAdapter(helmetAdapt);

        /*Date Picker*/
        DatePicker rentalDatePicker = (DatePicker)findViewById(R.id.datePicker2);
        rentalDatePicker.setSpinnersShown(true);
        rentalDatePicker.setCalendarViewShown(false);
    }
}
