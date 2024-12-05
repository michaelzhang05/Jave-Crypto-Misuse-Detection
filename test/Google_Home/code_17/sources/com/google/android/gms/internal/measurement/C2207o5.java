package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.o5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2207o5 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private Iterator f16758a;

    public C2207o5(Iterator it) {
        this.f16758a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16758a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f16758a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f16758a.remove();
    }
}
