package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd;

@zzard
/* loaded from: classes2.dex */
public final class zzael extends NativeAd.Image {
    private final zzaei a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f12677b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f12678c;

    /* renamed from: d, reason: collision with root package name */
    private final double f12679d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12680e;

    /* renamed from: f, reason: collision with root package name */
    private final int f12681f;

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:2|3)|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        com.google.android.gms.internal.ads.zzbad.c(okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        com.google.android.gms.internal.ads.zzbad.c(okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, r1);
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0032, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0033, code lost:
    
        com.google.android.gms.internal.ads.zzbad.c(okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0023, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0024, code lost:
    
        com.google.android.gms.internal.ads.zzbad.c(okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzael(com.google.android.gms.internal.ads.zzaei r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            r3.<init>()
            r3.a = r4
            r1 = 0
            com.google.android.gms.dynamic.IObjectWrapper r4 = r4.y4()     // Catch: android.os.RemoteException -> L15
            if (r4 == 0) goto L19
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.R(r4)     // Catch: android.os.RemoteException -> L15
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4     // Catch: android.os.RemoteException -> L15
            goto L1a
        L15:
            r4 = move-exception
            com.google.android.gms.internal.ads.zzbad.c(r0, r4)
        L19:
            r4 = r1
        L1a:
            r3.f12677b = r4
            com.google.android.gms.internal.ads.zzaei r4 = r3.a     // Catch: android.os.RemoteException -> L23
            android.net.Uri r1 = r4.n0()     // Catch: android.os.RemoteException -> L23
            goto L27
        L23:
            r4 = move-exception
            com.google.android.gms.internal.ads.zzbad.c(r0, r4)
        L27:
            r3.f12678c = r1
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.google.android.gms.internal.ads.zzaei r4 = r3.a     // Catch: android.os.RemoteException -> L32
            double r1 = r4.T3()     // Catch: android.os.RemoteException -> L32
            goto L36
        L32:
            r4 = move-exception
            com.google.android.gms.internal.ads.zzbad.c(r0, r4)
        L36:
            r3.f12679d = r1
            r4 = -1
            com.google.android.gms.internal.ads.zzaei r1 = r3.a     // Catch: android.os.RemoteException -> L40
            int r1 = r1.getWidth()     // Catch: android.os.RemoteException -> L40
            goto L45
        L40:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzbad.c(r0, r1)
            r1 = -1
        L45:
            r3.f12680e = r1
            com.google.android.gms.internal.ads.zzaei r1 = r3.a     // Catch: android.os.RemoteException -> L4e
            int r4 = r1.getHeight()     // Catch: android.os.RemoteException -> L4e
            goto L52
        L4e:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzbad.c(r0, r1)
        L52:
            r3.f12681f = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzael.<init>(com.google.android.gms.internal.ads.zzaei):void");
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f12677b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int getHeight() {
        return this.f12681f;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.f12679d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.f12678c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int getWidth() {
        return this.f12680e;
    }
}
