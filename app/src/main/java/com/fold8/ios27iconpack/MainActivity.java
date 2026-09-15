package com.fold8.ios27iconpack;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.widget.*;
import android.graphics.Color;
public class MainActivity extends Activity {
 @Override public void onCreate(Bundle b){super.onCreate(b);
  LinearLayout l=new LinearLayout(this); l.setOrientation(LinearLayout.VERTICAL); l.setPadding(48,80,48,48);
  TextView t=new TextView(this); t.setText("Fold8 iOS27 Icon Pack"); t.setTextSize(28); t.setTextColor(Color.WHITE);
  TextView d=new TextView(this); d.setText("\nGalaxy Fold8용 글래스 스타일 아이콘팩\n\nSamsung One UI에서는 Good Lock > Theme Park > 아이콘에서 이 팩을 선택하세요."); d.setTextSize(17); d.setTextColor(0xffdddddd);
  Button x=new Button(this); x.setText("아이콘 적용 안내"); x.setOnClickListener(v->{Toast.makeText(this,"Good Lock > Theme Park > 아이콘 > Fold8 iOS27 선택",Toast.LENGTH_LONG).show();});
  l.setBackgroundColor(0xff111522); l.addView(t); l.addView(d); l.addView(x); setContentView(l);
 }
}
