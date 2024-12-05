package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class N3 extends P3 {

    /* renamed from: a, reason: collision with root package name */
    private int f15400a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f15401b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ X3 f15402c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N3(X3 x32) {
        this.f15402c = x32;
        this.f15401b = x32.g();
    }

    @Override // com.google.android.gms.internal.measurement.R3
    public final byte a() {
        int i8 = this.f15400a;
        if (i8 < this.f15401b) {
            this.f15400a = i8 + 1;
            return this.f15402c.d(i8);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15400a < this.f15401b;
    }
}
