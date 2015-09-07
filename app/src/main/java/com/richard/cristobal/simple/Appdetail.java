package com.richard.cristobal.simple;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/**
 * Created by Cristobal on 04-09-2015.
 * store the label , name , and Icon of an aplication
 *
 */

public class Appdetail {

    CharSequence label;
    CharSequence name;
    Drawable icon;
    int Iconx =50;
    int Icony =50;

    public Appdetail(CharSequence label , CharSequence name , Drawable icon  ){

        this.label = label;
        this.name =  name;
        this.icon = this.resizeIcon(icon);

    }

    /**
     *Rezise de Icon to Iconx width and Icony Height
     */

    private Drawable resizeIcon (Drawable image) {
        Bitmap b = ((BitmapDrawable) image).getBitmap();
        Bitmap bitmapResized = Bitmap.createScaledBitmap(b, Iconx, Icony, false);
        image = new BitmapDrawable(Resources.getSystem(), bitmapResized);


        return image;
    }


}
