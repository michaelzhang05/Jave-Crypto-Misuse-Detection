package kotlin.reflect.x.internal.l0.b.q;

import java.util.List;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.w.e;
import kotlin.reflect.x.internal.l0.k.n;

/* compiled from: CloneableClassScope.kt */
/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: e, reason: collision with root package name */
    public static final C0283a f19748e = new C0283a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final f f19749f;

    /* compiled from: CloneableClassScope.kt */
    /* renamed from: kotlin.f0.x.e.l0.b.q.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0283a {
        private C0283a() {
        }

        public /* synthetic */ C0283a(g gVar) {
            this();
        }

        public final f a() {
            return a.f19749f;
        }
    }

    static {
        f r = f.r("clone");
        l.e(r, "identifier(\"clone\")");
        f19749f = r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n nVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        super(nVar, eVar);
        l.f(nVar, "storageManager");
        l.f(eVar, "containingClass");
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.e
    protected List<y> i() {
        List<w0> i2;
        List<? extends e1> i3;
        List<i1> i4;
        List<y> e2;
        g0 m1 = g0.m1(l(), kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b(), f19749f, b.a.DECLARATION, z0.a);
        w0 K0 = l().K0();
        i2 = t.i();
        i3 = t.i();
        i4 = t.i();
        m1.S0(null, K0, i2, i3, i4, kotlin.reflect.x.internal.l0.i.t.a.f(l()).i(), d0.OPEN, kotlin.reflect.jvm.internal.impl.descriptors.t.f21861c);
        e2 = s.e(m1);
        return e2;
    }
}
