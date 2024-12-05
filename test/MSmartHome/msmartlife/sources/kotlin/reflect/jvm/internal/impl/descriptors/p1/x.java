package kotlin.reflect.jvm.internal.impl.descriptors.p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.u0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.a0;

/* compiled from: ModuleDescriptorImpl.kt */
/* loaded from: classes2.dex */
public final class x extends j implements kotlin.reflect.jvm.internal.impl.descriptors.g0 {

    /* renamed from: h, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.n f21795h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.b.h f21796i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.f.f f21797j;

    /* renamed from: k, reason: collision with root package name */
    private final Map<kotlin.reflect.jvm.internal.impl.descriptors.f0<?>, Object> f21798k;
    private final a0 l;
    private v m;
    private kotlin.reflect.jvm.internal.impl.descriptors.l0 n;
    private boolean o;
    private final kotlin.reflect.x.internal.l0.k.g<kotlin.reflect.x.internal.l0.f.c, p0> p;
    private final Lazy q;

    /* compiled from: ModuleDescriptorImpl.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function0<i> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            int t;
            v vVar = x.this.m;
            x xVar = x.this;
            if (vVar != null) {
                List<x> a = vVar.a();
                x.this.P0();
                a.contains(x.this);
                Iterator<T> it = a.iterator();
                while (it.hasNext()) {
                    ((x) it.next()).U0();
                }
                t = kotlin.collections.u.t(a, 10);
                ArrayList arrayList = new ArrayList(t);
                Iterator<T> it2 = a.iterator();
                while (it2.hasNext()) {
                    kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var = ((x) it2.next()).n;
                    kotlin.jvm.internal.l.c(l0Var);
                    arrayList.add(l0Var);
                }
                return new i(arrayList, "CompositeProvider@ModuleDescriptor for " + x.this.getName());
            }
            throw new AssertionError("Dependencies of module " + xVar.Q0() + " were not set before querying module content");
        }
    }

    /* compiled from: ModuleDescriptorImpl.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function1<kotlin.reflect.x.internal.l0.f.c, p0> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p0 invoke(kotlin.reflect.x.internal.l0.f.c cVar) {
            kotlin.jvm.internal.l.f(cVar, "fqName");
            a0 a0Var = x.this.l;
            x xVar = x.this;
            return a0Var.a(xVar, cVar, xVar.f21795h);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(kotlin.reflect.x.internal.l0.f.f fVar, kotlin.reflect.x.internal.l0.k.n nVar, kotlin.reflect.x.internal.l0.b.h hVar, kotlin.reflect.x.internal.l0.g.a aVar) {
        this(fVar, nVar, hVar, aVar, null, null, 48, null);
        kotlin.jvm.internal.l.f(fVar, "moduleName");
        kotlin.jvm.internal.l.f(nVar, "storageManager");
        kotlin.jvm.internal.l.f(hVar, "builtIns");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ x(kotlin.reflect.x.internal.l0.f.f r10, kotlin.reflect.x.internal.l0.k.n r11, kotlin.reflect.x.internal.l0.b.h r12, kotlin.reflect.x.internal.l0.g.a r13, java.util.Map r14, kotlin.reflect.x.internal.l0.f.f r15, int r16, kotlin.jvm.internal.g r17) {
        /*
            r9 = this;
            r0 = r16 & 8
            r1 = 0
            if (r0 == 0) goto L7
            r6 = r1
            goto L8
        L7:
            r6 = r13
        L8:
            r0 = r16 & 16
            if (r0 == 0) goto L12
            java.util.Map r0 = kotlin.collections.l0.i()
            r7 = r0
            goto L13
        L12:
            r7 = r14
        L13:
            r0 = r16 & 32
            if (r0 == 0) goto L19
            r8 = r1
            goto L1a
        L19:
            r8 = r15
        L1a:
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p1.x.<init>(kotlin.f0.x.e.l0.f.f, kotlin.f0.x.e.l0.k.n, kotlin.f0.x.e.l0.b.h, kotlin.f0.x.e.l0.g.a, java.util.Map, kotlin.f0.x.e.l0.f.f, int, kotlin.a0.d.g):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String Q0() {
        String fVar = getName().toString();
        kotlin.jvm.internal.l.e(fVar, "name.toString()");
        return fVar;
    }

    private final i S0() {
        return (i) this.q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean U0() {
        return this.n != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    public <T> T I0(kotlin.reflect.jvm.internal.impl.descriptors.f0<T> f0Var) {
        kotlin.jvm.internal.l.f(f0Var, "capability");
        T t = (T) this.f21798k.get(f0Var);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R L(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d2) {
        return (R) g0.a.a(this, oVar, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    public p0 N(kotlin.reflect.x.internal.l0.f.c cVar) {
        kotlin.jvm.internal.l.f(cVar, "fqName");
        P0();
        return this.p.invoke(cVar);
    }

    public void P0() {
        if (V0()) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.a0.a(this);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.l0 R0() {
        P0();
        return S0();
    }

    public final void T0(kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var) {
        kotlin.jvm.internal.l.f(l0Var, "providerForModuleContent");
        U0();
        this.n = l0Var;
    }

    public boolean V0() {
        return this.o;
    }

    public final void W0(List<x> list) {
        Set<x> d2;
        kotlin.jvm.internal.l.f(list, "descriptors");
        d2 = u0.d();
        X0(list, d2);
    }

    public final void X0(List<x> list, Set<x> set) {
        List i2;
        Set d2;
        kotlin.jvm.internal.l.f(list, "descriptors");
        kotlin.jvm.internal.l.f(set, "friends");
        i2 = kotlin.collections.t.i();
        d2 = u0.d();
        Y0(new w(list, set, i2, d2));
    }

    public final void Y0(v vVar) {
        kotlin.jvm.internal.l.f(vVar, "dependencies");
        v vVar2 = this.m;
        this.m = vVar;
    }

    public final void Z0(x... xVarArr) {
        List<x> X;
        kotlin.jvm.internal.l.f(xVarArr, "descriptors");
        X = kotlin.collections.n.X(xVarArr);
        W0(X);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public kotlin.reflect.jvm.internal.impl.descriptors.m b() {
        return g0.a.b(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    public boolean e0(kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var) {
        boolean J;
        kotlin.jvm.internal.l.f(g0Var, "targetModule");
        if (kotlin.jvm.internal.l.a(this, g0Var)) {
            return true;
        }
        v vVar = this.m;
        kotlin.jvm.internal.l.c(vVar);
        J = kotlin.collections.b0.J(vVar.b(), g0Var);
        return J || t0().contains(g0Var) || g0Var.t0().contains(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    public kotlin.reflect.x.internal.l0.b.h o() {
        return this.f21796i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    public Collection<kotlin.reflect.x.internal.l0.f.c> p(kotlin.reflect.x.internal.l0.f.c cVar, Function1<? super kotlin.reflect.x.internal.l0.f.f, Boolean> function1) {
        kotlin.jvm.internal.l.f(cVar, "fqName");
        kotlin.jvm.internal.l.f(function1, "nameFilter");
        P0();
        return R0().p(cVar, function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    public List<kotlin.reflect.jvm.internal.impl.descriptors.g0> t0() {
        v vVar = this.m;
        if (vVar != null) {
            return vVar.c();
        }
        throw new AssertionError("Dependencies of module " + Q0() + " were not set");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kotlin.reflect.x.internal.l0.f.f fVar, kotlin.reflect.x.internal.l0.k.n nVar, kotlin.reflect.x.internal.l0.b.h hVar, kotlin.reflect.x.internal.l0.g.a aVar, Map<kotlin.reflect.jvm.internal.impl.descriptors.f0<?>, ? extends Object> map, kotlin.reflect.x.internal.l0.f.f fVar2) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b(), fVar);
        Lazy b2;
        kotlin.jvm.internal.l.f(fVar, "moduleName");
        kotlin.jvm.internal.l.f(nVar, "storageManager");
        kotlin.jvm.internal.l.f(hVar, "builtIns");
        kotlin.jvm.internal.l.f(map, "capabilities");
        this.f21795h = nVar;
        this.f21796i = hVar;
        this.f21797j = fVar2;
        if (fVar.x()) {
            this.f21798k = map;
            a0 a0Var = (a0) I0(a0.a.a());
            this.l = a0Var == null ? a0.b.f21706b : a0Var;
            this.o = true;
            this.p = nVar.h(new b());
            b2 = kotlin.i.b(new a());
            this.q = b2;
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + fVar);
    }
}
