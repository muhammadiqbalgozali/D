package com.example.android.haekalsfurniture;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ListBarangActivity extends AppCompatActivity {

    //Pembuatan class private dengan nama prefs
    private SharedPreferences prefs;
    //Pembuatan variabel String bernama prefName dengan string MyPref
    private String prefName = "MyPref";
    //Pembuatan method baru untuk DbHelper dengan variabel db
    DbHelper db = new DbHelper(this);
    //Membuat variabel stock 1 - 15 integer dengan nilai 0
    int stock1, stock2, stock3, stock4, stock5, stock6, stock7, stock8,
            stock9, stock10, stock11, stock12, stock13, stock14, stock15 = 0;

    //Pembuatan variabel tvStock1 - 15 untuk TextView
    TextView tvStock1;
    TextView tvStock2;
    TextView tvStock3;
    TextView tvStock4;
    TextView tvStock5;
    TextView tvStock6;
    TextView tvStock7;
    TextView tvStock8;
    TextView tvStock9;
    TextView tvStock10;
    TextView tvStock11;
    TextView tvStock12;
    TextView tvStock13;
    TextView tvStock14;
    TextView tvStock15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_barang);

        //Pembuatan variabel Button yang terdiri dari beragam id khusus untuk button pada
        //layout activity_list_barang untuk Button Up dan Dec 1-15
        Button btnUp1 = (Button) findViewById(R.id.btn_up_1);
        Button btnDec1 = (Button) findViewById(R.id.btn_dec_1);
        Button btnUp2 = (Button) findViewById(R.id.btn_up_2);
        Button btnDec2 = (Button) findViewById(R.id.btn_dec_2);
        Button btnUp3 = (Button) findViewById(R.id.btn_up_3);
        Button btnDec3 = (Button) findViewById(R.id.btn_dec_3);
        Button btnUp4 = (Button) findViewById(R.id.btn_up_4);
        Button btnDec4 = (Button) findViewById(R.id.btn_dec_4);
        Button btnUp5 = (Button) findViewById(R.id.btn_up_5);
        Button btnDec5 = (Button) findViewById(R.id.btn_dec_5);
        Button btnUp6 = (Button) findViewById(R.id.btn_up_6);
        Button btnDec6 = (Button) findViewById(R.id.btn_dec_6);
        Button btnUp7 = (Button) findViewById(R.id.btn_up_7);
        Button btnDec7 = (Button) findViewById(R.id.btn_dec_7);
        Button btnUp8 = (Button) findViewById(R.id.btn_up_8);
        Button btnDec8 = (Button) findViewById(R.id.btn_dec_8);
        Button btnUp9 = (Button) findViewById(R.id.btn_up_9);
        Button btnDec9 = (Button) findViewById(R.id.btn_dec_9);
        Button btnUp10 = (Button) findViewById(R.id.btn_up_10);
        Button btnDec10 = (Button) findViewById(R.id.btn_dec_10);
        Button btnUp11 = (Button) findViewById(R.id.btn_up_11);
        Button btnDec11 = (Button) findViewById(R.id.btn_dec_11);
        Button btnUp12 = (Button) findViewById(R.id.btn_up_12);
        Button btnDec12 = (Button) findViewById(R.id.btn_dec_12);
        Button btnUp13 = (Button) findViewById(R.id.btn_up_13);
        Button btnDec13 = (Button) findViewById(R.id.btn_dec_13);
        Button btnUp14 = (Button) findViewById(R.id.btn_up_14);
        Button btnDec14 = (Button) findViewById(R.id.btn_dec_14);
        Button btnUp15 = (Button) findViewById(R.id.btn_up_15);
        Button btnDec15 = (Button) findViewById(R.id.btn_dec_15);

        //Pembuatan variabel tvStock1 - 15
        tvStock1 = (TextView) findViewById(R.id.tv_stock_1);
        tvStock2 = (TextView) findViewById(R.id.tv_stock_2);
        tvStock3 = (TextView) findViewById(R.id.tv_stock_3);
        tvStock4 = (TextView) findViewById(R.id.tv_stock_4);
        tvStock5 = (TextView) findViewById(R.id.tv_stock_5);
        tvStock6 = (TextView) findViewById(R.id.tv_stock_6);
        tvStock7 = (TextView) findViewById(R.id.tv_stock_7);
        tvStock8 = (TextView) findViewById(R.id.tv_stock_8);
        tvStock9 = (TextView) findViewById(R.id.tv_stock_9);
        tvStock10 = (TextView) findViewById(R.id.tv_stock_10);
        tvStock11 = (TextView) findViewById(R.id.tv_stock_11);
        tvStock12 = (TextView) findViewById(R.id.tv_stock_12);
        tvStock13 = (TextView) findViewById(R.id.tv_stock_13);
        tvStock14 = (TextView) findViewById(R.id.tv_stock_14);
        tvStock15 = (TextView) findViewById(R.id.tv_stock_15);

        /** Pembuatan btn Up dan Dec agar stock 1 - 15 increment dan decrement
         * serta merubah text pada Stock increment / decrement
         * dan meng-update database sesuai dengan stock yang ditempatkan**/
        btnUp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock1++;
                tvStock1.setText("Stock : "+stock1);
                db.addStock1(stock1);
            }
        });

        btnDec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock1--;
                tvStock1.setText("Stock : "+stock1);
                db.addStock1(stock1);
            }
        });

        btnUp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock2++;
                tvStock2.setText("Stock : "+stock2);
                db.addStock2(stock2);
            }
        });

        btnDec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock2--;
                tvStock2.setText("Stock : "+stock2);
                db.addStock2(stock2);
            }
        });

        btnUp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock3++;
                tvStock3.setText("Stock : "+stock3);
                db.addStock3(stock3);
            }
        });

        btnDec3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock3--;
                tvStock3.setText("Stock : "+stock3);
                db.addStock3(stock3);
            }
        });

        btnUp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock4++;
                tvStock4.setText("Stock : "+stock4);
                db.addStock4(stock4);
            }
        });

        btnDec4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock4--;
                tvStock4.setText("Stock : "+stock4);
                db.addStock4(stock4);
            }
        });

        btnUp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock5++;
                tvStock5.setText("Stock : "+stock5);
                db.addStock5(stock5);
            }
        });

        btnDec5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock5--;
                tvStock5.setText("Stock : "+stock5);
                db.addStock5(stock5);
            }
        });

        btnUp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock6++;
                tvStock6.setText("Stock : "+stock6);
                db.addStock6(stock6);
            }
        });

        btnDec6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock6--;
                tvStock6.setText("Stock : "+stock6);
                db.addStock6(stock6);
            }
        });

        btnUp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock7++;
                tvStock7.setText("Stock : "+stock7);
                db.addStock7(stock7);
            }
        });

        btnDec7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock7--;
                tvStock7.setText("Stock : "+stock7);
                db.addStock7(stock7);
            }
        });

        btnUp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock8++;
                tvStock8.setText("Stock : "+stock8);
                db.addStock8(stock8);
            }
        });

        btnDec8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock8--;
                tvStock8.setText("Stock : "+stock8);
                db.addStock8(stock8);
            }
        });

        btnUp9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock9++;
                tvStock9.setText("Stock : "+stock9);
                db.addStock9(stock9);
            }
        });

        btnDec9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock9--;
                tvStock9.setText("Stock : "+stock9);
                db.addStock9(stock9);
            }
        });

        btnUp10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock10++;
                tvStock10.setText("Stock : "+stock10);
                db.addStock10(stock10);
            }
        });

        btnDec10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock10--;
                tvStock10.setText("Stock : "+stock10);
                db.addStock10(stock10);
            }
        });

        btnUp11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock11++;
                tvStock11.setText("Stock : "+stock11);
                db.addStock11(stock11);
            }
        });

        btnDec11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock11--;
                tvStock11.setText("Stock : "+stock11);
                db.addStock11(stock11);
            }
        });

        btnUp12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock12++;
                tvStock12.setText("Stock : "+stock12);
                db.addStock12(stock12);
            }
        });

        btnDec12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock12--;
                tvStock12.setText("Stock : "+stock12);
                db.addStock12(stock12);
            }
        });

        btnUp13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock13++;
                tvStock13.setText("Stock : "+stock13);
                db.addStock13(stock13);
            }
        });

        btnDec13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock13--;
                tvStock13.setText("Stock : "+stock13);
                db.addStock13(stock13);
            }
        });

        btnUp14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock14++;
                tvStock14.setText("Stock : "+stock14);
                db.addStock14(stock14);
            }
        });

        btnDec14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock14--;
                tvStock14.setText("Stock : "+stock14);
                db.addStock14(stock14);
            }
        });

        btnUp15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock15++;
                tvStock15.setText("Stock : "+stock15);
                db.addStock15(stock15);
            }
        });

        btnDec15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock15--;
                tvStock15.setText("Stock : "+stock15);
                db.addStock15(stock15);
            }
        });



    }

    //Membuat override method pada onOptionsItemSelected apabila tombol back ditekan,
    //maka akan menutup ListBarangActivity
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                ListBarangActivity.this.finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //Override method pada onBackPressed untuk melakukan intent dari ListBarangActivity ke MainActivity
    //serta menutup ListBarangActivity
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ListBarangActivity.this, MainActivity.class);
        startActivity(intent);
        ListBarangActivity.this.finish();
    }

    //pembuatan class onPause yang berguna untuk melakukan update pada databae stock
    protected void onPause() {
        super.onPause();
        prefs = getSharedPreferences(prefName, MODE_PRIVATE);
        SharedPreferences.Editor edit = prefs.edit();
        edit.putInt("stock1", stock1);
        edit.putInt("stock2", stock2);
        edit.putInt("stock3", stock3);
        edit.putInt("stock4", stock4);
        edit.putInt("stock5", stock5);
        edit.putInt("stock6", stock6);
        edit.putInt("stock7", stock7);
        edit.putInt("stock8", stock8);
        edit.putInt("stock9", stock9);
        edit.putInt("stock10", stock10);
        edit.putInt("stock11", stock11);
        edit.putInt("stock12", stock12);
        edit.putInt("stock13", stock13);
        edit.putInt("stock14", stock14);
        edit.putInt("stock15", stock15);
        edit.apply();
    }

    //membuat class onResume agar membaca database ketika aplikasi dibuka
    protected void onResume() {
        super.onResume();
        prefs = getSharedPreferences(prefName, MODE_PRIVATE);

        stock1 = prefs.getInt("stock1", stock1);
        tvStock1.setText("Stock : " + stock1);

        stock2 = prefs.getInt("stock2", stock2);
        tvStock2.setText("Stock : " + stock2);

        stock3 = prefs.getInt("stock3", stock3);
        tvStock3.setText("Stock : " + stock3);

        stock4 = prefs.getInt("stock4", stock4);
        tvStock4.setText("Stock : " + stock4);

        stock5 = prefs.getInt("stock5", stock5);
        tvStock5.setText("Stock : " + stock5);

        stock6 = prefs.getInt("stock6", stock6);
        tvStock6.setText("Stock : " + stock6);

        stock7 = prefs.getInt("stock7", stock7);
        tvStock7.setText("Stock : " + stock7);

        stock8 = prefs.getInt("stock8", stock8);
        tvStock8.setText("Stock : " + stock8);

        stock9 = prefs.getInt("stock9", stock9);
        tvStock9.setText("Stock : " + stock9);

        stock10 = prefs.getInt("stock10", stock10);
        tvStock10.setText("Stock : " + stock10);

        stock11 = prefs.getInt("stock11", stock11);
        tvStock11.setText("Stock : " + stock11);

        stock12 = prefs.getInt("stock12", stock12);
        tvStock12.setText("Stock : " + stock12);

        stock13 = prefs.getInt("stock13", stock13);
        tvStock13.setText("Stock : " + stock13);

        stock14 = prefs.getInt("stock14", stock14);
        tvStock14.setText("Stock : " + stock14);

        stock15 = prefs.getInt("stock15", stock15);
        tvStock15.setText("Stock : " + stock15);

    }

}