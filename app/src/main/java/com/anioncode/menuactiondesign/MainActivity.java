package com.anioncode.menuactiondesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab;
    FloatingActionButton fab1;
    FloatingActionButton fab2;
    FloatingActionButton fab3;

    boolean isOpen=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fab=(FloatingActionButton) findViewById(R.id.fab);
        fab1=(FloatingActionButton) findViewById(R.id.fab1);
        fab2=(FloatingActionButton) findViewById(R.id.fab2);
        fab3=(FloatingActionButton) findViewById(R.id.fab3);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isOpen){
                    openMenu();


                }else {
                    closeMenu();
                }
            }
        });
    }

    private void openMenu() {
        isOpen=true;
        fab1.animate().translationY(-getResources().getDimension(R.dimen.stan_55));
        fab2.animate().translationY(-getResources().getDimension(R.dimen.stan_105));
        fab3.animate().translationY(-getResources().getDimension(R.dimen.stan_155));
    }
    private void closeMenu() {
        isOpen=false;
        fab1.animate().translationY(0);
        fab2.animate().translationY(0);
        fab3.animate().translationY(0);
    }

}
