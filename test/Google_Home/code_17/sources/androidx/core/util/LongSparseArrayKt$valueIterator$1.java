package androidx.core.util;

import android.util.LongSparseArray;
import b6.InterfaceC1985a;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes3.dex */
public final class LongSparseArrayKt$valueIterator$1<T> implements Iterator<T>, InterfaceC1985a {
    final /* synthetic */ LongSparseArray<T> $this_valueIterator;
    private int index;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LongSparseArrayKt$valueIterator$1(LongSparseArray<T> longSparseArray) {
        this.$this_valueIterator = longSparseArray;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.$this_valueIterator.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        LongSparseArray<T> longSparseArray = this.$this_valueIterator;
        int i8 = this.index;
        this.index = i8 + 1;
        return longSparseArray.valueAt(i8);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i8) {
        this.index = i8;
    }
}
