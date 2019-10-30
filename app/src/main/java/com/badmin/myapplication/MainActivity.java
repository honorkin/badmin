package com.badmin.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> cityNames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 데이터 준비
        cityNames = new ArrayList<String>();
        cityNames.add("1");
        cityNames.add("2");
        cityNames.add("3");
        cityNames.add("인천광역시");
        cityNames.add("광주광역시");
        cityNames.add("대전광역시");
        cityNames.add("울산광역시");
        cityNames.add("경기도");
        cityNames.add("강원도");
        cityNames.add("충청북도");
        cityNames.add("충청남도");
        cityNames.add("전라북도");
        cityNames.add("전라남도");
        cityNames.add("경상북도");
        cityNames.add("경상남도");
        cityNames.add("제주특별자치도");

        // 어댑터를 생성
        ListAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, cityNames);

        // 어댑터를 설정
        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(adapter);

        // 항목 클릭시 위치값과 지역명 토스트로 출력
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView tv = (TextView) view.findViewById(android.R.id.text1);
                Toast.makeText(MainActivity.this,
                        position + ", " + tv.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }


}
