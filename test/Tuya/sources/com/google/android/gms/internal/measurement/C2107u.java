package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2107u implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f15907a = 0;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2115v f15908b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2107u(C2115v c2115v) {
        this.f15908b = c2115v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i8 = this.f15907a;
        str = this.f15908b.f15916a;
        return i8 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        String str2;
        int i8 = this.f15907a;
        C2115v c2115v = this.f15908b;
        str = c2115v.f15916a;
        if (i8 < str.length()) {
            str2 = c2115v.f15916a;
            this.f15907a = i8 + 1;
            return new C2115v(String.valueOf(str2.charAt(i8)));
        }
        throw new NoSuchElementException();
    }
}
