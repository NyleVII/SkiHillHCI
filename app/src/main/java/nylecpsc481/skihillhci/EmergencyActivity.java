package nylecpsc481.skihillhci;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class EmergencyActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
    }

    public void cancelEmergency(View view){

        Intent intent = new Intent(this, CancelledEmergencyActivity.class);
        startActivity(intent);
    }

}
