package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import P5.AbstractC1360a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentOrderedMapValues<K, V> extends AbstractC1360a implements ImmutableCollection<V> {
    public static final int $stable = 8;
    private final PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapValues(PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.map = persistentOrderedMap;
    }

    @Override // P5.AbstractC1360a, java.util.Collection
    public boolean contains(Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // P5.AbstractC1360a
    public int getSize() {
        return this.map.size();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new PersistentOrderedMapValuesIterator(this.map);
    }
}
