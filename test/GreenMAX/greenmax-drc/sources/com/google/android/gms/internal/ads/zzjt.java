package com.google.android.gms.internal.ads;

import android.content.Context;
import cm.aptoide.pt.dataprovider.BuildConfig;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzjt implements zzkf {
    private final zzkf a;

    /* renamed from: b, reason: collision with root package name */
    private final zzkf f15199b;

    /* renamed from: c, reason: collision with root package name */
    private final zzkf f15200c;

    /* renamed from: d, reason: collision with root package name */
    private zzkf f15201d;

    public zzjt(Context context, String str) {
        this(context, null, str, false);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final long a(zzjq zzjqVar) throws IOException {
        zzkh.d(this.f15201d == null);
        String scheme = zzjqVar.a.getScheme();
        if (!"http".equals(scheme) && !BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equals(scheme)) {
            if ("file".equals(scheme)) {
                if (zzjqVar.a.getPath().startsWith("/android_asset/")) {
                    this.f15201d = this.f15200c;
                } else {
                    this.f15201d = this.f15199b;
                }
            } else if ("asset".equals(scheme)) {
                this.f15201d = this.f15200c;
            } else {
                throw new zzju(scheme);
            }
        } else {
            this.f15201d = this.a;
        }
        return this.f15201d.a(zzjqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void close() throws IOException {
        zzkf zzkfVar = this.f15201d;
        if (zzkfVar != null) {
            try {
                zzkfVar.close();
            } finally {
                this.f15201d = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        return this.f15201d.read(bArr, i2, i3);
    }

    private zzjt(Context context, zzke zzkeVar, String str, boolean z) {
        this(context, null, new zzjs(str, null, null, 8000, 8000, false));
    }

    private zzjt(Context context, zzke zzkeVar, zzkf zzkfVar) {
        this.a = (zzkf) zzkh.c(zzkfVar);
        this.f15199b = new zzjv(null);
        this.f15200c = new zzjm(context, null);
    }
}
