package com.example.android.travelukraine;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityCity extends AppCompatActivity implements View.OnClickListener {

    TextView cityName;
    TextView cityPopulation;
    TextView cityArea;
    Button btnMap;
    ImageView cityImage;
    TextView cityInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        cityName = (TextView) findViewById(R.id.cityName);
        cityPopulation = (TextView) findViewById(R.id.cityPopulation);
        cityArea = (TextView) findViewById(R.id.cityArea);
        btnMap = (Button) findViewById(R.id.btnMap);
        btnMap.setOnClickListener(this);
        cityImage = (ImageView) findViewById(R.id.cityImage);
        cityInfo = (TextView) findViewById(R.id.cityInfo);

// Принимаем имя
        String nameFromMainActivity = getIntent().getStringExtra("name");
        switch (nameFromMainActivity) {
            case ("Kyiv"):
                cityName.setText("Kyiv");
                cityPopulation.setText("Population: " + 2868700);
                cityArea.setText("Area: " + 835 + " sq. km");
                cityImage.setImageResource(R.drawable.kyiv);
                cityInfo.setText(getResources().getString(R.string.Kyiv));
                break;

            case ("Lviv"):
                cityName.setText("Lviv");
                cityPopulation.setText("Population: " + 728660);
                cityArea.setText("Area: " + 182 + " sq. km");
                cityImage.setImageResource(R.drawable.lviv);
                cityInfo.setText(getResources().getString(R.string.Lviv));
                break;
            case ("Odesa"):
                cityName.setText("Odesa");
                cityPopulation.setText("Population: " + 1017000);
                cityArea.setText("Area: " + 162 + " sq. km");
                cityImage.setImageResource(R.drawable.odesa);
                cityInfo.setText(getResources().getString(R.string.Odesa));
                break;
            case ("Zaporizhzhia"):
                cityName.setText("Zaporizhzhia");
                cityPopulation.setText("Population: " + 766300);
                cityArea.setText("Area: " + 240 + " sq. km");
                cityImage.setImageResource(R.drawable.zaporizhzhia);
                cityInfo.setText(getResources().getString(R.string.Zaporizhzhia));
                break;
            case ("Chernivtsi"):
                cityName.setText("Chernivtsi");
                cityPopulation.setText("Population: " + 262294);
                cityArea.setText("Area: " + 153 + " sq. km");
                cityImage.setImageResource(R.drawable.chernivtsi);
                cityInfo.setText(getResources().getString(R.string.Chernivtsi));
                break;
            case ("Ivano-Frankivsk"):
                cityName.setText("Ivano-Frankivsk");
                cityPopulation.setText("Population: " + 242549);
                cityArea.setText("Area: " + 84 + " sq. km");
                cityImage.setImageResource(R.drawable.ivano_frankivsk);
                cityInfo.setText(getResources().getString(R.string.IvFrankivsk));
                break;
            case ("Rivne"):
                cityName.setText("Rivne");
                cityPopulation.setText("Population: " + 249639);
                cityArea.setText("Area: " + 63 + " sq. km");
                cityImage.setImageResource(R.drawable.rivne);
                cityInfo.setText(getResources().getString(R.string.Rivne));
                break;
            case ("Lutsk"):
                cityName.setText("Lutsk");
                cityPopulation.setText("Population: " + 217225);
                cityArea.setText("Area: " + 42 + " sq. km");
                cityImage.setImageResource(R.drawable.lutsk);
                cityInfo.setText(getResources().getString(R.string.Lutsk));
                break;
            case ("Uzhgorod"):
                cityName.setText("Uzhgorod");
                cityPopulation.setText("Population: " + 115520);
                cityArea.setText("Area: " + 40 + " sq. km");
                cityImage.setImageResource(R.drawable.uzhgorod);
                cityInfo.setText(getResources().getString(R.string.Uzhgorod));
                break;
            case ("Kamianets-Podilskyi"):
                cityName.setText("Kamianets-Podilskyi");
                cityPopulation.setText("Population: " + 101978);
                cityArea.setText("Area: " + 28 + " sq. km");
                cityImage.setImageResource(R.drawable.kamianets);
                cityInfo.setText(getResources().getString(R.string.Kamianets));
                break;

            default:
                break;

        }

    }

    @Override
    public void onClick(View v) {
        String name = cityName.getText().toString();
        Uri geoLocation;

        switch (name) {
            case ("Kyiv"):
                geoLocation = Uri.parse("geo:50.45000,30.52361111?");
                showMap(geoLocation);
                break;

            case ("Lviv"):
                geoLocation = Uri.parse("geo:49.83000,24.01416667?");
                showMap(geoLocation);
                break;
            case ("Odesa"):
                geoLocation = Uri.parse("geo:46.48556,30.74333333?");
                showMap(geoLocation);
                break;
            case ("Zaporizhzhia"):
                geoLocation = Uri.parse("geo:47.83778,35.13833333?");
                showMap(geoLocation);
                break;
            case ("Chernivtsi"):
                geoLocation = Uri.parse("geo:48.32194,25.92166667?");
                showMap(geoLocation);
                break;
            case ("Ivano-Frankivsk"):
                geoLocation = Uri.parse("geo:48.92278,24.71055556?");
                showMap(geoLocation);
                break;
            case ("Rivne"):
                geoLocation = Uri.parse("geo:50.61972,26.25138889?");
                showMap(geoLocation);
                break;
            case ("Lutsk"):
                geoLocation = Uri.parse("geo:50.74778,25.32444444?");
                showMap(geoLocation);
                break;
            case ("Uzhgorod"):
                geoLocation = Uri.parse("geo:48.62389,22.295?");
                showMap(geoLocation);
                break;
            case ("Kamianets-Podilskyi"):
                geoLocation = Uri.parse("geo:48.68222,26.5825?");
                showMap(geoLocation);
                break;

            default:
                break;
        }
    }

    public void showMap(Uri geoLocation) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
