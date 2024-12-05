package com.google.firebase.ktx;

import B0.C1062c;
import B0.F;
import B0.InterfaceC1064e;
import B0.h;
import B0.r;
import M5.AbstractC1246t;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import i6.AbstractC2840p0;
import i6.I;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3159y;

@Keep
/* loaded from: classes3.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* loaded from: classes3.dex */
    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final a f17293a = new a();

        @Override // B0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(InterfaceC1064e interfaceC1064e) {
            Object f8 = interfaceC1064e.f(F.a(A0.a.class, Executor.class));
            AbstractC3159y.h(f8, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC2840p0.a((Executor) f8);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final b f17294a = new b();

        @Override // B0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(InterfaceC1064e interfaceC1064e) {
            Object f8 = interfaceC1064e.f(F.a(A0.c.class, Executor.class));
            AbstractC3159y.h(f8, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC2840p0.a((Executor) f8);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final c f17295a = new c();

        @Override // B0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(InterfaceC1064e interfaceC1064e) {
            Object f8 = interfaceC1064e.f(F.a(A0.b.class, Executor.class));
            AbstractC3159y.h(f8, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC2840p0.a((Executor) f8);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final d f17296a = new d();

        @Override // B0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(InterfaceC1064e interfaceC1064e) {
            Object f8 = interfaceC1064e.f(F.a(A0.d.class, Executor.class));
            AbstractC3159y.h(f8, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC2840p0.a((Executor) f8);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1062c> getComponents() {
        C1062c b8 = h1.h.b("fire-core-ktx", "unspecified");
        C1062c d8 = C1062c.c(F.a(A0.a.class, I.class)).b(r.j(F.a(A0.a.class, Executor.class))).f(a.f17293a).d();
        AbstractC3159y.h(d8, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C1062c d9 = C1062c.c(F.a(A0.c.class, I.class)).b(r.j(F.a(A0.c.class, Executor.class))).f(b.f17294a).d();
        AbstractC3159y.h(d9, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C1062c d10 = C1062c.c(F.a(A0.b.class, I.class)).b(r.j(F.a(A0.b.class, Executor.class))).f(c.f17295a).d();
        AbstractC3159y.h(d10, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C1062c d11 = C1062c.c(F.a(A0.d.class, I.class)).b(r.j(F.a(A0.d.class, Executor.class))).f(d.f17296a).d();
        AbstractC3159y.h(d11, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return AbstractC1246t.p(b8, d8, d9, d10, d11);
    }
}
