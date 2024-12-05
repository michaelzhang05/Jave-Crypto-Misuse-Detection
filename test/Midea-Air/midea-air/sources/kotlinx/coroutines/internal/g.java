package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: ExceptionsConstuctor.kt */
/* loaded from: classes2.dex */
public final class g {
    private static final int a = d(Throwable.class, -1);

    /* renamed from: b, reason: collision with root package name */
    private static final ReentrantReadWriteLock f22215b = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    private static final WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> f22216c = new WeakHashMap<>();

    /* compiled from: ExceptionsConstuctor.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Constructor f22217f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Constructor constructor) {
            super(1);
            this.f22217f = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object a;
            Object newInstance;
            try {
                Result.a aVar = Result.f21603f;
                newInstance = this.f22217f.newInstance(th.getMessage(), th);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f21603f;
                a = Result.a(kotlin.o.a(th2));
            }
            if (newInstance != null) {
                a = Result.a((Throwable) newInstance);
                if (Result.c(a)) {
                    a = null;
                }
                return (Throwable) a;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Constructor f22218f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(1);
            this.f22218f = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object a;
            Object newInstance;
            try {
                Result.a aVar = Result.f21603f;
                newInstance = this.f22218f.newInstance(th);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f21603f;
                a = Result.a(kotlin.o.a(th2));
            }
            if (newInstance != null) {
                a = Result.a((Throwable) newInstance);
                if (Result.c(a)) {
                    a = null;
                }
                return (Throwable) a;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Constructor f22219f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f22219f = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object a;
            Object newInstance;
            try {
                Result.a aVar = Result.f21603f;
                newInstance = this.f22219f.newInstance(th.getMessage());
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f21603f;
                a = Result.a(kotlin.o.a(th2));
            }
            if (newInstance != null) {
                Throwable th3 = (Throwable) newInstance;
                th3.initCause(th);
                a = Result.a(th3);
                if (Result.c(a)) {
                    a = null;
                }
                return (Throwable) a;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Constructor f22220f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f22220f = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object a;
            Object newInstance;
            try {
                Result.a aVar = Result.f21603f;
                newInstance = this.f22220f.newInstance(new Object[0]);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f21603f;
                a = Result.a(kotlin.o.a(th2));
            }
            if (newInstance != null) {
                Throwable th3 = (Throwable) newInstance;
                th3.initCause(th);
                a = Result.a(th3);
                if (Result.c(a)) {
                    a = null;
                }
                return (Throwable) a;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class e<T> implements Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int a;
            a = kotlin.comparisons.b.a(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
            return a;
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    /* loaded from: classes2.dex */
    static final class f extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final f f22221f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    /* renamed from: kotlinx.coroutines.internal.g$g, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0384g extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final C0384g f22222f = new C0384g();

        C0384g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    private static final Function1<Throwable, Throwable> a(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new d(constructor);
        }
        if (length != 1) {
            if (length == 2 && kotlin.jvm.internal.l.a(parameterTypes[0], String.class) && kotlin.jvm.internal.l.a(parameterTypes[1], Throwable.class)) {
                return new a(constructor);
            }
        } else {
            Class<?> cls = parameterTypes[0];
            if (kotlin.jvm.internal.l.a(cls, Throwable.class)) {
                return new b(constructor);
            }
            if (kotlin.jvm.internal.l.a(cls, String.class)) {
                return new c(constructor);
            }
        }
        return null;
    }

    private static final int b(Class<?> cls, int i2) {
        do {
            int length = cls.getDeclaredFields().length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (!Modifier.isStatic(r0[i4].getModifiers())) {
                    i3++;
                }
            }
            i2 += i3;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i2;
    }

    static /* synthetic */ int c(Class cls, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return b(cls, i2);
    }

    private static final int d(Class<?> cls, int i2) {
        Object a2;
        kotlin.jvm.a.e(cls);
        try {
            Result.a aVar = Result.f21603f;
            a2 = Result.a(Integer.valueOf(c(cls, 0, 1, null)));
        } catch (Throwable th) {
            Result.a aVar2 = Result.f21603f;
            a2 = Result.a(kotlin.o.a(th));
        }
        Integer valueOf = Integer.valueOf(i2);
        if (Result.c(a2)) {
            a2 = valueOf;
        }
        return ((Number) a2).intValue();
    }

    public static final <E extends Throwable> E e(E e2) {
        Object a2;
        List P;
        ReentrantReadWriteLock.ReadLock readLock;
        int readHoldCount;
        ReentrantReadWriteLock.WriteLock writeLock;
        if (e2 instanceof kotlinx.coroutines.a0) {
            try {
                Result.a aVar = Result.f21603f;
                a2 = Result.a(((kotlinx.coroutines.a0) e2).a());
            } catch (Throwable th) {
                Result.a aVar2 = Result.f21603f;
                a2 = Result.a(kotlin.o.a(th));
            }
            return (E) (Result.c(a2) ? null : a2);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f22215b;
        ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
        readLock2.lock();
        try {
            Function1<Throwable, Throwable> function1 = f22216c.get(e2.getClass());
            if (function1 == null) {
                int i2 = 0;
                if (a != d(e2.getClass(), 0)) {
                    readLock = reentrantReadWriteLock.readLock();
                    readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                    for (int i3 = 0; i3 < readHoldCount; i3++) {
                        readLock.unlock();
                    }
                    writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        f22216c.put(e2.getClass(), f.f22221f);
                        kotlin.u uVar = kotlin.u.a;
                        return null;
                    } finally {
                        while (i2 < readHoldCount) {
                            readLock.lock();
                            i2++;
                        }
                        writeLock.unlock();
                    }
                }
                P = kotlin.collections.n.P(e2.getClass().getConstructors(), new e());
                Iterator it = P.iterator();
                Function1<Throwable, Throwable> function12 = null;
                while (it.hasNext() && (function12 = a((Constructor) it.next())) == null) {
                }
                ReentrantReadWriteLock reentrantReadWriteLock2 = f22215b;
                readLock = reentrantReadWriteLock2.readLock();
                readHoldCount = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
                for (int i4 = 0; i4 < readHoldCount; i4++) {
                    readLock.unlock();
                }
                writeLock = reentrantReadWriteLock2.writeLock();
                writeLock.lock();
                try {
                    f22216c.put(e2.getClass(), function12 == null ? C0384g.f22222f : function12);
                    kotlin.u uVar2 = kotlin.u.a;
                    while (i2 < readHoldCount) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                    if (function12 == null) {
                        return null;
                    }
                    return (E) function12.invoke(e2);
                } finally {
                    while (i2 < readHoldCount) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            }
            return (E) function1.invoke(e2);
        } finally {
            readLock2.unlock();
        }
    }
}
