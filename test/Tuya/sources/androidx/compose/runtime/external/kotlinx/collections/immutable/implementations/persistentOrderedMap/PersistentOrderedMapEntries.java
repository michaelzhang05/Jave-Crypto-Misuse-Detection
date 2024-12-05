package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import M5.AbstractC1236i;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentOrderedMapEntries<K, V> extends AbstractC1236i implements ImmutableSet<Map.Entry<? extends K, ? extends V>> {
    public static final int $stable = 8;
    private final PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapEntries(PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.map = persistentOrderedMap;
    }

    @Override // M5.AbstractC1228a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // M5.AbstractC1228a
    public int getSize() {
        return this.map.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new PersistentOrderedMapEntriesIterator(this.map);
    }

    public boolean contains(Map.Entry<? extends K, ? extends V> entry) {
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        V v8 = this.map.get(entry.getKey());
        return v8 != null ? AbstractC3159y.d(v8, entry.getValue()) : entry.getValue() == null && this.map.containsKey(entry.getKey());
    }
}
