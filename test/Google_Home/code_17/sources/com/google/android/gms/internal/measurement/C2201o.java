package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2201o implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Iterator f16742a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2201o(Iterator it) {
        this.f16742a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16742a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return new C2254u((String) this.f16742a.next());
    }
}
