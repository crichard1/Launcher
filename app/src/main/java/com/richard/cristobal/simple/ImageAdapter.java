package com.richard.cristobal.simple;

/**
 * Created by Cristobal on 05-09-2015.
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ImageAdapter extends BaseAdapter {

    private Context Contextgrid;
    private List<Appdetail> applist;

    public ImageAdapter(Context c, List<Appdetail> apps) {
        Contextgrid = c;
        this.applist = apps;
    }

    public int getCount() {
        return mThumbIds.length;
    }
    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(Contextgrid);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        }
        else
        {
            imageView = (ImageView) convertView;
        }



        imageView.setImageResource(mThumbIds[position]);
        return imageView;

    }






    // Keep all Images in array
    public Integer[] mThumbIds = {

    };
}
