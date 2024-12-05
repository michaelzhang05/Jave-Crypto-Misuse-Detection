package kotlin.reflect.x.internal.l0.l;

import cm.aptoide.pt.database.room.RoomNotification;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: DisjointKeysUnionTypeSubstitution.kt */
/* loaded from: classes2.dex */
public final class u extends j1 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f21324c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private final j1 f21325d;

    /* renamed from: e, reason: collision with root package name */
    private final j1 f21326e;

    /* compiled from: DisjointKeysUnionTypeSubstitution.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final j1 a(j1 j1Var, j1 j1Var2) {
            l.f(j1Var, "first");
            l.f(j1Var2, "second");
            return j1Var.f() ? j1Var2 : j1Var2.f() ? j1Var : new u(j1Var, j1Var2, null);
        }
    }

    private u(j1 j1Var, j1 j1Var2) {
        this.f21325d = j1Var;
        this.f21326e = j1Var2;
    }

    public /* synthetic */ u(j1 j1Var, j1 j1Var2, g gVar) {
        this(j1Var, j1Var2);
    }

    public static final j1 i(j1 j1Var, j1 j1Var2) {
        return f21324c.a(j1Var, j1Var2);
    }

    @Override // kotlin.reflect.x.internal.l0.l.j1
    public boolean a() {
        return this.f21325d.a() || this.f21326e.a();
    }

    @Override // kotlin.reflect.x.internal.l0.l.j1
    public boolean b() {
        return this.f21325d.b() || this.f21326e.b();
    }

    @Override // kotlin.reflect.x.internal.l0.l.j1
    public kotlin.reflect.jvm.internal.impl.descriptors.n1.g d(kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar) {
        l.f(gVar, "annotations");
        return this.f21326e.d(this.f21325d.d(gVar));
    }

    @Override // kotlin.reflect.x.internal.l0.l.j1
    public g1 e(e0 e0Var) {
        l.f(e0Var, RoomNotification.KEY);
        g1 e2 = this.f21325d.e(e0Var);
        return e2 == null ? this.f21326e.e(e0Var) : e2;
    }

    @Override // kotlin.reflect.x.internal.l0.l.j1
    public boolean f() {
        return false;
    }

    @Override // kotlin.reflect.x.internal.l0.l.j1
    public e0 g(e0 e0Var, r1 r1Var) {
        l.f(e0Var, "topLevelType");
        l.f(r1Var, "position");
        return this.f21326e.g(this.f21325d.g(e0Var, r1Var), r1Var);
    }
}
