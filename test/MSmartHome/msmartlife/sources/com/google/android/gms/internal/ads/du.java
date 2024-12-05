package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class du extends gu {

    /* renamed from: f, reason: collision with root package name */
    private int f11321f = 0;

    /* renamed from: g, reason: collision with root package name */
    private final int f11322g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zzdmr f11323h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public du(zzdmr zzdmrVar) {
        this.f11323h = zzdmrVar;
        this.f11322g = zzdmrVar.size();
    }

    @Override // com.google.android.gms.internal.ads.zzdmy
    public final byte b() {
        int i2 = this.f11321f;
        if (i2 < this.f11322g) {
            this.f11321f = i2 + 1;
            return this.f11323h.P(i2);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11321f < this.f11322g;
    }
}
