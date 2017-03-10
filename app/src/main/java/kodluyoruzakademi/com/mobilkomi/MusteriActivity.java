package kodluyoruzakademi.com.mobilkomi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by FIRAT on 08.03.2017.
 */

public class MusteriActivity extends AppCompatActivity {
    EditText editText1, editText2, editText3, editText4;
    TextView Musteri1, textView1, textView2, textView3, textView4;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musteri);

        editText1 = (EditText) findViewById(R.id.EditText1);
        editText2 = (EditText) findViewById(R.id.EditText2);
        editText3 = (EditText) findViewById(R.id.EditText3);
        editText4 = (EditText) findViewById(R.id.EditText4);

        Musteri1 = (TextView) findViewById(R.id.Baslik1);
        textView1 = (TextView) findViewById(R.id.TextView1);
        textView2 = (TextView) findViewById(R.id.TextView2);
        textView3 = (TextView) findViewById(R.id.TextView3);
        textView4 = (TextView) findViewById(R.id.TextView4);

        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MusteriActivity.this, IkinciMusteriActivity.class);
                intent.putExtra("mus", Musteri1.getText().toString());
                intent.putExtra("bas", editText1.getText().toString());
                intent.putExtra("ana", editText2.getText().toString());
                intent.putExtra("tat", editText3.getText().toString());
                intent.putExtra("içe", editText4.getText().toString());
                startActivity(intent);
            }

        });

    }
}