package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzxg extends AbstractList<String> implements zzve, RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    private final zzve f16162f;

    public zzxg(zzve zzveVar) {
        this.f16162f = zzveVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzve
    public final Object g(int i2) {
        return this.f16162f.g(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        return (String) this.f16162f.get(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzve
    public final zzve h() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new y2(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i2) {
        return new x2(this, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzve
    public final List<?> m() {
        return this.f16162f.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16162f.size();
    }
}
