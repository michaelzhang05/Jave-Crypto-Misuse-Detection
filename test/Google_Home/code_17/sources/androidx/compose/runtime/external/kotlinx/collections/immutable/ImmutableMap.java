package androidx.compose.runtime.external.kotlinx.collections.immutable;

import b6.InterfaceC1985a;
import java.util.Map;

/* loaded from: classes.dex */
public interface ImmutableMap<K, V> extends Map<K, V>, InterfaceC1985a {
    ImmutableSet<Map.Entry<K, V>> getEntries();

    ImmutableSet<K> getKeys();

    ImmutableCollection<V> getValues();
}
