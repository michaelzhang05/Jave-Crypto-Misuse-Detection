package kotlin.reflect.x.internal.l0.i.r;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b0;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.x.internal.l0.l.a1;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.e1;
import kotlin.reflect.x.internal.l0.l.f0;
import kotlin.reflect.x.internal.l0.l.i1;
import kotlin.reflect.x.internal.l0.l.k1;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.r1;

/* compiled from: IntegerLiteralTypeConstructor.kt */
/* loaded from: classes2.dex */
public final class n implements e1 {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final long f20875b;

    /* renamed from: c, reason: collision with root package name */
    private final g0 f20876c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<e0> f20877d;

    /* renamed from: e, reason: collision with root package name */
    private final m0 f20878e;

    /* renamed from: f, reason: collision with root package name */
    private final Lazy f20879f;

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IntegerLiteralTypeConstructor.kt */
        /* renamed from: kotlin.f0.x.e.l0.i.r.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum EnumC0337a {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        /* compiled from: IntegerLiteralTypeConstructor.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class b {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[EnumC0337a.values().length];
                iArr[EnumC0337a.COMMON_SUPER_TYPE.ordinal()] = 1;
                iArr[EnumC0337a.INTERSECTION_TYPE.ordinal()] = 2;
                a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final m0 a(Collection<? extends m0> collection, EnumC0337a enumC0337a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    m0 m0Var = (m0) it.next();
                    next = n.a.e((m0) next, m0Var, enumC0337a);
                }
                return (m0) next;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }

        private final m0 c(n nVar, n nVar2, EnumC0337a enumC0337a) {
            Set X;
            int i2 = b.a[enumC0337a.ordinal()];
            if (i2 == 1) {
                X = b0.X(nVar.k(), nVar2.k());
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                X = b0.D0(nVar.k(), nVar2.k());
            }
            return f0.e(a1.f21185g.h(), new n(nVar.f20875b, nVar.f20876c, X, null), false);
        }

        private final m0 d(n nVar, m0 m0Var) {
            if (nVar.k().contains(m0Var)) {
                return m0Var;
            }
            return null;
        }

        private final m0 e(m0 m0Var, m0 m0Var2, EnumC0337a enumC0337a) {
            if (m0Var == null || m0Var2 == null) {
                return null;
            }
            e1 O0 = m0Var.O0();
            e1 O02 = m0Var2.O0();
            boolean z = O0 instanceof n;
            if (z && (O02 instanceof n)) {
                return c((n) O0, (n) O02, enumC0337a);
            }
            if (z) {
                return d((n) O0, m0Var2);
            }
            if (O02 instanceof n) {
                return d((n) O02, m0Var);
            }
            return null;
        }

        public final m0 b(Collection<? extends m0> collection) {
            l.f(collection, "types");
            return a(collection, EnumC0337a.INTERSECTION_TYPE);
        }
    }

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function0<List<m0>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<m0> invoke() {
            List e2;
            List<m0> o;
            m0 s = n.this.o().x().s();
            l.e(s, "builtIns.comparable.defaultType");
            e2 = s.e(new i1(r1.IN_VARIANCE, n.this.f20878e));
            o = t.o(k1.f(s, e2, null, 2, null));
            if (!n.this.m()) {
                o.add(n.this.o().L());
            }
            return o;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IntegerLiteralTypeConstructor.kt */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements Function1<e0, CharSequence> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f20884f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(e0 e0Var) {
            l.f(e0Var, "it");
            return e0Var.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private n(long j2, g0 g0Var, Set<? extends e0> set) {
        Lazy b2;
        this.f20878e = f0.e(a1.f21185g.h(), this, false);
        b2 = i.b(new b());
        this.f20879f = b2;
        this.f20875b = j2;
        this.f20876c = g0Var;
        this.f20877d = set;
    }

    public /* synthetic */ n(long j2, g0 g0Var, Set set, g gVar) {
        this(j2, g0Var, set);
    }

    private final List<e0> l() {
        return (List) this.f20879f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        Collection<e0> a2 = t.a(this.f20876c);
        if ((a2 instanceof Collection) && a2.isEmpty()) {
            return true;
        }
        Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            if (!(!this.f20877d.contains((e0) it.next()))) {
                return false;
            }
        }
        return true;
    }

    private final String n() {
        String b0;
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        b0 = b0.b0(this.f20877d, ",", null, null, 0, null, c.f20884f, 30, null);
        sb.append(b0);
        sb.append(']');
        return sb.toString();
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public Collection<e0> a() {
        return l();
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public e1 b(kotlin.reflect.x.internal.l0.l.t1.g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    /* renamed from: c */
    public h w() {
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public boolean e() {
        return false;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public List<kotlin.reflect.jvm.internal.impl.descriptors.e1> getParameters() {
        List<kotlin.reflect.jvm.internal.impl.descriptors.e1> i2;
        i2 = t.i();
        return i2;
    }

    public final Set<e0> k() {
        return this.f20877d;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public kotlin.reflect.x.internal.l0.b.h o() {
        return this.f20876c.o();
    }

    public String toString() {
        return "IntegerLiteralType" + n();
    }
}
