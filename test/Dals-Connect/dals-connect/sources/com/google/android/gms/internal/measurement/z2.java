package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class z2 {
    private static final Logger a = Logger.getLogger(z2.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final Unsafe f16066b;

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f16067c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f16068d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f16069e;

    /* renamed from: f, reason: collision with root package name */
    private static final d f16070f;

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f16071g;

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f16072h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f16073i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f16074j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f16075k;
    private static final long l;
    private static final long m;
    private static final long n;
    private static final long o;
    private static final long p;
    private static final long q;
    private static final long r;
    private static final long s;
    private static final long t;
    private static final long u;
    private static final long v;
    private static final boolean w;

    /* loaded from: classes2.dex */
    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final void a(Object obj, long j2, double d2) {
            c(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final void b(Object obj, long j2, float f2) {
            e(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final void d(Object obj, long j2, boolean z) {
            if (z2.w) {
                z2.l(obj, j2, z);
            } else {
                z2.n(obj, j2, z);
            }
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final void f(Object obj, long j2, byte b2) {
            if (z2.w) {
                z2.b(obj, j2, b2);
            } else {
                z2.j(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final boolean i(Object obj, long j2) {
            return z2.w ? z2.D(obj, j2) : z2.E(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final float j(Object obj, long j2) {
            return Float.intBitsToFloat(g(obj, j2));
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final double k(Object obj, long j2) {
            return Double.longBitsToDouble(h(obj, j2));
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final byte l(Object obj, long j2) {
            return z2.w ? z2.B(obj, j2) : z2.C(obj, j2);
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final void a(Object obj, long j2, double d2) {
            c(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final void b(Object obj, long j2, float f2) {
            e(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final void d(Object obj, long j2, boolean z) {
            if (z2.w) {
                z2.l(obj, j2, z);
            } else {
                z2.n(obj, j2, z);
            }
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final void f(Object obj, long j2, byte b2) {
            if (z2.w) {
                z2.b(obj, j2, b2);
            } else {
                z2.j(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final boolean i(Object obj, long j2) {
            return z2.w ? z2.D(obj, j2) : z2.E(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final float j(Object obj, long j2) {
            return Float.intBitsToFloat(g(obj, j2));
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final double k(Object obj, long j2) {
            return Double.longBitsToDouble(h(obj, j2));
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final byte l(Object obj, long j2) {
            return z2.w ? z2.B(obj, j2) : z2.C(obj, j2);
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final void a(Object obj, long j2, double d2) {
            this.a.putDouble(obj, j2, d2);
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final void b(Object obj, long j2, float f2) {
            this.a.putFloat(obj, j2, f2);
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final void d(Object obj, long j2, boolean z) {
            this.a.putBoolean(obj, j2, z);
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final void f(Object obj, long j2, byte b2) {
            this.a.putByte(obj, j2, b2);
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final boolean i(Object obj, long j2) {
            return this.a.getBoolean(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final float j(Object obj, long j2) {
            return this.a.getFloat(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final double k(Object obj, long j2) {
            return this.a.getDouble(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.z2.d
        public final byte l(Object obj, long j2) {
            return this.a.getByte(obj, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class d {
        Unsafe a;

        d(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract void a(Object obj, long j2, double d2);

        public abstract void b(Object obj, long j2, float f2);

        public final void c(Object obj, long j2, long j3) {
            this.a.putLong(obj, j2, j3);
        }

        public abstract void d(Object obj, long j2, boolean z);

        public final void e(Object obj, long j2, int i2) {
            this.a.putInt(obj, j2, i2);
        }

        public abstract void f(Object obj, long j2, byte b2);

        public final int g(Object obj, long j2) {
            return this.a.getInt(obj, j2);
        }

        public final long h(Object obj, long j2) {
            return this.a.getLong(obj, j2);
        }

        public abstract boolean i(Object obj, long j2);

        public abstract float j(Object obj, long j2);

        public abstract double k(Object obj, long j2);

        public abstract byte l(Object obj, long j2);
    }

    static {
        Unsafe M = M();
        f16066b = M;
        f16067c = f0.c();
        boolean y = y(Long.TYPE);
        f16068d = y;
        boolean y2 = y(Integer.TYPE);
        f16069e = y2;
        d dVar = null;
        if (M != null) {
            if (!f0.b()) {
                dVar = new c(M);
            } else if (y) {
                dVar = new b(M);
            } else if (y2) {
                dVar = new a(M);
            }
        }
        f16070f = dVar;
        f16071g = O();
        f16072h = N();
        f16073i = t(byte[].class);
        f16074j = t(boolean[].class);
        f16075k = v(boolean[].class);
        l = t(int[].class);
        m = v(int[].class);
        n = t(long[].class);
        o = v(long[].class);
        p = t(float[].class);
        q = v(float[].class);
        r = t(double[].class);
        s = v(double[].class);
        t = t(Object[].class);
        u = v(Object[].class);
        Field P = P();
        v = (P == null || dVar == null) ? -1L : dVar.a.objectFieldOffset(P);
        w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private z2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object A(Object obj, long j2) {
        return f16070f.a.getObject(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte B(Object obj, long j2) {
        return (byte) (r(obj, (-4) & j2) >>> ((int) (((j2 ^ (-1)) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte C(Object obj, long j2) {
        return (byte) (r(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean D(Object obj, long j2) {
        return B(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean E(Object obj, long j2) {
        return C(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean K() {
        return f16072h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean L() {
        return f16071g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe M() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a3());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean N() {
        Unsafe unsafe = f16066b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (f0.b()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean O() {
        Unsafe unsafe = f16066b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (P() == null) {
                return false;
            }
            if (f0.b()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static Field P() {
        Field i2;
        if (f0.b() && (i2 = i(Buffer.class, "effectiveDirectAddress")) != null) {
            return i2;
        }
        Field i3 = i(Buffer.class, "address");
        if (i3 == null || i3.getType() != Long.TYPE) {
            return null;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte a(byte[] bArr, long j2) {
        return f16070f.l(bArr, f16073i + j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = ((((int) j2) ^ (-1)) & 3) << 3;
        k(obj, j3, ((255 & b2) << i2) | (r(obj, j3) & ((255 << i2) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Object obj, long j2, double d2) {
        f16070f.a(obj, j2, d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Object obj, long j2, float f2) {
        f16070f.b(obj, j2, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(Object obj, long j2, long j3) {
        f16070f.c(obj, j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Object obj, long j2, Object obj2) {
        f16070f.a.putObject(obj, j2, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Object obj, long j2, boolean z) {
        f16070f.d(obj, j2, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(byte[] bArr, long j2, byte b2) {
        f16070f.f(bArr, f16073i + j2, b2);
    }

    private static Field i(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        k(obj, j3, ((255 & b2) << i2) | (r(obj, j3) & ((255 << i2) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(Object obj, long j2, int i2) {
        f16070f.e(obj, j2, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(Object obj, long j2, boolean z) {
        b(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(Object obj, long j2, boolean z) {
        j(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(Object obj, long j2) {
        return f16070f.g(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T s(Class<T> cls) {
        try {
            return (T) f16066b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static int t(Class<?> cls) {
        if (f16072h) {
            return f16070f.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long u(Object obj, long j2) {
        return f16070f.h(obj, j2);
    }

    private static int v(Class<?> cls) {
        if (f16072h) {
            return f16070f.a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean w(Object obj, long j2) {
        return f16070f.i(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float x(Object obj, long j2) {
        return f16070f.j(obj, j2);
    }

    private static boolean y(Class<?> cls) {
        if (!f0.b()) {
            return false;
        }
        try {
            Class<?> cls2 = f16067c;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double z(Object obj, long j2) {
        return f16070f.k(obj, j2);
    }
}
