package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.d6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2102d6 extends C2172k6 {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Z5 f16605b;

    @Override // com.google.android.gms.internal.measurement.C2172k6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2082b6(this.f16605b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C2102d6(Z5 z52) {
        super(z52);
        this.f16605b = z52;
    }
}
