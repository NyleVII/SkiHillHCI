package nylecpsc481.skihillhci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;

public class RentalScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rental_screen);

        DatePicker rentalDatePicker = (DatePicker)findViewById(R.id.datePicker2);
        rentalDatePicker.setSpinnersShown(true);
        rentalDatePicker.setCalendarViewShown(false);
    }
}
