package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class sw extends yw {

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ pw f12175g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private sw(pw pwVar) {
        super(pwVar, null);
        this.f12175g = pwVar;
    }

    @Override // com.google.android.gms.internal.ads.yw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new rw(this.f12175g, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ sw(pw pwVar, qw qwVar) {
        this(pwVar);
    }
}
