package com.fmsd.liu.Views.HorizontalHuaDongView;

import android.content.Context;
import android.content.Intent;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.RecyclerView;
import android.telecom.Call;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.fmsd.liu.Adapter.Work_HorizontalHuaDongView_Adapter;
import com.fmsd.liu.Entity.Work_PullableListView_Entity;
import com.fmsd.liu.R;
import com.fmsd.liu.Utils.okhttputils.CallBackUtil;
import com.fmsd.liu.Utils.okhttputils.OkhttpUtil;
import com.fmsd.liu.Views.HorizontalHuaDongView.recyclerview.SnappingSwipingViewBuilder;
import com.fmsd.liu.Views.HorizontalHuaDongView.recyclerview.SnappyLinearLayoutManager;
import com.fmsd.liu.Views.HorizontalHuaDongView.recyclerview.SwipeGestureHelper;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * Created by qiang on 2018/11/7.
 */

public class Work_HorizontalHuaDongView extends LinearLayout implements SwipeGestureHelper.OnSwipeListener {
    private Context context;
    private RecyclerView recyclerView;
    private Work_HorizontalHuaDongView_Adapter workPuBuLiuViewAdapter;
    private SmartRefreshLayout smartRefreshLayout;
    private int index = 0;
    private List<Work_PullableListView_Entity.ArticlelistBean> articlelistBeen = new ArrayList<>();
    private FrameLayout frame;
    private FrameLayout frame1;
    private LinearLayout lin;
    private boolean upgundong;

    @Override
    public void onSwipe(RecyclerView rv, int adapterPosition, float dy) {
        workPuBuLiuViewAdapter.notifyItemRemoved(adapterPosition);
        rv.invalidateItemDecorations();
    }

    public Work_HorizontalHuaDongView(Context context) {
        super(context);
        init(context);
    }

    public Work_HorizontalHuaDongView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public Work_HorizontalHuaDongView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        this.context = context;
        LayoutInflater.from(context).inflate(R.layout.layout_horizontalhuadong, this);
        workPuBuLiuViewAdapter = new Work_HorizontalHuaDongView_Adapter(articlelistBeen, getContext());
        recyclerView = new SnappingSwipingViewBuilder(context)
                .setAdapter(workPuBuLiuViewAdapter)
//                .setHeadTailExtraMarginDp(17F)
                .setItemMarginDp(0, 0, 0, 0)
                .setOnSwipeListener(this)
                .setSnapMethod(SnappyLinearLayoutManager.SnappyLinearSmoothScroller.SNAP_CENTER)
                .build();
        smartRefreshLayout = findViewById(R.id.smart);
        frame = findViewById(R.id.frame);
        frame1 = findViewById(R.id.frame1);
        lin = findViewById(R.id.lin);
        recyclerView.setOverScrollMode(OVER_SCROLL_NEVER);
        lin.addView(recyclerView);
    }
    public void startYeWu(final JSONObject jsonObject, final Map<String, String> map, final String reqUrl) {
        articlelistBeen.clear();
        frame.setVisibility(VISIBLE);
        smartRefreshLayout.setEnableRefresh(false);
        smartRefreshLayout.setEnableLoadmore(false);
        try {
            jsonObject.put("page", index);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        OkhttpUtil.okHttpPostJson(reqUrl, jsonObject.toString(), map, new CallBackUtil.CallBackString() {

            @Override
            public void onFailure(okhttp3.Call call, Exception e) {}

            @Override
            public void onResponse(String response) {
                index++;
                Gson gson = new Gson();
                try {
                    Work_PullableListView_Entity entity = gson.fromJson(response, Work_PullableListView_Entity.class);
                    articlelistBeen.addAll(entity.getArticlelist());
                    workPuBuLiuViewAdapter.setJieKou(new RecyclerInterface() {
                        @Override
                        public void danJi(View view, int position) {
//                            Intent intent = new Intent(getContext(), TuPianContentActivity.class);
//                            intent.putExtra("articleid", articlelistBeen.get(position).getArticle_id());
//                            intent.putExtra("images", (Serializable) articlelistBeen.get(position));
//                            context.startActivity(intent);
                        }
                    });
                    workPuBuLiuViewAdapter.notifyDataSetChanged();
                    if (articlelistBeen.size() != 0) {
                        frame1.setVisibility(GONE);
                    }
                    frame.setVisibility(GONE);
                } catch (JsonSyntaxException e) {
                    e.printStackTrace();
                    frame.setVisibility(GONE);
                    frame1.setVisibility(VISIBLE);
                }
            }
        });
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == 0) {//当newState == 0时，表示recyclerView已经停止滚动了
                    if (upgundong) {
                        load_more(jsonObject,map,reqUrl);
                    }
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                //当执行完onScrolled方法后，系统会执行onScrollStateChanged方法
                super.onScrolled(recyclerView, dx, dy);
                 if (!recyclerView.canScrollHorizontally(1)) {
                    upgundong = true;
//                    Log.e("qwer", "到最右边了" + dy);
                }else {
                     upgundong = false;
                 }
            }
        });
    }

    private void load_more(JSONObject jsonObject, Map<String, String> map, String reqUrl) {
        try {
            jsonObject.put("page", index);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        OkhttpUtil.okHttpPostJson(reqUrl, jsonObject.toString(), map, new CallBackUtil.CallBackString() {

            @Override
            public void onFailure(okhttp3.Call call, Exception e) {}

            @Override
            public void onResponse(String response) {
                try {
                    index++;
                    Gson gson = new Gson();
                    Work_PullableListView_Entity entity = gson.fromJson(response, Work_PullableListView_Entity.class);
                    if (entity.getArticlelist().size() != 0) {
                        articlelistBeen.addAll(entity.getArticlelist());
                        workPuBuLiuViewAdapter.notifyDataSetChanged();
                    }else {
                        Toast.makeText(getContext(), "已加载所有数据!", Toast.LENGTH_SHORT).show();
                    }
                    smartRefreshLayout.finishLoadmore();
                } catch (JsonSyntaxException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
