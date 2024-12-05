package androidx.datastore.preferences.core;

import M5.AbstractC1246t;
import androidx.annotation.RestrictTo;
import i6.C2812b0;
import i6.I;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class Actual_jvmKt {
    public static final <T> Set<T> immutableCopyOfSet(Set<? extends T> set) {
        AbstractC3159y.i(set, "set");
        Set<T> unmodifiableSet = DesugarCollections.unmodifiableSet(AbstractC1246t.b1(set));
        AbstractC3159y.h(unmodifiableSet, "unmodifiableSet(set.toSet())");
        return unmodifiableSet;
    }

    public static final <K, V> Map<K, V> immutableMap(Map<K, ? extends V> map) {
        AbstractC3159y.i(map, "map");
        Map<K, V> unmodifiableMap = DesugarCollections.unmodifiableMap(map);
        AbstractC3159y.h(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public static final I ioDispatcher() {
        return C2812b0.b();
    }
}
