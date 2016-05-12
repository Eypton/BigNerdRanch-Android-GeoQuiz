package bignerdranchcom.android.criminalintent;

import java.util.UUID;

/**
 * Created by Stan on 5/12/16.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        //Generate unique identifer
        mId = UUID.randomUUID();
    }
}
