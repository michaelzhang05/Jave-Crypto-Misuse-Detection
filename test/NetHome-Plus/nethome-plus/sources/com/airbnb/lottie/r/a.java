package com.airbnb.lottie.r;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.s.h;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FontAssetManager.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private final AssetManager f8086d;

    /* renamed from: e, reason: collision with root package name */
    private com.airbnb.lottie.a f8087e;
    private final h<String> a = new h<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<h<String>, Typeface> f8084b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Typeface> f8085c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private String f8088f = ".ttf";

    public a(Drawable.Callback callback, com.airbnb.lottie.a aVar) {
        if (!(callback instanceof View)) {
            Log.w("LOTTIE", "LottieDrawable must be inside of a view for images to work.");
            this.f8086d = null;
        } else {
            this.f8086d = ((View) callback).getContext().getAssets();
        }
    }

    private Typeface a(String str) {
        Typeface typeface = this.f8085c.get(str);
        if (typeface != null) {
            return typeface;
        }
        com.airbnb.lottie.a aVar = this.f8087e;
        if (aVar != null) {
            throw null;
        }
        if (aVar != null) {
            throw null;
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.f8086d, "fonts/" + str + this.f8088f);
        this.f8085c.put(str, createFromAsset);
        return createFromAsset;
    }

    private Typeface d(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i2 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i2 ? typeface : Typeface.create(typeface, i2);
    }

    public Typeface b(String str, String str2) {
        this.a.b(str, str2);
        Typeface typeface = this.f8084b.get(this.a);
        if (typeface != null) {
            return typeface;
        }
        Typeface d2 = d(a(str), str2);
        this.f8084b.put(this.a, d2);
        return d2;
    }

    public void c(com.airbnb.lottie.a aVar) {
    }
}
