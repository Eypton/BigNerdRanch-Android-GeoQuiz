package bignerdranchcom.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Stan on 5/25/16.
 */
public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
