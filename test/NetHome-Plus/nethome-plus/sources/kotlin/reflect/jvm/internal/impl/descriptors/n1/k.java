package kotlin.reflect.jvm.internal.impl.descriptors.n1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;

/* compiled from: Annotations.kt */
/* loaded from: classes2.dex */
public final class k implements g {

    /* renamed from: f, reason: collision with root package name */
    private final List<g> f21681f;

    /* compiled from: Annotations.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function1<g, c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.x.internal.l0.f.c f21682f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.x.internal.l0.f.c cVar) {
            super(1);
            this.f21682f = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c invoke(g gVar) {
            kotlin.jvm.internal.l.f(gVar, "it");
            return gVar.e(this.f21682f);
        }
    }

    /* compiled from: Annotations.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function1<g, Sequence<? extends c>> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f21683f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Sequence<c> invoke(g gVar) {
            Sequence<c> I;
            kotlin.jvm.internal.l.f(gVar, "it");
            I = b0.I(gVar);
            return I;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(List<? extends g> list) {
        kotlin.jvm.internal.l.f(list, "delegates");
        this.f21681f = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
    public boolean A(kotlin.reflect.x.internal.l0.f.c cVar) {
        Sequence I;
        kotlin.jvm.internal.l.f(cVar, "fqName");
        I = b0.I(this.f21681f);
        Iterator it = I.iterator();
        while (it.hasNext()) {
            if (((g) it.next()).A(cVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
    public c e(kotlin.reflect.x.internal.l0.f.c cVar) {
        Sequence I;
        Sequence v;
        kotlin.jvm.internal.l.f(cVar, "fqName");
        I = b0.I(this.f21681f);
        v = kotlin.sequences.n.v(I, new a(cVar));
        return (c) kotlin.sequences.i.o(v);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
    public boolean isEmpty() {
        List<g> list = this.f21681f;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        Sequence I;
        Sequence p;
        I = b0.I(this.f21681f);
        p = kotlin.sequences.n.p(I, b.f21683f);
        return p.iterator();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(kotlin.reflect.jvm.internal.impl.descriptors.n1.g... r2) {
        /*
            r1 = this;
            java.lang.String r0 = "delegates"
            kotlin.jvm.internal.l.f(r2, r0)
            java.util.List r2 = kotlin.collections.j.X(r2)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.n1.k.<init>(kotlin.reflect.jvm.internal.impl.descriptors.n1.g[]):void");
    }
}
