package kotlin.reflect.x.internal;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* compiled from: ReflectProperties.java */
/* loaded from: classes2.dex */
public class c0 {

    /* compiled from: ReflectProperties.java */
    /* loaded from: classes2.dex */
    public static class a<T> extends c<T> implements Function0<T> {

        /* renamed from: g, reason: collision with root package name */
        private final Function0<T> f19527g;

        /* renamed from: h, reason: collision with root package name */
        private volatile SoftReference<Object> f19528h;

        public a(T t, Function0<T> function0) {
            if (function0 == null) {
                f(0);
            }
            this.f19528h = null;
            this.f19527g = function0;
            if (t != null) {
                this.f19528h = new SoftReference<>(b(t));
            }
        }

        private static /* synthetic */ void f(int i2) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // kotlin.f0.x.e.c0.c, kotlin.jvm.functions.Function0
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f19528h;
            if (softReference != null && (obj = softReference.get()) != null) {
                return e(obj);
            }
            T invoke = this.f19527g.invoke();
            this.f19528h = new SoftReference<>(b(invoke));
            return invoke;
        }
    }

    /* compiled from: ReflectProperties.java */
    /* loaded from: classes2.dex */
    public static class b<T> extends c<T> {

        /* renamed from: g, reason: collision with root package name */
        private final Function0<T> f19529g;

        /* renamed from: h, reason: collision with root package name */
        private volatile Object f19530h;

        public b(Function0<T> function0) {
            if (function0 == null) {
                f(0);
            }
            this.f19530h = null;
            this.f19529g = function0;
        }

        private static /* synthetic */ void f(int i2) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"));
        }

        @Override // kotlin.f0.x.e.c0.c, kotlin.jvm.functions.Function0
        public T invoke() {
            Object obj = this.f19530h;
            if (obj != null) {
                return e(obj);
            }
            T invoke = this.f19529g.invoke();
            this.f19530h = b(invoke);
            return invoke;
        }
    }

    /* compiled from: ReflectProperties.java */
    /* loaded from: classes2.dex */
    public static abstract class c<T> {

        /* renamed from: f, reason: collision with root package name */
        private static final Object f19531f = new a();

        /* compiled from: ReflectProperties.java */
        /* loaded from: classes2.dex */
        static class a {
            a() {
            }
        }

        protected Object b(T t) {
            return t == null ? f19531f : t;
        }

        public final T d(Object obj, Object obj2) {
            return invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected T e(Object obj) {
            if (obj == f19531f) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();
    }

    private static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i2 == 1 || i2 == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <T> b<T> b(Function0<T> function0) {
        if (function0 == null) {
            a(0);
        }
        return new b<>(function0);
    }

    public static <T> a<T> c(T t, Function0<T> function0) {
        if (function0 == null) {
            a(1);
        }
        return new a<>(t, function0);
    }

    public static <T> a<T> d(Function0<T> function0) {
        if (function0 == null) {
            a(2);
        }
        return c(null, function0);
    }
}
