package com.fold8.ios27iconpack;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends Activity {
 @Override public void onCreate(Bundle b){super.onCreate(b); TextView v=new TextView(this); v.setText("iOS 27 Liquid Glass Icon Pack\nInstalled successfully. Open Good Lock > Theme Park > Icon."); v.setTextSize(20); v.setPadding(48,96,48,48); setContentView(v);}
}