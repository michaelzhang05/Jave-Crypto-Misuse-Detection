package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.w6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2279w6 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(byte b8, byte b9, byte b10, byte b11, char[] cArr, int i8) {
        if (!e(b9) && (((b8 << 28) + (b9 + 112)) >> 30) == 0 && !e(b10) && !e(b11)) {
            int i9 = ((b8 & 7) << 18) | ((b9 & 63) << 12) | ((b10 & 63) << 6) | (b11 & 63);
            cArr[i8] = (char) ((i9 >>> 10) + 55232);
            cArr[i8 + 1] = (char) ((i9 & 1023) + 56320);
            return;
        }
        throw C2171k5.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(byte b8, byte b9, byte b10, char[] cArr, int i8) {
        if (!e(b9) && ((b8 != -32 || b9 >= -96) && ((b8 != -19 || b9 < -96) && !e(b10)))) {
            cArr[i8] = (char) (((b8 & 15) << 12) | ((b9 & 63) << 6) | (b10 & 63));
            return;
        }
        throw C2171k5.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(byte b8, byte b9, char[] cArr, int i8) {
        if (b8 >= -62 && !e(b9)) {
            cArr[i8] = (char) (((b8 & 31) << 6) | (b9 & 63));
            return;
        }
        throw C2171k5.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d(byte b8, char[] cArr, int i8) {
        cArr[i8] = (char) b8;
    }

    private static boolean e(byte b8) {
        return b8 > -65;
    }
}
