package com.google.android.gms.common.util;

import c.e.a;
import c.e.b;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@KeepForSdk
/* loaded from: classes2.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static <K, V> Map<K, V> a(K k2, V v, K k3, V v2, K k4, V v3) {
        Map f2 = f(3, false);
        f2.put(k2, v);
        f2.put(k3, v2);
        f2.put(k4, v3);
        return Collections.unmodifiableMap(f2);
    }

    @KeepForSdk
    public static <K, V> Map<K, V> b(K[] kArr, V[] vArr) {
        if (kArr.length == vArr.length) {
            int length = kArr.length;
            if (length == 0) {
                return Collections.emptyMap();
            }
            if (length != 1) {
                Map f2 = f(kArr.length, false);
                for (int i2 = 0; i2 < kArr.length; i2++) {
                    f2.put(kArr[i2], vArr[i2]);
                }
                return Collections.unmodifiableMap(f2);
            }
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        int length2 = kArr.length;
        int length3 = vArr.length;
        StringBuilder sb = new StringBuilder(66);
        sb.append("Key and values array lengths not equal: ");
        sb.append(length2);
        sb.append(" != ");
        sb.append(length3);
        throw new IllegalArgumentException(sb.toString());
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> c(T t, T t2, T t3) {
        Set e2 = e(3, false);
        e2.add(t);
        e2.add(t2);
        e2.add(t3);
        return Collections.unmodifiableSet(e2);
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> d(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            Set e2 = e(2, false);
            e2.add(t);
            e2.add(t2);
            return Collections.unmodifiableSet(e2);
        }
        if (length == 3) {
            return c(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set e3 = e(tArr.length, false);
            Collections.addAll(e3, tArr);
            return Collections.unmodifiableSet(e3);
        }
        T t3 = tArr[0];
        T t4 = tArr[1];
        T t5 = tArr[2];
        T t6 = tArr[3];
        Set e4 = e(4, false);
        e4.add(t3);
        e4.add(t4);
        e4.add(t5);
        e4.add(t6);
        return Collections.unmodifiableSet(e4);
    }

    private static <T> Set<T> e(int i2, boolean z) {
        float f2 = z ? 0.75f : 1.0f;
        if (i2 <= (z ? 128 : 256)) {
            return new b(i2);
        }
        return new HashSet(i2, f2);
    }

    private static <K, V> Map<K, V> f(int i2, boolean z) {
        if (i2 <= 256) {
            return new a(i2);
        }
        return new HashMap(i2, 1.0f);
    }
}
