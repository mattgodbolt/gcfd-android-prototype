package org.chicagosfoodbank.user.gcfduser;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class RewardsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards);

        final ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "PokeCoins", "iTunes $10");

        ListView rewardsList = (ListView) findViewById(R.id.rewards_list);
        final ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, list);
        rewardsList.setAdapter(adapter);
    }

}
