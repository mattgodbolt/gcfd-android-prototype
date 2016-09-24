package org.chicagosfoodbank.user.gcfduser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RatingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
    }

    public void submit(View view) {
        Toast.makeText(this, "Thanks for your rating!", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, ShowBarCode.class));
    }
}
