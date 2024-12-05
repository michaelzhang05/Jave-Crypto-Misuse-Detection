package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes2.dex */
public final class zzsl {
    private static final byte[] a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f15537b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f15538c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    private static int a(zzss zzssVar) {
        int a2 = zzssVar.a(5);
        return a2 == 31 ? zzssVar.a(6) + 32 : a2;
    }

    public static byte[] b(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = a;
        byte[] bArr3 = new byte[bArr2.length + i3];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i2, bArr3, bArr2.length, i3);
        return bArr3;
    }

    private static int c(zzss zzssVar) {
        int a2 = zzssVar.a(4);
        if (a2 == 15) {
            return zzssVar.a(24);
        }
        zzsk.a(a2 < 13);
        return f15537b[a2];
    }

    public static Pair<Integer, Integer> d(byte[] bArr) {
        zzss zzssVar = new zzss(bArr);
        int a2 = a(zzssVar);
        int c2 = c(zzssVar);
        int a3 = zzssVar.a(4);
        if (a2 == 5 || a2 == 29) {
            c2 = c(zzssVar);
            if (a(zzssVar) == 22) {
                a3 = zzssVar.a(4);
            }
        }
        int i2 = f15538c[a3];
        zzsk.a(i2 != -1);
        return Pair.create(Integer.valueOf(c2), Integer.valueOf(i2));
    }
}
