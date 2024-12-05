package kotlin.reflect.x.internal.l0.b;

import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.r;
import kotlin.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.o1.b;
import kotlin.reflect.jvm.internal.impl.descriptors.o1.c;
import kotlin.reflect.x.internal.l0.k.n;

/* compiled from: BuiltInsLoader.kt */
/* loaded from: classes2.dex */
public interface a {
    public static final C0279a a = C0279a.a;

    /* compiled from: BuiltInsLoader.kt */
    /* renamed from: kotlin.f0.x.e.l0.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0279a {
        static final /* synthetic */ C0279a a = new C0279a();

        /* renamed from: b, reason: collision with root package name */
        private static final Lazy<a> f19663b;

        /* compiled from: BuiltInsLoader.kt */
        /* renamed from: kotlin.f0.x.e.l0.b.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0280a extends Lambda implements Function0<a> {

            /* renamed from: f, reason: collision with root package name */
            public static final C0280a f19664f = new C0280a();

            C0280a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a invoke() {
                ServiceLoader load = ServiceLoader.load(a.class, a.class.getClassLoader());
                l.e(load, "implementations");
                a aVar = (a) r.S(load);
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }

        static {
            Lazy<a> a2;
            a2 = i.a(LazyThreadSafetyMode.PUBLICATION, C0280a.f19664f);
            f19663b = a2;
        }

        private C0279a() {
        }

        public final a a() {
            return f19663b.getValue();
        }
    }

    l0 a(n nVar, g0 g0Var, Iterable<? extends b> iterable, c cVar, kotlin.reflect.jvm.internal.impl.descriptors.o1.a aVar, boolean z);
}
