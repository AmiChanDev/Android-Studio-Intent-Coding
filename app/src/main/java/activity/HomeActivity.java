package activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import lk.jiat.intent.application.R;

public class HomeActivity extends AppCompatActivity {
    private Button homeBtn;
    private Button browseBtn;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//Layout file configuration and initialization
        setContentView(R.layout.activity_home);
        this.homeBtn = findViewById(R.id.homeBtn);
        this.browseBtn = findViewById(R.id.browserBtn);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Calling listeners
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSettings();

            }
        });

        browseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBrowserPage();
            }
        });
    }

    private void openBrowserPage() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.google.com"));
        startActivity(intent);
    }

    private void dialANumber(){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0771234567"));
        startActivity(intent);
    }

    private void moveToSettings() {
        Intent intent = new Intent(HomeActivity.this, SettingActivity.class);
//        intent.putExtra("username","ami");
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }
}
