package kotlin.reflect.x.internal.l0.l;

import cm.aptoide.pt.database.room.RoomNotification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.collections.o0;
import kotlin.collections.r;
import kotlin.collections.u;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes2.dex */
public abstract class f1 extends j1 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f21236c = new a(null);

    /* compiled from: TypeSubstitution.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* compiled from: TypeSubstitution.kt */
        /* renamed from: kotlin.f0.x.e.l0.l.f1$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0354a extends f1 {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map<e1, g1> f21237d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f21238e;

            /* JADX WARN: Multi-variable type inference failed */
            C0354a(Map<e1, ? extends g1> map, boolean z) {
                this.f21237d = map;
                this.f21238e = z;
            }

            @Override // kotlin.reflect.x.internal.l0.l.j1
            public boolean a() {
                return this.f21238e;
            }

            @Override // kotlin.reflect.x.internal.l0.l.j1
            public boolean f() {
                return this.f21237d.isEmpty();
            }

            @Override // kotlin.reflect.x.internal.l0.l.f1
            public g1 k(e1 e1Var) {
                l.f(e1Var, RoomNotification.KEY);
                return this.f21237d.get(e1Var);
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public static /* synthetic */ f1 e(a aVar, Map map, boolean z, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            return aVar.d(map, z);
        }

        public final j1 a(e0 e0Var) {
            l.f(e0Var, "kotlinType");
            return b(e0Var.O0(), e0Var.M0());
        }

        public final j1 b(e1 e1Var, List<? extends g1> list) {
            int t;
            List F0;
            Map q;
            l.f(e1Var, "typeConstructor");
            l.f(list, "arguments");
            List<e1> parameters = e1Var.getParameters();
            l.e(parameters, "typeConstructor.parameters");
            e1 e1Var2 = (e1) r.f0(parameters);
            if (e1Var2 != null && e1Var2.o0()) {
                List<e1> parameters2 = e1Var.getParameters();
                l.e(parameters2, "typeConstructor.parameters");
                t = u.t(parameters2, 10);
                ArrayList arrayList = new ArrayList(t);
                Iterator<T> it = parameters2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e1) it.next()).g());
                }
                F0 = b0.F0(arrayList, list);
                q = o0.q(F0);
                return e(this, q, false, 2, null);
            }
            return new c0(parameters, list);
        }

        public final f1 c(Map<e1, ? extends g1> map) {
            l.f(map, "map");
            return e(this, map, false, 2, null);
        }

        public final f1 d(Map<e1, ? extends g1> map, boolean z) {
            l.f(map, "map");
            return new C0354a(map, z);
        }
    }

    public static final j1 i(e1 e1Var, List<? extends g1> list) {
        return f21236c.b(e1Var, list);
    }

    public static final f1 j(Map<e1, ? extends g1> map) {
        return f21236c.c(map);
    }

    @Override // kotlin.reflect.x.internal.l0.l.j1
    public g1 e(e0 e0Var) {
        l.f(e0Var, RoomNotification.KEY);
        return k(e0Var.O0());
    }

    public abstract g1 k(e1 e1Var);
}
