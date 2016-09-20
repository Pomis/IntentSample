package pomis.app.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    final static String TEST_TAG = "TEST_TAG";

    Button startButton;
    EditText textField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TEST_TAG, "onCreate()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TEST_TAG, "onResume()");
        bindViews();
    }

    private void bindViews() {
        startButton = (Button) findViewById(R.id.b_start);
        textField = (EditText) findViewById(R.id.et_mytext);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(),
                        TextActivity.class);
                myIntent.putExtra("my_text", textField.getText().toString());
                startActivity(myIntent);
            }
        });
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TEST_TAG, "onStop()");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TEST_TAG, "onRestart()");

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TEST_TAG, "onPause()");

    }
}
