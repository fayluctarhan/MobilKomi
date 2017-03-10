
package kodluyoruzakademi.com.mobilkomi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by FIRAT on 09.03.2017.
 */

public class DetayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        String baslik = getIntent().getExtras().getString("mus");
        String baslangic = getIntent().getExtras().getString("bas");
        String ana_yemek = getIntent().getExtras().getString("ana");
        String tatli = getIntent().getExtras().getString("tat");
        String icecek = getIntent().getExtras().getString("içe");

        TextView test1 = (TextView) findViewById(R.id.Baslik1);
        test1.setText(baslik);
        TextView test2 = (TextView) findViewById(R.id.TextView1);
        test2.setText(baslangic);
        TextView test3 = (TextView) findViewById(R.id.TextView2);
        test3.setText(ana_yemek);
        TextView test4 = (TextView) findViewById(R.id.TextView3);
        test4.setText(tatli);
        TextView test5 = (TextView) findViewById(R.id.TextView4);
        test5.setText(icecek);





        String baslik2 = getIntent().getExtras().getString("mus2");
        String baslangic2 = getIntent().getExtras().getString("bas2");
        String ana_yemek2 = getIntent().getExtras().getString("ana2");
        String tatli2 = getIntent().getExtras().getString("tat2");
        String icecek2 = getIntent().getExtras().getString("içe2");

        TextView test6 = (TextView) findViewById(R.id.Baslik2);
        test6.setText(baslik2);
        TextView test7 = (TextView) findViewById(R.id.TextView5);
        test7.setText(baslangic2);
        TextView test8 = (TextView) findViewById(R.id.TextView6);
        test8.setText(ana_yemek2);
        TextView test9 = (TextView) findViewById(R.id.TextView7);
        test9.setText(tatli2);
        TextView test10 = (TextView) findViewById(R.id.TextView8);
        test10.setText(icecek2);

        String baslik3 = getIntent().getExtras().getString("mus3");
        String baslangic3 = getIntent().getExtras().getString("bas3");
        String ana_yemek3 = getIntent().getExtras().getString("ana3");
        String tatli3 = getIntent().getExtras().getString("tat3");
        String icecek3 = getIntent().getExtras().getString("içe3");

        TextView test11 = (TextView) findViewById(R.id.Baslik3);
        test11.setText(baslik3);
        TextView test12 = (TextView) findViewById(R.id.TextView9);
        test12.setText(baslangic3);
        TextView test13 = (TextView) findViewById(R.id.TextView10);
        test13.setText(ana_yemek3);
        TextView test14 = (TextView) findViewById(R.id.TextView11);
        test14.setText(tatli3);
        TextView test15 = (TextView) findViewById(R.id.TextView12);
        test15.setText(icecek3);


    }
}