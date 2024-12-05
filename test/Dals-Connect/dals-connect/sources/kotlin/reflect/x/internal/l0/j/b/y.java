package kotlin.reflect.x.internal.l0.j.b;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.n0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l;
import kotlin.ranges.f;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.e.m;
import kotlin.reflect.x.internal.l0.e.z.a;
import kotlin.reflect.x.internal.l0.e.z.c;
import kotlin.reflect.x.internal.l0.f.b;

/* compiled from: ProtoBasedClassDataFinder.kt */
/* loaded from: classes2.dex */
public final class y implements h {
    private final c a;

    /* renamed from: b, reason: collision with root package name */
    private final a f21144b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1<b, z0> f21145c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<b, kotlin.reflect.x.internal.l0.e.c> f21146d;

    /* JADX WARN: Multi-variable type inference failed */
    public y(m mVar, c cVar, a aVar, Function1<? super b, ? extends z0> function1) {
        int t;
        int e2;
        int b2;
        l.f(mVar, "proto");
        l.f(cVar, "nameResolver");
        l.f(aVar, "metadataVersion");
        l.f(function1, "classSource");
        this.a = cVar;
        this.f21144b = aVar;
        this.f21145c = function1;
        List<kotlin.reflect.x.internal.l0.e.c> L = mVar.L();
        l.e(L, "proto.class_List");
        t = u.t(L, 10);
        e2 = n0.e(t);
        b2 = f.b(e2, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(b2);
        for (Object obj : L) {
            linkedHashMap.put(x.a(this.a, ((kotlin.reflect.x.internal.l0.e.c) obj).G0()), obj);
        }
        this.f21146d = linkedHashMap;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.h
    public g a(b bVar) {
        l.f(bVar, "classId");
        kotlin.reflect.x.internal.l0.e.c cVar = this.f21146d.get(bVar);
        if (cVar == null) {
            return null;
        }
        return new g(this.a, cVar, this.f21144b, this.f21145c.invoke(bVar));
    }

    public final Collection<b> b() {
        return this.f21146d.keySet();
    }
}
