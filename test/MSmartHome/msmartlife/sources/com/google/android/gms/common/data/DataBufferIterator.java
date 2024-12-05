package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

@KeepForSdk
/* loaded from: classes2.dex */
public class DataBufferIterator<T> implements Iterator<T> {

    /* renamed from: f, reason: collision with root package name */
    protected final DataBuffer<T> f10776f;

    /* renamed from: g, reason: collision with root package name */
    protected int f10777g = -1;

    public DataBufferIterator(DataBuffer<T> dataBuffer) {
        this.f10776f = (DataBuffer) Preconditions.j(dataBuffer);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f10777g < this.f10776f.getCount() - 1;
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            DataBuffer<T> dataBuffer = this.f10776f;
            int i2 = this.f10777g + 1;
            this.f10777g = i2;
            return dataBuffer.get(i2);
        }
        int i3 = this.f10777g;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i3);
        throw new NoSuchElementException(sb.toString());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
