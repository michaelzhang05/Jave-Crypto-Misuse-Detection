package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class y2 implements Iterator<String> {

    /* renamed from: f, reason: collision with root package name */
    private Iterator<String> f16061f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzxg f16062g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y2(zzxg zzxgVar) {
        zzve zzveVar;
        this.f16062g = zzxgVar;
        zzveVar = zzxgVar.f16162f;
        this.f16061f = zzveVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16061f.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f16061f.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
