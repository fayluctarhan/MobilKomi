package kodluyoruzakademi.com.mobilkomi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by FIRAT on 08.03.2017.
 */

public class IkinciMusteriActivity extends AppCompatActivity {

    EditText editText5, editText6, editText7, editText8;
    TextView Musteri2, textView5, textView6, textView7, textView8;
    Button btn2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikincimusteri);


        //TextView text = (TextView) findViewById(R.id.text);
        final String baslik = getIntent().getExtras().getString("mus");
        final String baslangic = getIntent().getExtras().getString("bas");
        final String ana_yemek = getIntent().getExtras().getString("ana");
        final String tatli = getIntent().getExtras().getString("tat");
        final String icecek = getIntent().getExtras().getString("içe");


        //text.setText(baslangic);

        editText5 = (EditText) findViewById(R.id.EditText5);
        editText6 = (EditText) findViewById(R.id.EditText6);
        editText7 = (EditText) findViewById(R.id.EditText7);
        editText8 = (EditText) findViewById(R.id.EditText8);

        Musteri2 = (TextView) findViewById(R.id.Baslik2);
        textView5 = (TextView) findViewById(R.id.TextView5);
        textView6 = (TextView) findViewById(R.id.TextView6);
        textView7 = (TextView) findViewById(R.id.TextView7);
        textView8 = (TextView) findViewById(R.id.TextView8);

        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IkinciMusteriActivity.this, UcuncuMusteriActivity.class);

                intent.putExtra("mus", baslik);
                intent.putExtra("bas", baslangic);
                intent.putExtra("ana", ana_yemek);
                intent.putExtra("tat", tatli);
                intent.putExtra("içe", icecek);

                intent.putExtra("mus2", Musteri2.getText().toString());
                intent.putExtra("bas2", editText5.getText().toString());
                intent.putExtra("ana2", editText6.getText().toString());
                intent.putExtra("tat2", editText7.getText().toString());
                intent.putExtra("içe2", editText8.getText().toString());


                startActivity(intent);

            }
        });


    }
}