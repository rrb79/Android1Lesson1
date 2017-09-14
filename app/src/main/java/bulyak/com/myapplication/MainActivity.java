package bulyak.com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Button button;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greeting_layout);
        button=(Button)findViewById(R.id.greeting_button);



          }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_quit:
                finish();
                break;
            case R.id.action_settings:

            case R.id.account:
                Intent intent=new Intent(MainActivity.this,AccountActivity.class);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

}
