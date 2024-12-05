package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2044m implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f15762a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2044m(Iterator it) {
        this.f15762a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15762a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C2115v((String) this.f15762a.next());
    }
}
