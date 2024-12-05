package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.NoSuchElementException;

@KeepForSdk
/* loaded from: classes2.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {

    /* renamed from: h, reason: collision with root package name */
    private T f10795h;

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public T next() {
        if (hasNext()) {
            int i2 = this.f10777g + 1;
            this.f10777g = i2;
            if (i2 == 0) {
                T t = this.f10776f.get(0);
                this.f10795h = t;
                if (!(t instanceof DataBufferRef)) {
                    String valueOf = String.valueOf(this.f10795h.getClass());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 44);
                    sb.append("DataBuffer reference of type ");
                    sb.append(valueOf);
                    sb.append(" is not movable");
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                ((DataBufferRef) this.f10795h).a(i2);
            }
            return this.f10795h;
        }
        int i3 = this.f10777g;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Cannot advance the iterator beyond ");
        sb2.append(i3);
        throw new NoSuchElementException(sb2.toString());
    }
}
