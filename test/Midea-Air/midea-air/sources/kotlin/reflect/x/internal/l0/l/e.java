package kotlin.reflect.x.internal.l0.l;

import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.l.t1.n;
import kotlin.reflect.x.internal.l0.l.u1.k;

/* compiled from: StubTypes.kt */
/* loaded from: classes2.dex */
public abstract class e extends m0 {

    /* renamed from: g, reason: collision with root package name */
    public static final a f21209g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private final n f21210h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f21211i;

    /* renamed from: j, reason: collision with root package name */
    private final h f21212j;

    /* compiled from: StubTypes.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public e(n nVar, boolean z) {
        l.f(nVar, "originalTypeVariable");
        this.f21210h = nVar;
        this.f21211i = z;
        this.f21212j = k.b(kotlin.reflect.x.internal.l0.l.u1.g.STUB_TYPE_SCOPE, nVar.toString());
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public List<g1> M0() {
        List<g1> i2;
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public a1 N0() {
        return a1.f21185g.h();
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public boolean P0() {
        return this.f21211i;
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: V0 */
    public m0 S0(boolean z) {
        return z == P0() ? this : Y0(z);
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: W0 */
    public m0 U0(a1 a1Var) {
        l.f(a1Var, "newAttributes");
        return this;
    }

    public final n X0() {
        return this.f21210h;
    }

    public abstract e Y0(boolean z);

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public e Y0(kotlin.reflect.x.internal.l0.l.t1.g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public h q() {
        return this.f21212j;
    }
}
