package androidx.collection;

import L5.r;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class ArrayMapKt {
    public static final <K, V> ArrayMap<K, V> arrayMapOf() {
        return new ArrayMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> ArrayMap<K, V> arrayMapOf(r... pairs) {
        AbstractC3159y.i(pairs, "pairs");
        ArrayMap<K, V> arrayMap = (ArrayMap<K, V>) new ArrayMap(pairs.length);
        for (r rVar : pairs) {
            arrayMap.put(rVar.c(), rVar.d());
        }
        return arrayMap;
    }
}
