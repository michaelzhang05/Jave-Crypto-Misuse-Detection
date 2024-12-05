package kotlin.reflect.jvm.internal.impl.descriptors.p1;

import kotlin.reflect.jvm.internal.impl.descriptors.p0;

/* compiled from: PackageViewDescriptorFactory.kt */
/* loaded from: classes2.dex */
public interface a0 {
    public static final a a = a.a;

    /* compiled from: PackageViewDescriptorFactory.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final kotlin.reflect.jvm.internal.impl.descriptors.f0<a0> f21705b = new kotlin.reflect.jvm.internal.impl.descriptors.f0<>("PackageViewDescriptorFactory");

        private a() {
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.f0<a0> a() {
            return f21705b;
        }
    }

    /* compiled from: PackageViewDescriptorFactory.kt */
    /* loaded from: classes2.dex */
    public static final class b implements a0 {

        /* renamed from: b, reason: collision with root package name */
        public static final b f21706b = new b();

        private b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.a0
        public p0 a(x xVar, kotlin.reflect.x.internal.l0.f.c cVar, kotlin.reflect.x.internal.l0.k.n nVar) {
            kotlin.jvm.internal.l.f(xVar, "module");
            kotlin.jvm.internal.l.f(cVar, "fqName");
            kotlin.jvm.internal.l.f(nVar, "storageManager");
            return new r(xVar, cVar, nVar);
        }
    }

    p0 a(x xVar, kotlin.reflect.x.internal.l0.f.c cVar, kotlin.reflect.x.internal.l0.k.n nVar);
}
