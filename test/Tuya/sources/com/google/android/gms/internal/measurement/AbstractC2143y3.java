package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.y3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2143y3 extends AbstractC2095s3 implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC2135x3 f15965b;

    static int l(int i8) {
        int max = Math.max(i8, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static AbstractC2143y3 q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[15];
        objArr2[0] = "_in";
        objArr2[1] = "_xa";
        objArr2[2] = "_xu";
        objArr2[3] = "_aq";
        objArr2[4] = "_aa";
        objArr2[5] = "_ai";
        System.arraycopy(objArr, 0, objArr2, 6, 9);
        return t(15, objArr2);
    }

    private static AbstractC2143y3 t(int i8, Object... objArr) {
        if (i8 != 0) {
            if (i8 != 1) {
                int l8 = l(i8);
                Object[] objArr2 = new Object[l8];
                int i9 = l8 - 1;
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < i8; i12++) {
                    Object obj = objArr[i12];
                    A3.a(obj, i12);
                    int hashCode = obj.hashCode();
                    int a8 = AbstractC2072p3.a(hashCode);
                    while (true) {
                        int i13 = a8 & i9;
                        Object obj2 = objArr2[i13];
                        if (obj2 == null) {
                            objArr[i11] = obj;
                            objArr2[i13] = obj;
                            i10 += hashCode;
                            i11++;
                            break;
                        }
                        if (!obj2.equals(obj)) {
                            a8++;
                        }
                    }
                }
                Arrays.fill(objArr, i11, i8, (Object) null);
                if (i11 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new D3(obj3);
                }
                if (l(i11) < l8 / 2) {
                    return t(i11, objArr);
                }
                if (i11 < 10) {
                    objArr = Arrays.copyOf(objArr, i11);
                }
                return new C3(objArr, i10, objArr2, i9, i11);
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new D3(obj4);
        }
        return C3.f15283i;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC2143y3) && r() && ((AbstractC2143y3) obj).r() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public abstract int hashCode();

    public final AbstractC2135x3 m() {
        AbstractC2135x3 abstractC2135x3 = this.f15965b;
        if (abstractC2135x3 == null) {
            AbstractC2135x3 p8 = p();
            this.f15965b = p8;
            return p8;
        }
        return abstractC2135x3;
    }

    AbstractC2135x3 p() {
        Object[] array = toArray();
        int i8 = AbstractC2135x3.f15956c;
        return AbstractC2135x3.m(array, array.length);
    }

    boolean r() {
        return false;
    }
}
