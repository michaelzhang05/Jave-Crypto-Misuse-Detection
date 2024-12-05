package kotlin.reflect.x.internal.l0.l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.x.internal.l0.i.w.n;
import kotlin.reflect.x.internal.l0.l.t1.g;
import kotlin.reflect.x.internal.l0.l.w1.h;

/* compiled from: IntersectionTypeConstructor.kt */
/* loaded from: classes2.dex */
public final class d0 implements e1, h {
    private e0 a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashSet<e0> f21190b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21191c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IntersectionTypeConstructor.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function1<g, m0> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0 invoke(g gVar) {
            l.f(gVar, "kotlinTypeRefiner");
            return d0.this.b(gVar).h();
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f21193f;

        public b(Function1 function1) {
            this.f21193f = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int a;
            e0 e0Var = (e0) t;
            Function1 function1 = this.f21193f;
            l.e(e0Var, "it");
            String obj = function1.invoke(e0Var).toString();
            e0 e0Var2 = (e0) t2;
            Function1 function12 = this.f21193f;
            l.e(e0Var2, "it");
            a = kotlin.comparisons.b.a(obj, function12.invoke(e0Var2).toString());
            return a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IntersectionTypeConstructor.kt */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements Function1<e0, String> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f21194f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(e0 e0Var) {
            l.f(e0Var, "it");
            return e0Var.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IntersectionTypeConstructor.kt */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements Function1<e0, CharSequence> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<e0, Object> f21195f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super e0, ? extends Object> function1) {
            super(1);
            this.f21195f = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(e0 e0Var) {
            Function1<e0, Object> function1 = this.f21195f;
            l.e(e0Var, "it");
            return function1.invoke(e0Var).toString();
        }
    }

    public d0(Collection<? extends e0> collection) {
        l.f(collection, "typesToIntersect");
        collection.isEmpty();
        LinkedHashSet<e0> linkedHashSet = new LinkedHashSet<>(collection);
        this.f21190b = linkedHashSet;
        this.f21191c = linkedHashSet.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String k(d0 d0Var, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function1 = c.f21194f;
        }
        return d0Var.j(function1);
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public Collection<e0> a() {
        return this.f21190b;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    /* renamed from: c */
    public kotlin.reflect.jvm.internal.impl.descriptors.h w() {
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return l.a(this.f21190b, ((d0) obj).f21190b);
        }
        return false;
    }

    public final kotlin.reflect.x.internal.l0.i.w.h g() {
        return n.f20941b.a("member scope for intersection type", this.f21190b);
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public List<e1> getParameters() {
        List<e1> i2;
        i2 = t.i();
        return i2;
    }

    public final m0 h() {
        List i2;
        a1 h2 = a1.f21185g.h();
        i2 = t.i();
        return f0.k(h2, this, i2, false, g(), new a());
    }

    public int hashCode() {
        return this.f21191c;
    }

    public final e0 i() {
        return this.a;
    }

    public final String j(Function1<? super e0, ? extends Object> function1) {
        List r0;
        String b0;
        l.f(function1, "getProperTypeRelatedToStringify");
        r0 = b0.r0(this.f21190b, new b(function1));
        b0 = b0.b0(r0, " & ", "{", "}", 0, null, new d(function1), 24, null);
        return b0;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public d0 b(g gVar) {
        int t;
        l.f(gVar, "kotlinTypeRefiner");
        Collection<e0> a2 = a();
        t = u.t(a2, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = a2.iterator();
        boolean z = false;
        while (it.hasNext()) {
            arrayList.add(((e0) it.next()).Y0(gVar));
            z = true;
        }
        d0 d0Var = null;
        if (z) {
            e0 i2 = i();
            d0Var = new d0(arrayList).m(i2 != null ? i2.Y0(gVar) : null);
        }
        return d0Var == null ? this : d0Var;
    }

    public final d0 m(e0 e0Var) {
        return new d0(this.f21190b, e0Var);
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public kotlin.reflect.x.internal.l0.b.h o() {
        kotlin.reflect.x.internal.l0.b.h o = this.f21190b.iterator().next().O0().o();
        l.e(o, "intersectedTypes.iterato…xt().constructor.builtIns");
        return o;
    }

    public String toString() {
        return k(this, null, 1, null);
    }

    private d0(Collection<? extends e0> collection, e0 e0Var) {
        this(collection);
        this.a = e0Var;
    }
}
