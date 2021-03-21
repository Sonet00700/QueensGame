package com.sonetsagor.a4queensgame;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button btn00,btn01,btn02,btn03,btn10,btn11,btn12,btn13,
        btn20,btn21,btn22,btn23,btn30,btn31,btn32,btn33,btnreset;
private TextView textViewscoresuccess,textViewscoretried,queenscount;
private int c00=0,c01=0,c02=0,c03=0,c10=0,c11=0,c12=0,c13=0,c20=0,c21=0,c22=0,
        c23=0,c30=0,c31=0,c32=0,c33=0,count=0,lost=0,success=0,tried=0,qc=4,win;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        btn00=findViewById(R.id.button_id_00);
        btn01=findViewById(R.id.button_id_01);
        btn02=findViewById(R.id.button_id_02);
        btn03=findViewById(R.id.button_id_03);
        btn10=findViewById(R.id.button_id_10);
        btn11=findViewById(R.id.button_id_11);
        btn12=findViewById(R.id.button_id_12);
        btn13=findViewById(R.id.button_id_13);
        btn20=findViewById(R.id.button_id_20);
        btn21=findViewById(R.id.button_id_21);
        btn22=findViewById(R.id.button_id_22);
        btn23=findViewById(R.id.button_id_23);
        btn30=findViewById(R.id.button_id_30);
        btn31=findViewById(R.id.button_id_31);
        btn32=findViewById(R.id.button_id_32);
        btn33=findViewById(R.id.button_id_33);
        btnreset=findViewById(R.id.btn_reset);

        textViewscoresuccess=findViewById(R.id.textViewScoresuccess);
        textViewscoretried=findViewById(R.id.textViewScoretried);
        queenscount=findViewById(R.id.queensCount_id_4);

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });

        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn00.setText("Q");
                btn00.setEnabled(false);
                c00=1;
                Queen();
            }
        });
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn01.setText("Q");
                btn01.setEnabled(false);
                c01=1;
                Queen();
            }
        });
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn02.setText("Q");
                btn02.setEnabled(false);
                c02=1;
                Queen();
            }
        });
        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn03.setText("Q");
                btn03.setEnabled(false);
                c03=1;
                Queen();
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn10.setText("Q");
                btn10.setEnabled(false);
                c10=1;
                Queen();
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn11.setText("Q");
                btn11.setEnabled(false);
                c11=1;
                Queen();
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn12.setText("Q");
                btn12.setEnabled(false);
                c12=1;
                Queen();
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn13.setText("Q");
                btn13.setEnabled(false);
                c13=1;
                Queen();
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn20.setText("Q");
                btn20.setEnabled(false);
                c20=1;
                Queen();
            }
        });
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn21.setText("Q");
                btn21.setEnabled(false);
                c21=1;
                Queen();
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn22.setText("Q");
                btn22.setEnabled(false);
                c22=1;
                Queen();
            }
        });
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn23.setText("Q");
                btn23.setEnabled(false);
                c23=1;
                Queen();
            }
        });
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn30.setText("Q");
                btn30.setEnabled(false);
                c30=1;
                Queen();
            }
        });
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn31.setText("Q");
                btn31.setEnabled(false);
                c31=1;
                Queen();
            }
        });
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn32.setText("Q");
                btn32.setEnabled(false);
                c32=1;
                Queen();
            }
        });
        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn33.setText("Q");
                btn33.setEnabled(false);
                c33=1;
                Queen();
            }
        });

    }
    private void Queen(){
        qc--;
        queenscount.setText(""+qc);
        if(c00==1&&c01==1||c00==1&&c02==1||c00==1&&c03==1||c00==1&&c10==1||c00==1&&c20==1||c00==1&&c30==1||
                c00==1&&c11==1||c00==1&&c22==1||c00==1&&c33==1){
            lost=1;

        }
        if(c01==1&&c02==1||c01==1&&c03==1||c01==1&&c10==1||c01==1&&c21==1||c01==1&&c31==1||
                c01==1&&c11==1||c01==1&&c12==1||c01==1&&c23==1){
            lost=1;

        }
        if(c02==1&&c03==1||c02==1&&c20==1||c02==1&&c11==1||c02==1&&c12==1||
                c02==1&&c22==1||c02==1&&c32==1||c02==1&&c13==1){
            lost=1;

        }
        if(c03==1&&c13==1||c03==1&&c23==1||c03==1&&c33==1||c03==1&&c12==1||
                c03==1&&c21==1||c03==1&&c30==1){
            lost=1;

        }
        if(c10==1&&c11==1||c10==1&&c12==1||c10==1&&c13==1||c10==1&&c20==1||
                c10==1&&c30==1||c10==1&&c21==1||c10==1&&c32==1){
            lost=1;

        }
        if(c11==1&&c12==1||c11==1&&c13==1||c11==1&&c21==1||c11==1&&c31==1||
                c11==1&&c20==1||c11==1&&c22==1||c11==1&&c33==1){
            lost=1;

        }
        if(c12==1&&c13==1||c12==1&&c22==1||c12==1&&c32==1||c12==1&&c21==1||
                c12==1&&c30==1||c12==1&&c23==1){
            lost=1;

        }
        if(c13==1&&c23==1||c13==1&&c33==1||c13==1&&c22==1||c13==1&&c31==1){
         lost=1;
        }
        if(c20==1&&c21==1||c20==1&&c22==1||c20==1&&c23==1||c20==1&&c30==1||
                c20==1&&c31==1){
            lost=1;

        }
        if(c21==1&&c22==1||c21==1&&c23==1||c21==1&&c30==1||c21==1&&c32==1||
                c21==1&&c31==1){
            lost=1;

        }
        if(c22==1&&c23==1||c22==1&&c31==1||c22==1&&c32==1||c22==1&&c33==1){
            lost=1;

        }
        if(c23==1&&c32==1||c23==1&&c33==1){
            lost=1;

        }
        if(c30==1&&c31==1||c30==1&&c32==1||c30==1&&c33==1){
            lost=1;

        }
        if(c31==1&&c32==1||c31==1&&c33==1){
            lost=1;

        }
        if(c32==1&&c33==1){
            lost=1;

        }
        count++;
        if(count==4&&lost==0){
            success++;
            freez();
            successed();
             win=1;
            showToast();
        }
        if(lost==1){
            tried++;
            freez();
            lostgame();
            win=0;
            showToast();
        }
    }
    private void freez(){
        btn00.setEnabled(false);
        btn01.setEnabled(false);
        btn02.setEnabled(false);
        btn03.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn20.setEnabled(false);
        btn21.setEnabled(false);
        btn22.setEnabled(false);
        btn23.setEnabled(false);
        btn30.setEnabled(false);
        btn31.setEnabled(false);
        btn32.setEnabled(false);
        btn33.setEnabled(false);
    }
    private void reset(){
        btn00.setText("");
        btn00.setEnabled(true);
        btn01.setText("");
        btn01.setEnabled(true);
        btn02.setText("");
        btn02.setEnabled(true);
        btn03.setText("");
        btn03.setEnabled(true);
        btn10.setText("");
        btn10.setEnabled(true);
        btn11.setText("");
        btn11.setEnabled(true);
        btn12.setText("");
        btn12.setEnabled(true);
        btn13.setText("");
        btn13.setEnabled(true);
        btn20.setText("");
        btn20.setEnabled(true);
        btn21.setText("");
        btn21.setEnabled(true);
        btn22.setText("");
        btn22.setEnabled(true);
        btn23.setText("");
        btn23.setEnabled(true);
        btn30.setText("");
        btn30.setEnabled(true);
        btn31.setText("");
        btn31.setEnabled(true);
        btn32.setText("");
        btn32.setEnabled(true);
        btn33.setText("");
        btn33.setEnabled(true);

        c00=0;c01=0;c02=0;c03=0;c10=0;c11=0;c12=0;c13=0;c20=0;c21=0;c22=0;
                c23=0;c30=0;c31=0;c32=0;c33=0;count=0;lost=0;qc=4;
                queenscount.setText(""+qc);
    }

    private void successed(){
        textViewscoresuccess.setText(""+success);

    }
    private void lostgame(){
        textViewscoretried.setText(""+tried);
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