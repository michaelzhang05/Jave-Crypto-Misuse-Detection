package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.Task;
import java.util.Map;
import q0.C3826j;
import q0.InterfaceC3821e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class f implements InterfaceC3821e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3826j f15957a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f15958b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(g gVar, C3826j c3826j) {
        this.f15958b = gVar;
        this.f15957a = c3826j;
    }

    @Override // q0.InterfaceC3821e
    public final void a(Task task) {
        Map map;
        map = this.f15958b.f15960b;
        map.remove(this.f15957a);
    }
}
