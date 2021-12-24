package com.mohammed.BMI_analayzer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mohammed.BMI_analayzer.foodrecycleview.Food;
import com.mohammed.BMI_analayzer.foodrecycleview.FoodAdapter;

import java.util.ArrayList;

public class Food_List extends AppCompatActivity {
RecyclerView re_v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        re_v=findViewById(R.id.re_view);
        ArrayList<Food>f=new ArrayList<>();
        f.add(new Food(R.drawable.banana,"Banana","Fruit","500 cal/g"));
        f.add(new Food(R.drawable.banana,"Banana","Fruit","500 cal/g"));

        f.add(new Food(R.drawable.banana,"Banana","Fruit","500 cal/g"));
        f.add(new Food(R.drawable.banana,"Banana","Fruit","500 cal/g"));
        f.add(new Food(R.drawable.banana,"Banana","Fruit","500 cal/g"));

        FoodAdapter adapter=new FoodAdapter(f);
        RecyclerView.LayoutManager lm=new LinearLayoutManager(this);
        re_v.setHasFixedSize(true);
        re_v.setLayoutManager(lm);
        re_v.setAdapter(adapter);
    }
}