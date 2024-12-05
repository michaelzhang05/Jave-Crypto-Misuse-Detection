package kotlin.reflect.x.internal.l0.l;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.utils.f;
import kotlin.reflect.x.internal.l0.l.w1.d;
import kotlin.reflect.x.internal.l0.l.w1.i;
import kotlin.reflect.x.internal.l0.l.w1.k;
import kotlin.reflect.x.internal.l0.l.w1.p;
import kotlin.u;

/* compiled from: AbstractTypeChecker.kt */
/* loaded from: classes2.dex */
public class d1 {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f21196b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21197c;

    /* renamed from: d, reason: collision with root package name */
    private final p f21198d;

    /* renamed from: e, reason: collision with root package name */
    private final h f21199e;

    /* renamed from: f, reason: collision with root package name */
    private final i f21200f;

    /* renamed from: g, reason: collision with root package name */
    private int f21201g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21202h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayDeque<k> f21203i;

    /* renamed from: j, reason: collision with root package name */
    private Set<k> f21204j;

    /* compiled from: AbstractTypeChecker.kt */
    /* loaded from: classes2.dex */
    public interface a {

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: kotlin.f0.x.e.l0.l.d1$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0352a implements a {
            private boolean a;

            @Override // kotlin.f0.x.e.l0.l.d1.a
            public void a(Function0<Boolean> function0) {
                l.f(function0, "block");
                if (this.a) {
                    return;
                }
                this.a = function0.invoke().booleanValue();
            }

            public final boolean b() {
                return this.a;
            }
        }

        void a(Function0<Boolean> function0);
    }

    /* compiled from: AbstractTypeChecker.kt */
    /* loaded from: classes2.dex */
    public enum b {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* compiled from: AbstractTypeChecker.kt */
    /* loaded from: classes2.dex */
    public static abstract class c {

        /* compiled from: AbstractTypeChecker.kt */
        /* loaded from: classes2.dex */
        public static abstract class a extends c {
            public a() {
                super(null);
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        /* loaded from: classes2.dex */
        public static final class b extends c {
            public static final b a = new b();

            private b() {
                super(null);
            }

            @Override // kotlin.f0.x.e.l0.l.d1.c
            public k a(d1 d1Var, i iVar) {
                l.f(d1Var, "state");
                l.f(iVar, "type");
                return d1Var.j().h0(iVar);
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: kotlin.f0.x.e.l0.l.d1$c$c, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0353c extends c {
            public static final C0353c a = new C0353c();

            private C0353c() {
                super(null);
            }

            @Override // kotlin.f0.x.e.l0.l.d1.c
            public /* bridge */ /* synthetic */ k a(d1 d1Var, i iVar) {
                return (k) b(d1Var, iVar);
            }

            public Void b(d1 d1Var, i iVar) {
                l.f(d1Var, "state");
                l.f(iVar, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        /* loaded from: classes2.dex */
        public static final class d extends c {
            public static final d a = new d();

            private d() {
                super(null);
            }

            @Override // kotlin.f0.x.e.l0.l.d1.c
            public k a(d1 d1Var, i iVar) {
                l.f(d1Var, "state");
                l.f(iVar, "type");
                return d1Var.j().T(iVar);
            }
        }

        private c() {
        }

        public /* synthetic */ c(g gVar) {
            this();
        }

        public abstract k a(d1 d1Var, i iVar);
    }

    public d1(boolean z, boolean z2, boolean z3, p pVar, h hVar, i iVar) {
        l.f(pVar, "typeSystemContext");
        l.f(hVar, "kotlinTypePreparator");
        l.f(iVar, "kotlinTypeRefiner");
        this.a = z;
        this.f21196b = z2;
        this.f21197c = z3;
        this.f21198d = pVar;
        this.f21199e = hVar;
        this.f21200f = iVar;
    }

    public static /* synthetic */ Boolean d(d1 d1Var, i iVar, i iVar2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return d1Var.c(iVar, iVar2, z);
    }

    public Boolean c(i iVar, i iVar2, boolean z) {
        l.f(iVar, "subType");
        l.f(iVar2, "superType");
        return null;
    }

    public final void e() {
        ArrayDeque<k> arrayDeque = this.f21203i;
        l.c(arrayDeque);
        arrayDeque.clear();
        Set<k> set = this.f21204j;
        l.c(set);
        set.clear();
        this.f21202h = false;
    }

    public boolean f(i iVar, i iVar2) {
        l.f(iVar, "subType");
        l.f(iVar2, "superType");
        return true;
    }

    public b g(k kVar, d dVar) {
        l.f(kVar, "subType");
        l.f(dVar, "superType");
        return b.CHECK_SUBTYPE_AND_LOWER;
    }

    public final ArrayDeque<k> h() {
        return this.f21203i;
    }

    public final Set<k> i() {
        return this.f21204j;
    }

    public final p j() {
        return this.f21198d;
    }

    public final void k() {
        this.f21202h = true;
        if (this.f21203i == null) {
            this.f21203i = new ArrayDeque<>(4);
        }
        if (this.f21204j == null) {
            this.f21204j = f.f22019f.a();
        }
    }

    public final boolean l(i iVar) {
        l.f(iVar, "type");
        return this.f21197c && this.f21198d.z0(iVar);
    }

    public final boolean m() {
        return this.a;
    }

    public final boolean n() {
        return this.f21196b;
    }

    public final i o(i iVar) {
        l.f(iVar, "type");
        return this.f21199e.a(iVar);
    }

    public final i p(i iVar) {
        l.f(iVar, "type");
        return this.f21200f.a(iVar);
    }

    public boolean q(Function1<? super a, u> function1) {
        l.f(function1, "block");
        a.C0352a c0352a = new a.C0352a();
        function1.invoke(c0352a);
        return c0352a.b();
    }
}
