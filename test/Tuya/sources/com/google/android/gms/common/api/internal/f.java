package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.Task;
import java.util.Map;
import r0.C3679j;
import r0.InterfaceC3674e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class f implements InterfaceC3674e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3679j f15156a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f15157b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(g gVar, C3679j c3679j) {
        this.f15157b = gVar;
        this.f15156a = c3679j;
    }

    @Override // r0.InterfaceC3674e
    public final void a(Task task) {
        Map map;
        map = this.f15157b.f15159b;
        map.remove(this.f15156a);
    }
}
