package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2115f implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Iterator f16623a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Iterator f16624b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2115f(C2125g c2125g, Iterator it, Iterator it2) {
        this.f16623a = it;
        this.f16624b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f16623a.hasNext()) {
            return true;
        }
        return this.f16624b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f16623a.hasNext()) {
            return new C2254u(((Integer) this.f16623a.next()).toString());
        }
        if (this.f16624b.hasNext()) {
            return new C2254u((String) this.f16624b.next());
        }
        throw new NoSuchElementException();
    }
}
