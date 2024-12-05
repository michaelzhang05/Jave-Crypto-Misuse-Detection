package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.i6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2152i6 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f16672a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16673b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f16674c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ Z5 f16675d;

    private final Iterator a() {
        Map map;
        if (this.f16674c == null) {
            map = this.f16675d.f16538c;
            this.f16674c = map.entrySet().iterator();
        }
        return this.f16674c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i8;
        Map map;
        int i9 = this.f16672a + 1;
        i8 = this.f16675d.f16537b;
        if (i9 >= i8) {
            map = this.f16675d.f16538c;
            if (map.isEmpty() || !a().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i8;
        Object[] objArr;
        this.f16673b = true;
        int i9 = this.f16672a + 1;
        this.f16672a = i9;
        i8 = this.f16675d.f16537b;
        if (i9 < i8) {
            objArr = this.f16675d.f16536a;
            return (C2122f6) objArr[this.f16672a];
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i8;
        if (this.f16673b) {
            this.f16673b = false;
            this.f16675d.r();
            int i9 = this.f16672a;
            i8 = this.f16675d.f16537b;
            if (i9 < i8) {
                Z5 z52 = this.f16675d;
                int i10 = this.f16672a;
                this.f16672a = i10 - 1;
                z52.i(i10);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private C2152i6(Z5 z52) {
        this.f16675d = z52;
        this.f16672a = -1;
    }
}
