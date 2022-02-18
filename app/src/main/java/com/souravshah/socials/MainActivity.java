package com.souravshah.socials;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.TextView;

public class MainActivity<setOnclick> extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_maincourse);

        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);

                startActivity(startersActivityIntent);
            }
        });
        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent maincoursesActivityIntent = new Intent(MainActivity.this, StartersActivity.class);
                startActivity(maincoursesActivityIntent);
            }


        });

TextView emailtextview = findViewById(R.id.text_view_email_address);
emailtextview.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent launchemail = new Intent(Intent.ACTION_SENDTO);
        launchemail.setData(Uri.parse("mailto:thesocials@socials.com"));
        startActivity(launchemail);
    }
});
    }

        }
