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
 * Created by FIRAT on 09.03.2017.
 */

public class UcuncuMusteriActivity extends AppCompatActivity {

    EditText editText9, editText10, editText11, editText12;
    TextView Musteri3, textView9, textView10, textView11, textView12;
    Button btn3;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ucuncumusteri);

        //String ic = getIntent().getExtras().getString("içe");
        //TextView text = (TextView) findViewById(R.id.text3);
        //text.setText(ic);

        //String ic2 = getIntent().getExtras().getString("içe2");
        //TextView text2 = (TextView) findViewById(R.id.text4);
        //text2.setText(ic2);

        editText9 = (EditText) findViewById(R.id.EditText9);
        editText10 = (EditText) findViewById(R.id.EditText10);
        editText11 = (EditText) findViewById(R.id.EditText11);
        editText12 = (EditText) findViewById(R.id.EditText12);

        Musteri3 = (TextView) findViewById(R.id.Baslik3);
        textView9 = (TextView) findViewById(R.id.TextView9);
        textView10 = (TextView) findViewById(R.id.TextView10);
        textView11 = (TextView) findViewById(R.id.TextView11);
        textView12 = (TextView) findViewById(R.id.TextView12);

        final String baslik = getIntent().getExtras().getString("mus");
        final String baslangic = getIntent().getExtras().getString("bas");
        final String ana_yemek = getIntent().getExtras().getString("ana");
        final String tatli = getIntent().getExtras().getString("tat");
        final String icecek = getIntent().getExtras().getString("içe");

        final String baslik2 = getIntent().getExtras().getString("mus2");
        final String baslangic2 = getIntent().getExtras().getString("bas2");
        final String ana_yemek2 = getIntent().getExtras().getString("ana2");
        final String tatli2 = getIntent().getExtras().getString("tat2");
        final String icecek2 = getIntent().getExtras().getString("içe2");

        btn3 = (Button) findViewById(R.id.button);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(UcuncuMusteriActivity.this, DetayActivity.class);

                intent.putExtra("mus", baslik);
                intent.putExtra("bas", baslangic);
                intent.putExtra("ana", ana_yemek);
                intent.putExtra("tat", tatli);
                intent.putExtra("içe", icecek);

                intent.putExtra("mus2", baslik2);
                intent.putExtra("bas2", baslangic2);
                intent.putExtra("ana2", ana_yemek2);
                intent.putExtra("tat2", tatli2);
                intent.putExtra("içe2", icecek2);

                intent.putExtra("mus3", Musteri3.getText().toString());
                intent.putExtra("bas3", editText9.getText().toString());
                intent.putExtra("ana3", editText10.getText().toString());
                intent.putExtra("tat3", editText11.getText().toString());
                intent.putExtra("içe3", editText12.getText().toString());

                startActivity(intent);
                finish();
            }
        });
    }

}