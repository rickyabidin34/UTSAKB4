package fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rickyabidin.com.utsakb4.R;

/** Ricky Abidin
 *  10116169
 *  IF-4 21 Mei 2019 01:11:56
 */


public class ProfileFragment extends Fragment {
@Nullable
@Override

    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container, @Nullable
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
    return view;
    }
}

// <!-- Ricky Abidin
//     10116169
//     IF-4
//     20 Mei 2019 -->