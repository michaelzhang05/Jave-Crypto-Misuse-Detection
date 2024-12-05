package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import androidx.collection.LruCache;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class J2 extends LruCache {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ E2 f17226a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J2(E2 e22, int i8) {
        super(20);
        this.f17226a = e22;
    }

    @Override // androidx.collection.LruCache
    protected final /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        AbstractC1400p.f(str);
        return E2.z(this.f17226a, str);
    }
}
