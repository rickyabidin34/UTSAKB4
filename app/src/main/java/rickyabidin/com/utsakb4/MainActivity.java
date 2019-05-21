package rickyabidin.com.utsakb4;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.LinearLayout;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;


import fragment.ProfileFragment;

/**
 *  Ricky Abidin
 *  10116169
 *  IF-4
 *  19 Mei 2019
 */
@SuppressWarnings("ALL")



public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_profile:
                    mTextMessage.setText(R.string.title_profile);
                    return true;
                case R.id.navigation_contact:
                    mTextMessage.setText(R.string.title_contact);
                    return true;
                case R.id.navigation_daftarteman:
                    mTextMessage.setText(R.string.title_daftarteman);
                    return true;
            }
            return false;
        }
    };

    @Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mTextMessage = (TextView) findViewById(R.id.message);
    BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
    navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
}

}



// Ricky Abidin
// 10116169
// IF-4
// 19 Mei 2019