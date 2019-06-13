package com.fmsd.liu.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.fmsd.liu.Entity.Work_PullableListView_Entity;
import com.fmsd.liu.R;
import com.fmsd.liu.Views.HorizontalHuaDongView.RecyclerInterface;

import java.util.List;


/**
 * Created by qiang on 2018/11/7.
 */
public class Work_HorizontalHuaDongView_Adapter extends BaseRecycleViewAdapter<Work_PullableListView_Entity.ArticlelistBean> implements View.OnClickListener {
    private List<Work_PullableListView_Entity.ArticlelistBean> list;
    private Context context;
    private RecyclerInterface recyclerInterface;

    public Work_HorizontalHuaDongView_Adapter(List<Work_PullableListView_Entity.ArticlelistBean> list, Context context) {
        super(context, list);
        this.list = list;
        this.context = context;
    }

    @Override
    protected int getViewResource() {
        return R.layout.adapter_horizontalhuadongview_item;
    }

    @Override
    protected RecyclerView.ViewHolder getRecycleViewHolder(View view) {
        Work_HorizontalHuaDongView_ViewHolder viewholder = new Work_HorizontalHuaDongView_ViewHolder(view);
        view.setOnClickListener(this);
        return viewholder;
    }

    @Override
    protected void dataRead(final RecyclerView.ViewHolder holder, final int position) {
        Work_HorizontalHuaDongView_ViewHolder holder1 = (Work_HorizontalHuaDongView_ViewHolder) holder;
        if (list.get(position).getContentPictures().size() > 0) {
            RequestOptions r = new RequestOptions().error(R.drawable.zanwei).placeholder(R.drawable.zanwei);
            Glide.with(context).load(list.get(position).getContentPictures().get(0).getPic_url())
                    .apply(r).into(holder1.imageView);
        }
        holder1.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public void setJieKou(RecyclerInterface recyclerInterface) {
        this.recyclerInterface = recyclerInterface;
    }

    @Override
    public void onClick(View view) {
        recyclerInterface.danJi(view, (Integer) view.getTag());
    }

    class Work_HorizontalHuaDongView_ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        private Work_HorizontalHuaDongView_ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.tupian);
        }

    }

}
