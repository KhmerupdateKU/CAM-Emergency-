package com.nokorbal.ku.nokorbalkhan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.Menu;
import android.view.MenuItem;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.widget.Toolbar;

import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button senSok = (Button) findViewById(R.id.senSok);
        Button chongva = (Button) findViewById(R.id.chongva);
        Button dounPenh = (Button) findViewById(R.id.dounPenh);
        Button makara = (Button) findViewById(R.id.makaRa);
        Button dongKor = (Button) findViewById(R.id.dongKor);
        Button chomkaMorn = (Button) findViewById(R.id.chomkaMorn);
        Button toulkork = (Button) findViewById(R.id.toulKork);
        Button reoseyKeo = (Button) findViewById(R.id.reoseyKeo);
        Button jbaomPov = (Button) findViewById(R.id.jbaomPov);
        Button preakpnov = (Button) findViewById(R.id.preakPnov);
        Button meanChey = (Button) findViewById(R.id.meanChey);
        Button porSenchey = (Button) findViewById(R.id.porSenchey);




        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);

        senSok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phno="tel:012925967";

                Intent i=new Intent(Intent.ACTION_DIAL,Uri.parse(phno));
                startActivity(i);
            }

        });

        chongva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:095590095"));
                startActivity(call);
            }

        });

        dounPenh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0977658283"));
                startActivity(call);
            }

        });
        makara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:012445333"));
                startActivity(call);
            }

        });
        dongKor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0979009009"));
                startActivity(call);
            }

        });
        chomkaMorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:012445333"));
                startActivity(call);
            }

        });
        toulkork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:012266777"));
                startActivity(call);
            }

        });

        reoseyKeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:012955999"));
                startActivity(call);
            }

        });
        jbaomPov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:078888801"));
                startActivity(call);
            }

        });

        preakpnov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0977272594"));
                startActivity(call);
            }

        });
        meanChey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:017744123"));
                startActivity(call);
            }

        });
        porSenchey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0977780031"));
                startActivity(call);
            }

        });

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE, 1, Menu.NONE, R.string.about);
        menu.add(Menu.NONE, 3, Menu.NONE, R.string.web);
        menu.add(Menu.NONE, 2, Menu.NONE, R.string.rate);
        menu.add(Menu.NONE, 4, Menu.NONE, R.string.exit);
        return super.onCreateOptionsMenu(menu);

        }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case 1:
                Intent intent = new Intent(this,about.class);
                startActivity(intent);
                return true;
            case 2:
                Intent rate = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.nokorbal.ku.nokorbalkhan"));
                startActivity(rate);
                return true;
            case 3:
                Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=Khmerupdate"));
                startActivity(web);
                return true;
            case 4:

                Dialog dialog = new AlertDialog.Builder(this)
                        .setTitle(R.string.ask)
                        .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).create();
                dialog.show();

                return true;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

        Dialog dialog = new AlertDialog.Builder(this)
                .setTitle(R.string.ask)
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).create();
        dialog.show();


    }

}
