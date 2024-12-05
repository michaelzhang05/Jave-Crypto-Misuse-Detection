package com.google.firebase;

import D0.C1053c;
import D0.F;
import D0.InterfaceC1055e;
import D0.h;
import D0.r;
import P5.AbstractC1378t;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3375p0;
import l6.I;

@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* loaded from: classes.dex */
    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18212a = new a();

        @Override // D0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(InterfaceC1055e interfaceC1055e) {
            Object b8 = interfaceC1055e.b(F.a(C0.a.class, Executor.class));
            AbstractC3255y.h(b8, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC3375p0.a((Executor) b8);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final b f18213a = new b();

        @Override // D0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(InterfaceC1055e interfaceC1055e) {
            Object b8 = interfaceC1055e.b(F.a(C0.c.class, Executor.class));
            AbstractC3255y.h(b8, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC3375p0.a((Executor) b8);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final c f18214a = new c();

        @Override // D0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(InterfaceC1055e interfaceC1055e) {
            Object b8 = interfaceC1055e.b(F.a(C0.b.class, Executor.class));
            AbstractC3255y.h(b8, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC3375p0.a((Executor) b8);
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final d f18215a = new d();

        @Override // D0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(InterfaceC1055e interfaceC1055e) {
            Object b8 = interfaceC1055e.b(F.a(C0.d.class, Executor.class));
            AbstractC3255y.h(b8, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC3375p0.a((Executor) b8);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1053c> getComponents() {
        C1053c d8 = C1053c.c(F.a(C0.a.class, I.class)).b(r.k(F.a(C0.a.class, Executor.class))).f(a.f18212a).d();
        AbstractC3255y.h(d8, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C1053c d9 = C1053c.c(F.a(C0.c.class, I.class)).b(r.k(F.a(C0.c.class, Executor.class))).f(b.f18213a).d();
        AbstractC3255y.h(d9, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C1053c d10 = C1053c.c(F.a(C0.b.class, I.class)).b(r.k(F.a(C0.b.class, Executor.class))).f(c.f18214a).d();
        AbstractC3255y.h(d10, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C1053c d11 = C1053c.c(F.a(C0.d.class, I.class)).b(r.k(F.a(C0.d.class, Executor.class))).f(d.f18215a).d();
        AbstractC3255y.h(d11, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return AbstractC1378t.p(d8, d9, d10, d11);
    }
}
