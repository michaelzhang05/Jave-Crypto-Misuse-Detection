package com.google.android.gms.common.api.internal;

import O.g;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e implements g.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f15955a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f15956b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(g gVar, BasePendingResult basePendingResult) {
        this.f15956b = gVar;
        this.f15955a = basePendingResult;
    }

    @Override // O.g.a
    public final void a(Status status) {
        Map map;
        map = this.f15956b.f15959a;
        map.remove(this.f15955a);
    }
}
