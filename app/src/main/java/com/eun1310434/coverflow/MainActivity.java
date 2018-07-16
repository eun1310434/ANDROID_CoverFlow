/*=====================================================================
□ Infomation
  ○ Data : 12.05.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ Function
  ○ 갤러리를 변형하여 커버플로우를 만드는 방법에 대해 알 수 있습니다.

□ Study
  ○
=====================================================================*/
package com.eun1310434.coverflow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //간격
    public static int spacing = -45;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ImageAdapter :: BaseAdapter
        ImageAdapter coverImageAdapter = new ImageAdapter(this);

        //CoverFlow :: Gallery
        CoverFlow coverFlow = (CoverFlow) findViewById(R.id.coverflow);

        //커버플로우에 어댑터 설정
        coverFlow.setAdapter(coverImageAdapter);

        // 커버플로우에 속성 설정
        coverFlow.setSpacing(spacing);
        coverFlow.setSelection(2, true);
        coverFlow.setAnimationDuration(3000);
    }
}
