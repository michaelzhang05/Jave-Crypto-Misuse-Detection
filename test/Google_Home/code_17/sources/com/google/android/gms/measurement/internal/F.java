package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class F implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private Iterator f17025a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C f17026b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(C c8) {
        Bundle bundle;
        this.f17026b = c8;
        bundle = c8.f16984a;
        this.f17025a = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17025a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f17025a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
