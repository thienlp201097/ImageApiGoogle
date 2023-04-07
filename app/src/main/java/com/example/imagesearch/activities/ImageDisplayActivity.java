package com.example.imagesearch.activities;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.imagesearch.R;
import com.example.imagesearch.models.ImageResult;
import com.squareup.picasso.Picasso;

public class ImageDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_display);
        ImageView ivImage = (ImageView) findViewById(R.id.ivResult);
        TextView tvImageName = (TextView) findViewById(R.id.tvImageName);

        ImageResult imageResult = (ImageResult) getIntent().getSerializableExtra("result");
        String url = imageResult.getFullUrl();
        Picasso.with(this).load(url).into(ivImage);
        tvImageName.setText(imageResult.getTitle());
       // getActionBar().hide();
        getSupportActionBar().hide();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_image_display, menu);
        return true;
    }
}
