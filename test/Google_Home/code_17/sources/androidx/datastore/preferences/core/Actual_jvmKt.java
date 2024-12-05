package androidx.datastore.preferences.core;

import P5.AbstractC1378t;
import androidx.annotation.RestrictTo;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;
import l6.C3347b0;
import l6.I;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class Actual_jvmKt {
    public static final <T> Set<T> immutableCopyOfSet(Set<? extends T> set) {
        AbstractC3255y.i(set, "set");
        Set<T> unmodifiableSet = DesugarCollections.unmodifiableSet(AbstractC1378t.b1(set));
        AbstractC3255y.h(unmodifiableSet, "unmodifiableSet(set.toSet())");
        return unmodifiableSet;
    }

    public static final <K, V> Map<K, V> immutableMap(Map<K, ? extends V> map) {
        AbstractC3255y.i(map, "map");
        Map<K, V> unmodifiableMap = DesugarCollections.unmodifiableMap(map);
        AbstractC3255y.h(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public static final I ioDispatcher() {
        return C3347b0.b();
    }
}
