package kotlin.reflect.x.internal.l0.d.a.o0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.x.internal.l0.d.a.l0.g;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.l0;
import kotlin.reflect.x.internal.l0.l.n1;
import kotlin.reflect.x.internal.l0.l.q1;

/* compiled from: signatureEnhancement.kt */
/* loaded from: classes2.dex */
public final class l {
    private final kotlin.reflect.x.internal.l0.d.a.o0.d a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: signatureEnhancement.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function1<q1, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f20174f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(q1 q1Var) {
            h w = q1Var.O0().w();
            if (w == null) {
                return Boolean.FALSE;
            }
            f name = w.getName();
            kotlin.reflect.x.internal.l0.b.q.c cVar = kotlin.reflect.x.internal.l0.b.q.c.a;
            return Boolean.valueOf(kotlin.jvm.internal.l.a(name, cVar.h().g()) && kotlin.jvm.internal.l.a(kotlin.reflect.x.internal.l0.i.t.a.d(w), cVar.h()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: signatureEnhancement.kt */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function1<kotlin.reflect.jvm.internal.impl.descriptors.b, e0> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f20175f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e0 invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            kotlin.jvm.internal.l.f(bVar, "it");
            w0 m0 = bVar.m0();
            kotlin.jvm.internal.l.c(m0);
            e0 type = m0.getType();
            kotlin.jvm.internal.l.e(type, "it.extensionReceiverParameter!!.type");
            return type;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: signatureEnhancement.kt */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements Function1<kotlin.reflect.jvm.internal.impl.descriptors.b, e0> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f20176f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e0 invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            kotlin.jvm.internal.l.f(bVar, "it");
            e0 returnType = bVar.getReturnType();
            kotlin.jvm.internal.l.c(returnType);
            return returnType;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: signatureEnhancement.kt */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements Function1<kotlin.reflect.jvm.internal.impl.descriptors.b, e0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i1 f20177f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(i1 i1Var) {
            super(1);
            this.f20177f = i1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e0 invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            kotlin.jvm.internal.l.f(bVar, "it");
            e0 type = bVar.h().get(this.f20177f.f()).getType();
            kotlin.jvm.internal.l.e(type, "it.valueParameters[p.index].type");
            return type;
        }
    }

    /* compiled from: signatureEnhancement.kt */
    /* loaded from: classes2.dex */
    static final class e extends Lambda implements Function1<q1, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f20178f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(q1 q1Var) {
            kotlin.jvm.internal.l.f(q1Var, "it");
            return Boolean.valueOf(q1Var instanceof l0);
        }
    }

    public l(kotlin.reflect.x.internal.l0.d.a.o0.d dVar) {
        kotlin.jvm.internal.l.f(dVar, "typeEnhancement");
        this.a = dVar;
    }

    private final boolean a(e0 e0Var) {
        return n1.c(e0Var, a.f20174f);
    }

    private final e0 b(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, kotlin.reflect.jvm.internal.impl.descriptors.n1.a aVar, boolean z, g gVar, kotlin.reflect.x.internal.l0.d.a.b bVar2, q qVar, boolean z2, Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.b, ? extends e0> function1) {
        int t;
        n nVar = new n(aVar, z, gVar, bVar2, false, 16, null);
        e0 invoke = function1.invoke(bVar);
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> e2 = bVar.e();
        kotlin.jvm.internal.l.e(e2, "overriddenDescriptors");
        t = u.t(e2, 10);
        ArrayList arrayList = new ArrayList(t);
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar3 : e2) {
            kotlin.jvm.internal.l.e(bVar3, "it");
            arrayList.add(function1.invoke(bVar3));
        }
        return c(nVar, invoke, arrayList, qVar, z2);
    }

    private final e0 c(n nVar, e0 e0Var, List<? extends e0> list, q qVar, boolean z) {
        return this.a.a(e0Var, nVar.b(e0Var, list, qVar, z), nVar.u());
    }

    static /* synthetic */ e0 d(l lVar, kotlin.reflect.jvm.internal.impl.descriptors.b bVar, kotlin.reflect.jvm.internal.impl.descriptors.n1.a aVar, boolean z, g gVar, kotlin.reflect.x.internal.l0.d.a.b bVar2, q qVar, boolean z2, Function1 function1, int i2, Object obj) {
        return lVar.b(bVar, aVar, z, gVar, bVar2, qVar, (i2 & 32) != 0 ? false : z2, function1);
    }

    static /* synthetic */ e0 e(l lVar, n nVar, e0 e0Var, List list, q qVar, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            qVar = null;
        }
        return lVar.c(nVar, e0Var, list, qVar, (i2 & 8) != 0 ? false : z);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> D f(D r21, kotlin.reflect.x.internal.l0.d.a.l0.g r22) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.d.a.o0.l.f(kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.f0.x.e.l0.d.a.l0.g):kotlin.reflect.jvm.internal.impl.descriptors.b");
    }

    private final e0 j(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, i1 i1Var, g gVar, q qVar, boolean z, Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.b, ? extends e0> function1) {
        g h2;
        return b(bVar, i1Var, false, (i1Var == null || (h2 = kotlin.reflect.x.internal.l0.d.a.l0.a.h(gVar, i1Var.getAnnotations())) == null) ? gVar : h2, kotlin.reflect.x.internal.l0.d.a.b.VALUE_PARAMETER, qVar, z, function1);
    }

    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> kotlin.reflect.jvm.internal.impl.descriptors.n1.g k(D d2, g gVar) {
        int t;
        List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c> i0;
        h a2 = s.a(d2);
        if (a2 == null) {
            return d2.getAnnotations();
        }
        kotlin.reflect.x.internal.l0.d.a.l0.l.f fVar = a2 instanceof kotlin.reflect.x.internal.l0.d.a.l0.l.f ? (kotlin.reflect.x.internal.l0.d.a.l0.l.f) a2 : null;
        List<kotlin.reflect.x.internal.l0.d.a.n0.a> R0 = fVar != null ? fVar.R0() : null;
        if (R0 == null || R0.isEmpty()) {
            return d2.getAnnotations();
        }
        t = u.t(R0, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = R0.iterator();
        while (it.hasNext()) {
            arrayList.add(new kotlin.reflect.x.internal.l0.d.a.l0.l.e(gVar, (kotlin.reflect.x.internal.l0.d.a.n0.a) it.next(), true));
        }
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c;
        i0 = b0.i0(d2.getAnnotations(), arrayList);
        return aVar.a(i0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> Collection<D> g(kotlin.reflect.x.internal.l0.d.a.l0.g gVar, Collection<? extends D> collection) {
        int t;
        kotlin.jvm.internal.l.f(gVar, "c");
        kotlin.jvm.internal.l.f(collection, "platformSignatures");
        t = u.t(collection, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(f((kotlin.reflect.jvm.internal.impl.descriptors.b) it.next(), gVar));
        }
        return arrayList;
    }

    public final e0 h(e0 e0Var, kotlin.reflect.x.internal.l0.d.a.l0.g gVar) {
        List i2;
        kotlin.jvm.internal.l.f(e0Var, "type");
        kotlin.jvm.internal.l.f(gVar, "context");
        n nVar = new n(null, false, gVar, kotlin.reflect.x.internal.l0.d.a.b.TYPE_USE, true);
        i2 = t.i();
        e0 e2 = e(this, nVar, e0Var, i2, null, false, 12, null);
        return e2 == null ? e0Var : e2;
    }

    public final List<e0> i(e1 e1Var, List<? extends e0> list, kotlin.reflect.x.internal.l0.d.a.l0.g gVar) {
        int t;
        List i2;
        kotlin.jvm.internal.l.f(e1Var, "typeParameter");
        kotlin.jvm.internal.l.f(list, "bounds");
        kotlin.jvm.internal.l.f(gVar, "context");
        t = u.t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        for (e0 e0Var : list) {
            if (!kotlin.reflect.x.internal.l0.l.x1.a.b(e0Var, e.f20178f)) {
                n nVar = new n(e1Var, false, gVar, kotlin.reflect.x.internal.l0.d.a.b.TYPE_PARAMETER_BOUNDS, false, 16, null);
                i2 = t.i();
                e0 e2 = e(this, nVar, e0Var, i2, null, false, 12, null);
                if (e2 != null) {
                    e0Var = e2;
                }
            }
            arrayList.add(e0Var);
        }
        return arrayList;
    }
}
