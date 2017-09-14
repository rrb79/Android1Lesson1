package bulyak.com.myapplication;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Администратор on 14.09.2017.
 */

public class AccountActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Button button1;
        Button button2;
        Button button3;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_layout);
        button1 = (Button) findViewById(R.id.account_button);
        onClick(button1);

    }

    public void onClick(View v) {
        AccountManager am = AccountManager.get(this); // current Context
        //AccountManager am = (AccountManager) getSystemService(ACCOUNT_SERVICE); // видел такой способ

        Account[] accounts = am.getAccountsByType("com.google");
        Log.i("Account", accounts.length + "");
        TextView tvInfo = (TextView) findViewById(R.id.textView1);
        tvInfo.setText(accounts[0].name);
    }
}
