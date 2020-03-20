package kr.co.a20200320_01_profile01;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public abstract class baseActivity extends AppCompatActivity {

    public Context mContext = this;

    public abstract void setupEvents();
    public abstract void setValues();

}
