package pomis.app.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

    TextView myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        bindViews();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(MainActivity.TEST_TAG, getIntent().getStringExtra("my_text"));
        myText.setText(getIntent().getStringExtra("my_text"));
    }

    private void bindViews() {
        myText = (TextView) findViewById(R.id.tv_my_text);
    }
}
