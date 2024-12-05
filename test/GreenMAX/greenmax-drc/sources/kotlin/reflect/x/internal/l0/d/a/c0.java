package kotlin.reflect.x.internal.l0.d.a;

import java.util.Map;
import kotlin.collections.o0;
import kotlin.reflect.x.internal.l0.f.c;

/* compiled from: JavaNullabilityAnnotationSettings.kt */
/* loaded from: classes2.dex */
public interface c0<T> {
    public static final a a = a.a;

    /* compiled from: JavaNullabilityAnnotationSettings.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final c0 f19866b;

        static {
            Map i2;
            i2 = o0.i();
            f19866b = new d0(i2);
        }

        private a() {
        }

        public final c0 a() {
            return f19866b;
        }
    }

    T a(c cVar);
}
