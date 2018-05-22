package com.test.testproject.presentation.binders;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.net.Uri;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.test.testproject.presentation.utils.PicassoCircleTransformation;
import com.test.testproject.presentation.utils.PicassoRoundCornersTransformation;

public class MainImageBinder {

    @BindingAdapter("binding:picassoMain")
    public static void setImageUrl(ImageView imageView, String imageUrl) {
        Context context = imageView.getContext();
        Picasso.get().load(imageUrl).fit().centerCrop().transform(new PicassoRoundCornersTransformation()).into(imageView);
    }


    @BindingAdapter("binding:picassoCircle")
    public static void setImageUrlWithCircleTransform(ImageView imageView, String imageUrl) {
        Context context = imageView.getContext();
        Picasso.get().load(imageUrl).transform(new PicassoCircleTransformation()).into(imageView);
    }

}
