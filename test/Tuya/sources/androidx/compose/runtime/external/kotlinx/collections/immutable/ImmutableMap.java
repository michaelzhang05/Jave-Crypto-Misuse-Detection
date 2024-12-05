package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Map;

/* loaded from: classes.dex */
public interface ImmutableMap<K, V> extends Map<K, V>, Y5.a {
    ImmutableSet<Map.Entry<K, V>> getEntries();

    ImmutableSet<K> getKeys();

    ImmutableCollection<V> getValues();
}
