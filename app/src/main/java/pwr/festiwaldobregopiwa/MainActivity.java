package pwr.festiwaldobregopiwa;

import android.os.Bundle;
import android.support.design.widget.NavigationView;

import com.example.filip.festiwal.R;

public class MainActivity extends BaseActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makeMenu();
    }
}
