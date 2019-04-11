package com.example.android.haekalsfurniture;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Main Activity Class.
 * Developers : Haekal
 **/

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    //Method override onCreate, berfungsi untuk melakukan penambahan konten program pada layout
    //MainActivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Pendeklarasian variabel toolbar yang terhubung dengan id toolbar pada activity_main
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //Menambahkan ActionBar pada toolbar
        setSupportActionBar(toolbar);

        //Pendeklarasian variabel drawer yang terhubung dengan id drawer_layout pada activity_main
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        //Pendeklarasian variabel toggle serta membuat method baru untuk ActionBarDrawerToggle
        //Untuk membuat navigation drawer dapat terbuka dan tertutup.
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        //Melakukan sinkronisasi pada variabel toggle.
        toggle.syncState();

        //Pembuatan variabel navigationView yang terhubung dengan id nav_view pada activity_main
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //Pembuatan variabel btnJual yang terhubung dengan id btn_jual pada activity_main
        Button btnJual = (Button) findViewById(R.id.btn_jual);
        //Pembuatan method OnClickListener pada btnJual untuk melakukan intent agar berpindah
        //dari MainActivity ke JualActivity
        btnJual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JualActivity.class);
                startActivity(intent);
            }
        });

        //Pembuatan variabel btnList1 yang terhubung dengan id btn_list1 pada activity_main
        LinearLayout btnList1 = (LinearLayout) findViewById(R.id.btn_list1);
        //Pembuatan method OnClickListener pada btnList1 untuk melakukan intent agar berpindah
        //dari MainActivity ke ListBarangActivity
        btnList1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentList1 = new Intent(MainActivity.this, ListBarangActivity.class);
                startActivity(intentList1);
                MainActivity.this.finish();
            }
        });

        //Pembuatan variabel btnList2 yang terhubung dengan id btn_list2 pada activity_main
        LinearLayout btnList2 = (LinearLayout) findViewById(R.id.btn_list2);
        //Pembuatan method onClickListener pada btnList2 untuk melakukan intent agar berpindah
        //dari MainActivity ke ListBarangActivity
        btnList2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentList2 = new Intent(MainActivity.this, ListBarangActivity.class);
                startActivity(intentList2);
                MainActivity.this.finish();
            }
        });

        //Pembuatan variabel btnList3 yang terhubung dengan id btn_list3 pada activity_main
        LinearLayout btnList3 = (LinearLayout) findViewById(R.id.btn_list3);
        //Pembuatan method onClickListener pada btnList3 untuk melakukan intent agar berpindah
        //dari MainActivity ke ListBarangActivity
        btnList3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentList3 = new Intent(MainActivity.this, ListBarangActivity.class);
                startActivity(intentList3);
                MainActivity.this.finish();
            }
        });

    }

    //Melakukan override pada method onBackPressed apabila tombol back ditekan, maka drawer akan
    //tertutup
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    //Melakukan override pada method onNavigationItemSelected untuk mengatur menu pada navigation
    //bar
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        //kondisi untuk tombol beranda
        if (id == R.id.nav_beranda) {

            //kondisi lain apabila tombol jual ditekan, maka melakukan Intent ke JualActivity.class
        } else if (id == R.id.nav_jual) {
            Intent intent = new Intent(MainActivity.this, JualActivity.class);
            startActivity(intent);
            MainActivity.this.finish();

            //kondisi lain apabila tombol List ditekan, maka melakukan Intent ke ListBarang.class
        } else if (id == R.id.nav_list) {
            Intent intent = new Intent(MainActivity.this, ListBarangActivity.class);
            startActivity(intent);
            MainActivity.this.finish();

            //kondisi lain apabila tombol call ditekan, maka melakukan Intent untuk menelefon
            //toko Haekal's Furniture
        } else if (id == R.id.nav_call) {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "0812000000"));
            startActivity(intent);

            //kondisi lain apabila tombol send ditekan, maka melakukan Intent untuk mengirimkan
            //email ke haekal54@gmail.com
            //isi subject "Haekal Furniture Feedback"
            //isi text "Silahkan berikan feedback untuk aplikasi haekal's furniture"
        } else if (id == R.id.nav_send) {
            String[] recipients = new String[]{""};

            Intent feedbackIntent = new Intent(Intent.ACTION_SEND, Uri.parse("mailto:"));
            feedbackIntent.putExtra(Intent.EXTRA_EMAIL, recipients);
            feedbackIntent.putExtra(Intent.EXTRA_SUBJECT, "Sinsa Pramuka Furniture");
            feedbackIntent.putExtra(Intent.EXTRA_TEXT,
                    "\n\n\nUntuk informasi lebih lanjut, hubungi \n" +
                            "081806097928 atau\n" +
                            "sinsa_pramuka@gmail.com\n\n" +
                            "Demikian informasi yang dapat kami sampaikan, atas perhatian nya" +
                            "kami ucapkan terima kasih.");
            feedbackIntent.setType("plain/text");

            startActivity(feedbackIntent);

        }

        //Pembuatan variabel drawer yang terhubung dengan drawer layout untuk membuat animasi
        //drawer ketika tertutup
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
