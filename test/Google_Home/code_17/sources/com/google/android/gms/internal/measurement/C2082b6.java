package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2082b6 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f16576a;

    /* renamed from: b, reason: collision with root package name */
    private Iterator f16577b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Z5 f16578c;

    private final Iterator a() {
        Map map;
        if (this.f16577b == null) {
            map = this.f16578c.f16541f;
            this.f16577b = map.entrySet().iterator();
        }
        return this.f16577b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i8;
        int i9 = this.f16576a;
        if (i9 > 0) {
            i8 = this.f16578c.f16537b;
            if (i9 <= i8) {
                return true;
            }
        }
        if (a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object[] objArr;
        if (!a().hasNext()) {
            objArr = this.f16578c.f16536a;
            int i8 = this.f16576a - 1;
            this.f16576a = i8;
            return (C2122f6) objArr[i8];
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private C2082b6(Z5 z52) {
        int i8;
        this.f16578c = z52;
        i8 = z52.f16537b;
        this.f16576a = i8;
    }
}
