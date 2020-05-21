package den.bogdanov.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusCounter(View view) {
        a = a + 1;
        TextView scoreTextView = findViewById(R.id.scoreTextView);
        scoreTextView.setText("" + a);
    }

    public void minusButton(View view) {
        a = a - 1;
        TextView scoreTextView = findViewById(R.id.scoreTextView);
        scoreTextView.setText("" + a);
    }
}
