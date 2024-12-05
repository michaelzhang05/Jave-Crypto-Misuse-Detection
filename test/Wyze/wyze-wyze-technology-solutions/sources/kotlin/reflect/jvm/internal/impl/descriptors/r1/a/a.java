package kotlin.reflect.jvm.internal.impl.descriptors.r1.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.b0;
import kotlin.collections.s;
import kotlin.reflect.x.internal.l0.d.b.c0.a;
import kotlin.reflect.x.internal.l0.d.b.p;
import kotlin.reflect.x.internal.l0.d.b.q;

/* compiled from: PackagePartScopeCache.kt */
/* loaded from: classes2.dex */
public final class a {
    private final kotlin.reflect.x.internal.l0.d.b.g a;

    /* renamed from: b, reason: collision with root package name */
    private final g f21808b;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap<kotlin.reflect.x.internal.l0.f.b, kotlin.reflect.x.internal.l0.i.w.h> f21809c;

    public a(kotlin.reflect.x.internal.l0.d.b.g gVar, g gVar2) {
        kotlin.jvm.internal.l.f(gVar, "resolver");
        kotlin.jvm.internal.l.f(gVar2, "kotlinClassFinder");
        this.a = gVar;
        this.f21808b = gVar2;
        this.f21809c = new ConcurrentHashMap<>();
    }

    public final kotlin.reflect.x.internal.l0.i.w.h a(f fVar) {
        Collection e2;
        List y0;
        kotlin.jvm.internal.l.f(fVar, "fileClass");
        ConcurrentHashMap<kotlin.reflect.x.internal.l0.f.b, kotlin.reflect.x.internal.l0.i.w.h> concurrentHashMap = this.f21809c;
        kotlin.reflect.x.internal.l0.f.b c2 = fVar.c();
        kotlin.reflect.x.internal.l0.i.w.h hVar = concurrentHashMap.get(c2);
        if (hVar == null) {
            kotlin.reflect.x.internal.l0.f.c h2 = fVar.c().h();
            kotlin.jvm.internal.l.e(h2, "fileClass.classId.packageFqName");
            if (fVar.a().c() == a.EnumC0304a.MULTIFILE_CLASS) {
                List<String> f2 = fVar.a().f();
                e2 = new ArrayList();
                Iterator<T> it = f2.iterator();
                while (it.hasNext()) {
                    kotlin.reflect.x.internal.l0.f.b m = kotlin.reflect.x.internal.l0.f.b.m(kotlin.reflect.x.internal.l0.i.u.d.d((String) it.next()).e());
                    kotlin.jvm.internal.l.e(m, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                    q b2 = p.b(this.f21808b, m);
                    if (b2 != null) {
                        e2.add(b2);
                    }
                }
            } else {
                e2 = s.e(fVar);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.p1.m mVar = new kotlin.reflect.jvm.internal.impl.descriptors.p1.m(this.a.d().p(), h2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = e2.iterator();
            while (it2.hasNext()) {
                kotlin.reflect.x.internal.l0.i.w.h b3 = this.a.b(mVar, (q) it2.next());
                if (b3 != null) {
                    arrayList.add(b3);
                }
            }
            y0 = b0.y0(arrayList);
            kotlin.reflect.x.internal.l0.i.w.h a = kotlin.reflect.x.internal.l0.i.w.b.f20906b.a("package " + h2 + " (" + fVar + ')', y0);
            kotlin.reflect.x.internal.l0.i.w.h putIfAbsent = concurrentHashMap.putIfAbsent(c2, a);
            hVar = putIfAbsent == null ? a : putIfAbsent;
        }
        kotlin.jvm.internal.l.e(hVar, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
        return hVar;
    }
}
