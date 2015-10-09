package hypd.nxring;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import butterknife.Bind;

public class Settings extends AppCompatActivity {

    @Bind(R.id.settings_fab)
    FloatingActionButton fab;
    @Bind(R.id.settings_toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        if (toolbar != null)
            setSupportActionBar(toolbar);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Not implemented yet", Snackbar.LENGTH_LONG).show();
                //todo add new rule
            }
        });
    }

    //options menu omitted for now, don't think there is any need for it for now
}
