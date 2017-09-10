package bulyak.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button_change_text);
        textView = (TextView) findViewById(R.id.change_text);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (textView.getText() == getString(R.string.hello_world)) {
                    button.setText(R.string.button_text2);
                    textView.setText(R.string.hello_world1);
                } else {
                    textView.setText(R.string.hello_world);
                    button.setText(R.string.change_text);
                }
            }
        });
    }
}
