package nylecpsc481.skihillhci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LodgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lodge);
    }

    public void openFoodMenu(View view){

        Intent intent = new Intent(this, FoodMenuActivity.class);
        startActivity(intent);
    }
}
