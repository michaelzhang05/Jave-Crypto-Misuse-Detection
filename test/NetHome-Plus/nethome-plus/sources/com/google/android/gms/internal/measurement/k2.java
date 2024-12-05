package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class k2 extends q2 {

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ h2 f15985g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private k2(h2 h2Var) {
        super(h2Var, null);
        this.f15985g = h2Var;
    }

    @Override // com.google.android.gms.internal.measurement.q2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new j2(this.f15985g, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ k2(h2 h2Var, i2 i2Var) {
        this(h2Var);
    }
}
