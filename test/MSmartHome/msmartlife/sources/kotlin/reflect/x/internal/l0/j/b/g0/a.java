package kotlin.reflect.x.internal.l0.j.b.g0;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.c;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.x.internal.l0.k.i;
import kotlin.reflect.x.internal.l0.k.m;
import kotlin.reflect.x.internal.l0.k.n;

/* compiled from: DeserializedAnnotations.kt */
/* loaded from: classes2.dex */
public class a implements g {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f21002f = {b0.g(new v(b0.b(a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: g, reason: collision with root package name */
    private final i f21003g;

    public a(n nVar, Function0<? extends List<? extends c>> function0) {
        l.f(nVar, "storageManager");
        l.f(function0, "compute");
        this.f21003g = nVar.d(function0);
    }

    private final List<c> a() {
        return (List) m.a(this.f21003g, this, f21002f[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
    public boolean A(kotlin.reflect.x.internal.l0.f.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
    public c e(kotlin.reflect.x.internal.l0.f.c cVar) {
        return g.b.a(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
    public boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        return a().iterator();
    }
}
