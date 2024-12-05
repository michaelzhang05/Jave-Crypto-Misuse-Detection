package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

@TargetApi(17)
/* loaded from: classes2.dex */
public final class zztd extends Surface {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f15580f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f15581g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f15582h;

    /* renamed from: i, reason: collision with root package name */
    private final s30 f15583i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15584j;

    private zztd(s30 s30Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f15583i = s30Var;
        this.f15582h = z;
    }

    public static zztd a(Context context, boolean z) {
        if (zzsy.a >= 17) {
            zzsk.e(!z || b(context));
            return new s30().b(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean b(android.content.Context r6) {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.zztd> r0 = com.google.android.gms.internal.ads.zztd.class
            monitor-enter(r0)
            boolean r1 = com.google.android.gms.internal.ads.zztd.f15581g     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L4f
            int r1 = com.google.android.gms.internal.ads.zzsy.a     // Catch: java.lang.Throwable -> L53
            r2 = 17
            r3 = 1
            if (r1 < r2) goto L4d
            r2 = 0
            android.opengl.EGLDisplay r4 = android.opengl.EGL14.eglGetDisplay(r2)     // Catch: java.lang.Throwable -> L53
            r5 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r4 = android.opengl.EGL14.eglQueryString(r4, r5)     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L4b
            java.lang.String r5 = "EGL_EXT_protected_content"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L4b
            r4 = 24
            if (r1 != r4) goto L47
            java.lang.String r1 = com.google.android.gms.internal.ads.zzsy.f15565d     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = "SM-G950"
            boolean r4 = r1.startsWith(r4)     // Catch: java.lang.Throwable -> L53
            if (r4 != 0) goto L39
            java.lang.String r4 = "SM-G955"
            boolean r1 = r1.startsWith(r4)     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L47
        L39:
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = "android.hardware.vr.high_performance"
            boolean r6 = r6.hasSystemFeature(r1)     // Catch: java.lang.Throwable -> L53
            if (r6 != 0) goto L47
            r6 = 1
            goto L48
        L47:
            r6 = 0
        L48:
            if (r6 != 0) goto L4b
            r2 = 1
        L4b:
            com.google.android.gms.internal.ads.zztd.f15580f = r2     // Catch: java.lang.Throwable -> L53
        L4d:
            com.google.android.gms.internal.ads.zztd.f15581g = r3     // Catch: java.lang.Throwable -> L53
        L4f:
            boolean r6 = com.google.android.gms.internal.ads.zztd.f15580f     // Catch: java.lang.Throwable -> L53
            monitor-exit(r0)
            return r6
        L53:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztd.b(android.content.Context):boolean");
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f15583i) {
            if (!this.f15584j) {
                this.f15583i.a();
                this.f15584j = true;
            }
        }
    }
}
