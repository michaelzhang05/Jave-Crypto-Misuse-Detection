package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.WindowManager;

@TargetApi(16)
/* loaded from: classes2.dex */
public final class zztl {
    private final v30 a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15588b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15589c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15590d;

    /* renamed from: e, reason: collision with root package name */
    private long f15591e;

    /* renamed from: f, reason: collision with root package name */
    private long f15592f;

    /* renamed from: g, reason: collision with root package name */
    private long f15593g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15594h;

    /* renamed from: i, reason: collision with root package name */
    private long f15595i;

    /* renamed from: j, reason: collision with root package name */
    private long f15596j;

    /* renamed from: k, reason: collision with root package name */
    private long f15597k;

    public zztl() {
        this(-1.0d);
    }

    private final boolean d(long j2, long j3) {
        return Math.abs((j3 - this.f15595i) - (j2 - this.f15596j)) > 20000000;
    }

    public final void a() {
        if (this.f15588b) {
            this.a.c();
        }
    }

    public final void b() {
        this.f15594h = false;
        if (this.f15588b) {
            this.a.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(long r12, long r14) {
        /*
            r11 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            boolean r2 = r11.f15594h
            if (r2 == 0) goto L42
            long r2 = r11.f15591e
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L19
            long r2 = r11.f15597k
            r4 = 1
            long r2 = r2 + r4
            r11.f15597k = r2
            long r2 = r11.f15593g
            r11.f15592f = r2
        L19:
            long r2 = r11.f15597k
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L3a
            long r4 = r11.f15596j
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r11.f15592f
            long r2 = r2 + r4
            boolean r4 = r11.d(r2, r14)
            if (r4 == 0) goto L33
            r11.f15594h = r6
            goto L42
        L33:
            long r4 = r11.f15595i
            long r4 = r4 + r2
            long r6 = r11.f15596j
            long r4 = r4 - r6
            goto L44
        L3a:
            boolean r2 = r11.d(r0, r14)
            if (r2 == 0) goto L42
            r11.f15594h = r6
        L42:
            r4 = r14
            r2 = r0
        L44:
            boolean r6 = r11.f15594h
            r7 = 0
            if (r6 != 0) goto L53
            r11.f15596j = r0
            r11.f15595i = r14
            r11.f15597k = r7
            r14 = 1
            r11.f15594h = r14
        L53:
            r11.f15591e = r12
            r11.f15593g = r2
            com.google.android.gms.internal.ads.v30 r12 = r11.a
            if (r12 == 0) goto L86
            long r12 = r12.f12263g
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 != 0) goto L62
            goto L86
        L62:
            com.google.android.gms.internal.ads.v30 r12 = r11.a
            long r12 = r12.f12263g
            long r14 = r11.f15589c
            long r0 = r4 - r12
            long r0 = r0 / r14
            long r0 = r0 * r14
            long r12 = r12 + r0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L75
            long r14 = r12 - r14
            goto L79
        L75:
            long r14 = r14 + r12
            r9 = r12
            r12 = r14
            r14 = r9
        L79:
            long r0 = r12 - r4
            long r4 = r4 - r14
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L81
            goto L82
        L81:
            r12 = r14
        L82:
            long r14 = r11.f15590d
            long r12 = r12 - r14
            return r12
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztl.c(long, long):long");
    }

    public zztl(Context context) {
        this(((WindowManager) context.getSystemService("window")).getDefaultDisplay() != null ? r3.getDefaultDisplay().getRefreshRate() : -1.0d);
    }

    private zztl(double d2) {
        boolean z = d2 != -1.0d;
        this.f15588b = z;
        if (z) {
            this.a = v30.a();
            long j2 = (long) (1.0E9d / d2);
            this.f15589c = j2;
            this.f15590d = (j2 * 80) / 100;
            return;
        }
        this.a = null;
        this.f15589c = -1L;
        this.f15590d = -1L;
    }
}
