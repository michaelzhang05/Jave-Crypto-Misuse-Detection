package kotlin.reflect.x.internal.l0.b.p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.r;
import kotlin.collections.u0;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.o1.b;
import kotlin.reflect.x.internal.l0.b.p.c;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.k.n;
import kotlin.text.u;
import kotlin.text.v;

/* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
/* loaded from: classes2.dex */
public final class a implements b {
    private final n a;

    /* renamed from: b, reason: collision with root package name */
    private final g0 f19738b;

    public a(n nVar, g0 g0Var) {
        l.f(nVar, "storageManager");
        l.f(g0Var, "module");
        this.a = nVar;
        this.f19738b = g0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1.b
    public Collection<e> a(c cVar) {
        Set d2;
        l.f(cVar, "packageFqName");
        d2 = u0.d();
        return d2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1.b
    public boolean b(c cVar, f fVar) {
        boolean A;
        boolean A2;
        boolean A3;
        boolean A4;
        l.f(cVar, "packageFqName");
        l.f(fVar, "name");
        String f2 = fVar.f();
        l.e(f2, "name.asString()");
        A = u.A(f2, "Function", false, 2, null);
        if (!A) {
            A2 = u.A(f2, "KFunction", false, 2, null);
            if (!A2) {
                A3 = u.A(f2, "SuspendFunction", false, 2, null);
                if (!A3) {
                    A4 = u.A(f2, "KSuspendFunction", false, 2, null);
                    if (!A4) {
                        return false;
                    }
                }
            }
        }
        return c.f19741f.c(f2, cVar) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1.b
    public e c(kotlin.reflect.x.internal.l0.f.b bVar) {
        boolean F;
        l.f(bVar, "classId");
        if (bVar.k() || bVar.l()) {
            return null;
        }
        String b2 = bVar.i().b();
        l.e(b2, "classId.relativeClassName.asString()");
        F = v.F(b2, "Function", false, 2, null);
        if (!F) {
            return null;
        }
        c h2 = bVar.h();
        l.e(h2, "classId.packageFqName");
        c.a.C0282a c2 = c.f19741f.c(b2, h2);
        if (c2 == null) {
            return null;
        }
        c a = c2.a();
        int b3 = c2.b();
        List<k0> I = this.f19738b.N(h2).I();
        ArrayList arrayList = new ArrayList();
        for (Object obj : I) {
            if (obj instanceof kotlin.reflect.x.internal.l0.b.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof kotlin.reflect.x.internal.l0.b.f) {
                arrayList2.add(obj2);
            }
        }
        k0 k0Var = (kotlin.reflect.x.internal.l0.b.f) r.T(arrayList2);
        if (k0Var == null) {
            k0Var = (kotlin.reflect.x.internal.l0.b.b) r.R(arrayList);
        }
        return new b(this.a, k0Var, a, b3);
    }
}
