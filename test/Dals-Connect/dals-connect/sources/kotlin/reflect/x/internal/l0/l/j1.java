package kotlin.reflect.x.internal.l0.l;

import cm.aptoide.pt.database.room.RoomNotification;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes2.dex */
public abstract class j1 {
    public static final b a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final j1 f21259b = new a();

    /* compiled from: TypeSubstitution.kt */
    /* loaded from: classes2.dex */
    public static final class a extends j1 {
        a() {
        }

        @Override // kotlin.reflect.x.internal.l0.l.j1
        public /* bridge */ /* synthetic */ g1 e(e0 e0Var) {
            return (g1) i(e0Var);
        }

        @Override // kotlin.reflect.x.internal.l0.l.j1
        public boolean f() {
            return true;
        }

        public Void i(e0 e0Var) {
            l.f(e0Var, RoomNotification.KEY);
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* compiled from: TypeSubstitution.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    /* compiled from: TypeSubstitution.kt */
    /* loaded from: classes2.dex */
    public static final class c extends j1 {
        c() {
        }

        @Override // kotlin.reflect.x.internal.l0.l.j1
        public boolean a() {
            return false;
        }

        @Override // kotlin.reflect.x.internal.l0.l.j1
        public boolean b() {
            return false;
        }

        @Override // kotlin.reflect.x.internal.l0.l.j1
        public kotlin.reflect.jvm.internal.impl.descriptors.n1.g d(kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar) {
            l.f(gVar, "annotations");
            return j1.this.d(gVar);
        }

        @Override // kotlin.reflect.x.internal.l0.l.j1
        public g1 e(e0 e0Var) {
            l.f(e0Var, RoomNotification.KEY);
            return j1.this.e(e0Var);
        }

        @Override // kotlin.reflect.x.internal.l0.l.j1
        public boolean f() {
            return j1.this.f();
        }

        @Override // kotlin.reflect.x.internal.l0.l.j1
        public e0 g(e0 e0Var, r1 r1Var) {
            l.f(e0Var, "topLevelType");
            l.f(r1Var, "position");
            return j1.this.g(e0Var, r1Var);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final l1 c() {
        l1 g2 = l1.g(this);
        l.e(g2, "create(this)");
        return g2;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.n1.g d(kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar) {
        l.f(gVar, "annotations");
        return gVar;
    }

    public abstract g1 e(e0 e0Var);

    public boolean f() {
        return false;
    }

    public e0 g(e0 e0Var, r1 r1Var) {
        l.f(e0Var, "topLevelType");
        l.f(r1Var, "position");
        return e0Var;
    }

    public final j1 h() {
        return new c();
    }
}
