package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class zzjm implements zzkf {
    private final AssetManager a;

    /* renamed from: b, reason: collision with root package name */
    private final zzke f15174b;

    /* renamed from: c, reason: collision with root package name */
    private String f15175c;

    /* renamed from: d, reason: collision with root package name */
    private InputStream f15176d;

    /* renamed from: e, reason: collision with root package name */
    private long f15177e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15178f;

    public zzjm(Context context, zzke zzkeVar) {
        this.a = context.getAssets();
        this.f15174b = zzkeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final long a(zzjq zzjqVar) throws zzjn {
        try {
            this.f15175c = zzjqVar.a.toString();
            String path = zzjqVar.a.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream open = this.a.open(path, 1);
            this.f15176d = open;
            zzkh.d(open.skip(zzjqVar.f15182c) == zzjqVar.f15182c);
            long j2 = zzjqVar.f15183d;
            if (j2 == -1) {
                j2 = this.f15176d.available();
            }
            this.f15177e = j2;
            if (j2 >= 0) {
                this.f15178f = true;
                zzke zzkeVar = this.f15174b;
                if (zzkeVar != null) {
                    zzkeVar.b();
                }
                return this.f15177e;
            }
            throw new EOFException();
        } catch (IOException e2) {
            throw new zzjn(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void close() throws zzjn {
        InputStream inputStream = this.f15176d;
        if (inputStream != null) {
            try {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    throw new zzjn(e2);
                }
            } finally {
                this.f15176d = null;
                if (this.f15178f) {
                    this.f15178f = false;
                    zzke zzkeVar = this.f15174b;
                    if (zzkeVar != null) {
                        zzkeVar.c();
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final int read(byte[] bArr, int i2, int i3) throws zzjn {
        long j2 = this.f15177e;
        if (j2 == 0) {
            return -1;
        }
        try {
            int read = this.f15176d.read(bArr, i2, (int) Math.min(j2, i3));
            if (read > 0) {
                this.f15177e -= read;
                zzke zzkeVar = this.f15174b;
                if (zzkeVar != null) {
                    zzkeVar.a(read);
                }
            }
            return read;
        } catch (IOException e2) {
            throw new zzjn(e2);
        }
    }
}
