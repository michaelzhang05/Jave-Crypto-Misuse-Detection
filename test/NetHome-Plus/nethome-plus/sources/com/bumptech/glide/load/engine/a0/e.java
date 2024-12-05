package com.bumptech.glide.load.engine.a0;

import android.util.Log;
import com.bumptech.glide.k.a;
import com.bumptech.glide.load.engine.a0.a;
import java.io.File;
import java.io.IOException;

/* compiled from: DiskLruCacheWrapper.java */
/* loaded from: classes.dex */
public class e implements a {

    /* renamed from: b, reason: collision with root package name */
    private final File f8466b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8467c;

    /* renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.k.a f8469e;

    /* renamed from: d, reason: collision with root package name */
    private final c f8468d = new c();
    private final j a = new j();

    @Deprecated
    protected e(File file, long j2) {
        this.f8466b = file;
        this.f8467c = j2;
    }

    public static a c(File file, long j2) {
        return new e(file, j2);
    }

    private synchronized com.bumptech.glide.k.a d() throws IOException {
        if (this.f8469e == null) {
            this.f8469e = com.bumptech.glide.k.a.q0(this.f8466b, 1, 1, this.f8467c);
        }
        return this.f8469e;
    }

    @Override // com.bumptech.glide.load.engine.a0.a
    public void a(com.bumptech.glide.load.f fVar, a.b bVar) {
        com.bumptech.glide.k.a d2;
        String b2 = this.a.b(fVar);
        this.f8468d.a(b2);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b2 + " for for Key: " + fVar);
            }
            try {
                d2 = d();
            } catch (IOException e2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e2);
                }
            }
            if (d2.i0(b2) != null) {
                return;
            }
            a.c c0 = d2.c0(b2);
            if (c0 != null) {
                try {
                    if (bVar.a(c0.f(0))) {
                        c0.e();
                    }
                    c0.b();
                    return;
                } catch (Throwable th) {
                    c0.b();
                    throw th;
                }
            }
            throw new IllegalStateException("Had two simultaneous puts for: " + b2);
        } finally {
            this.f8468d.b(b2);
        }
    }

    @Override // com.bumptech.glide.load.engine.a0.a
    public File b(com.bumptech.glide.load.f fVar) {
        String b2 = this.a.b(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b2 + " for for Key: " + fVar);
        }
        try {
            a.e i0 = d().i0(b2);
            if (i0 != null) {
                return i0.a(0);
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
            return null;
        }
    }
}
