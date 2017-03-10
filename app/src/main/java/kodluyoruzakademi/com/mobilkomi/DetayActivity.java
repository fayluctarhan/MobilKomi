
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

        TextView test1 = (TextView) findViewById(R.id.test1);
        test1.setText(baslangic);

        String baslik2 = getIntent().getExtras().getString("mus2");
        String baslangic2 = getIntent().getExtras().getString("bas2");
        String ana_yemek2 = getIntent().getExtras().getString("ana2");
        String tatli2 = getIntent().getExtras().getString("tat2");
        String icecek2 = getIntent().getExtras().getString("içe2");

        TextView test2 = (TextView) findViewById(R.id.test2);
        test2.setText(baslangic2);

        String baslik3 = getIntent().getExtras().getString("mus3");
        String baslangic3 = getIntent().getExtras().getString("bas3");
        String ana_yemek3 = getIntent().getExtras().getString("ana3");
        String tatli3 = getIntent().getExtras().getString("tat3");
        String icecek3 = getIntent().getExtras().getString("içe3");

        TextView test3 = (TextView) findViewById(R.id.test3);
        test3.setText(baslangic3);

    }
}