package nylecpsc481.skihillhci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CancelledEmergencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancelled_emergency);
    }

    public void mainMenu(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
