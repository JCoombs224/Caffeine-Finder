package edu.miracostacollege.cs134.caffeinefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;

public class CaffieneDetailsActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView addressTextView;
    private TextView cityTextView;
    private TextView phoneTextView;
    private TextView latLngTextView;
    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caffiene_details);

        nameTextView = findViewById(R.id.detailsNameTextView);
        addressTextView = findViewById(R.id.detailsAddressTextView);
        cityTextView = findViewById(R.id.detailsCityTextView);
        phoneTextView = findViewById(R.id.detailsPhoneTextView);
        latLngTextView = findViewById(R.id.detailsLatLngTextView);



    }
}
