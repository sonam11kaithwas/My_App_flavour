package android.com.myapplication;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, BuildConfig.BASEURL, Toast.LENGTH_SHORT).show();
        if (BuildConfig.BASEURL.equals("BASEURL")) { // do something cool }
        }
    }
}