package kotlin.reflect.x.internal.l0.l.t1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.g1;
import kotlin.reflect.x.internal.l0.l.q1;

/* compiled from: NewCapturedType.kt */
/* loaded from: classes2.dex */
public final class j implements kotlin.reflect.x.internal.l0.i.q.a.b {
    private final g1 a;

    /* renamed from: b, reason: collision with root package name */
    private Function0<? extends List<? extends q1>> f21302b;

    /* renamed from: c, reason: collision with root package name */
    private final j f21303c;

    /* renamed from: d, reason: collision with root package name */
    private final e1 f21304d;

    /* renamed from: e, reason: collision with root package name */
    private final Lazy f21305e;

    /* compiled from: NewCapturedType.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function0<List<? extends q1>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<q1> f21306f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends q1> list) {
            super(0);
            this.f21306f = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends q1> invoke() {
            return this.f21306f;
        }
    }

    /* compiled from: NewCapturedType.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function0<List<? extends q1>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends q1> invoke() {
            Function0 function0 = j.this.f21302b;
            if (function0 != null) {
                return (List) function0.invoke();
            }
            return null;
        }
    }

    /* compiled from: NewCapturedType.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function0<List<? extends q1>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<q1> f21308f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends q1> list) {
            super(0);
            this.f21308f = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends q1> invoke() {
            return this.f21308f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewCapturedType.kt */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements Function0<List<? extends q1>> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ g f21310g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(0);
            this.f21310g = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends q1> invoke() {
            int t;
            List<q1> a = j.this.a();
            g gVar = this.f21310g;
            t = u.t(a, 10);
            ArrayList arrayList = new ArrayList(t);
            Iterator<T> it = a.iterator();
            while (it.hasNext()) {
                arrayList.add(((q1) it.next()).Y0(gVar));
            }
            return arrayList;
        }
    }

    public j(g1 g1Var, Function0<? extends List<? extends q1>> function0, j jVar, e1 e1Var) {
        Lazy a2;
        l.f(g1Var, "projection");
        this.a = g1Var;
        this.f21302b = function0;
        this.f21303c = jVar;
        this.f21304d = e1Var;
        a2 = i.a(LazyThreadSafetyMode.PUBLICATION, new b());
        this.f21305e = a2;
    }

    private final List<q1> i() {
        return (List) this.f21305e.getValue();
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    /* renamed from: c */
    public h w() {
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
        if (!l.a(j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        j jVar = (j) obj;
        j jVar2 = this.f21303c;
        if (jVar2 == null) {
            jVar2 = this;
        }
        j jVar3 = jVar.f21303c;
        if (jVar3 != null) {
            jVar = jVar3;
        }
        return jVar2 == jVar;
    }

    @Override // kotlin.reflect.x.internal.l0.i.q.a.b
    public g1 f() {
        return this.a;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public List<e1> getParameters() {
        List<e1> i2;
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<q1> a() {
        List<q1> i2;
        List<q1> i3 = i();
        if (i3 != null) {
            return i3;
        }
        i2 = t.i();
        return i2;
    }

    public int hashCode() {
        j jVar = this.f21303c;
        return jVar != null ? jVar.hashCode() : super.hashCode();
    }

    public final void j(List<? extends q1> list) {
        l.f(list, "supertypes");
        Function0<? extends List<? extends q1>> function0 = this.f21302b;
        this.f21302b = new c(list);
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public j b(g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        g1 b2 = f().b(gVar);
        l.e(b2, "projection.refine(kotlinTypeRefiner)");
        d dVar = this.f21302b != null ? new d(gVar) : null;
        j jVar = this.f21303c;
        if (jVar == null) {
            jVar = this;
        }
        return new j(b2, dVar, jVar, this.f21304d);
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public kotlin.reflect.x.internal.l0.b.h o() {
        e0 type = f().getType();
        l.e(type, "projection.type");
        return kotlin.reflect.x.internal.l0.l.x1.a.h(type);
    }

    public String toString() {
        return "CapturedType(" + f() + ')';
    }

    public /* synthetic */ j(g1 g1Var, Function0 function0, j jVar, e1 e1Var, int i2, g gVar) {
        this(g1Var, (i2 & 2) != 0 ? null : function0, (i2 & 4) != 0 ? null : jVar, (i2 & 8) != 0 ? null : e1Var);
    }

    public /* synthetic */ j(g1 g1Var, List list, j jVar, int i2, g gVar) {
        this(g1Var, list, (i2 & 4) != 0 ? null : jVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(g1 g1Var, List<? extends q1> list, j jVar) {
        this(g1Var, new a(list), jVar, null, 8, null);
        l.f(g1Var, "projection");
        l.f(list, "supertypes");
    }
}
