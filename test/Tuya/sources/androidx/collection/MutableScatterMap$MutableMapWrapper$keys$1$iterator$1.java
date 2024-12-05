package androidx.collection;

import f6.AbstractC2683j;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$keys$1$iterator$1<K> implements Iterator<K>, Y5.a {
    private int current = -1;
    private final Iterator<Integer> iterator;
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MutableScatterMap$MutableMapWrapper$keys$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
        this.iterator = AbstractC2683j.a(new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(mutableScatterMap, null));
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        int intValue = this.iterator.next().intValue();
        this.current = intValue;
        return (K) this.this$0.keys[intValue];
    }

    @Override // java.util.Iterator
    public void remove() {
        int i8 = this.current;
        if (i8 >= 0) {
            this.this$0.removeValueAt(i8);
            this.current = -1;
        }
    }
}
