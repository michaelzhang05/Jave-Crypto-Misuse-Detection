package com.google.android.gms.common.api.internal;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements l2.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l2.j f4590a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f4591b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(e eVar, l2.j jVar) {
        this.f4591b = eVar;
        this.f4590a = jVar;
    }

    @Override // l2.d
    public final void a(l2.i iVar) {
        Map map;
        map = this.f4591b.f4593b;
        map.remove(this.f4590a);
    }
}
