package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    int[] images = {R.drawable.aston , R.drawable.benz ,R.drawable.bmw ,
            R.drawable.ferrari , R.drawable.lamb , R.drawable.lotus,
            R.drawable.porsche ,R.drawable.toyota ,R.drawable.mcl};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridview);
        Myadapter myadapter = new Myadapter(getApplicationContext(),images);
        gridView.setAdapter(myadapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext() , ResultActivity.class);
                intent.putExtra("id",images[position]);
                startActivity(intent);
            }
        });
    }
}
