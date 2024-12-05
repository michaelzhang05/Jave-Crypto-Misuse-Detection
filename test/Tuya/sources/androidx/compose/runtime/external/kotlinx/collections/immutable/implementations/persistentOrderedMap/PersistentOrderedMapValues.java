package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import M5.AbstractC1228a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentOrderedMapValues<K, V> extends AbstractC1228a implements ImmutableCollection<V> {
    public static final int $stable = 8;
    private final PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapValues(PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.map = persistentOrderedMap;
    }

    @Override // M5.AbstractC1228a, java.util.Collection
    public boolean contains(Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // M5.AbstractC1228a
    public int getSize() {
        return this.map.size();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new PersistentOrderedMapValuesIterator(this.map);
    }
}
