package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public abstract class A3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(Object obj, int i8) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] b(Object[] objArr, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            a(objArr[i9], i9);
        }
        return objArr;
    }
}
