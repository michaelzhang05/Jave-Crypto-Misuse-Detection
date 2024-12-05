package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@zzard
@TargetApi(14)
/* loaded from: classes.dex */
public abstract class zzbco extends TextureView implements g8 {

    /* renamed from: f, reason: collision with root package name */
    protected final zzbcy f13169f;

    /* renamed from: g, reason: collision with root package name */
    protected final zzbdi f13170g;

    public zzbco(Context context) {
        super(context);
        this.f13169f = new zzbcy();
        this.f13170g = new zzbdi(context, this);
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract void e(int i2);

    public abstract void f();

    public abstract void g(float f2, float f3);

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void h(zzbcn zzbcnVar);

    public void i(String str, String[] strArr) {
        setVideoPath(str);
    }

    public void j(int i2) {
    }

    public void k(int i2) {
    }

    public void l(int i2) {
    }

    public void m(int i2) {
    }

    public void n(int i2) {
    }

    public abstract String o();

    public abstract void setVideoPath(String str);
}
