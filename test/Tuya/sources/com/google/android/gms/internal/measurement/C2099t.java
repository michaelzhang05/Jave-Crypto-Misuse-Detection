package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2099t implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f15896a = 0;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2115v f15897b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2099t(C2115v c2115v) {
        this.f15897b = c2115v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i8 = this.f15896a;
        str = this.f15897b.f15916a;
        return i8 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        int i8 = this.f15896a;
        str = this.f15897b.f15916a;
        if (i8 < str.length()) {
            this.f15896a = i8 + 1;
            return new C2115v(String.valueOf(i8));
        }
        throw new NoSuchElementException();
    }
}
