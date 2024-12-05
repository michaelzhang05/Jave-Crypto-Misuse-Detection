package kotlin.reflect.x.internal.l0.d.a.l0;

import java.util.Iterator;
import kotlin.collections.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.c;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.k.h;
import kotlin.sequences.Sequence;
import kotlin.sequences.n;

/* compiled from: LazyJavaAnnotations.kt */
/* loaded from: classes2.dex */
public final class d implements g {

    /* renamed from: f, reason: collision with root package name */
    private final g f19968f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.d.a.n0.d f19969g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f19970h;

    /* renamed from: i, reason: collision with root package name */
    private final h<kotlin.reflect.x.internal.l0.d.a.n0.a, c> f19971i;

    /* compiled from: LazyJavaAnnotations.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function1<kotlin.reflect.x.internal.l0.d.a.n0.a, c> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c invoke(kotlin.reflect.x.internal.l0.d.a.n0.a aVar) {
            l.f(aVar, "annotation");
            return kotlin.reflect.x.internal.l0.d.a.j0.c.a.e(aVar, d.this.f19968f, d.this.f19970h);
        }
    }

    public d(g gVar, kotlin.reflect.x.internal.l0.d.a.n0.d dVar, boolean z) {
        l.f(gVar, "c");
        l.f(dVar, "annotationOwner");
        this.f19968f = gVar;
        this.f19969g = dVar;
        this.f19970h = z;
        this.f19971i = gVar.a().u().i(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
    public boolean A(kotlin.reflect.x.internal.l0.f.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
    public c e(kotlin.reflect.x.internal.l0.f.c cVar) {
        c invoke;
        l.f(cVar, "fqName");
        kotlin.reflect.x.internal.l0.d.a.n0.a e2 = this.f19969g.e(cVar);
        return (e2 == null || (invoke = this.f19971i.invoke(e2)) == null) ? kotlin.reflect.x.internal.l0.d.a.j0.c.a.a(cVar, this.f19969g, this.f19968f) : invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
    public boolean isEmpty() {
        return this.f19969g.getAnnotations().isEmpty() && !this.f19969g.l();
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        Sequence I;
        Sequence u;
        Sequence x;
        Sequence n;
        I = b0.I(this.f19969g.getAnnotations());
        u = n.u(I, this.f19971i);
        x = n.x(u, kotlin.reflect.x.internal.l0.d.a.j0.c.a.a(k.a.y, this.f19969g, this.f19968f));
        n = n.n(x);
        return n.iterator();
    }

    public /* synthetic */ d(g gVar, kotlin.reflect.x.internal.l0.d.a.n0.d dVar, boolean z, int i2, kotlin.jvm.internal.g gVar2) {
        this(gVar, dVar, (i2 & 4) != 0 ? false : z);
    }
}
