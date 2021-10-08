package com.example.myapplication_text1;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.transition.Transition;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Fragment WechatFragment=new WechatFragment();
    private Fragment Wechat2Fragment=new Wechat2Fragment();
    private Fragment Wechat3Fragment=new Wechat3Fragment();
    private Fragment Wechat4Fragment=new Wechat4Fragment();

    private FragmentManager fragmentManager;

    private LinearLayout LinearLayout1;
    private LinearLayout LinearLayout2;
    private LinearLayout LinearLayout3;
    private LinearLayout LinearLayout4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout1=findViewById(R.id.LinearLayout1);
        LinearLayout2=findViewById(R.id.LinearLayout2);
        LinearLayout3=findViewById(R.id.LinearLayout3);
        LinearLayout4=findViewById(R.id.LinearLayout4);

        LinearLayout1.setOnClickListener(this);
        LinearLayout2.setOnClickListener(this);
        LinearLayout3.setOnClickListener(this);
        LinearLayout4.setOnClickListener(this);


        initFragment();


    }

    protected void initFragment() {
        fragmentManager=getFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.add(R.id.id_content,WechatFragment);
        transaction.add(R.id.id_content,Wechat2Fragment);
        transaction.add(R.id.id_content,Wechat3Fragment);
        transaction.add(R.id.id_content,Wechat4Fragment);
        transaction.commit();
    }

    protected void hideFragment(FragmentTransaction transaction) {

        transaction.hide(WechatFragment);
        transaction.hide(Wechat2Fragment);
        transaction.hide(Wechat3Fragment);
        transaction.hide(Wechat4Fragment);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.LinearLayout1:
                showfragment(1);
                break;
            case R.id.LinearLayout2:
                showfragment(2);
                break;
            case R.id.LinearLayout3:
                showfragment(3);
                break;
            case R.id.LinearLayout4:
                showfragment(4);
                break;
            default:
                break;
        }
    }

    private void showfragment(int i) {
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        hideFragment(transaction);
        switch (i){
            case 1:
                transaction.show(WechatFragment);
                break;
            case 2:
                transaction.show(Wechat2Fragment);
                break;
            case 3:
                transaction.show(Wechat3Fragment);
                break;
            case 4:
                transaction.show(Wechat4Fragment);
                break;
            default:
                break;
        }
        transaction.commit();
    }
}