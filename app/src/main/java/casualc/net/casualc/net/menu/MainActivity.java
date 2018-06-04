package casualc.net.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.sharedpreferences.Pref;

import casualc.net.menu.BuildIn.CheckDialog;
import casualc.net.menu.BuildIn.MyPref_;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity implements CheckDialog.ExampleDialogListener {

    private TextView textViewUrl;
    private TextView textViewId;
    private Button button1;


    @Pref
    MyPref_ pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewUrl = (TextView) findViewById(R.id.baseurl);
        textViewId = (TextView) findViewById(R.id.app);
        openDialog();
    }
        private void openDialog() {
            CheckDialog exampleDialog = new CheckDialog();
            exampleDialog.show(getSupportFragmentManager(),"example dialog");
        }

        @Override
        public void applyTexts(String field1, String field2) {
            //textViewUrl.setText(field1);
            //textViewId.setText(field2);
            /*
            *             pref.edit()
                    .url().put(field1)
                    .id().put(field2)
                    .apply();
            MainActivity_.intent(this).start();
            * */
        }
}
