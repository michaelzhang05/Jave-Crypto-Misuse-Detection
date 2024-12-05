package kotlin.reflect.x.internal.l0.d.b;

import com.google.android.gms.ads.AdRequest;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.j0;
import kotlin.reflect.jvm.internal.impl.descriptors.o1.a;
import kotlin.reflect.jvm.internal.impl.descriptors.o1.c;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.i;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.x;
import kotlin.reflect.x.internal.l0.b.q.f;
import kotlin.reflect.x.internal.l0.b.q.h;
import kotlin.reflect.x.internal.l0.d.a.l0.j;
import kotlin.reflect.x.internal.l0.d.a.m0.b;
import kotlin.reflect.x.internal.l0.d.a.o;
import kotlin.reflect.x.internal.l0.i.u.c;
import kotlin.reflect.x.internal.l0.j.b.k;
import kotlin.reflect.x.internal.l0.j.b.l;
import kotlin.reflect.x.internal.l0.j.b.r;
import kotlin.reflect.x.internal.l0.j.b.v;
import kotlin.reflect.x.internal.l0.k.f;
import kotlin.reflect.x.internal.l0.k.n;
import kotlin.reflect.x.internal.l0.l.t1.m;

/* compiled from: DeserializationComponentsForJava.kt */
/* loaded from: classes2.dex */
public final class e {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final k f20294b;

    /* compiled from: DeserializationComponentsForJava.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* compiled from: DeserializationComponentsForJava.kt */
        /* renamed from: kotlin.f0.x.e.l0.d.b.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0309a {
            private final e a;

            /* renamed from: b, reason: collision with root package name */
            private final g f20295b;

            public C0309a(e eVar, g gVar) {
                l.f(eVar, "deserializationComponentsForJava");
                l.f(gVar, "deserializedDescriptorResolver");
                this.a = eVar;
                this.f20295b = gVar;
            }

            public final e a() {
                return this.a;
            }

            public final g b() {
                return this.f20295b;
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final C0309a a(o oVar, o oVar2, o oVar3, String str, r rVar, b bVar) {
            List i2;
            List l;
            l.f(oVar, "kotlinClassFinder");
            l.f(oVar2, "jvmBuiltInsKotlinClassFinder");
            l.f(oVar3, "javaClassFinder");
            l.f(str, "moduleName");
            l.f(rVar, "errorReporter");
            l.f(bVar, "javaSourceElementFactory");
            f fVar = new f("DeserializationComponentsForJava.ModuleData");
            kotlin.reflect.x.internal.l0.b.q.f fVar2 = new kotlin.reflect.x.internal.l0.b.q.f(fVar, f.a.FROM_DEPENDENCIES);
            kotlin.reflect.x.internal.l0.f.f C = kotlin.reflect.x.internal.l0.f.f.C('<' + str + '>');
            l.e(C, "special(\"<$moduleName>\")");
            x xVar = new x(C, fVar, fVar2, null, null, null, 56, null);
            fVar2.D0(xVar);
            fVar2.I0(xVar, true);
            g gVar = new g();
            j jVar = new j();
            j0 j0Var = new j0(fVar, xVar);
            kotlin.reflect.x.internal.l0.d.a.l0.f c2 = f.c(oVar3, xVar, fVar, j0Var, oVar, gVar, rVar, bVar, jVar, null, AdRequest.MAX_CONTENT_URL_LENGTH, null);
            e a = f.a(xVar, fVar, j0Var, c2, oVar, gVar, rVar);
            gVar.l(a);
            kotlin.reflect.x.internal.l0.d.a.j0.g gVar2 = kotlin.reflect.x.internal.l0.d.a.j0.g.a;
            l.e(gVar2, "EMPTY");
            c cVar = new c(c2, gVar2);
            jVar.c(cVar);
            kotlin.reflect.x.internal.l0.b.q.g H0 = fVar2.H0();
            kotlin.reflect.x.internal.l0.b.q.g H02 = fVar2.H0();
            l.a aVar = l.a.a;
            m a2 = kotlin.reflect.x.internal.l0.l.t1.l.f21311b.a();
            i2 = t.i();
            h hVar = new h(fVar, oVar2, xVar, j0Var, H0, H02, aVar, a2, new kotlin.reflect.x.internal.l0.i.v.b(fVar, i2));
            xVar.Z0(xVar);
            l = t.l(cVar.a(), hVar);
            xVar.T0(new i(l, "CompositeProvider@RuntimeModuleData for " + xVar));
            return new C0309a(a, gVar);
        }
    }

    public e(n nVar, g0 g0Var, kotlin.reflect.x.internal.l0.j.b.l lVar, h hVar, c cVar, kotlin.reflect.x.internal.l0.d.a.l0.f fVar, j0 j0Var, r rVar, kotlin.reflect.x.internal.l0.c.b.c cVar2, kotlin.reflect.x.internal.l0.j.b.j jVar, kotlin.reflect.x.internal.l0.l.t1.l lVar2, kotlin.reflect.x.internal.l0.l.v1.a aVar) {
        List i2;
        List i3;
        kotlin.reflect.jvm.internal.impl.descriptors.o1.a H0;
        kotlin.jvm.internal.l.f(nVar, "storageManager");
        kotlin.jvm.internal.l.f(g0Var, "moduleDescriptor");
        kotlin.jvm.internal.l.f(lVar, "configuration");
        kotlin.jvm.internal.l.f(hVar, "classDataFinder");
        kotlin.jvm.internal.l.f(cVar, "annotationAndConstantLoader");
        kotlin.jvm.internal.l.f(fVar, "packageFragmentProvider");
        kotlin.jvm.internal.l.f(j0Var, "notFoundClasses");
        kotlin.jvm.internal.l.f(rVar, "errorReporter");
        kotlin.jvm.internal.l.f(cVar2, "lookupTracker");
        kotlin.jvm.internal.l.f(jVar, "contractDeserializer");
        kotlin.jvm.internal.l.f(lVar2, "kotlinTypeChecker");
        kotlin.jvm.internal.l.f(aVar, "typeAttributeTranslators");
        kotlin.reflect.x.internal.l0.b.h o = g0Var.o();
        kotlin.reflect.x.internal.l0.b.q.f fVar2 = o instanceof kotlin.reflect.x.internal.l0.b.q.f ? (kotlin.reflect.x.internal.l0.b.q.f) o : null;
        v.a aVar2 = v.a.a;
        i iVar = i.a;
        i2 = t.i();
        kotlin.reflect.jvm.internal.impl.descriptors.o1.a aVar3 = (fVar2 == null || (H0 = fVar2.H0()) == null) ? a.C0367a.a : H0;
        kotlin.reflect.jvm.internal.impl.descriptors.o1.c cVar3 = (fVar2 == null || (cVar3 = fVar2.H0()) == null) ? c.b.a : cVar3;
        kotlin.reflect.jvm.internal.impl.protobuf.f a2 = kotlin.reflect.x.internal.l0.e.a0.b.i.a.a();
        i3 = t.i();
        this.f20294b = new k(nVar, g0Var, lVar, hVar, cVar, fVar, aVar2, rVar, cVar2, iVar, i2, j0Var, jVar, aVar3, cVar3, a2, lVar2, new kotlin.reflect.x.internal.l0.i.v.b(nVar, i3), null, aVar.a(), 262144, null);
    }

    public final k a() {
        return this.f20294b;
    }
}
