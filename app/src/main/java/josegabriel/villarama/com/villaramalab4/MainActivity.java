package josegabriel.villarama.com.villaramalab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITI", "onCreate(){....} has Executed..");

        Button btnToast = (Button) findViewById(R.id.btnToast);
        Button btnSnack = (Button) findViewById(R.id.btnSnack);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = "TOAST!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();
            }
        });

        btnSnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_layout_id);
                String message = "Snackbar";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message,duration);
            }
        });


    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITI", "onStart() has Executed..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITI", "onResume() has Executed..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITI", "onPause() has Executed..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITI", "onStop() has Executed..");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITI", "onRestart() has Executed..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITI", "onDestroy() has Executed..");
    }

    public void showSnackbar(View v, String message, int duration){
        Snackbar.make(v, message, duration).show();
    }
}

