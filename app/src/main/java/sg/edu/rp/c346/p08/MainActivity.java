package sg.edu.rp.c346.p08;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor preEdit = prefs.edit();
        preEdit.putString("greeting", "hello");
        preEdit.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();

      SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);

      String msg = prefs.getString("greeting", "No greetings!");

      Toast toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG); toast.show();
    }








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

    }
}




         }
@Override
protected void onPause () {
        super.onPause();
        String name = tvname.getText().toString();
        Integer.parseInt(tvage.getText().toString());
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor preEdit = prefs.edit();
        preEdit.putString("Name", name);
        preEdit.putInt("Age", 0);
        preEdit.commit();
        }

@Override
protected void onResume () {
        super.onResume();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String name = prefs.getString("Name", "");
        Integer age = prefs.getInt("Age", 0);

        tvname.setText(name);
        tvage.setText(age);

        }
        }