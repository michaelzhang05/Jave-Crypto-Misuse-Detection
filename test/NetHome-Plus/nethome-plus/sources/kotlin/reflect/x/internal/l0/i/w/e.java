package kotlin.reflect.x.internal.l0.i.w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.h;
import kotlin.reflect.x.internal.l0.i.j;
import kotlin.reflect.x.internal.l0.i.w.k;
import kotlin.reflect.x.internal.l0.k.i;
import kotlin.reflect.x.internal.l0.k.n;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: GivenFunctionsMemberScope.kt */
/* loaded from: classes2.dex */
public abstract class e extends i {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f20921b = {b0.g(new v(b0.b(e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f20922c;

    /* renamed from: d, reason: collision with root package name */
    private final i f20923d;

    /* compiled from: GivenFunctionsMemberScope.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function0<List<? extends m>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends m> invoke() {
            List<? extends m> k0;
            List<y> i2 = e.this.i();
            k0 = kotlin.collections.b0.k0(i2, e.this.j(i2));
            return k0;
        }
    }

    /* compiled from: GivenFunctionsMemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class b extends h {
        final /* synthetic */ ArrayList<m> a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f20925b;

        b(ArrayList<m> arrayList, e eVar) {
            this.a = arrayList;
            this.f20925b = eVar;
        }

        @Override // kotlin.reflect.x.internal.l0.i.i
        public void a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l.f(bVar, "fakeOverride");
            j.K(bVar, null);
            this.a.add(bVar);
        }

        @Override // kotlin.reflect.x.internal.l0.i.h
        protected void e(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, kotlin.reflect.jvm.internal.impl.descriptors.b bVar2) {
            l.f(bVar, "fromSuper");
            l.f(bVar2, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f20925b.l() + ": " + bVar + " vs " + bVar2).toString());
        }
    }

    public e(n nVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l.f(nVar, "storageManager");
        l.f(eVar, "containingClass");
        this.f20922c = eVar;
        this.f20923d = nVar.d(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<m> j(List<? extends y> list) {
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> i2;
        ArrayList arrayList = new ArrayList(3);
        Collection<e0> a2 = this.f20922c.g().a();
        l.e(a2, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            kotlin.collections.y.y(arrayList2, k.a.a(((e0) it.next()).q(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            f name = ((kotlin.reflect.jvm.internal.impl.descriptors.b) obj2).getName();
            Object obj3 = linkedHashMap.get(name);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(name, obj3);
            }
            ((List) obj3).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            f fVar = (f) entry.getKey();
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj4 : list2) {
                Boolean valueOf = Boolean.valueOf(((kotlin.reflect.jvm.internal.impl.descriptors.b) obj4) instanceof y);
                Object obj5 = linkedHashMap2.get(valueOf);
                if (obj5 == null) {
                    obj5 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj5);
                }
                ((List) obj5).add(obj4);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                j jVar = j.f20836b;
                if (booleanValue) {
                    i2 = new ArrayList<>();
                    for (Object obj6 : list) {
                        if (l.a(((y) obj6).getName(), fVar)) {
                            i2.add(obj6);
                        }
                    }
                } else {
                    i2 = t.i();
                }
                jVar.v(fVar, list3, i2, this.f20922c, new b(arrayList, this));
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.a.c(arrayList);
    }

    private final List<m> k() {
        return (List) kotlin.reflect.x.internal.l0.k.m.a(this.f20923d, this, f20921b[0]);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    public Collection<y0> a(f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        List<m> k2 = k();
        kotlin.reflect.jvm.internal.impl.utils.e eVar = new kotlin.reflect.jvm.internal.impl.utils.e();
        for (Object obj : k2) {
            if ((obj instanceof y0) && l.a(((y0) obj).getName(), fVar)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    public Collection<t0> c(f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        List<m> k2 = k();
        kotlin.reflect.jvm.internal.impl.utils.e eVar = new kotlin.reflect.jvm.internal.impl.utils.e();
        for (Object obj : k2) {
            if ((obj instanceof t0) && l.a(((t0) obj).getName(), fVar)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.k
    public Collection<m> g(d dVar, Function1<? super f, Boolean> function1) {
        List i2;
        l.f(dVar, "kindFilter");
        l.f(function1, "nameFilter");
        if (dVar.a(d.n.m())) {
            return k();
        }
        i2 = t.i();
        return i2;
    }

    protected abstract List<y> i();

    /* JADX INFO: Access modifiers changed from: protected */
    public final kotlin.reflect.jvm.internal.impl.descriptors.e l() {
        return this.f20922c;
    }
}
