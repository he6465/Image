package myapplication.image;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    TextView Text1, Text2;
    Switch ChkAgree;
    RadioGroup Rgroup1;
    RadioButton jelly, kitkat, lolipop;
    Button btend, btreset;
    ImageView Img;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("안드로이드 사진보기");

        Text1 = (TextView) findViewById(R.id.Text1);
        Text2 = (TextView) findViewById(R.id.Text2);

        ChkAgree = (Switch) findViewById(R.id.ChkAgree);

        Rgroup1 = (RadioGroup) findViewById(R.id.Rgroup1);

        jelly = (RadioButton) findViewById(R.id.jelly);
        kitkat = (RadioButton) findViewById(R.id.kitkat);
        lolipop = (RadioButton) findViewById(R.id.lolipop);

        btend = (Button) findViewById(R.id.btend);
        btreset = (Button) findViewById(R.id.btreset);

        Img = (ImageView) findViewById(R.id.Img);

        ChkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
                String str = String.valueOf(arg1);

                if (arg1) {
                    Text2.setVisibility(View.VISIBLE);
                    Rgroup1.setVisibility(View.VISIBLE);
                    btend.setVisibility(View.VISIBLE);
                    btreset.setVisibility(View.VISIBLE);
                    Img.setVisibility(View.VISIBLE);
                } else {
                    Text2.setVisibility(View.INVISIBLE);
                    Rgroup1.setVisibility(View.INVISIBLE);
                    btend.setVisibility(View.INVISIBLE);
                    btreset.setVisibility(View.INVISIBLE);
                    Img.setVisibility(View.INVISIBLE);
                }
            }
        });

        jelly.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Img.setImageResource(R.drawable.jelly);
            }
        });

        kitkat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Img.setImageResource(R.drawable.kitkat);
            }
        });

        lolipop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Img.setImageResource(R.drawable.lolipop);
            }
        });

        btend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btreset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ChkAgree.setChecked(false);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
