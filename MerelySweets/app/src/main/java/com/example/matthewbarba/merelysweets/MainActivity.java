package com.example.matthewbarba.merelysweets;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //    This method is called when the email button is clicked. Opens the email app
    public void composeEmail(View view) {
        String emailAddress = "merelysweets@gmail.com";
        Intent intent = new Intent(Intent.ACTION_SEND); //Intent specifying email app needs to be opened
        intent.setType("text/html");
        intent.putExtra(Intent.EXTRA_EMAIL, emailAddress); //recieving email address
        intent.putExtra(Intent.EXTRA_SUBJECT, "Hello Merely Sweets!"); //email subject. change if desired.
        startActivity(Intent.createChooser(intent, "Send Email"));
    }

    //This method is called when the menu button is clicked. Opens link to menu on website.
    public void openMenu(View view) {
        String menu_url = "http://merelysweets.com/menu/"; //URL that needs to be opened
        Intent intent = new Intent(Intent.ACTION_VIEW); //New intent that opens url
        intent.setData(Uri.parse(menu_url));
        startActivity(intent);
    }

    //this method is called when the address or location icons are clicked. opens the default map app to location of the business
    public void navLocation(View view) {
//        intent to open map app to business loction
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Merely+Sweets/@33.9188191,-117.9031448,17z/data=!3m1!4b1!4m5!3m4!1s0x80dcd512d4751bfb:0x15e393df56c3ab2b!8m2!3d33.9188191!4d-117.9009561"));
        startActivity(intent);
    }

    //This method is called when the phone number or phone icons are clicked. Opens the phone with the number of the business
    public void callNumber(View view) {
//        intent to open phone to business phone #
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:7145299909"));
        startActivity(intent);
    }
}

