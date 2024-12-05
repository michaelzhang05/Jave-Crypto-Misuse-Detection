package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentHashMapBuilderEntries<K, V> extends AbstractMapBuilderEntries<Map.Entry<K, V>, K, V> {
    public static final int $stable = 8;
    private final PersistentHashMapBuilder<K, V> builder;

    public PersistentHashMapBuilderEntries(PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        this.builder = persistentHashMapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.builder.clear();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries
    public boolean containsEntry(Map.Entry<? extends K, ? extends V> entry) {
        V v8 = this.builder.get(entry.getKey());
        if (v8 != null) {
            return AbstractC3255y.d(v8, entry.getValue());
        }
        if (entry.getValue() == null && this.builder.containsKey(entry.getKey())) {
            return true;
        }
        return false;
    }

    @Override // P5.AbstractC1367h
    public int getSize() {
        return this.builder.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new PersistentHashMapBuilderEntriesIterator(this.builder);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries
    public boolean removeEntry(Map.Entry<? extends K, ? extends V> entry) {
        return this.builder.remove(entry.getKey(), entry.getValue());
    }

    @Override // P5.AbstractC1367h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException();
    }
}
