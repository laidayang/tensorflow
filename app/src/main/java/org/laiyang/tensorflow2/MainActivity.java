package org.laiyang.tensorflow2;

import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.readystatesoftware.systembartint.SystemBarTintManager;

import org.laiyang.tensorflow.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener { private FrameLayout fragment01;
private ImageView imageView1,imageView2,imageView3,imageView4;
private ScanfFragment scanfFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.fragment);
        immersion();
        bindview();
        replaceFragment(new ScanfFragment());
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container,fragment);
        transaction.commit();
    }

    private void bindview() {
        imageView1 = findViewById(R.id.image1);
        imageView2 = findViewById(R.id.image2);
        imageView3 = findViewById(R.id.image3);
        imageView4 = findViewById(R.id.image4);
        fragment01 = (FrameLayout) findViewById(R.id.fragment_container);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
    }


    private void immersion() {
        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //透明导航栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            // 激活状态栏
            tintManager.setStatusBarTintEnabled(true);
            // enable navigation bar tint 激活导航栏
            tintManager.setNavigationBarTintEnabled(true);
            //设置系统栏设置颜色
            //tintManager.setTintColor(R.color.red);
            //给状态栏设置颜色
            /*tintManager.setStatusBarTintResource(R.color.mask_tags_1);*/
            //Apply the specified drawable or color resource to the system navigation bar.
            //给导航栏设置资源
            /*  tintManager.setNavigationBarTintResource(R.color.mask_tags_1);*/
        }
    }

    @Override
    public void onClick(View view) {
       FragmentTransaction transactiont = getFragmentManager().beginTransaction();
       switch (view.getId()){
           case R.id.image1:
               replaceFragment(new ScanfFragment());
               break;
           case R.id.image2:
               replaceFragment(new Second_meony_fragment());
               break;
               }
    }


}

