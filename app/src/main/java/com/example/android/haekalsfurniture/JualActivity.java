package com.example.android.haekalsfurniture;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;




import static java.lang.Integer.parseInt;

public class JualActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jual);

        //Pendeklarasian variabel EditText pada lembar kerja activity_jual.xml
        final EditText etKursiErgotec842 = (EditText) findViewById(R.id.et_kursi_ergotec_842);
        final EditText etKursiErgotec838 = (EditText) findViewById(R.id.et_kursi_ergotec_838);
        final EditText etKursiDonatiAvasys = (EditText) findViewById(R.id.et_kursi_donati_avasys);
        final EditText etKursiDonatiBose2 = (EditText) findViewById(R.id.et_kursi_donati_bose2);
        final EditText etKursiDonatiCarlo2n = (EditText) findViewById(R.id.et_kursi_donati_carlo2n);
        final EditText etLemariDonati3Laci = (EditText) findViewById(R.id.et_lemari_donati_3_laci);
        final EditText etLemariDonatiDoc553r = (EditText) findViewById(R.id.et_lemari_donati_doc_55_3r);
        final EditText etLemariDonatiDd2 = (EditText) findViewById(R.id.et_lemari_donati_dd2);
        final EditText etLemariCradenzaDonatiDCR = (EditText) findViewById(R.id.et_lemari_cradenza_donati_dcr);
        final EditText etLemariDonatiDoc55 = (EditText) findViewById(R.id.et_lemari_donati_doc_55);
        final EditText etSofaDonatiRbs3Seater = (EditText) findViewById(R.id.et_sofa_donati_rbs_3_seater);
        final EditText etSofaDonatiHiBeat3Seater = (EditText) findViewById(R.id.et_sofa_donati_hi_beat_3_seater);
        final EditText etSofaAvedaAc701 = (EditText) findViewById(R.id.et_sofa_aveda_ac_701);
        final EditText etSofaAvedaAC8013Seater = (EditText) findViewById(R.id.et_sofa_aveda_ac_801_3_seater);
        final EditText etSofaAvedaAc805Ottoman = (EditText) findViewById(R.id.et_sofa_aveda_ac_805_ottoman_3_seater);
        final EditText etDiskon = (EditText) findViewById(R.id.et_diskon);

        //Pendeklarasian variabel TextView pada lembar kerja activity_jual.xml
        final TextView tvKursiErgotec842 = (TextView) findViewById(R.id.tv_kursi_ergotec_842);
        final TextView tvKursiErgotec838 = (TextView) findViewById(R.id.tv_kursi_ergotec_838);
        final TextView tvKursiDonatiAvasys = (TextView) findViewById(R.id.tv_kursi_donati_avasys);
        final TextView tvKursiDonatiBose2 = (TextView) findViewById(R.id.tv_kursi_donati_bose2);
        final TextView tvKursiDonatiCarlo2n = (TextView) findViewById(R.id.tv_kursi_donati_carlo2n);
        final TextView tvLemariDonati3Laci = (TextView) findViewById(R.id.tv_lemari_donati_3_laci);
        final TextView tvLemariDonatiDoc553r = (TextView) findViewById(R.id.tv_lemari_donati_doc_55_3r);
        final TextView tvLemariDonatiDd2 = (TextView) findViewById(R.id.tv_lemari_donati_dd2);
        final TextView tvLemariCradenzaDonatiDCR = (TextView) findViewById(R.id.tv_lemari_cradenza_donati_dcr);
        final TextView tvLemariDonatiDoc55 = (TextView) findViewById(R.id.tv_lemari_donati_doc_55);
        final TextView tvSofaDonatiRbs3Seater = (TextView) findViewById(R.id.tv_sofa_donati_rbs_3_seater);
        final TextView tvSofaDonatiHiBeat3Seater = (TextView) findViewById(R.id.tv_sofa_donati_hi_beat_3_seater);
        final TextView tvSofaAvedaAc701 = (TextView) findViewById(R.id.tv_sofa_aveda_ac_701);
        final TextView tvSofaAvedaAC8013Seater = (TextView) findViewById(R.id.tv_sofa_aveda_ac_801_3_seater);
        final TextView tvSofaAvedaAc805Ottoman = (TextView) findViewById(R.id.tv_sofa_aveda_ac_805_ottoman_3_seater);
        final TextView tvTotalHarga = (TextView) findViewById(R.id.tv_total_harga);
        Button btnReset = (Button) findViewById(R.id.btn_reset);
        Button btnHitung = (Button) findViewById(R.id.btn_hitung);

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);


        //Pembuatan method pada penjualan Kursi Ergotec 842
        etKursiErgotec842.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String qtyItem = etKursiErgotec842.getText().toString().trim();

                int qty;
                try {
                    qty = parseInt(qtyItem);
                } catch (NumberFormatException ex) {
                    tvKursiErgotec842.setText("Total : RP. 0 ,-");
                    return;
                }

                int harga = 660000;
                int total = qty * harga;


                tvKursiErgotec842.setText("Total : Rp. " + total + " ,-");


            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });

        etKursiErgotec838.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String qtyItem = etKursiErgotec838.getText().toString().trim();

                int qty;
                try {
                    qty = parseInt(qtyItem);
                } catch (NumberFormatException ex) {
                    tvKursiErgotec838.setText("Total : RP. 0 ,-");
                    return;
                }

                int harga = 755000;
                int total = qty * harga;

                tvKursiErgotec838.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etKursiDonatiAvasys.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String qtyItem = etKursiDonatiAvasys.getText().toString().trim();

                int qty;
                try {
                    qty = parseInt(qtyItem);
                } catch (NumberFormatException ex) {
                    tvKursiDonatiAvasys.setText("Total : RP. 0 ,-");
                    return;
                }

                int harga = 1004300;
                int total = qty * harga;

                tvKursiDonatiAvasys.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etKursiDonatiBose2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String qtyItem = etKursiDonatiBose2.getText().toString().trim();

                int qty;
                try {
                    qty = parseInt(qtyItem);
                } catch (NumberFormatException ex) {
                    tvKursiDonatiBose2.setText("Total : RP. 0 ,-");
                    return;
                }

                int harga = 4152500;
                int total = qty * harga;

                tvKursiDonatiBose2.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        etKursiDonatiCarlo2n.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String qtyItem = etKursiDonatiCarlo2n.getText().toString().trim();

                int qty;
                try {
                    qty = parseInt(qtyItem);
                } catch (NumberFormatException ex) {
                    tvKursiDonatiCarlo2n.setText("Total : RP. 0 ,-");
                    return;
                }

                int harga = 3437500;
                int total = qty * harga;

                tvKursiDonatiCarlo2n.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etLemariDonati3Laci.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String qtyItem = etLemariDonati3Laci.getText().toString().trim();

                int qty;
                try {
                    qty = parseInt(qtyItem);
                } catch (NumberFormatException ex) {
                    tvLemariDonati3Laci.setText("Total : RP. 0 ,-");
                    return;
                }

                int harga = 1569700;
                int total = qty * harga;

                tvLemariDonati3Laci.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etLemariDonatiDoc553r.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String qtyItem = etLemariDonatiDoc553r.getText().toString().trim();

                int qty;
                try {
                    qty = parseInt(qtyItem);
                } catch (NumberFormatException ex) {
                    tvLemariDonatiDoc553r.setText("Total : RP. 0 ,-");
                    return;
                }

                int harga = 5871800;
                int total = qty * harga;

                tvLemariDonatiDoc553r.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etLemariDonatiDd2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String qtyItem = etLemariDonatiDd2.getText().toString().trim();

                int qty;
                try {
                    qty = parseInt(qtyItem);
                } catch (NumberFormatException ex) {
                    tvLemariDonatiDd2.setText("Total : RP. 0 ,-");
                    return;
                }

                int harga = 4655200;
                int total = qty * harga;

                tvLemariDonatiDd2.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etLemariCradenzaDonatiDCR.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String qtyItem = etLemariCradenzaDonatiDCR.getText().toString().trim();

                int qty;
                try {
                    qty = parseInt(qtyItem);
                } catch (NumberFormatException ex) {
                    tvLemariCradenzaDonatiDCR.setText("Total : RP. 0 ,-");
                    return;
                }

                int harga = 2924900;
                int total = qty * harga;

                tvLemariCradenzaDonatiDCR.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etLemariDonatiDoc55.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String qtyItem = etLemariDonatiDoc55.getText().toString().trim();

                int qty;
                try {
                    qty = parseInt(qtyItem);
                } catch (NumberFormatException ex) {
                    tvLemariDonatiDoc55.setText("Total : RP. 0 ,-");
                    return;
                }

                int harga = 2281400;
                int total = qty * harga;

                tvLemariDonatiDoc55.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etSofaDonatiRbs3Seater.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String qtyItem = etSofaDonatiRbs3Seater.getText().toString().trim();

                int qty;
                try {
                    qty = parseInt(qtyItem);
                } catch (NumberFormatException ex) {
                    tvSofaDonatiRbs3Seater.setText("Total : RP. 0 ,-");
                    return;
                }

                int harga = 11297000;
                int total = qty * harga;

                tvSofaDonatiRbs3Seater.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etSofaDonatiHiBeat3Seater.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String qtyItem = etSofaDonatiHiBeat3Seater.getText().toString().trim();

                int qty;
                try {
                    qty = parseInt(qtyItem);
                } catch (NumberFormatException ex) {
                    tvSofaDonatiHiBeat3Seater.setText("Total : RP. 0 ,-");
                    return;
                }

                int harga = 6006000;
                int total = qty * harga;

                tvSofaDonatiHiBeat3Seater.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etSofaAvedaAc701.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String qtyItem = etSofaAvedaAc701.getText().toString().trim();

                int qty;
                try {
                    qty = parseInt(qtyItem);
                } catch (NumberFormatException ex) {
                    tvSofaAvedaAc701.setText("Total : RP. 0 ,-");
                    return;
                }

                int harga = 1888000;
                int total = qty * harga;

                tvSofaAvedaAc701.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etSofaAvedaAC8013Seater.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String qtyItem = etSofaAvedaAC8013Seater.getText().toString().trim();

                int qty;
                try {
                    qty = parseInt(qtyItem);
                } catch (NumberFormatException ex) {
                    tvSofaAvedaAC8013Seater.setText("Total : RP. 0 ,-");
                    return;
                }

                int harga = 6360000;
                int total = qty * harga;

                tvSofaAvedaAC8013Seater.setText("Total : Rp. " + total + " ,-");


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etSofaAvedaAc805Ottoman.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String qtyItem = etSofaAvedaAc805Ottoman.getText().toString().trim();

                int qty;
                try {
                    qty = parseInt(qtyItem);
                } catch (NumberFormatException ex) {
                    tvSofaAvedaAc805Ottoman.setText("Total : RP. 0 ,-");
                    return;
                }

                int harga = 5240000;
                int total = qty * harga;

                tvSofaAvedaAc805Ottoman.setText("Total : Rp. " + total + " ,-");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //Pembuatan btnHitung
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Pendeklarasian String dengan nama produk untuk mengambil text dan di convert menjadi string
                String valSofaAvedaAc805Ottoman = etSofaAvedaAc805Ottoman.getText().toString().trim();
                String valSofaAvedaAC8013Seater = etSofaAvedaAC8013Seater.getText().toString().trim();
                String valSofaAvedaAc701 = etSofaAvedaAc701.getText().toString().trim();
                String valSofaDonatiHiBeat3Seater = etSofaDonatiHiBeat3Seater.getText().toString().trim();
                String valSofaDonatiRbs3Seater = etSofaDonatiRbs3Seater.getText().toString().trim();
                String valLemariDonatiDoc55 = etLemariDonatiDoc55.getText().toString().trim();
                String valLemariCradenzaDonatiDCR = etLemariCradenzaDonatiDCR.getText().toString().trim();
                String valLemariDonatiDd2 = etLemariDonatiDd2.getText().toString().trim();
                String valLemariDonatiDoc553r = etLemariDonatiDoc553r.getText().toString().trim();
                String valLemariDonati3Laci = etLemariDonati3Laci.getText().toString().trim();
                String valKursiDonatiCarlo2n = etKursiDonatiCarlo2n.getText().toString().trim();
                String valKursiDonatiBose2 = etKursiDonatiBose2.getText().toString().trim();
                String valKursiDonatiAvasys = etKursiDonatiAvasys.getText().toString().trim();
                String valKursiErgotec838 = etKursiErgotec838.getText().toString().trim();
                String valKursiErgotec842 = etKursiErgotec842.getText().toString().trim();
                String valDiskon = etDiskon.getText().toString().trim();

                /** Melakukan konversi dari string ke float**/
                float nilaiDiskon;
                try {
                    nilaiDiskon = Float.parseFloat(valDiskon);
                } catch (NumberFormatException ex) {
                    nilaiDiskon = 0;
                }

                float nilaiSofaAvedaAc805Ottoman;
                try {
                    nilaiSofaAvedaAc805Ottoman = Float.parseFloat(valSofaAvedaAc805Ottoman);
                } catch (NumberFormatException ex) {
                    nilaiSofaAvedaAc805Ottoman = 0;
                }

                float nilaiSofaAvedaAc8013Seater;
                try {
                    nilaiSofaAvedaAc8013Seater = Float.parseFloat(valSofaAvedaAC8013Seater);
                } catch (NumberFormatException ex) {
                    nilaiSofaAvedaAc8013Seater = 0;
                }

                float nilaiSofaAvedaAc701;
                try {
                    nilaiSofaAvedaAc701 = Float.parseFloat(valSofaAvedaAc701);
                } catch (NumberFormatException ex) {
                    nilaiSofaAvedaAc701 = 0;
                }

                float nilaiSofaDonatiHiBeat3Seater;
                try {
                    nilaiSofaDonatiHiBeat3Seater = Float.parseFloat(valSofaDonatiHiBeat3Seater);
                } catch (NumberFormatException ex) {
                    nilaiSofaDonatiHiBeat3Seater = 0;
                }

                float nilaiSofaDonatiRbs3Seater;
                try {
                    nilaiSofaDonatiRbs3Seater = Float.parseFloat(valSofaDonatiRbs3Seater);
                } catch (NumberFormatException ex) {
                    nilaiSofaDonatiRbs3Seater = 0;
                }

                float nilaiLemariDonatiDoc55;
                try {
                    nilaiLemariDonatiDoc55 = Float.parseFloat(valLemariDonatiDoc55);
                } catch (NumberFormatException ex) {
                    nilaiLemariDonatiDoc55 = 0;
                }

                float nilaiLemariCradenzaDonatiDCR;
                try {
                    nilaiLemariCradenzaDonatiDCR = Float.parseFloat(valLemariCradenzaDonatiDCR);
                } catch (NumberFormatException ex) {
                    nilaiLemariCradenzaDonatiDCR = 0;
                }

                float nilaiLemariDonatiDd2;
                try {
                    nilaiLemariDonatiDd2 = Float.parseFloat(valLemariDonatiDd2);
                } catch (NumberFormatException ex) {
                    nilaiLemariDonatiDd2 = 0;
                }

                float nilaiLemariDonatiDoc553r;
                try {
                    nilaiLemariDonatiDoc553r = Float.parseFloat(valLemariDonatiDoc553r);
                } catch (NumberFormatException ex) {
                    nilaiLemariDonatiDoc553r = 0;
                }

                float nilaiLemariDonati3Laci;
                try {
                    nilaiLemariDonati3Laci = Float.parseFloat(valLemariDonati3Laci);
                } catch (NumberFormatException ex) {
                    nilaiLemariDonati3Laci = 0;
                }

                float nilaiKursiDonatiCarlo2n;
                try {
                    nilaiKursiDonatiCarlo2n = Float.parseFloat(valKursiDonatiCarlo2n);
                } catch (NumberFormatException ex) {
                    nilaiKursiDonatiCarlo2n = 0;
                }

                float nilaiKursiDonatiBose2;
                try {
                    nilaiKursiDonatiBose2 = Float.parseFloat(valKursiDonatiBose2);
                } catch (NumberFormatException ex) {
                    nilaiKursiDonatiBose2 = 0;
                }

                float nilaiKursiDonatiAvasys;
                try {
                    nilaiKursiDonatiAvasys = Float.parseFloat(valKursiDonatiAvasys);
                } catch (NumberFormatException ex) {
                    nilaiKursiDonatiAvasys = 0;
                }

                float nilaiKursiErgotec838;
                try {
                    nilaiKursiErgotec838 = Float.parseFloat(valKursiErgotec838);
                } catch (NumberFormatException ex) {
                    nilaiKursiErgotec838 = 0;
                }

                float nilaiKursiErgotec842;
                try {
                    nilaiKursiErgotec842 = Float.parseFloat(valKursiErgotec842);
                } catch (NumberFormatException ex) {
                    nilaiKursiErgotec842 = 0;
                }

                //menentukan harga produk dengan tipe data integer
                int hargaSofaAvedaAc805Ottoman = 5240000;
                int hargaSofaAvedaAc8013Seater = 6360000;
                int hargaSofaAvedaAc701 = 1880000;
                int hargaSofaDonatiHiBeat3Seater = 6006000;
                int hargaSofaDonatiRbs3Seater = 11297000;
                int hargaLemariDonatiDoc55 = 2281000;
                int hargaLemariCradenzaDonatiDCR = 2924900;
                int hargaLemariDonatiDd2 = 4655200;
                int hargaLemariDonatiDoc553r = 5871800;
                int hargaLemariDonati3Laci = 1569700;
                int hargaKursiDonatiCarlo2n = 3437500;
                int hargaKursiDonatiBose2 = 4152500;
                int hargaKursiDonatiAvasys = 1004300;
                int hargaKursiErgotec838 = 755000;
                int hargaKursiErgotec842 = 660000;

                //membuat rumus sesuai variabel yang telah dibuat
                float totalSofaAvedaAc805Ottoman = nilaiSofaAvedaAc805Ottoman * hargaSofaAvedaAc805Ottoman;
                float totalSofaAvedaAc8013Seater = nilaiSofaAvedaAc8013Seater * hargaSofaAvedaAc8013Seater;
                float totalSofaAvedaAc701 = nilaiSofaAvedaAc701 * hargaSofaAvedaAc701;
                float totalSofaDonatiHiBeat3Seater = nilaiSofaDonatiHiBeat3Seater * hargaSofaDonatiHiBeat3Seater;
                float totalSofaDonatiRbs3Seater = nilaiSofaDonatiRbs3Seater * hargaSofaDonatiRbs3Seater;
                float totalLemariDonatiDoc55 = nilaiLemariDonatiDoc55 * hargaLemariDonatiDoc55;
                float totalLemariCradenzaDonatiDCR = nilaiLemariCradenzaDonatiDCR * hargaLemariCradenzaDonatiDCR;
                float totalLemariDonatiDd2 = nilaiLemariDonatiDd2 * hargaLemariDonatiDd2;
                float totalLemariDonatiDoc553r = nilaiLemariDonatiDoc553r * hargaLemariDonatiDoc553r;
                float totalLemariDonati3Laci = nilaiLemariDonati3Laci * hargaLemariDonati3Laci;
                float totalKursiDonatiCarlo2n = nilaiKursiDonatiCarlo2n * hargaKursiDonatiCarlo2n;
                float totalKursiDonatiBose2 = nilaiKursiDonatiBose2 * hargaKursiDonatiBose2;
                float totalKursiDonatiAvasys = nilaiKursiDonatiAvasys * hargaKursiDonatiAvasys;
                float totalKursiErgotec838 = nilaiKursiErgotec838 * hargaKursiErgotec838;
                float totalKursiErgotec842 = nilaiKursiErgotec842 * hargaKursiErgotec842;
                float totalDiskon = nilaiDiskon;

                //membuat rumus total dari seluruh variabel yang telah dibuat
                float total = totalSofaAvedaAc805Ottoman + totalSofaAvedaAc8013Seater + totalSofaAvedaAc701 + totalSofaDonatiHiBeat3Seater + totalSofaDonatiRbs3Seater
                        + totalLemariDonatiDoc55 + totalLemariCradenzaDonatiDCR + totalLemariDonatiDd2 + totalLemariDonatiDoc553r + totalLemariDonati3Laci + totalKursiDonatiCarlo2n
                        + totalKursiDonatiBose2 + totalKursiDonatiAvasys + totalKursiErgotec838 + totalKursiErgotec842;

                //menentukan perhitungan diskon
                float diskon = (total / 100) * totalDiskon;

                //melakukan perhitungan diskon
                float summaryTotal = total - diskon;

                //menampilkan total harga pada tvTotalHarga
                tvTotalHarga.setText(String.format("%.2f", +summaryTotal));

                //melakukan konversi discount menjadi integer
                int Discount;
                try {
                    Discount = Integer.parseInt(valDiskon);
                } catch (NumberFormatException ex) {
                    Discount = 0;
                }

                //Pembuatan intent untuk mengirim total biaya serta diskon dan dikirimkan ke
                //email
                String biayaTotal = new String(String.format("%.2f", summaryTotal));
                String biayaNormal = new String(String.format("%.2f",total));
                Intent feedbackIntent = new Intent(Intent.ACTION_SEND, Uri.parse("mailto:"));
                feedbackIntent.putExtra(Intent.EXTRA_SUBJECT, "E-Order Coffe");
                feedbackIntent.putExtra(Intent.EXTRA_TEXT, (
                        "Pembeli : \n" +
                                "Cashier : \n\n" +
                                "Biaya : " + biayaNormal +
                                "\nDiskon : " + Discount +"%"+
                                "\nTotal Biaya Adalah : Rp. " + biayaTotal + " ,-\n\n" +
                                "Terima kasih telah memesan, orderan anda akan tiba."));
                feedbackIntent.setType("plain/text");

                startActivity(feedbackIntent);

            }
        });

        //Melakukan tombol reset untuk mengembalikan seluruh nilai ke nilai awal.
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etSofaAvedaAc805Ottoman.setText("");
                etSofaAvedaAC8013Seater.setText("");
                etSofaAvedaAc701.setText("");
                etSofaDonatiHiBeat3Seater.setText("");
                etSofaDonatiHiBeat3Seater.setText("");
                etLemariDonatiDoc55.setText("");
                etLemariCradenzaDonatiDCR.setText("");
                etLemariDonatiDd2.setText("");
                etLemariDonatiDoc553r.setText("");
                etLemariDonati3Laci.setText("");
                etKursiDonatiCarlo2n.setText("");
                etKursiDonatiBose2.setText("");
                etKursiDonatiAvasys.setText("");
                etKursiErgotec838.setText("");
                etKursiErgotec842.setText("");
                etDiskon.setText("");
                tvTotalHarga.setText("");

                Toast.makeText(JualActivity.this, "Hitung Ulang", Toast.LENGTH_SHORT).show();


            }
        });


    }


    //Override method untuk action back agar kembali ke menu home
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                JualActivity.this.finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //Override method untuk tombol back agar kembali ke menu home
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(JualActivity.this, MainActivity.class);
        startActivity(intent);
        JualActivity.this.finish();
    }
}

