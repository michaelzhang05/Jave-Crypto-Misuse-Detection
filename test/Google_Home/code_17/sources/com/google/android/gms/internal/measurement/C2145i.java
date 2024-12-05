package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2145i implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f16661a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2125g f16662b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2145i(C2125g c2125g) {
        this.f16662b = c2125g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f16661a < this.f16662b.m()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f16661a < this.f16662b.m()) {
            C2125g c2125g = this.f16662b;
            int i8 = this.f16661a;
            this.f16661a = i8 + 1;
            return c2125g.e(i8);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.f16661a);
    }
}
