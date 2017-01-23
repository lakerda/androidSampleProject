package com.example.caner.projectsample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView metin_alani;
    Button btn;
    float f = 4444.6f; //ondalık sayılar varsıyalan olarak double şeklinde kabul edilir o yüzden f eklenir
    double d = 5555;
    int sayi = 67;
    int sayi2 = -5;
    int i;
    double sonuc;
    boolean durum = true;
    boolean durum2 = false;
    /*
    String sehir1="Kocaeli";
    String sehir2="Istanbul";
    String sehir3="Bursa";
    String sehir4="Adana";
    String sehir5="Izmir";
    String sehir6="Manisa";   bu şekilde yaparsak kod çok saçma olur o yüzden dizileri kullanırız
    String sehir7="Antalya";
    String sehir8="Mugla";
    String sehir9="Ankara";
    String sehir10="Sakarya";
    */
    //String[] sehirler = {"istan","anka","izmir"};
    String[] sehirler = new String[3];
    String str = sehirler[1];
    //String dizi = {3,12,3,124,4,1,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        metin_alani = (TextView) findViewById(R.id.tv);
        btn = (Button) findViewById(R.id.button);


        long buyuk_sayi = 342334324;
        String str = "metin ifadesi";
        String str2 = "sayi degeri";
        final String str3 = str +" "+str2 +" " + sayi; //buton içinde kullanamak için final dedik yada main'de tanım yapmamız gerekiyordu


        float f = 4444.6f; //ondalık sayılar varsıyalan olarak double şeklinde kabul edilir o yüzden f eklenir
        double d = 5555;
        i =sayi/sayi2;
        sonuc = (float)sayi/sayi2;
        String[] sehirler = new String[3];
        sehirler[2] = "anka";
        sehirler[1]= "istan";
        sehirler[0] = "izmit";

       // int boyut = dizi.length();
        String country[] = getResources().getStringArray(R.array.ulkeler); //xml'de tanımlanan string verisine nasıl ulaşılır sorusuna cevap
        int indis[] = getResources().getIntArray(R.array.indisler);            //xml'de tanımlanan string verisine nasıl ulaşılır sorusuna cevap

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metin_alani.setText("sonuc int tipinde ="+i+"\n"+"sonuc="+sonuc);
                //metin_alani.setTextSize(Float.parseFloat("44"));
                metin_alani.setTextColor(Color.BLACK);
                btn.setText("Ouchhh!..");


            }
        });
    }
}
