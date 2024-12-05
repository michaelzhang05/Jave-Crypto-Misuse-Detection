package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import P5.AbstractC1367h;
import androidx.compose.runtime.internal.StabilityInferred;
import b6.InterfaceC1989e;
import java.util.Iterator;
import java.util.Set;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentHashMapBuilderKeys<K, V> extends AbstractC1367h implements Set<K>, InterfaceC1989e {
    public static final int $stable = 8;
    private final PersistentHashMapBuilder<K, V> builder;

    public PersistentHashMapBuilderKeys(PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        this.builder = persistentHashMapBuilder;
    }

    @Override // P5.AbstractC1367h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(K k8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.builder.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.builder.containsKey(obj);
    }

    @Override // P5.AbstractC1367h
    public int getSize() {
        return this.builder.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new PersistentHashMapBuilderKeysIterator(this.builder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (this.builder.containsKey(obj)) {
            this.builder.remove(obj);
            return true;
        }
        return false;
    }
}
