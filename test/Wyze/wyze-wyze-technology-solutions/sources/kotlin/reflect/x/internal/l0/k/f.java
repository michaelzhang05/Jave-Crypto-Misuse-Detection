package kotlin.reflect.x.internal.l0.k;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.v;
import kotlin.u;
import okhttp3.HttpUrl;

/* compiled from: LockBasedStorageManager.java */
/* loaded from: classes2.dex */
public class f implements kotlin.reflect.x.internal.l0.k.n {
    private static final String a;

    /* renamed from: b, reason: collision with root package name */
    public static final kotlin.reflect.x.internal.l0.k.n f21159b;

    /* renamed from: c, reason: collision with root package name */
    protected final kotlin.reflect.x.internal.l0.k.k f21160c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0351f f21161d;

    /* renamed from: e, reason: collision with root package name */
    private final String f21162e;

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    static class a extends f {
        a(String str, InterfaceC0351f interfaceC0351f, kotlin.reflect.x.internal.l0.k.k kVar) {
            super(str, interfaceC0351f, kVar, null);
        }

        private static /* synthetic */ void j(int i2) {
            String str = i2 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i2 != 1 ? 3 : 2];
            if (i2 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i2 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i2 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String format = String.format(str, objArr);
            if (i2 == 1) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.x.internal.l0.k.f
        protected <K, V> o<V> p(String str, K k2) {
            if (str == null) {
                j(0);
            }
            o<V> a = o.a();
            if (a == null) {
                j(1);
            }
            return a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    class b<T> extends j<T> {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Object f21163i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, Function0 function0, Object obj) {
            super(fVar, function0);
            this.f21163i = obj;
        }

        private static /* synthetic */ void b(int i2) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // kotlin.f0.x.e.l0.k.f.h
        protected o<T> e(boolean z) {
            o<T> d2 = o.d(this.f21163i);
            if (d2 == null) {
                b(0);
            }
            return d2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    class c<T> extends k<T> {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1 f21165j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1 f21166k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f fVar, Function0 function0, Function1 function1, Function1 function12) {
            super(fVar, function0);
            this.f21165j = function1;
            this.f21166k = function12;
        }

        private static /* synthetic */ void b(int i2) {
            String str = i2 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i2 != 2 ? 2 : 3];
            if (i2 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i2 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i2 == 2) {
                objArr[2] = "doPostCompute";
            }
            String format = String.format(str, objArr);
            if (i2 == 2) {
                throw new IllegalArgumentException(format);
            }
        }

        @Override // kotlin.f0.x.e.l0.k.f.h
        protected o<T> e(boolean z) {
            Function1 function1 = this.f21165j;
            if (function1 == null) {
                o<T> e2 = super.e(z);
                if (e2 == null) {
                    b(0);
                }
                return e2;
            }
            o<T> d2 = o.d(function1.invoke(Boolean.valueOf(z)));
            if (d2 == null) {
                b(1);
            }
            return d2;
        }

        @Override // kotlin.f0.x.e.l0.k.f.i
        protected void f(T t) {
            if (t == null) {
                b(2);
            }
            this.f21166k.invoke(t);
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    private static class d<K, V> extends e<K, V> implements kotlin.reflect.x.internal.l0.k.a<K, V> {
        /* synthetic */ d(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void d(int i2) {
            String str = i2 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i2 != 3 ? 3 : 2];
            if (i2 == 1) {
                objArr[0] = "map";
            } else if (i2 == 2) {
                objArr[0] = "computation";
            } else if (i2 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i2 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i2 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i2 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i2 == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.f0.x.e.l0.k.f.e, kotlin.reflect.x.internal.l0.k.a
        public V b(K k2, Function0<? extends V> function0) {
            if (function0 == null) {
                d(2);
            }
            V v = (V) super.b(k2, function0);
            if (v == null) {
                d(3);
            }
            return v;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(f fVar, ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, null);
            if (fVar == null) {
                d(0);
            }
            if (concurrentMap == null) {
                d(1);
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    private static class e<K, V> extends l<g<K, V>, V> implements kotlin.reflect.x.internal.l0.k.b<K, V> {

        /* compiled from: LockBasedStorageManager.java */
        /* loaded from: classes2.dex */
        class a implements Function1<g<K, V>, V> {
            a() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public V invoke(g<K, V> gVar) {
                return (V) ((g) gVar).f21167b.invoke();
            }
        }

        /* synthetic */ e(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void d(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "map";
            } else if (i2 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i2 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public V b(K k2, Function0<? extends V> function0) {
            if (function0 == null) {
                d(2);
            }
            return invoke(new g(k2, function0));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(f fVar, ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, new a());
            if (fVar == null) {
                d(0);
            }
            if (concurrentMap == null) {
                d(1);
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.x.e.l0.k.f$f, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0351f {
        public static final InterfaceC0351f a = new a();

        /* compiled from: LockBasedStorageManager.java */
        /* renamed from: kotlin.f0.x.e.l0.k.f$f$a */
        /* loaded from: classes2.dex */
        static class a implements InterfaceC0351f {
            a() {
            }

            private static /* synthetic */ void b(int i2) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // kotlin.reflect.x.internal.l0.k.f.InterfaceC0351f
            public RuntimeException a(Throwable th) {
                if (th == null) {
                    b(0);
                }
                throw kotlin.reflect.jvm.internal.impl.utils.c.b(th);
            }
        }

        RuntimeException a(Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    public static class g<K, V> {
        private final K a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0<? extends V> f21167b;

        public g(K k2, Function0<? extends V> function0) {
            this.a = k2;
            this.f21167b = function0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && g.class == obj.getClass() && this.a.equals(((g) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    public static class h<T> implements kotlin.reflect.x.internal.l0.k.j<T> {

        /* renamed from: f, reason: collision with root package name */
        private final f f21168f;

        /* renamed from: g, reason: collision with root package name */
        private final Function0<? extends T> f21169g;

        /* renamed from: h, reason: collision with root package name */
        private volatile Object f21170h;

        public h(f fVar, Function0<? extends T> function0) {
            if (fVar == null) {
                b(0);
            }
            if (function0 == null) {
                b(1);
            }
            this.f21170h = n.NOT_COMPUTED;
            this.f21168f = fVar;
            this.f21169g = function0;
        }

        private static /* synthetic */ void b(int i2) {
            String str = (i2 == 2 || i2 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i2 == 2 || i2 == 3) ? 2 : 3];
            if (i2 == 1) {
                objArr[0] = "computable";
            } else if (i2 == 2 || i2 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i2 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i2 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i2 != 2 && i2 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i2 != 2 && i2 != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        public boolean a() {
            return (this.f21170h == n.NOT_COMPUTED || this.f21170h == n.COMPUTING) ? false : true;
        }

        protected void d(T t) {
        }

        protected o<T> e(boolean z) {
            o<T> p = this.f21168f.p("in a lazy value", null);
            if (p == null) {
                b(2);
            }
            return p;
        }

        @Override // kotlin.jvm.functions.Function0
        public T invoke() {
            T invoke;
            Object obj = this.f21170h;
            if (!(obj instanceof n)) {
                return (T) WrappedValues.f(obj);
            }
            this.f21168f.f21160c.lock();
            try {
                Object obj2 = this.f21170h;
                if (obj2 instanceof n) {
                    n nVar = n.COMPUTING;
                    if (obj2 == nVar) {
                        this.f21170h = n.RECURSION_WAS_DETECTED;
                        o<T> e2 = e(true);
                        if (!e2.c()) {
                            invoke = e2.b();
                        }
                    }
                    if (obj2 == n.RECURSION_WAS_DETECTED) {
                        o<T> e3 = e(false);
                        if (!e3.c()) {
                            invoke = e3.b();
                        }
                    }
                    this.f21170h = nVar;
                    try {
                        invoke = this.f21169g.invoke();
                        d(invoke);
                        this.f21170h = invoke;
                    } catch (Throwable th) {
                        if (!kotlin.reflect.jvm.internal.impl.utils.c.a(th)) {
                            if (this.f21170h == n.COMPUTING) {
                                this.f21170h = WrappedValues.c(th);
                            }
                            throw this.f21168f.f21161d.a(th);
                        }
                        this.f21170h = n.NOT_COMPUTED;
                        throw th;
                    }
                } else {
                    invoke = (T) WrappedValues.f(obj2);
                }
                return invoke;
            } finally {
                this.f21168f.f21160c.unlock();
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    private static abstract class i<T> extends h<T> {

        /* renamed from: i, reason: collision with root package name */
        private volatile kotlin.reflect.x.internal.l0.k.l<T> f21171i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(f fVar, Function0<? extends T> function0) {
            super(fVar, function0);
            if (fVar == null) {
                b(0);
            }
            if (function0 == null) {
                b(1);
            }
            this.f21171i = null;
        }

        private static /* synthetic */ void b(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.f0.x.e.l0.k.f.h
        protected final void d(T t) {
            this.f21171i = new kotlin.reflect.x.internal.l0.k.l<>(t);
            try {
                f(t);
            } finally {
                this.f21171i = null;
            }
        }

        protected abstract void f(T t);

        @Override // kotlin.f0.x.e.l0.k.f.h, kotlin.jvm.functions.Function0
        public T invoke() {
            kotlin.reflect.x.internal.l0.k.l<T> lVar = this.f21171i;
            if (lVar != null && lVar.b()) {
                return lVar.a();
            }
            return (T) super.invoke();
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    private static class j<T> extends h<T> implements kotlin.reflect.x.internal.l0.k.i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(f fVar, Function0<? extends T> function0) {
            super(fVar, function0);
            if (fVar == null) {
                b(0);
            }
            if (function0 == null) {
                b(1);
            }
        }

        private static /* synthetic */ void b(int i2) {
            String str = i2 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i2 != 2 ? 3 : 2];
            if (i2 == 1) {
                objArr[0] = "computable";
            } else if (i2 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i2 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i2 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i2 == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.f0.x.e.l0.k.f.h, kotlin.jvm.functions.Function0
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                b(2);
            }
            return t;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    private static abstract class k<T> extends i<T> implements kotlin.reflect.x.internal.l0.k.i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(f fVar, Function0<? extends T> function0) {
            super(fVar, function0);
            if (fVar == null) {
                b(0);
            }
            if (function0 == null) {
                b(1);
            }
        }

        private static /* synthetic */ void b(int i2) {
            String str = i2 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i2 != 2 ? 3 : 2];
            if (i2 == 1) {
                objArr[0] = "computable";
            } else if (i2 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i2 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i2 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i2 == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.f0.x.e.l0.k.f.i, kotlin.f0.x.e.l0.k.f.h, kotlin.jvm.functions.Function0
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                b(2);
            }
            return t;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    public static class l<K, V> implements kotlin.reflect.x.internal.l0.k.h<K, V> {

        /* renamed from: f, reason: collision with root package name */
        private final f f21172f;

        /* renamed from: g, reason: collision with root package name */
        private final ConcurrentMap<K, Object> f21173g;

        /* renamed from: h, reason: collision with root package name */
        private final Function1<? super K, ? extends V> f21174h;

        public l(f fVar, ConcurrentMap<K, Object> concurrentMap, Function1<? super K, ? extends V> function1) {
            if (fVar == null) {
                d(0);
            }
            if (concurrentMap == null) {
                d(1);
            }
            if (function1 == null) {
                d(2);
            }
            this.f21172f = fVar;
            this.f21173g = concurrentMap;
            this.f21174h = function1;
        }

        private static /* synthetic */ void d(int i2) {
            String str = (i2 == 3 || i2 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i2 == 3 || i2 == 4) ? 2 : 3];
            if (i2 == 1) {
                objArr[0] = "map";
            } else if (i2 == 2) {
                objArr[0] = "compute";
            } else if (i2 == 3 || i2 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i2 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i2 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i2 != 3 && i2 != 4) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i2 != 3 && i2 != 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        private AssertionError e(K k2, Object obj) {
            AssertionError assertionError = (AssertionError) f.q(new AssertionError("Race condition detected on input " + k2 + ". Old value is " + obj + " under " + this.f21172f));
            if (assertionError == null) {
                d(4);
            }
            return assertionError;
        }

        protected o<V> f(K k2, boolean z) {
            o<V> p = this.f21172f.p(HttpUrl.FRAGMENT_ENCODE_SET, k2);
            if (p == null) {
                d(3);
            }
            return p;
        }

        @Override // kotlin.reflect.x.internal.l0.k.h
        public boolean h(K k2) {
            Object obj = this.f21173g.get(k2);
            return (obj == null || obj == n.COMPUTING) ? false : true;
        }

        @Override // kotlin.jvm.functions.Function1
        public V invoke(K k2) {
            V v;
            Object obj = this.f21173g.get(k2);
            if (obj != null && obj != n.COMPUTING) {
                return (V) WrappedValues.d(obj);
            }
            this.f21172f.f21160c.lock();
            try {
                Object obj2 = this.f21173g.get(k2);
                n nVar = n.COMPUTING;
                if (obj2 == nVar) {
                    obj2 = n.RECURSION_WAS_DETECTED;
                    o<V> f2 = f(k2, true);
                    if (!f2.c()) {
                        v = f2.b();
                        return v;
                    }
                }
                if (obj2 == n.RECURSION_WAS_DETECTED) {
                    o<V> f3 = f(k2, false);
                    if (!f3.c()) {
                        v = f3.b();
                        return v;
                    }
                }
                if (obj2 != null) {
                    v = (V) WrappedValues.d(obj2);
                    return v;
                }
                AssertionError assertionError = null;
                try {
                    this.f21173g.put(k2, nVar);
                    V invoke = this.f21174h.invoke(k2);
                    Object put = this.f21173g.put(k2, WrappedValues.b(invoke));
                    if (put == nVar) {
                        return invoke;
                    }
                    assertionError = e(k2, put);
                    throw assertionError;
                } catch (Throwable th) {
                    if (kotlin.reflect.jvm.internal.impl.utils.c.a(th)) {
                        this.f21173g.remove(k2);
                        throw th;
                    }
                    if (th == assertionError) {
                        throw this.f21172f.f21161d.a(th);
                    }
                    Object put2 = this.f21173g.put(k2, WrappedValues.c(th));
                    if (put2 == n.COMPUTING) {
                        throw this.f21172f.f21161d.a(th);
                    }
                    throw e(k2, put2);
                }
            } finally {
                this.f21172f.f21160c.unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    public static class m<K, V> extends l<K, V> implements kotlin.reflect.x.internal.l0.k.g<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(f fVar, ConcurrentMap<K, Object> concurrentMap, Function1<? super K, ? extends V> function1) {
            super(fVar, concurrentMap, function1);
            if (fVar == null) {
                d(0);
            }
            if (concurrentMap == null) {
                d(1);
            }
            if (function1 == null) {
                d(2);
            }
        }

        private static /* synthetic */ void d(int i2) {
            String str = i2 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i2 != 3 ? 3 : 2];
            if (i2 == 1) {
                objArr[0] = "map";
            } else if (i2 == 2) {
                objArr[0] = "compute";
            } else if (i2 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i2 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i2 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i2 == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.f0.x.e.l0.k.f.l, kotlin.jvm.functions.Function1
        public V invoke(K k2) {
            V v = (V) super.invoke(k2);
            if (v == null) {
                d(3);
            }
            return v;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    public enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    public static class o<T> {
        private final T a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f21179b;

        private o(T t, boolean z) {
            this.a = t;
            this.f21179b = z;
        }

        public static <T> o<T> a() {
            return new o<>(null, true);
        }

        public static <T> o<T> d(T t) {
            return new o<>(t, false);
        }

        public T b() {
            return this.a;
        }

        public boolean c() {
            return this.f21179b;
        }

        public String toString() {
            return c() ? "FALL_THROUGH" : String.valueOf(this.a);
        }
    }

    static {
        String H0;
        H0 = v.H0(f.class.getCanonicalName(), ".", HttpUrl.FRAGMENT_ENCODE_SET);
        a = H0;
        f21159b = new a("NO_LOCKS", InterfaceC0351f.a, kotlin.reflect.x.internal.l0.k.e.f21158b);
    }

    /* synthetic */ f(String str, InterfaceC0351f interfaceC0351f, kotlin.reflect.x.internal.l0.k.k kVar, a aVar) {
        this(str, interfaceC0351f, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void j(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.k.f.j(int):void");
    }

    private static <K> ConcurrentMap<K, Object> m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends Throwable> T q(T t) {
        if (t == null) {
            j(36);
        }
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            if (!stackTrace[i3].getClassName().startsWith(a)) {
                i2 = i3;
                break;
            }
            i3++;
        }
        List subList = Arrays.asList(stackTrace).subList(i2, length);
        t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t;
    }

    @Override // kotlin.reflect.x.internal.l0.k.n
    public <K, V> kotlin.reflect.x.internal.l0.k.b<K, V> a() {
        return new e(this, m(), null);
    }

    @Override // kotlin.reflect.x.internal.l0.k.n
    public <K, V> kotlin.reflect.x.internal.l0.k.a<K, V> b() {
        return new d(this, m(), null);
    }

    @Override // kotlin.reflect.x.internal.l0.k.n
    public <T> kotlin.reflect.x.internal.l0.k.i<T> c(Function0<? extends T> function0, T t) {
        if (function0 == null) {
            j(26);
        }
        if (t == null) {
            j(27);
        }
        return new b(this, function0, t);
    }

    @Override // kotlin.reflect.x.internal.l0.k.n
    public <T> kotlin.reflect.x.internal.l0.k.i<T> d(Function0<? extends T> function0) {
        if (function0 == null) {
            j(23);
        }
        return new j(this, function0);
    }

    @Override // kotlin.reflect.x.internal.l0.k.n
    public <T> T e(Function0<? extends T> function0) {
        if (function0 == null) {
            j(34);
        }
        this.f21160c.lock();
        try {
            return function0.invoke();
        } finally {
        }
    }

    @Override // kotlin.reflect.x.internal.l0.k.n
    public <T> kotlin.reflect.x.internal.l0.k.j<T> f(Function0<? extends T> function0) {
        if (function0 == null) {
            j(30);
        }
        return new h(this, function0);
    }

    @Override // kotlin.reflect.x.internal.l0.k.n
    public <T> kotlin.reflect.x.internal.l0.k.i<T> g(Function0<? extends T> function0, Function1<? super Boolean, ? extends T> function1, Function1<? super T, u> function12) {
        if (function0 == null) {
            j(28);
        }
        if (function12 == null) {
            j(29);
        }
        return new c(this, function0, function1, function12);
    }

    @Override // kotlin.reflect.x.internal.l0.k.n
    public <K, V> kotlin.reflect.x.internal.l0.k.g<K, V> h(Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            j(9);
        }
        kotlin.reflect.x.internal.l0.k.g<K, V> n2 = n(function1, m());
        if (n2 == null) {
            j(10);
        }
        return n2;
    }

    @Override // kotlin.reflect.x.internal.l0.k.n
    public <K, V> kotlin.reflect.x.internal.l0.k.h<K, V> i(Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            j(19);
        }
        kotlin.reflect.x.internal.l0.k.h<K, V> o2 = o(function1, m());
        if (o2 == null) {
            j(20);
        }
        return o2;
    }

    public <K, V> kotlin.reflect.x.internal.l0.k.g<K, V> n(Function1<? super K, ? extends V> function1, ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new m(this, concurrentMap, function1);
    }

    public <K, V> kotlin.reflect.x.internal.l0.k.h<K, V> o(Function1<? super K, ? extends V> function1, ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new l(this, concurrentMap, function1);
    }

    protected <K, V> o<V> p(String str, K k2) {
        String str2;
        if (str == null) {
            j(35);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Recursion detected ");
        sb.append(str);
        if (k2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str2 = "on input: " + k2;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        throw ((AssertionError) q(new AssertionError(sb.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f21162e + ")";
    }

    private f(String str, InterfaceC0351f interfaceC0351f, kotlin.reflect.x.internal.l0.k.k kVar) {
        if (str == null) {
            j(4);
        }
        if (interfaceC0351f == null) {
            j(5);
        }
        if (kVar == null) {
            j(6);
        }
        this.f21160c = kVar;
        this.f21161d = interfaceC0351f;
        this.f21162e = str;
    }

    public f(String str) {
        this(str, (Runnable) null, (Function1<InterruptedException, u>) null);
    }

    public f(String str, Runnable runnable, Function1<InterruptedException, u> function1) {
        this(str, InterfaceC0351f.a, kotlin.reflect.x.internal.l0.k.k.a.a(runnable, function1));
    }
}
