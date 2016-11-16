package nylecpsc481.skihillhci;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.CompoundButton;
        import android.widget.ToggleButton;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        final View conditions = findViewById(R.id.conditionsImage);
        /*conditions toggle button logic*/
        ToggleButton toggleConditions = (ToggleButton) findViewById(R.id.toggleConditions);
        toggleConditions.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    conditions.setVisibility(View.VISIBLE);

                } else {

                    conditions.setVisibility(View.INVISIBLE);
                }
            }
        });
    }


}
