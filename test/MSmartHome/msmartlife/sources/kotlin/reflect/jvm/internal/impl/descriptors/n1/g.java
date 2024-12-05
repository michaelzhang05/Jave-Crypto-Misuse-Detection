package kotlin.reflect.jvm.internal.impl.descriptors.n1;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: Annotations.kt */
/* loaded from: classes2.dex */
public interface g extends Iterable<c>, KMappedMarker {

    /* renamed from: c, reason: collision with root package name */
    public static final a f21674c = a.a;

    /* compiled from: Annotations.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final g f21675b = new C0366a();

        /* compiled from: Annotations.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0366a implements g {
            C0366a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
            public boolean A(kotlin.reflect.x.internal.l0.f.c cVar) {
                return b.b(this, cVar);
            }

            public Void a(kotlin.reflect.x.internal.l0.f.c cVar) {
                kotlin.jvm.internal.l.f(cVar, "fqName");
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
            public /* bridge */ /* synthetic */ c e(kotlin.reflect.x.internal.l0.f.c cVar) {
                return (c) a(cVar);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator<c> iterator() {
                return r.i().iterator();
            }

            public String toString() {
                return "EMPTY";
            }
        }

        private a() {
        }

        public final g a(List<? extends c> list) {
            kotlin.jvm.internal.l.f(list, "annotations");
            return list.isEmpty() ? f21675b : new h(list);
        }

        public final g b() {
            return f21675b;
        }
    }

    /* compiled from: Annotations.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public static c a(g gVar, kotlin.reflect.x.internal.l0.f.c cVar) {
            c cVar2;
            kotlin.jvm.internal.l.f(cVar, "fqName");
            Iterator<c> it = gVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar2 = null;
                    break;
                }
                cVar2 = it.next();
                if (kotlin.jvm.internal.l.a(cVar2.d(), cVar)) {
                    break;
                }
            }
            return cVar2;
        }

        public static boolean b(g gVar, kotlin.reflect.x.internal.l0.f.c cVar) {
            kotlin.jvm.internal.l.f(cVar, "fqName");
            return gVar.e(cVar) != null;
        }
    }

    boolean A(kotlin.reflect.x.internal.l0.f.c cVar);

    c e(kotlin.reflect.x.internal.l0.f.c cVar);

    boolean isEmpty();
}
