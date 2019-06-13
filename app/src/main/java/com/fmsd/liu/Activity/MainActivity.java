package com.fmsd.liu.Activity;

import android.support.v4.util.ArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fmsd.liu.R;
import com.fmsd.liu.Views.HorizontalHuaDongView.Work_HorizontalHuaDongView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private Work_HorizontalHuaDongView huadong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        huadong =findViewById(R.id.huadong);
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("user_id", "");
            jsonObject.put("appid", 12);
            jsonObject.put("column_id", "0");
            jsonObject.put("class_id", 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
//        Log.e("jsonObject11", "init: " + jsonObject.toString());
        Map<String, String> map = new ArrayMap<>();
        map.put("iscolumn", "1");

        huadong.startYeWu(jsonObject,map,"https://xcx.51babyapp.com/App/appinterface1");

    }
}
