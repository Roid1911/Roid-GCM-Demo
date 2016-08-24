package net.roidz.demo.gcm.roid_gcm_demo;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Instance ID를 획득하기 위한 리스너를 상속받아서 토큰을 갱신
 * Created by roid on 2016-08-24.
 */
public class MyInstanceIDListenerService extends InstanceIDListenerService {

    private static final String TAG = "MyInstanceIDLS";

    @Override
    public void onTokenRefresh() {
        Intent intent = new Intent(this, RegistrationIntentService.class);
        startService(intent);
    }

}
