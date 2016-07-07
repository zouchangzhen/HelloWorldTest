package com.example.administrator.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class EmptyActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);

        listView= (ListView) findViewById(R.id.listView);
        CommonListAdapter adapter=new CommonListAdapter(EmptyActivity.this);
        listView.setAdapter(adapter);
    }
}
