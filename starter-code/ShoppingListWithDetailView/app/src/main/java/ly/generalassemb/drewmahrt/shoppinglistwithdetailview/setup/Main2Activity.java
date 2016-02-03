package ly.generalassemb.drewmahrt.shoppinglistwithdetailview.setup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import ly.generalassemb.drewmahrt.shoppinglistwithdetailview.R;
import ly.generalassemb.drewmahrt.shoppinglistwithdetailview.ShoppingSQLiteOpenHelper;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        int id = getIntent().getIntExtra("id", -1);

        if(id>=0){
            TextView itemName = (TextView) findViewById(R.id.name);
            TextView itemDesc = (TextView) findViewById(R.id.desc);
            TextView itemPrice = (TextView) findViewById(R.id.price);
            TextView itemType = (TextView) findViewById(R.id.type);

            String name = ShoppingSQLiteOpenHelper.getInstance(Main2Activity.this).getNameById(id);
            String desc = ShoppingSQLiteOpenHelper.getInstance(Main2Activity.this).getDescById(id);
            String price = ShoppingSQLiteOpenHelper.getInstance(Main2Activity.this).getPriceById(id);
            String type = ShoppingSQLiteOpenHelper.getInstance(Main2Activity.this).getTypeById(id);

            itemName.setText(name);
            itemDesc.setText(desc);
            itemPrice.setText(price);
            itemType.setText(type);
        }
    }
}
