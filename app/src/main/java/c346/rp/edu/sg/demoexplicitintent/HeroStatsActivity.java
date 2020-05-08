package c346.rp.edu.sg.demoexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HeroStatsActivity extends AppCompatActivity {

    TextView tvName, tvStrength, tvTechnialProwess;
    Button btnLike, btnDislike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_stats);

        Intent i = getIntent();
        Hero hero = (Hero) i.getSerializableExtra("hero");

        tvName = (TextView)findViewById(R.id.textViewName);
        tvStrength = (TextView)findViewById(R.id.textViewStrength);
        tvTechnialProwess = (TextView)findViewById(R.id.textViewTechnicalProwess);
        btnLike = (Button)findViewById(R.id.buttonLike);
        btnDislike = (Button)findViewById(R.id.buttonDislike);

        tvName.setText(hero.getName());
        tvStrength.setText("Strength: " + hero.getStrength());
        tvTechnialProwess.setText("Technical: " + hero.getTechnicalProwess());

        btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("like", "like");
                setResult(RESULT_OK, i);
                finish();
            }
        });

        btnDislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("like", "dislike");
                setResult(RESULT_OK, i);
                finish();
            }
        });
    }
}
