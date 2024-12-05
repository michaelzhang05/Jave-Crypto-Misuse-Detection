package androidx.compose.runtime.snapshots;

import b6.InterfaceC1989e;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3246o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class SnapshotMapSet<K, V, E> implements Set<E>, InterfaceC1989e {
    private final SnapshotStateMap<K, V> map;

    public SnapshotMapSet(SnapshotStateMap<K, V> snapshotStateMap) {
        this.map = snapshotStateMap;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.map.clear();
    }

    public final SnapshotStateMap<K, V> getMap() {
        return this.map;
    }

    public int getSize() {
        return this.map.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC3246o.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC3246o.b(this, tArr);
    }
}
