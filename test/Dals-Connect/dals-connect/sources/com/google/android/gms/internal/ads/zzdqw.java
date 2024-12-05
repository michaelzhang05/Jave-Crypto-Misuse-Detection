package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzdqw extends AbstractList<String> implements zzdot, RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    private final zzdot f14880f;

    public zzdqw(zzdot zzdotVar) {
        this.f14880f = zzdotVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final Object I(int i2) {
        return this.f14880f.I(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final List<?> c() {
        return this.f14880f.c();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        return (String) this.f14880f.get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new gx(this);
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final zzdot j() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i2) {
        return new fx(this, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14880f.size();
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final void u(zzdmr zzdmrVar) {
        throw new UnsupportedOperationException();
    }
}
