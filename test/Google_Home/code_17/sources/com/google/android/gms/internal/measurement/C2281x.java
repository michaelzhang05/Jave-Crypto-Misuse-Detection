package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2281x implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f16885a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2254u f16886b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2281x(C2254u c2254u) {
        this.f16886b = c2254u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i8 = this.f16885a;
        str = this.f16886b.f16852a;
        if (i8 < str.length()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        String str;
        int i8 = this.f16885a;
        str = this.f16886b.f16852a;
        if (i8 < str.length()) {
            int i9 = this.f16885a;
            this.f16885a = i9 + 1;
            return new C2254u(String.valueOf(i9));
        }
        throw new NoSuchElementException();
    }
}
