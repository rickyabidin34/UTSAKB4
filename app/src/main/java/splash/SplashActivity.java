package splash;

/**
 *  Ricky Abidin
 *      10116169
 *      IF-4
 *      20 Mei 2019
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import rickyabidin.com.utsakb4.MainActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();


    }
}

// Ricky Abidin
// 10116169
// IF-4
// 19 Mei 2019