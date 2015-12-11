package nyc.c4q.android;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by charlynbuchanan on 12/10/15.
 */
public class EmailListActivity extends FragmentActivity {


//    @Override
//    public View onCreateView(String name, Context context, AttributeSet attrs) {
//        return super.onCreateView(name, context, attrs);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_email_list);

        Context context = getApplicationContext();

        // Create new fragment and transaction
        Fragment emailFragment = new Fragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.add(R.id.container, emailFragment);
        // Commit the transaction
        transaction.commit();
    }
}
