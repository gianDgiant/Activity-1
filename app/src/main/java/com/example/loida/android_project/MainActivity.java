package com.example.loida.android_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int a,b,c,d,e,f;
    String cpd, cs;
    public static String cpdf = "com.example.application.example.cpdf";
    public static String csf = "com.example.application.example.cs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but = findViewById(R.id.but);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setData();
                if(a!=0&&b!=0&&c!=0&&d!=0&&e!=0&&f!=0){
                    calu();
                    openScreen2();
                    //TextView yo = findViewById(R.id.yo);
                    //yo.setText(cpd);
                }
            }
        });
    }

    public void openScreen2(){
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra(cpdf,cpd);
        intent.putExtra(csf,cs);
        startActivity(intent);
    }

    public void setData(){
        EditText et1 = findViewById(R.id.v1);
        a = Integer.parseInt(et1.getText().toString());
        EditText et2 = findViewById(R.id.v2);
        b = Integer.parseInt(et2.getText().toString());
        EditText et3 = findViewById(R.id.v3);
        c = Integer.parseInt(et3.getText().toString());
        EditText et4 = findViewById(R.id.v4);
        d = Integer.parseInt(et4.getText().toString());
        EditText et5 = findViewById(R.id.v5);
        e = Integer.parseInt(et5.getText().toString());
        EditText et6 = findViewById(R.id.v6);
        f = Integer.parseInt(et6.getText().toString());
    }

    public void calu(){

        cpd = ""+(((a/c)*b)+d+e);
        cs = ""+((((a/c)*b)+d+e)-f);

    }
}
