package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import androidx.collection.LruCache;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class P1 extends LruCache {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ S1 f16250a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P1(S1 s12, int i8) {
        super(20);
        this.f16250a = s12;
    }

    @Override // androidx.collection.LruCache
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        AbstractC1319p.f(str);
        return S1.s(this.f16250a, str);
    }
}
