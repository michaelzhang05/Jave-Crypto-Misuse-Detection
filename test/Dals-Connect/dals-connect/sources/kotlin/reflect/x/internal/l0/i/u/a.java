package kotlin.reflect.x.internal.l0.i.u;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.y;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.x.internal.l0.f.f;

/* compiled from: SyntheticJavaPartsProvider.kt */
/* loaded from: classes2.dex */
public final class a implements f {

    /* renamed from: b, reason: collision with root package name */
    private final List<f> f20895b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends f> list) {
        l.f(list, "inner");
        this.f20895b = list;
    }

    @Override // kotlin.reflect.x.internal.l0.i.u.f
    public List<f> a(e eVar) {
        l.f(eVar, "thisDescriptor");
        List<f> list = this.f20895b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            y.y(arrayList, ((f) it.next()).a(eVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.x.internal.l0.i.u.f
    public void b(e eVar, f fVar, Collection<y0> collection) {
        l.f(eVar, "thisDescriptor");
        l.f(fVar, "name");
        l.f(collection, "result");
        Iterator<T> it = this.f20895b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).b(eVar, fVar, collection);
        }
    }

    @Override // kotlin.reflect.x.internal.l0.i.u.f
    public void c(e eVar, List<d> list) {
        l.f(eVar, "thisDescriptor");
        l.f(list, "result");
        Iterator<T> it = this.f20895b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).c(eVar, list);
        }
    }

    @Override // kotlin.reflect.x.internal.l0.i.u.f
    public List<f> d(e eVar) {
        l.f(eVar, "thisDescriptor");
        List<f> list = this.f20895b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            y.y(arrayList, ((f) it.next()).d(eVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.x.internal.l0.i.u.f
    public void e(e eVar, f fVar, Collection<y0> collection) {
        l.f(eVar, "thisDescriptor");
        l.f(fVar, "name");
        l.f(collection, "result");
        Iterator<T> it = this.f20895b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).e(eVar, fVar, collection);
        }
    }
}
