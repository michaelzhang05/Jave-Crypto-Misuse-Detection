package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.t5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2105t5 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f15903a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2113u5 f15904b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2105t5(C2113u5 c2113u5) {
        G4 g42;
        this.f15904b = c2113u5;
        g42 = c2113u5.f15914a;
        this.f15903a = g42.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15903a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f15903a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
