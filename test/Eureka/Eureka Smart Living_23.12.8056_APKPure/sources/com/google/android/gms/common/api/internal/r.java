package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.c;
import t1.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r extends c {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ c.a f4634d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(c.a aVar, s1.c[] cVarArr, boolean z5, int i6) {
        super(cVarArr, z5, i6);
        this.f4634d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.c
    public final void b(a.b bVar, l2.j jVar) {
        u1.i iVar;
        iVar = this.f4634d.f4586a;
        iVar.accept(bVar, jVar);
    }
}
