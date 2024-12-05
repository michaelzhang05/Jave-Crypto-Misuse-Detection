package com.google.android.gms.common.data;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class AbstractDataBuffer<T> implements DataBuffer<T> {

    /* renamed from: f, reason: collision with root package name */
    protected final DataHolder f10769f;

    @Override // com.google.android.gms.common.api.Releasable
    public void a() {
        DataHolder dataHolder = this.f10769f;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public abstract T get(int i2);

    @Override // com.google.android.gms.common.data.DataBuffer
    public int getCount() {
        DataHolder dataHolder = this.f10769f;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new DataBufferIterator(this);
    }
}
