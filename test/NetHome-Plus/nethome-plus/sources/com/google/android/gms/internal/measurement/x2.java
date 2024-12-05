package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* loaded from: classes2.dex */
final class x2 implements ListIterator<String> {

    /* renamed from: f, reason: collision with root package name */
    private ListIterator<String> f16053f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f16054g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zzxg f16055h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x2(zzxg zzxgVar, int i2) {
        zzve zzveVar;
        this.f16055h = zzxgVar;
        this.f16054g = i2;
        zzveVar = zzxgVar.f16162f;
        this.f16053f = zzveVar.listIterator(i2);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f16053f.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f16053f.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f16053f.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f16053f.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f16053f.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f16053f.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
