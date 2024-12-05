package kotlin.reflect.x.internal.l0.i.r;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.x.internal.l0.b.h;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.l.a1;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.f0;
import kotlin.reflect.x.internal.l0.l.g0;
import kotlin.reflect.x.internal.l0.l.g1;
import kotlin.reflect.x.internal.l0.l.i1;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.r1;
import kotlin.reflect.x.internal.l0.l.u1.j;

/* compiled from: constantValues.kt */
/* loaded from: classes2.dex */
public final class q extends g<b> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20887b = new a(null);

    /* compiled from: constantValues.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final g<?> a(e0 e0Var) {
            l.f(e0Var, "argumentType");
            if (g0.a(e0Var)) {
                return null;
            }
            e0 e0Var2 = e0Var;
            int i2 = 0;
            while (h.c0(e0Var2)) {
                e0Var2 = ((g1) r.n0(e0Var2.M0())).getType();
                l.e(e0Var2, "type.arguments.single().type");
                i2++;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.h w = e0Var2.O0().w();
            if (w instanceof e) {
                kotlin.reflect.x.internal.l0.f.b g2 = kotlin.reflect.x.internal.l0.i.t.a.g(w);
                return g2 == null ? new q(new b.a(e0Var)) : new q(g2, i2);
            }
            if (!(w instanceof e1)) {
                return null;
            }
            kotlin.reflect.x.internal.l0.f.b m = kotlin.reflect.x.internal.l0.f.b.m(k.a.f19710b.l());
            l.e(m, "topLevel(StandardNames.FqNames.any.toSafe())");
            return new q(m, 0);
        }
    }

    /* compiled from: constantValues.kt */
    /* loaded from: classes2.dex */
    public static abstract class b {

        /* compiled from: constantValues.kt */
        /* loaded from: classes2.dex */
        public static final class a extends b {
            private final e0 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e0 e0Var) {
                super(null);
                l.f(e0Var, "type");
                this.a = e0Var;
            }

            public final e0 a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && l.a(this.a, ((a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.a + ')';
            }
        }

        /* compiled from: constantValues.kt */
        /* renamed from: kotlin.f0.x.e.l0.i.r.q$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0338b extends b {
            private final f a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0338b(f fVar) {
                super(null);
                l.f(fVar, "value");
                this.a = fVar;
            }

            public final int a() {
                return this.a.c();
            }

            public final kotlin.reflect.x.internal.l0.f.b b() {
                return this.a.d();
            }

            public final f c() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0338b) && l.a(this.a, ((C0338b) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.a + ')';
            }
        }

        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(b bVar) {
        super(bVar);
        l.f(bVar, "value");
    }

    @Override // kotlin.reflect.x.internal.l0.i.r.g
    public e0 a(kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var) {
        List e2;
        l.f(g0Var, "module");
        a1 h2 = a1.f21185g.h();
        e E = g0Var.o().E();
        l.e(E, "module.builtIns.kClass");
        e2 = s.e(new i1(c(g0Var)));
        return f0.g(h2, E, e2);
    }

    public final e0 c(kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var) {
        l.f(g0Var, "module");
        b b2 = b();
        if (b2 instanceof b.a) {
            return ((b.a) b()).a();
        }
        if (b2 instanceof b.C0338b) {
            f c2 = ((b.C0338b) b()).c();
            kotlin.reflect.x.internal.l0.f.b a2 = c2.a();
            int b3 = c2.b();
            e a3 = x.a(g0Var, a2);
            if (a3 == null) {
                j jVar = j.f21361k;
                String bVar = a2.toString();
                l.e(bVar, "classId.toString()");
                return kotlin.reflect.x.internal.l0.l.u1.k.d(jVar, bVar, String.valueOf(b3));
            }
            m0 s = a3.s();
            l.e(s, "descriptor.defaultType");
            e0 w = kotlin.reflect.x.internal.l0.l.x1.a.w(s);
            for (int i2 = 0; i2 < b3; i2++) {
                w = g0Var.o().l(r1.INVARIANT, w);
                l.e(w, "module.builtIns.getArray…Variance.INVARIANT, type)");
            }
            return w;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(f fVar) {
        this(new b.C0338b(fVar));
        l.f(fVar, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(kotlin.reflect.x.internal.l0.f.b bVar, int i2) {
        this(new f(bVar, i2));
        l.f(bVar, "classId");
    }
}
