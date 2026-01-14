package activity;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import lk.jiat.intent.application.R;

public class HomeActivity extends AppCompatActivity {
    private Button homeBtn;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//Layout file configuration and initialization
        setContentView(R.layout.activity_home);
        this.homeBtn = findViewById(R.id.homeBtn);


    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
