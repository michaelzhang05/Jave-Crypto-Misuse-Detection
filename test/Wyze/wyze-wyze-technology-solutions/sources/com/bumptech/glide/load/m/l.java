package com.bumptech.glide.load.m;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.m.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: LocalUriFetcher.java */
/* loaded from: classes.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: f, reason: collision with root package name */
    private final Uri f8686f;

    /* renamed from: g, reason: collision with root package name */
    private final ContentResolver f8687g;

    /* renamed from: h, reason: collision with root package name */
    private T f8688h;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f8687g = contentResolver;
        this.f8686f = uri;
    }

    @Override // com.bumptech.glide.load.m.d
    public void b() {
        T t = this.f8688h;
        if (t != null) {
            try {
                c(t);
            } catch (IOException unused) {
            }
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
    public final void e(com.bumptech.glide.g gVar, d.a<? super T> aVar) {
        try {
            T f2 = f(this.f8686f, this.f8687g);
            this.f8688h = f2;
            aVar.g(f2);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e2);
            }
            aVar.c(e2);
        }
    }

    protected abstract T f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
