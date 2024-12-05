package com.airbnb.lottie.r;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.g;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ImageAssetManager.java */
/* loaded from: classes.dex */
public class b {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Context f8089b;

    /* renamed from: c, reason: collision with root package name */
    private String f8090c;

    /* renamed from: d, reason: collision with root package name */
    private com.airbnb.lottie.b f8091d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, g> f8092e;

    public b(Drawable.Callback callback, String str, com.airbnb.lottie.b bVar, Map<String, g> map) {
        this.f8090c = str;
        if (!TextUtils.isEmpty(str)) {
            if (this.f8090c.charAt(r4.length() - 1) != '/') {
                this.f8090c += '/';
            }
        }
        if (!(callback instanceof View)) {
            Log.w("LOTTIE", "LottieDrawable must be inside of a view for images to work.");
            this.f8092e = new HashMap();
            this.f8089b = null;
        } else {
            this.f8089b = ((View) callback).getContext();
            this.f8092e = map;
            e(bVar);
        }
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (a) {
            this.f8092e.get(str).d(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        g gVar = this.f8092e.get(str);
        if (gVar == null) {
            return null;
        }
        Bitmap a2 = gVar.a();
        if (a2 != null) {
            return a2;
        }
        com.airbnb.lottie.b bVar = this.f8091d;
        if (bVar != null) {
            Bitmap a3 = bVar.a(gVar);
            if (a3 != null) {
                c(str, a3);
            }
            return a3;
        }
        String b2 = gVar.b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (b2.startsWith("data:") && b2.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(b2.substring(b2.indexOf(44) + 1), 0);
                return c(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e2) {
                Log.w("LOTTIE", "data URL did not have correct base64 format.", e2);
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.f8090c)) {
                return c(str, BitmapFactory.decodeStream(this.f8089b.getAssets().open(this.f8090c + b2), null, options));
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException e3) {
            Log.w("LOTTIE", "Unable to open asset.", e3);
            return null;
        }
    }

    public boolean b(Context context) {
        return (context == null && this.f8089b == null) || this.f8089b.equals(context);
    }

    public void d() {
        synchronized (a) {
            Iterator<Map.Entry<String, g>> it = this.f8092e.entrySet().iterator();
            while (it.hasNext()) {
                g value = it.next().getValue();
                Bitmap a2 = value.a();
                if (a2 != null) {
                    a2.recycle();
                    value.d(null);
                }
            }
        }
    }

    public void e(com.airbnb.lottie.b bVar) {
        this.f8091d = bVar;
    }
}
