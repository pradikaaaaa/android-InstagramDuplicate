package com.example.user.uts3cyahya.RecyclerAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.user.uts3cyahya.R;

/**
 * Created by user on 29/10/2018.
 */

public class ImageAdapterGridView extends BaseAdapter {
    Integer[] imageIDs;
    private Context mContext;

    public ImageAdapterGridView(Integer[] imageIDs, Context mContext) {
        this.imageIDs = imageIDs;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imageIDs.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null){
            view = LayoutInflater.from(mContext).inflate(R.layout.view_gridview,viewGroup,false);
        }
        ImageView img = view.findViewById(R.id.img_gv);

        img.setImageResource(imageIDs[i]);

        return view;
//        ImageView mImageView;
//        if(view == null){
//            mImageView = new ImageView(mContext);
//            mImageView.setLayoutParams(new GridView.LayoutParams(225,255));
//            mImageView.setAdjustViewBounds(true);
//            mImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
//            mImageView.setPadding(0,0,0,0);
//            //mImageView.setBackground(ContextCompat.getDrawable(mContext, R.drawable.grid_row_border));
//
//
//        }else{
//            mImageView = (ImageView) view;
//        }
//        mImageView.setImageResource(imageIDs[i]);
//        return mImageView;
    }
}
