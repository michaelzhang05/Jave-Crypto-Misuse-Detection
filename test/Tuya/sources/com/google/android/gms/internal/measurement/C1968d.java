package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1968d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f15684a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f15685b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1968d(C1986f c1986f, Iterator it, Iterator it2) {
        this.f15684a = it;
        this.f15685b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15684a.hasNext()) {
            return true;
        }
        return this.f15685b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f15684a.hasNext()) {
            return new C2115v(((Integer) this.f15684a.next()).toString());
        }
        if (this.f15685b.hasNext()) {
            return new C2115v((String) this.f15685b.next());
        }
        throw new NoSuchElementException();
    }
}
