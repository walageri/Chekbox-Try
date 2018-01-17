package com.blogspot.programer27android.chekboxtry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox cb1,cb2,cb3,cb4;
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1= (CheckBox) findViewById(R.id.checkBox1);
        cb2= (CheckBox) findViewById(R.id.checkBox2);
        cb3= (CheckBox) findViewById(R.id.checkBox3);
        cb4= (CheckBox) findViewById(R.id.checkBox4);
        pilihancek ();
        tv= (TextView) findViewById(R.id.textView);
        btn= (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer hasil = new StringBuffer();
                hasil.append("sapi : ").append(cb1.isChecked());
                hasil.append("\nayam : ").append(cb2.isChecked());
                hasil.append("\nkambing : ").append(cb3.isChecked());
                hasil.append("\nikan : ").append(cb4.isChecked());
                tv.setText(hasil);
                Toast.makeText(MainActivity.this, hasil, Toast.LENGTH_LONG).show();
            }
        });
    }
    public void pilihancek (){
        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Sapi terceklis", Toast.LENGTH_SHORT).show();
            }
        });
        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ayam terceklis", Toast.LENGTH_SHORT).show();
            }
        });
        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Kambing terceklis", Toast.LENGTH_SHORT).show();
            }
        });
        cb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ikan terceklis", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
