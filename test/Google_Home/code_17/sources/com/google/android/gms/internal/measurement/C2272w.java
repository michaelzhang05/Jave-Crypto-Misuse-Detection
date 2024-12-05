package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2272w implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f16874a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2254u f16875b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2272w(C2254u c2254u) {
        this.f16875b = c2254u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i8 = this.f16874a;
        str = this.f16875b.f16852a;
        if (i8 < str.length()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        String str;
        String str2;
        int i8 = this.f16874a;
        str = this.f16875b.f16852a;
        if (i8 < str.length()) {
            str2 = this.f16875b.f16852a;
            int i9 = this.f16874a;
            this.f16874a = i9 + 1;
            return new C2254u(String.valueOf(str2.charAt(i9)));
        }
        throw new NoSuchElementException();
    }
}
