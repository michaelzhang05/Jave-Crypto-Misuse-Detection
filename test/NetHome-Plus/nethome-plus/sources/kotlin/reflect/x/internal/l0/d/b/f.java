package kotlin.reflect.x.internal.l0.d.b;

import com.google.android.gms.ads.AdRequest;
import java.util.List;
import kotlin.collections.s;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.c1;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.j0;
import kotlin.reflect.x.internal.l0.c.b.c;
import kotlin.reflect.x.internal.l0.d.a.d;
import kotlin.reflect.x.internal.l0.d.a.j0.f;
import kotlin.reflect.x.internal.l0.d.a.j0.g;
import kotlin.reflect.x.internal.l0.d.a.l0.c;
import kotlin.reflect.x.internal.l0.d.a.l0.i;
import kotlin.reflect.x.internal.l0.d.a.p;
import kotlin.reflect.x.internal.l0.d.a.t;
import kotlin.reflect.x.internal.l0.d.a.w;
import kotlin.reflect.x.internal.l0.d.b.w;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.j.b.j;
import kotlin.reflect.x.internal.l0.j.b.l;
import kotlin.reflect.x.internal.l0.j.b.r;
import kotlin.reflect.x.internal.l0.k.n;
import kotlin.reflect.x.internal.l0.l.o;
import kotlin.reflect.x.internal.l0.l.t1.m;

/* compiled from: DeserializationComponentsForJava.kt */
/* loaded from: classes2.dex */
public final class f {

    /* compiled from: DeserializationComponentsForJava.kt */
    /* loaded from: classes2.dex */
    public static final class a implements t {
        a() {
        }

        @Override // kotlin.reflect.x.internal.l0.d.a.t
        public List<kotlin.reflect.x.internal.l0.d.a.n0.a> a(b bVar) {
            l.f(bVar, "classId");
            return null;
        }
    }

    public static final e a(g0 g0Var, n nVar, j0 j0Var, kotlin.reflect.x.internal.l0.d.a.l0.f fVar, o oVar, g gVar, r rVar) {
        List e2;
        l.f(g0Var, "module");
        l.f(nVar, "storageManager");
        l.f(j0Var, "notFoundClasses");
        l.f(fVar, "lazyJavaPackageFragmentProvider");
        l.f(oVar, "reflectKotlinClassFinder");
        l.f(gVar, "deserializedDescriptorResolver");
        l.f(rVar, "errorReporter");
        h hVar = new h(oVar, gVar);
        c cVar = new c(g0Var, j0Var, nVar, oVar);
        l.a aVar = l.a.a;
        c.a aVar2 = c.a.a;
        j a2 = j.a.a();
        m a3 = kotlin.reflect.x.internal.l0.l.t1.l.f21311b.a();
        e2 = s.e(o.a);
        return new e(nVar, g0Var, aVar, hVar, cVar, fVar, j0Var, rVar, aVar2, a2, a3, new kotlin.reflect.x.internal.l0.l.v1.a(e2));
    }

    public static final kotlin.reflect.x.internal.l0.d.a.l0.f b(kotlin.reflect.x.internal.l0.d.a.o oVar, g0 g0Var, n nVar, j0 j0Var, o oVar2, g gVar, r rVar, kotlin.reflect.x.internal.l0.d.a.m0.b bVar, i iVar, w wVar) {
        List i2;
        kotlin.jvm.internal.l.f(oVar, "javaClassFinder");
        kotlin.jvm.internal.l.f(g0Var, "module");
        kotlin.jvm.internal.l.f(nVar, "storageManager");
        kotlin.jvm.internal.l.f(j0Var, "notFoundClasses");
        kotlin.jvm.internal.l.f(oVar2, "reflectKotlinClassFinder");
        kotlin.jvm.internal.l.f(gVar, "deserializedDescriptorResolver");
        kotlin.jvm.internal.l.f(rVar, "errorReporter");
        kotlin.jvm.internal.l.f(bVar, "javaSourceElementFactory");
        kotlin.jvm.internal.l.f(iVar, "singleModuleClassResolver");
        kotlin.jvm.internal.l.f(wVar, "packagePartProvider");
        kotlin.reflect.x.internal.l0.d.a.j0.j jVar = kotlin.reflect.x.internal.l0.d.a.j0.j.a;
        kotlin.jvm.internal.l.e(jVar, "DO_NOTHING");
        g gVar2 = g.a;
        kotlin.jvm.internal.l.e(gVar2, "EMPTY");
        f.a aVar = f.a.a;
        i2 = kotlin.collections.t.i();
        kotlin.reflect.x.internal.l0.i.v.b bVar2 = new kotlin.reflect.x.internal.l0.i.v.b(nVar, i2);
        c1.a aVar2 = c1.a.a;
        c.a aVar3 = c.a.a;
        kotlin.reflect.x.internal.l0.b.j jVar2 = new kotlin.reflect.x.internal.l0.b.j(g0Var, j0Var);
        w.b bVar3 = w.a;
        d dVar = new d(bVar3.a());
        c.b bVar4 = c.b.f19967b;
        return new kotlin.reflect.x.internal.l0.d.a.l0.f(new kotlin.reflect.x.internal.l0.d.a.l0.b(nVar, oVar, oVar2, gVar, jVar, rVar, gVar2, aVar, bVar2, bVar, iVar, wVar, aVar2, aVar3, g0Var, jVar2, dVar, new kotlin.reflect.x.internal.l0.d.a.o0.l(new kotlin.reflect.x.internal.l0.d.a.o0.d(bVar4)), p.a.a, bVar4, kotlin.reflect.x.internal.l0.l.t1.l.f21311b.a(), bVar3.a(), new a(), null, 8388608, null));
    }

    public static /* synthetic */ kotlin.reflect.x.internal.l0.d.a.l0.f c(kotlin.reflect.x.internal.l0.d.a.o oVar, g0 g0Var, n nVar, j0 j0Var, o oVar2, g gVar, r rVar, kotlin.reflect.x.internal.l0.d.a.m0.b bVar, i iVar, w wVar, int i2, Object obj) {
        return b(oVar, g0Var, nVar, j0Var, oVar2, gVar, rVar, bVar, iVar, (i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? w.a.a : wVar);
    }
}
