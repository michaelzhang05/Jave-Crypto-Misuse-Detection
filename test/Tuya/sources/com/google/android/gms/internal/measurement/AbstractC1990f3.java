package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1990f3 {
    public static int a(int i8, int i9, String str) {
        String a8;
        if (i8 >= 0 && i8 < i9) {
            return i8;
        }
        if (i8 >= 0) {
            if (i9 < 0) {
                throw new IllegalArgumentException("negative size: " + i9);
            }
            a8 = AbstractC2008h3.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i8), Integer.valueOf(i9));
        } else {
            a8 = AbstractC2008h3.a("%s (%s) must not be negative", "index", Integer.valueOf(i8));
        }
        throw new IndexOutOfBoundsException(a8);
    }

    public static int b(int i8, int i9, String str) {
        if (i8 >= 0 && i8 <= i9) {
            return i8;
        }
        throw new IndexOutOfBoundsException(d(i8, i9, "index"));
    }

    public static void c(int i8, int i9, int i10) {
        String d8;
        if (i8 >= 0 && i9 >= i8 && i9 <= i10) {
            return;
        }
        if (i8 >= 0 && i8 <= i10) {
            if (i9 >= 0 && i9 <= i10) {
                d8 = AbstractC2008h3.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i8));
            } else {
                d8 = d(i9, i10, "end index");
            }
        } else {
            d8 = d(i8, i10, "start index");
        }
        throw new IndexOutOfBoundsException(d8);
    }

    private static String d(int i8, int i9, String str) {
        if (i8 < 0) {
            return AbstractC2008h3.a("%s (%s) must not be negative", str, Integer.valueOf(i8));
        }
        if (i9 >= 0) {
            return AbstractC2008h3.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IllegalArgumentException("negative size: " + i9);
    }
}
