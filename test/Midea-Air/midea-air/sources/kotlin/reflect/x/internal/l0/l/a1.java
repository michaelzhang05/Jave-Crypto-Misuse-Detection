package kotlin.reflect.x.internal.l0.l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KClass;
import kotlin.reflect.x.internal.l0.m.c;
import kotlin.reflect.x.internal.l0.m.e;
import kotlin.reflect.x.internal.l0.m.s;

/* compiled from: TypeAttributes.kt */
/* loaded from: classes2.dex */
public final class a1 extends e<y0<?>, y0<?>> implements Iterable<y0<?>>, KMappedMarker {

    /* renamed from: g, reason: collision with root package name */
    public static final a f21185g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final a1 f21186h;

    /* compiled from: TypeAttributes.kt */
    /* loaded from: classes2.dex */
    public static final class a extends s<y0<?>, y0<?>> {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.x.internal.l0.m.s
        public <T extends y0<?>> int b(ConcurrentHashMap<KClass<? extends y0<?>>, Integer> concurrentHashMap, KClass<T> kClass, Function1<? super KClass<? extends y0<?>>, Integer> function1) {
            int intValue;
            l.f(concurrentHashMap, "<this>");
            l.f(kClass, "kClass");
            l.f(function1, "compute");
            Integer num = concurrentHashMap.get(kClass);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                Integer num2 = concurrentHashMap.get(kClass);
                if (num2 == null) {
                    Integer invoke = function1.invoke(kClass);
                    concurrentHashMap.putIfAbsent(kClass, Integer.valueOf(invoke.intValue()));
                    num2 = invoke;
                }
                l.e(num2, "this[kClass] ?: compute(…putIfAbsent(kClass, it) }");
                intValue = num2.intValue();
            }
            return intValue;
        }

        public final a1 g(List<? extends y0<?>> list) {
            l.f(list, "attributes");
            if (list.isEmpty()) {
                return h();
            }
            return new a1(list, null);
        }

        public final a1 h() {
            return a1.f21186h;
        }
    }

    static {
        List i2;
        i2 = t.i();
        f21186h = new a1((List<? extends y0<?>>) i2);
    }

    private a1(List<? extends y0<?>> list) {
        for (y0<?> y0Var : list) {
            f(y0Var.b(), y0Var);
        }
    }

    public /* synthetic */ a1(List list, g gVar) {
        this((List<? extends y0<?>>) list);
    }

    public final a1 D(a1 a1Var) {
        Object c2;
        l.f(a1Var, "other");
        if (isEmpty() && a1Var.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f21185g.e().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            y0<?> y0Var = a().get(intValue);
            y0<?> y0Var2 = a1Var.a().get(intValue);
            if (y0Var == null) {
                c2 = y0Var2 != null ? y0Var2.c(y0Var) : null;
            } else {
                c2 = y0Var.c(y0Var2);
            }
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, c2);
        }
        return f21185g.g(arrayList);
    }

    public final a1 J(y0<?> y0Var) {
        List y0;
        List<? extends y0<?>> l0;
        l.f(y0Var, "attribute");
        if (z(y0Var)) {
            return this;
        }
        if (isEmpty()) {
            return new a1(y0Var);
        }
        y0 = b0.y0(this);
        l0 = b0.l0(y0, y0Var);
        return f21185g.g(l0);
    }

    public final a1 K(y0<?> y0Var) {
        l.f(y0Var, "attribute");
        if (isEmpty()) {
            return this;
        }
        c<y0<?>> a2 = a();
        ArrayList arrayList = new ArrayList();
        for (y0<?> y0Var2 : a2) {
            if (!l.a(y0Var2, y0Var)) {
                arrayList.add(y0Var2);
            }
        }
        return arrayList.size() == a().a() ? this : f21185g.g(arrayList);
    }

    @Override // kotlin.reflect.x.internal.l0.m.a
    protected s<y0<?>, y0<?>> b() {
        return f21185g;
    }

    public final a1 x(a1 a1Var) {
        Object a2;
        l.f(a1Var, "other");
        if (isEmpty() && a1Var.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f21185g.e().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            y0<?> y0Var = a().get(intValue);
            y0<?> y0Var2 = a1Var.a().get(intValue);
            if (y0Var == null) {
                a2 = y0Var2 != null ? y0Var2.a(y0Var) : null;
            } else {
                a2 = y0Var.a(y0Var2);
            }
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, a2);
        }
        return f21185g.g(arrayList);
    }

    public final boolean z(y0<?> y0Var) {
        l.f(y0Var, "attribute");
        return a().get(f21185g.d(y0Var.b())) != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private a1(kotlin.reflect.x.internal.l0.l.y0<?> r1) {
        /*
            r0 = this;
            java.util.List r1 = kotlin.collections.r.e(r1)
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.l.a1.<init>(kotlin.f0.x.e.l0.l.y0):void");
    }
}
