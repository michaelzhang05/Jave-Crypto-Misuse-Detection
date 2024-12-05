package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes2.dex */
final class jy<E> implements Iterator<E> {

    /* renamed from: f, reason: collision with root package name */
    private int f11669f = 0;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzdta f11670g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public jy(zzdta zzdtaVar) {
        this.f11670g = zzdtaVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11669f < this.f11670g.f14979g.size() || this.f11670g.f14980h.hasNext();
    }

    @Override // java.util.Iterator
    public final E next() {
        while (this.f11669f >= this.f11670g.f14979g.size()) {
            zzdta zzdtaVar = this.f11670g;
            zzdtaVar.f14979g.add(zzdtaVar.f14980h.next());
        }
        List<E> list = this.f11670g.f14979g;
        int i2 = this.f11669f;
        this.f11669f = i2 + 1;
        return list.get(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
