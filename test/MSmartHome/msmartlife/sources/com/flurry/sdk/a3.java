package com.flurry.sdk;

import com.flurry.sdk.x2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a3 extends c3 {
    protected List<j3> s;
    protected i3 t;

    /* loaded from: classes2.dex */
    final class a extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ u6 f9735h;

        a(u6 u6Var) {
            this.f9735h = u6Var;
        }

        @Override // com.flurry.sdk.f2
        public final void a() {
            a3.y(a3.this, this.f9735h);
            a3.this.w(this.f9735h);
        }
    }

    /* loaded from: classes2.dex */
    final class b implements i3 {
        b() {
        }

        @Override // com.flurry.sdk.i3
        public final void a(Runnable runnable) {
            a3.this.m(runnable);
        }

        @Override // com.flurry.sdk.i3
        public final void b(u6 u6Var) {
            a3.this.j(u6Var);
        }

        @Override // com.flurry.sdk.i3
        public final void c(u6 u6Var) {
            a3.this.w(u6Var);
        }
    }

    /* loaded from: classes2.dex */
    final class c extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ u6 f9737h;

        c(u6 u6Var) {
            this.f9737h = u6Var;
        }

        @Override // com.flurry.sdk.f2
        public final void a() throws Exception {
            a3.y(a3.this, this.f9737h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a3(x2 x2Var) {
        super("PolicyModule", x2Var);
        this.t = new b();
        ArrayList arrayList = new ArrayList();
        this.s = arrayList;
        arrayList.add(new k3(this.t));
    }

    static /* synthetic */ void y(a3 a3Var, u6 u6Var) {
        Iterator<j3> it = a3Var.s.iterator();
        while (it.hasNext()) {
            it.next().b(u6Var);
        }
    }

    @Override // com.flurry.sdk.c3
    public final void b(u6 u6Var) {
        m(new a(u6Var));
    }

    @Override // com.flurry.sdk.c3, com.flurry.sdk.x2
    public final x2.a c(u6 u6Var) {
        m(new c(u6Var));
        return super.c(u6Var);
    }
}
