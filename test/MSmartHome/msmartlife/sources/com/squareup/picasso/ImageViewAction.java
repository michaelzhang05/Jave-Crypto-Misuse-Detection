package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ImageViewAction extends Action<ImageView> {
    Callback callback;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImageViewAction(Picasso picasso, ImageView imageView, Request request, int i2, int i3, int i4, Drawable drawable, String str, Object obj, Callback callback, boolean z) {
        super(picasso, imageView, request, i2, i3, i4, drawable, str, obj, z);
        this.callback = callback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.Action
    public void cancel() {
        super.cancel();
        if (this.callback != null) {
            this.callback = null;
        }
    }

    @Override // com.squareup.picasso.Action
    public void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.target.get();
            if (imageView == null) {
                return;
            }
            Picasso picasso = this.picasso;
            PicassoDrawable.setBitmap(imageView, picasso.context, bitmap, loadedFrom, this.noFade, picasso.indicatorsEnabled);
            Callback callback = this.callback;
            if (callback != null) {
                callback.onSuccess();
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    @Override // com.squareup.picasso.Action
    public void error() {
        ImageView imageView = (ImageView) this.target.get();
        if (imageView == null) {
            return;
        }
        int i2 = this.errorResId;
        if (i2 != 0) {
            imageView.setImageResource(i2);
        } else {
            Drawable drawable = this.errorDrawable;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        Callback callback = this.callback;
        if (callback != null) {
            callback.onError();
        }
    }
}
