package bulyak.com.myapplication.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import bulyak.com.myapplication.R;

/**
 * Created by Администратор on 14.09.2017.
 */

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.greeting_layout);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_quit:
                finish();
                break;
            case R.id.action_settings:
            case R.id.account:

                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

}
