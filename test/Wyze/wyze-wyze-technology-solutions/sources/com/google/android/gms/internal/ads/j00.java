package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class j00 implements g00 {
    private final /* synthetic */ zzjg a;

    private j00(zzjg zzjgVar) {
        this.a = zzjgVar;
    }

    @Override // com.google.android.gms.internal.ads.g00
    public final void b(int i2, long j2) throws zzhl {
        this.a.j(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.g00
    public final void d(int i2, double d2) {
        this.a.b(i2, d2);
    }

    @Override // com.google.android.gms.internal.ads.g00
    public final void e(int i2, long j2, long j3) throws zzhl {
        this.a.i(i2, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.g00
    public final void f(int i2, String str) throws zzhl {
        this.a.f(i2, str);
    }

    @Override // com.google.android.gms.internal.ads.g00
    public final int g(int i2) {
        switch (i2) {
            case 131:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 20531:
            case 21420:
            case 22186:
            case 22203:
            case 2807729:
                return 2;
            case 134:
            case 17026:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20533:
            case 25152:
            case 28032:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 18402:
            case 21419:
            case 25506:
                return 4;
            case 181:
            case 17545:
                return 5;
            default:
                return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.g00
    public final void h(int i2) throws zzhl {
        this.a.m(i2);
    }

    @Override // com.google.android.gms.internal.ads.g00
    public final void i(int i2, int i3, zzie zzieVar) throws IOException, InterruptedException {
        this.a.c(i2, i3, zzieVar);
    }
}
