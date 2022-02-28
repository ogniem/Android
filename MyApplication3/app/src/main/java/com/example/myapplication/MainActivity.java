package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static TextView tbt0,tbt1,tbt2,tbt3,tbt4,tbt5,tbt6,tbt7,tbt8,tbt9,tbtc, tbtce, tbtphantram, tbtm, tbtmtru, tbtmcong, tbtmr, tbtmc, mh1, mh2 ,menu2,menu4;
    static ImageView ibtbang, ibtcong,ibtnhan, ibttru, ibtchia, ibtxoa,ibtcham, ibttd, ibtcan, ibtmu, ibtdao,menu1, menu3, menu5;


    static String str1="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ham();
        tbt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh1("0");
            }
        });
        tbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh1("1");
            }
        });
        tbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh1("2");
            }
        });
        tbt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh1("3");
            }
        });
        tbt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh1("4");
            }
        });
        tbt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh1("5");
            }
        });
        tbt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh1("6");
            }
        });
        tbt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh1("7");
            }
        });
        tbt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh1("8");
            }
        });
        tbt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh1("9");
            }
        });
        tbtce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1="";
                mh1.setText("");
            }
        });
        tbtc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1="";
                mh2.setText(str1);
                mh1.setText(str1);
            }
        });
        ibtbang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mh2.setText(String.valueOf(tinh()));
               // mh2.setText(str1);
            }
        });

        ibtcong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mh1.getText()==""){
                    str1="0";
                    mh2.setText("0 + ");
                }
                else {
                    manhinh1("+");
                    mh1.setText(str1);

                }
            }
        });
        ibttru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mh1.getText()==""){
                    str1="0";
                    mh2.setText("0 - ");
                }
                else {
                    manhinh1("-");
                    mh1.setText(str1);

                }
            }
        });
        ibtnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mh1.getText()==""){
                    str1="0";
                    mh2.setText("0 * ");
                }
                else {
                    manhinh1("*");
                    mh1.setText(str1);

                }
            }
        });
        ibtchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mh1.getText()==""){
                    str1="0";
                    mh2.setText("0 / ");
                }
                else {
                    manhinh1("/");
                    mh1.setText(str1);

                }
            }
        });
        ibtxoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str1.length()>0){
                    String newstr= str1.substring(0,str1.length()-1);
                    str1= newstr;
                    mh1.setText(str1);
                }

            }
        });


    }
    private  void manhinh1(String x){
        str1+=x;
        mh1.setText(str1);
    }

    private double tinh(){
        int a=0;
        int b=0;
        Character dau=0;
        int i;
       // String kq = "";

        for( i=0; i< str1.length();i++){
            if(str1.charAt(i)<0 || str1.charAt(i)>9){
                dau = str1.charAt(i);
                break;
            }
            else{
                a= a*10+(str1.charAt(i)-'0');
            }
        }
        for(;i<str1.length();i++){
            b=b*10+(str1.charAt(i)-'0');
        }
//        if(dau.equals('+')){
//          //  kq=String.valueOf(a+b);
//           // str1= kq;
//            mh2.setText(String.valueOf(a+b));
       // }

        if (dau == '+') return Double.valueOf(a) + Double.valueOf(b);
        if (dau == '-') return Double.valueOf(a) - Double.valueOf(b);
        if (dau == 'x') return Double.valueOf(a) * Double.valueOf(b);
        if (dau == '/') return Double.valueOf(a) / Double.valueOf(b);
        if (dau == '.') return Math.sqrt(Double.valueOf(a));

        return 0.0;


    }
    private void ham()
    {
        tbt0 = findViewById(R.id.tbt0);
        tbt1 = findViewById(R.id.tbt1);
        tbt2 = findViewById(R.id.tbt2);
        tbt3 = findViewById(R.id.tbt3);
        tbt4 = findViewById(R.id.tbt4);
        tbt5 = findViewById(R.id.tbt5);
        tbt6 = findViewById(R.id.tbt6);
        tbt7 = findViewById(R.id.tbt7);
        tbt8 = findViewById(R.id.tbt8);
        tbt9 = findViewById(R.id.tbt9);
        tbtc= findViewById(R.id.tbtc);
        tbtce =findViewById(R.id.tbtce);
        tbtphantram= findViewById(R.id.tbtphantram);
        tbtm= findViewById(R.id.tbtm);
        tbtmtru= findViewById(R.id.tbtmtru);
        tbtmcong= findViewById(R.id.tbtmcong);
        tbtmr= findViewById(R.id.tbtmr);
        tbtmc= findViewById(R.id.tbtmc);
        menu2 = findViewById(R.id.menu2);
        menu4 = findViewById(R.id.menu4);

        ibtbang = findViewById(R.id.ibtbang);
        ibtcong= findViewById(R.id.ibtcong);
        ibttru = findViewById(R.id.ibttru);
        ibtnhan = findViewById(R.id.ibtnhan);
        ibtchia = findViewById(R.id.ibtchia);
        ibtxoa = findViewById(R.id.ibtxoa);
        ibtcham = findViewById(R.id.ibtcham);
        ibttd = findViewById(R.id.ibttd);
        ibtcan= findViewById(R.id.ibtcan);
        ibtmu= findViewById(R.id.ibtmu);
        ibtdao= findViewById(R.id.ibtdao);
        mh1 = findViewById(R.id.mh1);
        mh2 = findViewById(R.id.mh2);
        menu1 = findViewById(R.id.menu1);
        menu3 = findViewById(R.id.menu3);
        menu5 = findViewById(R.id.menu3);

    }
}