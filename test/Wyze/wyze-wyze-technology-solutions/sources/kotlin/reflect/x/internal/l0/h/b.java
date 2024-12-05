package kotlin.reflect.x.internal.l0.h;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.z;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.x.internal.l0.f.d;
import kotlin.reflect.x.internal.l0.f.f;
import okhttp3.HttpUrl;

/* compiled from: ClassifierNamePolicy.kt */
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: ClassifierNamePolicy.kt */
    /* loaded from: classes2.dex */
    public static final class a implements b {
        public static final a a = new a();

        private a() {
        }

        @Override // kotlin.reflect.x.internal.l0.h.b
        public String a(h hVar, kotlin.reflect.x.internal.l0.h.c cVar) {
            l.f(hVar, "classifier");
            l.f(cVar, "renderer");
            if (hVar instanceof e1) {
                f name = ((e1) hVar).getName();
                l.e(name, "classifier.name");
                return cVar.v(name, false);
            }
            d m = kotlin.reflect.x.internal.l0.i.d.m(hVar);
            l.e(m, "getFqName(classifier)");
            return cVar.u(m);
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    /* renamed from: kotlin.f0.x.e.l0.h.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0331b implements b {
        public static final C0331b a = new C0331b();

        private C0331b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.h] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.i0] */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.m] */
        @Override // kotlin.reflect.x.internal.l0.h.b
        public String a(h hVar, kotlin.reflect.x.internal.l0.h.c cVar) {
            List E;
            l.f(hVar, "classifier");
            l.f(cVar, "renderer");
            if (hVar instanceof e1) {
                f name = ((e1) hVar).getName();
                l.e(name, "classifier.name");
                return cVar.v(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(hVar.getName());
                hVar = hVar.b();
            } while (hVar instanceof e);
            E = z.E(arrayList);
            return n.c(E);
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    /* loaded from: classes2.dex */
    public static final class c implements b {
        public static final c a = new c();

        private c() {
        }

        private final String b(h hVar) {
            f name = hVar.getName();
            l.e(name, "descriptor.name");
            String b2 = n.b(name);
            if (hVar instanceof e1) {
                return b2;
            }
            m b3 = hVar.b();
            l.e(b3, "descriptor.containingDeclaration");
            String c2 = c(b3);
            if (c2 == null || l.a(c2, HttpUrl.FRAGMENT_ENCODE_SET)) {
                return b2;
            }
            return c2 + '.' + b2;
        }

        private final String c(m mVar) {
            if (mVar instanceof e) {
                return b((h) mVar);
            }
            if (!(mVar instanceof k0)) {
                return null;
            }
            d j2 = ((k0) mVar).d().j();
            l.e(j2, "descriptor.fqName.toUnsafe()");
            return n.a(j2);
        }

        @Override // kotlin.reflect.x.internal.l0.h.b
        public String a(h hVar, kotlin.reflect.x.internal.l0.h.c cVar) {
            l.f(hVar, "classifier");
            l.f(cVar, "renderer");
            return b(hVar);
        }
    }

    String a(h hVar, kotlin.reflect.x.internal.l0.h.c cVar);
}
