package com.bumptech.glide.load.m;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.m.d;
import java.io.IOException;

/* compiled from: AssetPathFetcher.java */
/* loaded from: classes.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: f, reason: collision with root package name */
    private final String f8667f;

    /* renamed from: g, reason: collision with root package name */
    private final AssetManager f8668g;

    /* renamed from: h, reason: collision with root package name */
    private T f8669h;

    public b(AssetManager assetManager, String str) {
        this.f8668g = assetManager;
        this.f8667f = str;
    }

    @Override // com.bumptech.glide.load.m.d
    public void b() {
        T t = this.f8669h;
        if (t == null) {
            return;
        }
        try {
            c(t);
        } catch (IOException unused) {
        }
    }

    protected abstract void c(T t) throws IOException;

    @Override // com.bumptech.glide.load.m.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.m.d
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.m.d
    public void e(com.bumptech.glide.g gVar, d.a<? super T> aVar) {
        try {
            T f2 = f(this.f8668g, this.f8667f);
            this.f8669h = f2;
            aVar.g(f2);
        } catch (IOException e2) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
            }
            aVar.c(e2);
        }
    }

    protected abstract T f(AssetManager assetManager, String str) throws IOException;
}
