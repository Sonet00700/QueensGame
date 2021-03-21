package com.sonetsagor.a4queensgame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class EightQueenActivity extends AppCompatActivity {
   private Button btn00,btn01,btn02,btn03,btn04,btn05,btn06,btn07,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,
            btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn30,btn31,btn32,btn33,btn34,btn35,btn36,btn37,
    btn40,btn41,btn42,btn43,btn44,btn45,btn46,btn47,btn50,btn51,btn52,btn53,btn54,btn55,btn56,btn57,
    btn60,btn61,btn62,btn63,btn64,btn65,btn66,btn67,btn70,btn71,btn72,btn73,btn74,btn75,btn76,btn77,btnresetEight;
  private  TextView textViewscoresuccessEight,textViewscoretriedEight,queenscount8;
    private AdView mAdView;
  private  int c00=0,c01=0,c02=0,c03=0,c04=0,c05=0,c06=0,c07=0,c10=0,c11=0,c12=0,c13=0,c14=0,c15=0,c16=0,c17=0,c20=0,c21=0,c22=0,
            c23=0,c24=0,c25=0,c26=0,c27=0,c30=0,c31=0,c32=0,c33=0,c34=0,c35=0,c36=0,c37=0,
          c40=0,c41=0,c42=0,c43=0,c44=0,c45=0,c46=0,c47=0,c50=0,c51=0,c52=0,c53=0,c54=0,c55=0,c56=0,c57=0,c60=0,c61=0,c62=0,
          c63=0,c64=0,c65=0,c66=0,c67=0,c70=0,c71=0,c72=0,c73=0,c74=0,c75=0,c76=0,c77=0,Ecount=0,Elost=0,win,Esuccess=0,Etried=0,qc8=8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight_queen);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        btn00=findViewById(R.id.buttonEight_id_00);
        btn01=findViewById(R.id.buttonEight_id_01);
        btn02=findViewById(R.id.buttonEight_id_02);
        btn03=findViewById(R.id.buttonEight_id_03);
        btn04=findViewById(R.id.buttonEight_id_04);
        btn05=findViewById(R.id.buttonEight_id_05);
        btn06=findViewById(R.id.buttonEight_id_06);
        btn07=findViewById(R.id.buttonEight_id_07);
        btn10=findViewById(R.id.buttonEight_id_10);
        btn11=findViewById(R.id.buttonEight_id_11);
        btn12=findViewById(R.id.buttonEight_id_12);
        btn13=findViewById(R.id.buttonEight_id_13);
        btn14=findViewById(R.id.buttonEight_id_14);
        btn15=findViewById(R.id.buttonEight_id_15);
        btn16=findViewById(R.id.buttonEight_id_16);
        btn17=findViewById(R.id.buttonEight_id_17);
        btn20=findViewById(R.id.buttonEight_id_20);
        btn21=findViewById(R.id.buttonEight_id_21);
        btn22=findViewById(R.id.buttonEight_id_22);
        btn23=findViewById(R.id.buttonEight_id_23);
        btn24=findViewById(R.id.buttonEight_id_24);
        btn25=findViewById(R.id.buttonEight_id_25);
        btn26=findViewById(R.id.buttonEight_id_26);
        btn27=findViewById(R.id.buttonEight_id_27);
        btn30=findViewById(R.id.buttonEight_id_30);
        btn31=findViewById(R.id.buttonEight_id_31);
        btn32=findViewById(R.id.buttonEight_id_32);
        btn33=findViewById(R.id.buttonEight_id_33);
        btn34=findViewById(R.id.buttonEight_id_34);
        btn35=findViewById(R.id.buttonEight_id_35);
        btn36=findViewById(R.id.buttonEight_id_36);
        btn37=findViewById(R.id.buttonEight_id_37);
        btn40=findViewById(R.id.buttonEight_id_40);
        btn41=findViewById(R.id.buttonEight_id_41);
        btn42=findViewById(R.id.buttonEight_id_42);
        btn43=findViewById(R.id.buttonEight_id_43);
        btn44=findViewById(R.id.buttonEight_id_44);
        btn45=findViewById(R.id.buttonEight_id_45);
        btn46=findViewById(R.id.buttonEight_id_46);
        btn47=findViewById(R.id.buttonEight_id_47);
        btn50=findViewById(R.id.buttonEight_id_50);
        btn51=findViewById(R.id.buttonEight_id_51);
        btn52=findViewById(R.id.buttonEight_id_52);
        btn53=findViewById(R.id.buttonEight_id_53);
        btn54=findViewById(R.id.buttonEight_id_54);
        btn55=findViewById(R.id.buttonEight_id_55);
        btn56=findViewById(R.id.buttonEight_id_56);
        btn57=findViewById(R.id.buttonEight_id_57);
        btn60=findViewById(R.id.buttonEight_id_60);
        btn61=findViewById(R.id.buttonEight_id_61);
        btn62=findViewById(R.id.buttonEight_id_62);
        btn63=findViewById(R.id.buttonEight_id_63);
        btn64=findViewById(R.id.buttonEight_id_64);
        btn65=findViewById(R.id.buttonEight_id_65);
        btn66=findViewById(R.id.buttonEight_id_66);
        btn67=findViewById(R.id.buttonEight_id_67);
        btn70=findViewById(R.id.buttonEight_id_70);
        btn71=findViewById(R.id.buttonEight_id_71);
        btn72=findViewById(R.id.buttonEight_id_72);
        btn73=findViewById(R.id.buttonEight_id_73);
        btn74=findViewById(R.id.buttonEight_id_74);
        btn75=findViewById(R.id.buttonEight_id_75);
        btn76=findViewById(R.id.buttonEight_id_76);
        btn77=findViewById(R.id.buttonEight_id_77);

        queenscount8=findViewById(R.id.queensCount_id_8);
        btnresetEight=findViewById(R.id.btn_resetEight);
        textViewscoresuccessEight=findViewById(R.id.textViewScoresuccessEight);
        textViewscoretriedEight=findViewById(R.id.textViewScoretriedEight);

        btnresetEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ereset();
            }
        });

        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn00.setText("Q");
                btn00.setEnabled(false);
                c00=1;
                EQueen();
            }
        });
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn01.setText("Q");
                btn01.setEnabled(false);
                c01=1;
                EQueen();
            }
        });
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn02.setText("Q");
                btn02.setEnabled(false);
                c02=1;
                EQueen();
            }
        });
        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn03.setText("Q");
                btn03.setEnabled(false);
                c03=1;
                EQueen();
            }
        });
        btn04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn04.setText("Q");
                btn04.setEnabled(false);
                c04=1;
                EQueen();
            }
        });
        btn05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn05.setText("Q");
                btn05.setEnabled(false);
                c05=1;
                EQueen();
            }
        });
        btn06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn06.setText("Q");
                btn06.setEnabled(false);
                c06=1;
                EQueen();
            }
        });
        btn07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn07.setText("Q");
                btn07.setEnabled(false);
                c07=1;
                EQueen();
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn10.setText("Q");
                btn10.setEnabled(false);
                c10=1;
                EQueen();
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn11.setText("Q");
                btn11.setEnabled(false);
                c11=1;
                EQueen();
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn12.setText("Q");
                btn12.setEnabled(false);
                c12=1;
                EQueen();
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn13.setText("Q");
                btn13.setEnabled(false);
                c13=1;
                EQueen();
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn14.setText("Q");
                btn14.setEnabled(false);
                c14=1;
                EQueen();
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn15.setText("Q");
                btn15.setEnabled(false);
                c15=1;
                EQueen();
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn16.setText("Q");
                btn16.setEnabled(false);
                c16=1;
                EQueen();
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn17.setText("Q");
                btn17.setEnabled(false);
                c17=1;
                EQueen();
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn20.setText("Q");
                btn20.setEnabled(false);
                c20=1;
                EQueen();
            }
        });
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn21.setText("Q");
                btn21.setEnabled(false);
                c21=1;
                EQueen();
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn22.setText("Q");
                btn22.setEnabled(false);
                c22=1;
                EQueen();
            }
        });
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn23.setText("Q");
                btn23.setEnabled(false);
                c23=1;
                EQueen();
            }
        });
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn24.setText("Q");
                btn24.setEnabled(false);
                c24=1;
                EQueen();
            }
        });
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn25.setText("Q");
                btn25.setEnabled(false);
                c25=1;
                EQueen();
            }
        });
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn26.setText("Q");
                btn26.setEnabled(false);
                c26=1;
                EQueen();
            }
        });
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn27.setText("Q");
                btn27.setEnabled(false);
                c27=1;
                EQueen();
            }
        });
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn30.setText("Q");
                btn30.setEnabled(false);
                c30=1;
                EQueen();
            }
        });
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn31.setText("Q");
                btn31.setEnabled(false);
                c31=1;
                EQueen();
            }
        });
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn32.setText("Q");
                btn32.setEnabled(false);
                c32=1;
                EQueen();
            }
        });
        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn33.setText("Q");
                btn33.setEnabled(false);
                c33=1;
                EQueen();
            }
        });
        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn34.setText("Q");
                btn34.setEnabled(false);
                c34=1;
                EQueen();
            }
        });
        btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn35.setText("Q");
                btn35.setEnabled(false);
                c35=1;
                EQueen();
            }
        });
        btn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn36.setText("Q");
                btn36.setEnabled(false);
                c36=1;
                EQueen();
            }
        });
        btn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn37.setText("Q");
                btn37.setEnabled(false);
                c37=1;
                EQueen();
            }
        });

        btn40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn40.setText("Q");
                btn40.setEnabled(false);
                c40=1;
                EQueen();
            }
        });
        btn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn41.setText("Q");
                btn41.setEnabled(false);
                c41=1;
                EQueen();
            }
        });
        btn42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn42.setText("Q");
                btn42.setEnabled(false);
                c42=1;
                EQueen();
            }
        });
        btn43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn43.setText("Q");
                btn43.setEnabled(false);
                c43=1;
                EQueen();
            }
        });
        btn44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn44.setText("Q");
                btn44.setEnabled(false);
                c44=1;
                EQueen();
            }
        });
        btn45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn45.setText("Q");
                btn45.setEnabled(false);
                c45=1;
                EQueen();
            }
        });
        btn46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn46.setText("Q");
                btn46.setEnabled(false);
                c46=1;
                EQueen();
            }
        });
        btn47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn47.setText("Q");
                btn47.setEnabled(false);
                c47=1;
                EQueen();
            }
        });
        btn50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn50.setText("Q");
                btn50.setEnabled(false);
                c50=1;
                EQueen();
            }
        });
        btn51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn51.setText("Q");
                btn51.setEnabled(false);
                c51=1;
                EQueen();
            }
        });
        btn52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn52.setText("Q");
                btn52.setEnabled(false);
                c52=1;
                EQueen();
            }
        });
        btn53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn53.setText("Q");
                btn53.setEnabled(false);
                c53=1;
                EQueen();
            }
        });
        btn54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn54.setText("Q");
                btn54.setEnabled(false);
                c54=1;
                EQueen();
            }
        });
        btn55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn55.setText("Q");
                btn55.setEnabled(false);
                c55=1;
                EQueen();
            }
        });
        btn56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn56.setText("Q");
                btn56.setEnabled(false);
                c56=1;
                EQueen();
            }
        });
        btn57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn57.setText("Q");
                btn57.setEnabled(false);
                c57=1;
                EQueen();
            }
        });
        btn60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn60.setText("Q");
                btn60.setEnabled(false);
                c60=1;
                EQueen();
            }
        });
        btn61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn61.setText("Q");
                btn61.setEnabled(false);
                c61=1;
                EQueen();
            }
        });
        btn62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn62.setText("Q");
                btn62.setEnabled(false);
                c62=1;
                EQueen();
            }
        });
        btn63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn63.setText("Q");
                btn63.setEnabled(false);
                c63=1;
                EQueen();
            }
        });
        btn64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn64.setText("Q");
                btn64.setEnabled(false);
                c64=1;
                EQueen();
            }
        });
        btn65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn65.setText("Q");
                btn65.setEnabled(false);
                c65=1;
                EQueen();
            }
        });
        btn66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn66.setText("Q");
                btn66.setEnabled(false);
                c66=1;
                EQueen();
            }
        });
        btn67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn67.setText("Q");
                btn67.setEnabled(false);
                c67=1;
                EQueen();
            }
        });
        btn70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn70.setText("Q");
                btn70.setEnabled(false);
                c70=1;
                EQueen();
            }
        });
        btn71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn71.setText("Q");
                btn71.setEnabled(false);
                c71=1;
                EQueen();
            }
        });
        btn72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn72.setText("Q");
                btn72.setEnabled(false);
                c72=1;
                EQueen();
            }
        });
        btn73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn73.setText("Q");
                btn73.setEnabled(false);
                c73=1;
                EQueen();
            }
        });
        btn74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn74.setText("Q");
                btn74.setEnabled(false);
                c74=1;
                EQueen();
            }
        });
        btn75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn75.setText("Q");
                btn75.setEnabled(false);
                c75=1;
                EQueen();
            }
        });
        btn76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn76.setText("Q");
                btn76.setEnabled(false);
                c76=1;
                EQueen();
            }
        });
        btn77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn77.setText("Q");
                btn77.setEnabled(false);
                c77=1;
                EQueen();
            }
        });

    }
    private void EQueen(){
        qc8--;
        queenscount8.setText(""+qc8);
        if(c00==1&&c01==1||c00==1&&c02==1||c00==1&&c03==1||c00==1&&c04==1||c00==1&&c05==1||c00==1&&c06==1||c00==1&&c07==1||c00==1&&c10==1||c00==1&&c20==1||c00==1&&c30==1||c00==1&&c40==1||c00==1&&c50==1||c00==1&&c60==1||c00==1&&c70==1||c00==1&&c11==1||c00==1&&c22==1||c00==1&&c33==1||c00==1&&c44==1||c00==1&&c55==1||c00==1&&c66==1||c00==1&&c77==1){
            Elost=1;
        }
        if(c01==1&&c02==1||c01==1&&c03==1||c01==1&&c04==1||c01==1&&c05==1||c01==1&&c06==1|| c01==1&&c07==1||c01==1&&c10==1||c01==1&&c11==1||c01==1&&c21==1||c01==1&&c31==1||c01==1&&c41==1||c01==1&&c51==1||c01==1&&c61==1||c01==1&&c71==1||c01==1&&c12==1||c01==1&&c23==1||c01==1&&c34==1||c01==1&&c45==1||c01==1&&c56==1||c01==1&&c67==1){
            Elost=1;
        }
        if(c02==1&&c03==1||c02==1&&c04==1||c02==1&&c05==1||c02==1&&c06==1||c02==1&&c07==1||c02==1&&c11==1||c02==1&&c20==1||c02==1&&c12==1||c02==1&&c22==1||c02==1&&c32==1||c02==1&&c42==1||c02==1&&c52==1||c02==1&&c62==1||c02==1&&c72==1||c02==1&&c13==1||c02==1&&c24==1||c02==1&&c35==1||c02==1&&c46==1||c02==1&&c57==1){
            Elost=1;
        }
        if(c03==1&&c04==1||c03==1&&c05==1||c03==1&&c06==1||c03==1&&c07==1||c03==1&&c12==1||c03==1&&c21==1||c03==1&&c30==1||c03==1&&c13==1||c03==1&&c23==1||c03==1&&c33==1||c03==1&&c43==1||c03==1&&c53==1||c03==1&&c63==1||c03==1&&c73==1||c03==1&&c14==1||c03==1&&c25==1||c03==1&&c36==1||c03==1&&c47==1){
            Elost=1;
        }
        if(c04==1&&c05==1||c04==1&&c06==1||c04==1&&c07==1||c04==1&&c13==1||c04==1&&c22==1||c04==1&&c31==1||c04==1&&c40==1||c04==1&&c14==1||c04==1&&c24==1||c04==1&&c34==1||c04==1&&c44==1||c04==1&&c54==1||c04==1&&c64==1||c04==1&&c74==1||c04==1&&c15==1||c04==1&&c26==1||c04==1&&c37==1){
            Elost=1;
        }
        if(c05==1&&c06==1||c05==1&&c07==1||c05==1&&c14==1||c05==1&&c23==1||c05==1&&c32==1||c05==1&&c41==1||c05==1&&c50==1||c05==1&&c15==1||c05==1&&c25==1||c05==1&&c35==1||c05==1&&c45==1||c05==1&&c55==1||c05==1&&c65==1||c05==1&&c75==1||c05==1&&c16==1||c05==1&&c27==1){
            Elost=1;
        }
        if(c06==1&&c07==1||c06==1&&c15==1||c06==1&&c24==1||c06==1&&c33==1||c06==1&&c42==1||c06==1&&c51==1||c06==1&&c60==1||c06==1&&c16==1||c06==1&&c26==1||c06==1&&c36==1||c06==1&&c46==1||c06==1&&c56==1||c06==1&&c66==1||c06==1&&c76==1||c06==1&&c17==1){
            Elost=1;
        }
        if(c07==1&&c16==1||c07==1&&c25==1||c07==1&&c34==1||c07==1&&c43==1||c07==1&&c52==1||c07==1&&c61==1||c07==1&&c70==1||c07==1&&c17==1||c07==1&&c27==1||c07==1&&c37==1||c07==1&&c47==1||c07==1&&c57==1||c07==1&&c67==1||c07==1&&c77==1){
            Elost=1;
        }
        if(c10==1&&c11==1||c10==1&&c12==1||c10==1&&c13==1||c10==1&&c14==1||c10==1&&c15==1||c10==1&&c16==1||c10==1&&c17==1||c10==1&&c20==1||c10==1&&c30==1||c10==1&&c40==1||c10==1&&c50==1||c10==1&&c60==1||c10==1&&c70==1||c10==1&&c21==1||c10==1&&c32==1||c10==1&&c43==1||c10==1&&c54==1||c10==1&&c65==1||c10==1&&c76==1){
            Elost=1;
        }
        if(c11==1&&c12==1||c11==1&&c13==1||c11==1&&c14==1||c11==1&&c15==1||c11==1&&c16==1||c11==1&&c17==1||c11==1&&c20==1||c11==1&&c21==1||c11==1&&c31==1||c11==1&&c41==1||c11==1&&c51==1||c11==1&&c61==1||c11==1&&c71==1||c11==1&&c22==1||c11==1&&c33==1||c11==1&&c44==1||c11==1&&c55==1||c11==1&&c66==1||c11==1&&c77==1){
            Elost=1;
        }
        if(c12==1&&c13==1||c12==1&&c14==1||c12==1&&c15==1||c12==1&&c16==1||c12==1&&c17==1||c12==1&&c21==1||c12==1&&c30==1||c12==1&&c22==1||c12==1&&c32==1||c12==1&&c42==1||c12==1&&c52==1||c12==1&&c62==1||c12==1&&c72==1||c12==1&&c23==1||c12==1&&c34==1||c12==1&&c45==1||c12==1&&c56==1||c12==1&&c67==1){
            Elost=1;
        }
        if(c13==1&&c14==1||c13==1&&c15==1||c13==1&&c16==1||c13==1&&c17==1||c13==1&&c22==1||c13==1&&c31==1||c13==1&&c40==1||c13==1&&c23==1||c13==1&&c33==1||c13==1&&c43==1||c13==1&&c53==1||c13==1&&c63==1||c13==1&&c73==1||c13==1&&c24==1||c13==1&&c35==1||c13==1&&c46==1||c13==1&&c57==1){
            Elost=1;
        }
        if(c14==1&&c15==1||c14==1&&c16==1||c14==1&&c17==1||c14==1&&c23==1||c14==1&&c32==1||c14==1&&c41==1||c14==1&&c50==1||c14==1&&c24==1||c14==1&&c34==1||c14==1&&c44==1||c14==1&&c54==1||c14==1&&c64==1||c14==1&&c74==1||c14==1&&c25==1||c14==1&&c36==1||c14==1&&c47==1){
            Elost=1;
        }
        if(c15==1&&c16==1||c15==1&&c17==1||c15==1&&c24==1||c15==1&&c33==1||c15==1&&c42==1||c15==1&&c51==1||c15==1&&c60==1||c15==1&&c25==1||c15==1&&c35==1||c15==1&&c45==1||c15==1&&c55==1||c15==1&&c65==1||c15==1&&c75==1||c15==1&&c26==1||c15==1&&c37==1){
            Elost=1;
        }
        if(c16==1&&c17==1||c16==1&&c25==1||c16==1&&c34==1||c16==1&&c43==1||c16==1&&c52==1||c16==1&&c61==1||c16==1&&c70==1||c16==1&&c26==1||c16==1&&c36==1||c16==1&&c46==1||c16==1&&c56==1||c16==1&&c66==1||c16==1&&c76==1||c16==1&&c27==1){
            Elost=1;
        }
        if(c17==1&&c26==1||c17==1&&c35==1||c17==1&&c44==1||c17==1&&c53==1||c17==1&&c62==1||c17==1&&c71==1||c17==1&&c27==1||c17==1&&c37==1||c17==1&&c47==1||c17==1&&c57==1||c17==1&&c67==1||c17==1&&c77==1){
            Elost=1;
        }
        if(c20==1&&c21==1||c20==1&&c22==1||c20==1&&c23==1||c20==1&&c24==1||c20==1&&c25==1||c20==1&&c26==1||c20==1&&c27==1||c20==1&&c30==1||c20==1&&c40==1||c20==1&&c50==1||c20==1&&c60==1||c20==1&&c70==1||c20==1&&c31==1||c20==1&&c42==1||c20==1&&c53==1||c20==1&&c64==1||c20==1&&c75==1){
            Elost=1;
        }
        if(c21==1&&c22==1||c21==1&&c23==1||c21==1&&c24==1||c21==1&&c25==1||c21==1&&c26==1||c21==1&&c27==1||c21==1&&c30==1||c21==1&&c31==1||c21==1&&c41==1||c21==1&&c51==1||c21==1&&c61==1||c21==1&&c71==1||c21==1&&c32==1||c21==1&&c43==1||c21==1&&c54==1||c21==1&&c65==1||c21==1&&c76==1){
            Elost=1;
        }
        if(c22==1&&c23==1||c22==1&&c24==1||c22==1&&c25==1||c22==1&&c26==1||c22==1&&c27==1||c22==1&&c31==1||c22==1&&c40==1||c22==1&&c32==1||c22==1&&c42==1||c22==1&&c52==1||c22==1&&c62==1||c22==1&&c72==1||c22==1&&c33==1||c22==1&&c44==1||c22==1&&c55==1||c22==1&&c66==1||c22==1&&c77==1){
            Elost=1;
        }
        if(c23==1&&c24==1||c23==1&&c25==1||c23==1&&c26==1||c23==1&&c27==1||c23==1&&c32==1||c23==1&&c41==1||c23==1&&c50==1||c23==1&&c33==1||c23==1&&c43==1||c23==1&&c53==1||c23==1&&c63==1||c23==1&&c73==1||c23==1&&c34==1||c23==1&&c45==1||c23==1&&c56==1||c23==1&&c67==1){
            Elost=1;
        }
        if(c24==1&&c25==1||c24==1&&c26==1||c24==1&&c27==1||c24==1&&c33==1||c24==1&&c42==1||c24==1&&c51==1||c24==1&&c60==1||c24==1&&c34==1||c24==1&&c44==1||c24==1&&c54==1||c24==1&&c64==1||c24==1&&c74==1||c24==1&&c35==1||c24==1&&c46==1||c24==1&&c57==1){
            Elost=1;
        }
        if(c25==1&&c26==1||c25==1&&c27==1||c25==1&&c34==1||c25==1&&c43==1||c25==1&&c52==1||c25==1&&c61==1||c25==1&&c70==1||c25==1&&c35==1||c25==1&&c45==1||c25==1&&c55==1||c25==1&&c65==1||c25==1&&c75==1||c25==1&&c36==1||c25==1&&c47==1){
            Elost=1;
        }
        if(c26==1&&c27==1||c26==1&&c35==1||c26==1&&c44==1||c26==1&&c53==1||c26==1&&c62==1||c26==1&&c71==1||c26==1&&c36==1||c26==1&&c46==1||c26==1&&c56==1||c26==1&&c66==1||c26==1&&c76==1||c26==1&&c37==1){
            Elost=1;
        }
        if(c27==1&&c36==1||c27==1&&c45==1||c27==1&&c54==1||c27==1&&c63==1||c27==1&&c72==1||c27==1&&c37==1||c27==1&&c47==1||c27==1&&c57==1||c27==1&&c67==1||c27==1&&c77==1){
            Elost=1;
        }
        if(c30==1&&c31==1||c30==1&&c32==1||c30==1&&c33==1||c30==1&&c34==1||c30==1&&c35==1||c30==1&&c36==1||c30==1&&c37==1||c30==1&&c40==1||c30==1&&c50==1||c30==1&&c60==1||c30==1&&c70==1||c30==1&&c41==1||c30==1&&c52==1||c30==1&&c63==1||c30==1&&c74==1){
            Elost=1;
        }
        if(c31==1&&c32==1||c31==1&&c33==1||c31==1&&c34==1||c31==1&&c35==1||c31==1&&c36==1||c31==1&&c37==1||c31==1&&c40==1||c31==1&&c41==1||c31==1&&c51==1||c31==1&&c61==1||c31==1&&c71==1||c31==1&&c42==1||c31==1&&c53==1||c31==1&&c64==1||c31==1&&c75==1){
            Elost=1;
        }
        if(c32==1&&c33==1||c32==1&&c34==1||c32==1&&c35==1||c32==1&&c36==1||c32==1&&c37==1||c32==1&&c41==1||c32==1&&c50==1||c32==1&&c42==1||c32==1&&c52==1||c32==1&&c62==1||c32==1&&c72==1||c32==1&&c43==1||c32==1&&c54==1||c32==1&&c65==1||c32==1&&c76==1){
            Elost=1;
        }
        if(c33==1&&c34==1||c33==1&&c35==1||c33==1&&c36==1||c33==1&&c37==1||c33==1&&c42==1||c33==1&&c51==1||c33==1&&c60==1||c33==1&&c43==1||c33==1&&c53==1||c33==1&&c63==1||c33==1&&c73==1||c33==1&&c44==1||c33==1&&c55==1||c33==1&&c66==1||c33==1&&c77==1){
            Elost=1;
        }
        if(c34==1&&c35==1||c34==1&&c36==1||c34==1&&c37==1||c34==1&&c43==1||c34==1&&c52==1||c34==1&&c61==1||c34==1&&c70==1||c34==1&&c44==1||c34==1&&c54==1||c34==1&&c64==1||c34==1&&c74==1||c34==1&&c45==1||c34==1&&c56==1||c34==1&&c67==1){
            Elost=1;
        }
        if(c35==1&&c36==1||c35==1&&c37==1||c35==1&&c44==1||c35==1&&c53==1||c35==1&&c62==1||c35==1&&c71==1||c35==1&&c45==1||c35==1&&c55==1||c35==1&&c65==1||c35==1&&c75==1||c35==1&&c46==1||c35==1&&c57==1){
            Elost=1;
        }
        if(c36==1&&c37==1||c36==1&&c45==1||c36==1&&c54==1||c36==1&&c63==1||c36==1&&c72==1||c36==1&&c46==1||c36==1&&c56==1||c36==1&&c66==1||c36==1&&c76==1||c36==1&&c47==1){
            Elost=1;
        }
        if(c37==1&&c46==1||c37==1&&c55==1||c37==1&&c64==1||c37==1&&c73==1||c37==1&&c47==1||c37==1&&c57==1||c37==1&&c67==1||c37==1&&c77==1){
            Elost=1;
        }
        if(c40==1&&c41==1||c40==1&&c42==1||c40==1&&c43==1||c40==1&&c44==1||c40==1&&c45==1||c40==1&&c46==1||c40==1&&c47==1||c40==1&&c50==1||c40==1&&c60==1||c40==1&&c70==1||c40==1&&c51==1||c40==1&&c62==1||c40==1&&c73==1){
            Elost=1;
        }
        if(c41==1&&c42==1||c41==1&&c43==1||c41==1&&c44==1||c41==1&&c45==1||c41==1&&c46==1||c41==1&&c47==1||c41==1&&c50==1||c41==1&&c51==1||c41==1&&c61==1||c41==1&&c71==1||c41==1&&c52==1||c41==1&&c63==1||c41==1&&c74==1){
            Elost=1;
        }
        if(c42==1&&c43==1||c42==1&&c44==1||c42==1&&c45==1||c42==1&&c46==1||c42==1&&c47==1||c42==1&&c51==1||c42==1&&c60==1||c42==1&&c52==1||c42==1&&c62==1||c42==1&&c72==1||c42==1&&c53==1||c42==1&&c64==1||c42==1&&c75==1){
            Elost=1;
        }
        if(c43==1&&c44==1||c43==1&&c45==1||c43==1&&c46==1||c43==1&&c47==1||c43==1&&c52==1||c43==1&&c61==1||c43==1&&c70==1||c43==1&&c53==1||c43==1&&c63==1||c43==1&&c73==1||c43==1&&c54==1||c43==1&&c65==1||c43==1&&c76==1){
            Elost=1;
        }
        if(c44==1&&c45==1||c44==1&&c46==1||c44==1&&c47==1||c44==1&&c53==1||c44==1&&c62==1||c44==1&&c71==1||c44==1&&c54==1||c44==1&&c64==1||c44==1&&c74==1||c44==1&&c55==1||c44==1&&c66==1||c44==1&&c77==1){
            Elost=1;
        }
        if(c45==1&&c46==1||c45==1&&c47==1||c45==1&&c54==1||c45==1&&c63==1||c45==1&&c72==1||c45==1&&c55==1||c45==1&&c65==1||c45==1&&c75==1||c45==1&&c56==1||c45==1&&c67==1){
            Elost=1;
        }
        if(c46==1&&c47==1||c46==1&&c55==1||c46==1&&c64==1||c46==1&&c73==1||c46==1&&c56==1||c46==1&&c66==1||c46==1&&c76==1||c46==1&&c57==1){
            Elost=1;
        }
        if(c47==1&&c56==1||c47==1&&c65==1||c47==1&&c74==1||c47==1&&c57==1||c47==1&&c67==1||c47==1&&c77==1){
            Elost=1;
        }
        if(c50==1&&c51==1||c50==1&&c52==1||c50==1&&c53==1||c50==1&&c54==1||c50==1&&c55==1||c50==1&&c56==1||c50==1&&c57==1||c50==1&&c60==1||c50==1&&c70==1||c50==1&&c61==1||c50==1&&c72==1){
            Elost=1;
        }
        if(c51==1&&c52==1||c51==1&&c53==1||c51==1&&c54==1||c51==1&&c55==1||c51==1&&c56==1||c51==1&&c57==1||c51==1&&c60==1||c51==1&&c61==1||c51==1&&c71==1||c51==1&&c62==1||c51==1&&c73==1){
            Elost=1;
        }
        if(c52==1&&c53==1||c52==1&&c54==1||c52==1&&c55==1||c52==1&&c56==1||c52==1&&c57==1||c52==1&&c61==1||c52==1&&c70==1||c52==1&&c62==1||c52==1&&c72==1||c52==1&&c63==1||c52==1&&c74==1){
            Elost=1;
        }
        if(c53==1&&c54==1||c53==1&&c55==1||c53==1&&c56==1||c53==1&&c57==1||c53==1&&c62==1||c53==1&&c71==1||c53==1&&c63==1||c53==1&&c73==1||c53==1&&c64==1||c53==1&&c75==1){
            Elost=1;
        }
        if(c54==1&&c55==1||c54==1&&c56==1||c54==1&&c57==1||c54==1&&c63==1||c54==1&&c72==1||c54==1&&c64==1||c54==1&&c74==1||c54==1&&c65==1||c54==1&&c76==1){
            Elost=1;
        }
        if(c55==1&&c56==1||c55==1&&c57==1||c55==1&&c64==1||c55==1&&c73==1||c55==1&&c65==1||c55==1&&c75==1||c55==1&&c66==1||c55==1&&c77==1){
            Elost=1;
        }
        if(c56==1&&c57==1||c56==1&&c65==1||c56==1&&c74==1||c56==1&&c66==1||c56==1&&c76==1||c56==1&&c67==1){
            Elost=1;
        }
        if(c57==1&&c66==1||c57==1&&c75==1||c57==1&&c67==1||c57==1&&c77==1){
            Elost=1;
        }
        if(c60==1&&c61==1||c60==1&&c62==1||c60==1&&c63==1||c60==1&&c64==1||c60==1&&c65==1||c60==1&&c66==1||c60==1&&c67==1||c60==1&&c70==1||c60==1&&c71==1){
            Elost=1;
        }
        if(c61==1&&c62==1||c61==1&&c63==1||c61==1&&c64==1||c61==1&&c65==1||c61==1&&c66==1||c61==1&&c67==1||c61==1&&c70==1||c61==1&&c71==1||c61==1&&c72==1){
            Elost=1;
        }
        if(c62==1&&c63==1||c62==1&&c64==1||c62==1&&c65==1||c62==1&&c66==1||c62==1&&c67==1||c62==1&&c71==1||c62==1&&c72==1||c62==1&&c73==1){
            Elost=1;
        }
        if(c63==1&&c64==1||c63==1&&c65==1||c63==1&&c66==1||c63==1&&c67==1||c63==1&&c72==1||c63==1&&c73==1||c63==1&&c74==1){
            Elost=1;
        }
        if(c64==1&&c65==1||c64==1&&c66==1||c64==1&&c67==1||c64==1&&c73==1||c64==1&&c74==1||c64==1&&c75==1){
            Elost=1;
        }
        if(c65==1&&c66==1||c65==1&&c67==1||c65==1&&c74==1||c65==1&&c75==1||c65==1&&c76==1){
            Elost=1;
        }
        if(c66==1&&c67==1||c66==1&&c75==1||c66==1&&c76==1||c66==1&&c77==1){
            Elost=1;
        }
        if(c67==1&&c76==1||c67==1&&c77==1){
            Elost=1;
        }
        if(c70==1&&c71==1||c70==1&&c72==1||c70==1&&c73==1||c70==1&&c74==1||c70==1&&c75==1||c70==1&&c76==1||c70==1&&c77==1){
            Elost=1;
        }
        if(c71==1&&c72==1||c71==1&&c73==1||c71==1&&c74==1||c71==1&&c75==1||c71==1&&c76==1||c71==1&&c77==1){
            Elost=1;
        }
        if(c72==1&&c73==1||c72==1&&c74==1||c72==1&&c75==1||c72==1&&c76==1||c72==1&&c77==1){
            Elost=1;
        }
        if(c73==1&&c74==1||c73==1&&c75==1||c73==1&&c76==1||c73==1&&c77==1){
            Elost=1;
        }
        if(c74==1&&c75==1||c74==1&&c76==1||c74==1&&c77==1){
            Elost=1;
        }
        if(c75==1&&c76==1||c75==1&&c77==1){
            Elost=1;
        }
        if(c76==1&&c77==1){
            Elost=1;
        }
        Ecount++;
        if(Ecount==8&&Elost==0){
            Esuccess++;
            Efreez();
            Esuccessed();
           win=1;
           showToast();
        }
        if(Elost==1){
            Etried++;
            Elostgame();
            Efreez();
            win=0;
            showToast();
        }

    }
    private void Efreez(){
        btn00.setEnabled(false);
        btn01.setEnabled(false);
        btn02.setEnabled(false);
        btn03.setEnabled(false);
        btn04.setEnabled(false);
        btn05.setEnabled(false);
        btn06.setEnabled(false);
        btn07.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        btn16.setEnabled(false);
        btn17.setEnabled(false);
        btn20.setEnabled(false);
        btn21.setEnabled(false);
        btn22.setEnabled(false);
        btn23.setEnabled(false);
        btn24.setEnabled(false);
        btn25.setEnabled(false);
        btn26.setEnabled(false);
        btn27.setEnabled(false);
        btn30.setEnabled(false);
        btn31.setEnabled(false);
        btn32.setEnabled(false);
        btn33.setEnabled(false);
        btn34.setEnabled(false);
        btn35.setEnabled(false);
        btn36.setEnabled(false);
        btn37.setEnabled(false);
        btn40.setEnabled(false);
        btn41.setEnabled(false);
        btn42.setEnabled(false);
        btn43.setEnabled(false);
        btn44.setEnabled(false);
        btn45.setEnabled(false);
        btn46.setEnabled(false);
        btn47.setEnabled(false);
        btn50.setEnabled(false);
        btn51.setEnabled(false);
        btn52.setEnabled(false);
        btn53.setEnabled(false);
        btn54.setEnabled(false);
        btn55.setEnabled(false);
        btn56.setEnabled(false);
        btn57.setEnabled(false);
        btn60.setEnabled(false);
        btn61.setEnabled(false);
        btn62.setEnabled(false);
        btn63.setEnabled(false);
        btn64.setEnabled(false);
        btn65.setEnabled(false);
        btn66.setEnabled(false);
        btn67.setEnabled(false);
        btn70.setEnabled(false);
        btn71.setEnabled(false);
        btn72.setEnabled(false);
        btn73.setEnabled(false);
        btn74.setEnabled(false);
        btn75.setEnabled(false);
        btn76.setEnabled(false);
        btn77.setEnabled(false);
    }
    private void Ereset(){
        btn00.setText("");
        btn00.setEnabled(true);
        btn01.setText("");
        btn01.setEnabled(true);
        btn02.setText("");
        btn02.setEnabled(true);
        btn03.setText("");
        btn03.setEnabled(true);
        btn04.setText("");
        btn04.setEnabled(true);
        btn05.setText("");
        btn05.setEnabled(true);
        btn06.setText("");
        btn06.setEnabled(true);
        btn07.setText("");
        btn07.setEnabled(true);
        btn10.setText("");
        btn10.setEnabled(true);
        btn11.setText("");
        btn11.setEnabled(true);
        btn12.setText("");
        btn12.setEnabled(true);
        btn13.setText("");
        btn13.setEnabled(true);
        btn14.setText("");
        btn14.setEnabled(true);
        btn15.setText("");
        btn15.setEnabled(true);
        btn16.setText("");
        btn16.setEnabled(true);
        btn17.setText("");
        btn17.setEnabled(true);
        btn20.setText("");
        btn20.setEnabled(true);
        btn21.setText("");
        btn21.setEnabled(true);
        btn22.setText("");
        btn22.setEnabled(true);
        btn23.setText("");
        btn23.setEnabled(true);
        btn24.setText("");
        btn24.setEnabled(true);
        btn25.setText("");
        btn25.setEnabled(true);
        btn26.setText("");
        btn26.setEnabled(true);
        btn27.setText("");
        btn27.setEnabled(true);
        btn30.setText("");
        btn30.setEnabled(true);
        btn31.setText("");
        btn31.setEnabled(true);
        btn32.setText("");
        btn32.setEnabled(true);
        btn33.setText("");
        btn33.setEnabled(true);
        btn34.setText("");
        btn34.setEnabled(true);
        btn35.setText("");
        btn35.setEnabled(true);
        btn36.setText("");
        btn36.setEnabled(true);
        btn37.setText("");
        btn37.setEnabled(true);
        btn40.setText("");
        btn40.setEnabled(true);
        btn41.setText("");
        btn41.setEnabled(true);
        btn42.setText("");
        btn42.setEnabled(true);
        btn43.setText("");
        btn43.setEnabled(true);
        btn44.setText("");
        btn44.setEnabled(true);
        btn45.setText("");
        btn45.setEnabled(true);
        btn46.setText("");
        btn46.setEnabled(true);
        btn47.setText("");
        btn47.setEnabled(true);
        btn50.setText("");
        btn50.setEnabled(true);
        btn51.setText("");
        btn51.setEnabled(true);
        btn52.setText("");
        btn52.setEnabled(true);
        btn53.setText("");
        btn53.setEnabled(true);
        btn54.setText("");
        btn54.setEnabled(true);
        btn55.setText("");
        btn55.setEnabled(true);
        btn56.setText("");
        btn56.setEnabled(true);
        btn57.setText("");
        btn57.setEnabled(true);
        btn60.setText("");
        btn60.setEnabled(true);
        btn61.setText("");
        btn61.setEnabled(true);
        btn62.setText("");
        btn62.setEnabled(true);
        btn63.setText("");
        btn63.setEnabled(true);
        btn64.setText("");
        btn64.setEnabled(true);
        btn65.setText("");
        btn65.setEnabled(true);
        btn66.setText("");
        btn66.setEnabled(true);
        btn67.setText("");
        btn67.setEnabled(true);
        btn70.setText("");
        btn70.setEnabled(true);
        btn71.setText("");
        btn71.setEnabled(true);
        btn72.setText("");
        btn72.setEnabled(true);
        btn73.setText("");
        btn73.setEnabled(true);
        btn74.setText("");
        btn74.setEnabled(true);
        btn75.setText("");
        btn75.setEnabled(true);
        btn76.setText("");
        btn76.setEnabled(true);
        btn77.setText("");
        btn77.setEnabled(true);

        c00=0;c01=0;c02=0;c03=0;c04=0;c05=0;c06=0;c07=0;
        c10=0;c11=0;c12=0;c13=0;c14=0;c15=0;c16=0;c17=0;
        c20=0;c21=0;c22=0;c23=0;c24=0;c25=0;c26=0;c27=0;
        c30=0;c31=0;c32=0;c33=0;c34=0;c35=0;c36=0;c37=0;
        c40=0;c41=0;c42=0;c43=0;c44=0;c45=0;c46=0;c47=0;
        c50=0;c51=0;c52=0;c53=0;c54=0;c55=0;c56=0;c57=0;
        c60=0;c61=0;c62=0;c63=0;c64=0;c65=0;c66=0;c67=0;
        c70=0;c71=0;c72=0;c73=0;c74=0;c75=0;c76=0;c77=0;

        Ecount=0;Elost=0;qc8=8;
        queenscount8.setText(""+qc8);
    }
    private void Esuccessed(){
        textViewscoresuccessEight.setText(""+Esuccess);

    }
    private void Elostgame(){
        textViewscoretriedEight.setText(""+Etried);
    }
    @SuppressLint("SetTextI18n")
    public void showToast(){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.activity_toast,
                (ViewGroup) findViewById(R.id.custom_toast_container));

        TextView text = (TextView) layout.findViewById(R.id.txtwin);
        ImageView img=(ImageView)layout.findViewById(R.id.imgwin);
        if(win==1){
            text.setText("Congrasulations, You Win !!!!");
            img.setImageResource(R.drawable.win);
        }else{
            text.setText("Opps, You lost !!!!");
            img.setImageResource(R.drawable.lost);
        }


        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
}