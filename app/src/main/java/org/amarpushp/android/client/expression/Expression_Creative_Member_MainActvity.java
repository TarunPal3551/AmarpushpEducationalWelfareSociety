package org.amarpushp.android.client.expression;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.hp.amarpushpeducationalwelfaresocietyblue.R;

public class Expression_Creative_Member_MainActvity extends AppCompatActivity   {


    ImageButton fb_button1, fb_button2, fb_button3, fb_button4;
    ImageButton twitter_button1, twitter_button2, twitter_button3, twitter_button4;
    ImageButton linkedin_button1, linkedin_button2, linkedin_button3, linkedin_button4;
    ImageButton google_plus_button1, google_plus_button2, google_plus_button3, google_plus_button4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expression_creative_members_recyclerview);

        fb_button1 = (ImageButton)findViewById(R.id.facebook_image_button1);
        fb_button2 = (ImageButton)findViewById(R.id.facebook_image_button2);
        fb_button3 = (ImageButton)findViewById(R.id.facebook_image_button3);
        fb_button4 = (ImageButton)findViewById(R.id.facebook_image_button4);

        twitter_button1 = (ImageButton)findViewById(R.id.twitter_image_button1);
        twitter_button2 = (ImageButton)findViewById(R.id.twitter_image_button2);
        twitter_button3 = (ImageButton)findViewById(R.id.twitter_image_button3);
        twitter_button4 = (ImageButton)findViewById(R.id.twitter_image_button4);

        linkedin_button1 = (ImageButton)findViewById(R.id.linkedin_image_button1);
        linkedin_button2 = (ImageButton)findViewById(R.id.linkedin_image_button2);
        linkedin_button3 = (ImageButton)findViewById(R.id.linkedin_image_button3);
        linkedin_button4 = (ImageButton)findViewById(R.id.linkedin_image_button4);

        google_plus_button1 = (ImageButton)findViewById(R.id.google_plus_image_button1);
        google_plus_button2 = (ImageButton)findViewById(R.id.google_plus_image_button2);
        google_plus_button3 = (ImageButton)findViewById(R.id.google_plus_image_button3);
        google_plus_button4 = (ImageButton)findViewById(R.id.google_plus_image_button4);







        fb_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Uri uri = Uri.parse("https://www.facebook.com/gitanjali.kushwaha");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        fb_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://www.facebook.com/Amarpushp-Educational-Welfare-Society-263557857012341/");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        fb_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://www.facebook.com/Amarpushp-Educational-Welfare-Society-263557857012341/");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        fb_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://www.facebook.com/akushwaha11");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        twitter_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://twitter.com/amarpushps");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        twitter_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://twitter.com/amarpushps");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        twitter_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://twitter.com/amarpushps");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        twitter_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://twitter.com/akushwaha11");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        linkedin_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://www.linkedin.com/in/gitanjali-kushwaha-43622b40/");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        linkedin_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://www.linkedin.com/company/amarpushp-educational-and-welfare-society/");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        linkedin_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://www.linkedin.com/company/amarpushp-educational-and-welfare-society/");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        linkedin_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://www.linkedin.com/in/ashish-kushwaha-9057b336/");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        google_plus_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://plus.google.com/u/1/103166768955006638941");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        google_plus_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://plus.google.com/u/1/103166768955006638941");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        google_plus_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://plus.google.com/u/1/103166768955006638941");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        google_plus_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://plus.google.com/u/1/103166768955006638941");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });






        }





}
