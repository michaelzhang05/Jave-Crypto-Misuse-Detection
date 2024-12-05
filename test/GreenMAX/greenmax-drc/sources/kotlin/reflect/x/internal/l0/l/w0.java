package kotlin.reflect.x.internal.l0.l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.collections.o0;
import kotlin.collections.u;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;

/* compiled from: TypeAliasExpansion.kt */
/* loaded from: classes2.dex */
public final class w0 {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final w0 f21372b;

    /* renamed from: c, reason: collision with root package name */
    private final d1 f21373c;

    /* renamed from: d, reason: collision with root package name */
    private final List<g1> f21374d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<e1, g1> f21375e;

    /* compiled from: TypeAliasExpansion.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final w0 a(w0 w0Var, d1 d1Var, List<? extends g1> list) {
            int t;
            List F0;
            Map q;
            l.f(d1Var, "typeAliasDescriptor");
            l.f(list, "arguments");
            List<e1> parameters = d1Var.g().getParameters();
            l.e(parameters, "typeAliasDescriptor.typeConstructor.parameters");
            t = u.t(parameters, 10);
            ArrayList arrayList = new ArrayList(t);
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((e1) it.next()).a());
            }
            F0 = b0.F0(arrayList, list);
            q = o0.q(F0);
            return new w0(w0Var, d1Var, list, q, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private w0(w0 w0Var, d1 d1Var, List<? extends g1> list, Map<e1, ? extends g1> map) {
        this.f21372b = w0Var;
        this.f21373c = d1Var;
        this.f21374d = list;
        this.f21375e = map;
    }

    public /* synthetic */ w0(w0 w0Var, d1 d1Var, List list, Map map, g gVar) {
        this(w0Var, d1Var, list, map);
    }

    public final List<g1> a() {
        return this.f21374d;
    }

    public final d1 b() {
        return this.f21373c;
    }

    public final g1 c(e1 e1Var) {
        l.f(e1Var, "constructor");
        h c2 = e1Var.c();
        if (c2 instanceof e1) {
            return this.f21375e.get(c2);
        }
        return null;
    }

    public final boolean d(d1 d1Var) {
        l.f(d1Var, "descriptor");
        if (!l.a(this.f21373c, d1Var)) {
            w0 w0Var = this.f21372b;
            if (!(w0Var != null ? w0Var.d(d1Var) : false)) {
                return false;
            }
        }
        return true;
    }
}
