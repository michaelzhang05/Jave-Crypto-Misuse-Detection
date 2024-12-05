package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.r4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2232r4 extends AbstractC2250t4 {

    /* renamed from: a, reason: collision with root package name */
    private int f16795a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f16796b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ AbstractC2241s4 f16797c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2232r4(AbstractC2241s4 abstractC2241s4) {
        this.f16797c = abstractC2241s4;
        this.f16796b = abstractC2241s4.r();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f16795a < this.f16796b) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2295y4
    public final byte w() {
        int i8 = this.f16795a;
        if (i8 < this.f16796b) {
            this.f16795a = i8 + 1;
            return this.f16797c.q(i8);
        }
        throw new NoSuchElementException();
    }
}
