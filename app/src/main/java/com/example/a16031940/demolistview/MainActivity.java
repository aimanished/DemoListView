package com.example.a16031940.demolistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<food> Food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)this.findViewById(R.id.LvFood);

        Food = new ArrayList<food>();
        Food.add(new food("Ah Lat Coffee",false));
        Food.add(new food("Rocky Choc",true));
        Food.add(new food("Kid Cat Choc",true));

        aa = new FoodAdapter(this,R.layout.row,Food);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                food selectedFood = Food.get(position);
                Toast.makeText(MainActivity.this ,selectedFood.getName() + " Star: " +
                selectedFood.isStar(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
