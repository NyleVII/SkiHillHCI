package nylecpsc481.skihillhci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FoodMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);

        /*Main Spinner the array is the content*/
        Spinner mainSpinner = (Spinner)findViewById(R.id.mainMealSpinner);
        String[] mains = new String[]{"Burger", "Cheese Burger", "Bacon Wrap", "Fried Chicken"};
        ArrayAdapter<String> mainsAdapt = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, mains);
        mainSpinner.setAdapter(mainsAdapt);

        /*Side spinner*/
        Spinner sidesSpinner = (Spinner)findViewById(R.id.sidesMealSpinner);
        String[] sides = new String[]{"Fries", "Caesar Salad", "House Salad", "Soup"};
        ArrayAdapter<String> sidesAdapt = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, sides);
        sidesSpinner.setAdapter(sidesAdapt);

        /*Drinks spinner*/
        Spinner drinkSpinner = (Spinner)findViewById(R.id.drinkMealSpinner);
        String[] drinks = new String[]{"PEPSI", "PEPSI", "PEPSI", "ARE YOU HAPPY STEVE", "YES I AM!"};
        ArrayAdapter<String> drinksAdapt = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, drinks);
        drinkSpinner.setAdapter(drinksAdapt);
    }
}
