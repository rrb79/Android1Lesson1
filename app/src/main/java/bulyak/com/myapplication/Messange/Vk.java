package bulyak.com.myapplication.Messange;

import android.app.Activity;
import android.content.Intent;

import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKCallback;
import com.vk.sdk.VKSdk;
import com.vk.sdk.api.VKError;

/**
 * Created by Администратор on 15.09.2017.
 */


public class Vk {

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!VKSdk.onActivityResult(requestCode, resultCode, data, new VKCallback<VKAccessToken>() {
            @Override
            public void onResult(VKAccessToken res) {
// Пользователь успешно авторизовался
            }

            @Override
            public void onError(VKError error) {
// Произошла ошибка авторизации (например, пользователь запретил авторизацию)
            }
        })) {
            onActivityResult(requestCode, resultCode, data);
        }
    }

    public boolean Accouting(Activity runningActivity, String quest) {
        VKSdk.login(runningActivity, quest);
        return false;
    }


}

