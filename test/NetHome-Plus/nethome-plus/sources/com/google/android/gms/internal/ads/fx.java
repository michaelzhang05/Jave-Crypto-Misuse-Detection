package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* loaded from: classes2.dex */
final class fx implements ListIterator<String> {

    /* renamed from: f, reason: collision with root package name */
    private ListIterator<String> f11439f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f11440g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zzdqw f11441h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fx(zzdqw zzdqwVar, int i2) {
        zzdot zzdotVar;
        this.f11441h = zzdqwVar;
        this.f11440g = i2;
        zzdotVar = zzdqwVar.f14880f;
        this.f11439f = zzdotVar.listIterator(i2);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f11439f.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f11439f.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f11439f.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f11439f.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f11439f.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f11439f.previousIndex();
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
