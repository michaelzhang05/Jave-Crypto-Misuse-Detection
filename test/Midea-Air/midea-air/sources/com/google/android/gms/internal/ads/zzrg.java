package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzrg extends zzrj {

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f15473f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private final zzrn f15474g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<zzrh> f15475h;

    public zzrg() {
        this(null);
    }

    private static boolean g(zzlh zzlhVar, String str) {
        return str != null && TextUtils.equals(str, zzsy.l(zzlhVar.D));
    }

    private static int h(int i2, int i3) {
        if (i2 == -1) {
            return i3 == -1 ? 0 : -1;
        }
        if (i3 == -1) {
            return 1;
        }
        return i2 - i3;
    }

    private static boolean i(int i2, boolean z) {
        int i3 = i2 & 3;
        if (i3 != 3) {
            return z && i3 == 2;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0176, code lost:
    
        if (r10 <= r15) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a0  */
    @Override // com.google.android.gms.internal.ads.zzrj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.google.android.gms.internal.ads.zzrm[] e(com.google.android.gms.internal.ads.zzlp[] r34, com.google.android.gms.internal.ads.zzrb[] r35, int[][][] r36) throws com.google.android.gms.internal.ads.zzku {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrg.e(com.google.android.gms.internal.ads.zzlp[], com.google.android.gms.internal.ads.zzrb[], int[][][]):com.google.android.gms.internal.ads.zzrm[]");
    }

    private zzrg(zzrn zzrnVar) {
        this.f15474g = null;
        this.f15475h = new AtomicReference<>(new zzrh());
    }
}
