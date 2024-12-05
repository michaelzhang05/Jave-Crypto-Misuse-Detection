package kotlin.reflect.x.internal.l0.i.w;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.u0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.x.internal.l0.f.f;

/* compiled from: MemberScope.kt */
/* loaded from: classes2.dex */
public interface h extends k {
    public static final a a = a.a;

    /* compiled from: MemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Function1<f, Boolean> f20929b = C0341a.f20930f;

        /* compiled from: MemberScope.kt */
        /* renamed from: kotlin.f0.x.e.l0.i.w.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0341a extends Lambda implements Function1<f, Boolean> {

            /* renamed from: f, reason: collision with root package name */
            public static final C0341a f20930f = new C0341a();

            C0341a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(f fVar) {
                l.f(fVar, "it");
                return Boolean.TRUE;
            }
        }

        private a() {
        }

        public final Function1<f, Boolean> a() {
            return f20929b;
        }
    }

    /* compiled from: MemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class b extends i {

        /* renamed from: b, reason: collision with root package name */
        public static final b f20931b = new b();

        private b() {
        }

        @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
        public Set<f> b() {
            Set<f> d2;
            d2 = u0.d();
            return d2;
        }

        @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
        public Set<f> d() {
            Set<f> d2;
            d2 = u0.d();
            return d2;
        }

        @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
        public Set<f> e() {
            Set<f> d2;
            d2 = u0.d();
            return d2;
        }
    }

    Collection<? extends y0> a(f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar);

    Set<f> b();

    Collection<? extends t0> c(f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar);

    Set<f> d();

    Set<f> e();
}
