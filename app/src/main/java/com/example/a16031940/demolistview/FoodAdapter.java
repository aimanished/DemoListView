package com.example.a16031940.demolistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FoodAdapter extends ArrayAdapter<food> {

    private ArrayList<food> Food;
    private Context context;
    private TextView tvFoodName;
    private ImageView ivStar;

    public FoodAdapter(Context context, int resource, ArrayList<food> objects){
        super(context,resource,objects);
        Food = objects;
        this.context = context;
    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row,parent,false);
        tvFoodName = (TextView)rowView.findViewById(R.id.tvFoodName);
        ivStar = (ImageView)rowView.findViewById(R.id.ivStar);
        food currentFood = Food.get(position);

        tvFoodName.setText(currentFood.getName());
        if(currentFood.isStar()){
            ivStar.setImageResource(R.drawable.star);
        }
        else{
            ivStar.setImageResource(R.drawable.nostar);
        }
        return rowView;
    }
}
