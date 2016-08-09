package br.com.fgr.udacity0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPopularMovies = (Button) findViewById(R.id.btn_popular_movies);
        Button btnStockHawk = (Button) findViewById(R.id.btn_stock_hawk);
        Button btnBuildBigger = (Button) findViewById(R.id.btn_build_it_bigger);
        Button btnMakeYourAppMaterial = (Button) findViewById(R.id.btn_make_your_app_material);
        Button btnGoUbiquitous = (Button) findViewById(R.id.btn_go_ubiquitous);
        Button btnCapstone = (Button) findViewById(R.id.btn_capstone);

        btnPopularMovies.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my popular movies apps!",
                    Toast.LENGTH_SHORT).show();
            }
        });

        btnStockHawk.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my stock hawk apps!",
                    Toast.LENGTH_SHORT).show();
            }
        });

        btnBuildBigger.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my build bigger apps!",
                    Toast.LENGTH_SHORT).show();
            }
        });

        btnMakeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                    "This button will launch my make your app material apps!", Toast.LENGTH_SHORT)
                    .show();
            }
        });

        btnGoUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my go ubiquitous apps!",
                    Toast.LENGTH_SHORT).show();
            }
        });

        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my capstone apps!",
                    Toast.LENGTH_SHORT).show();
            }
        });
    }
}
