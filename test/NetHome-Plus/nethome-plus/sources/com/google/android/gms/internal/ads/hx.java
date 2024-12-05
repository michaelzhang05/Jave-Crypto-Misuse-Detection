package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class hx {
    private static final Logger a = Logger.getLogger(hx.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final Unsafe f11547b;

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f11548c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f11549d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f11550e;

    /* renamed from: f, reason: collision with root package name */
    private static final d f11551f;

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f11552g;

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f11553h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f11554i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f11555j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f11556k;
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

        @Override // com.google.android.gms.internal.ads.hx.d
        public final void a(long j2, byte b2) {
            Memory.pokeByte((int) (j2 & (-1)), b2);
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final void b(Object obj, long j2, double d2) {
            d(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final void c(Object obj, long j2, float f2) {
            g(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final void e(Object obj, long j2, boolean z) {
            if (hx.w) {
                hx.o(obj, j2, z);
            } else {
                hx.x(obj, j2, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final void f(byte[] bArr, long j2, long j3, long j4) {
            Memory.pokeByteArray((int) (j3 & (-1)), bArr, (int) j2, (int) j4);
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final void h(Object obj, long j2, byte b2) {
            if (hx.w) {
                hx.c(obj, j2, b2);
            } else {
                hx.m(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final boolean k(Object obj, long j2) {
            return hx.w ? hx.O(obj, j2) : hx.P(obj, j2);
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final float l(Object obj, long j2) {
            return Float.intBitsToFloat(i(obj, j2));
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final double m(Object obj, long j2) {
            return Double.longBitsToDouble(j(obj, j2));
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final byte n(Object obj, long j2) {
            return hx.w ? hx.M(obj, j2) : hx.N(obj, j2);
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final void a(long j2, byte b2) {
            Memory.pokeByte(j2, b2);
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final void b(Object obj, long j2, double d2) {
            d(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final void c(Object obj, long j2, float f2) {
            g(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final void e(Object obj, long j2, boolean z) {
            if (hx.w) {
                hx.o(obj, j2, z);
            } else {
                hx.x(obj, j2, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final void f(byte[] bArr, long j2, long j3, long j4) {
            Memory.pokeByteArray(j3, bArr, (int) j2, (int) j4);
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final void h(Object obj, long j2, byte b2) {
            if (hx.w) {
                hx.c(obj, j2, b2);
            } else {
                hx.m(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final boolean k(Object obj, long j2) {
            return hx.w ? hx.O(obj, j2) : hx.P(obj, j2);
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final float l(Object obj, long j2) {
            return Float.intBitsToFloat(i(obj, j2));
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final double m(Object obj, long j2) {
            return Double.longBitsToDouble(j(obj, j2));
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final byte n(Object obj, long j2) {
            return hx.w ? hx.M(obj, j2) : hx.N(obj, j2);
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final void a(long j2, byte b2) {
            this.a.putByte(j2, b2);
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final void b(Object obj, long j2, double d2) {
            this.a.putDouble(obj, j2, d2);
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final void c(Object obj, long j2, float f2) {
            this.a.putFloat(obj, j2, f2);
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final void e(Object obj, long j2, boolean z) {
            this.a.putBoolean(obj, j2, z);
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final void f(byte[] bArr, long j2, long j3, long j4) {
            this.a.copyMemory(bArr, hx.f11554i + j2, (Object) null, j3, j4);
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final void h(Object obj, long j2, byte b2) {
            this.a.putByte(obj, j2, b2);
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final boolean k(Object obj, long j2) {
            return this.a.getBoolean(obj, j2);
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final float l(Object obj, long j2) {
            return this.a.getFloat(obj, j2);
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final double m(Object obj, long j2) {
            return this.a.getDouble(obj, j2);
        }

        @Override // com.google.android.gms.internal.ads.hx.d
        public final byte n(Object obj, long j2) {
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

        public abstract void a(long j2, byte b2);

        public abstract void b(Object obj, long j2, double d2);

        public abstract void c(Object obj, long j2, float f2);

        public final void d(Object obj, long j2, long j3) {
            this.a.putLong(obj, j2, j3);
        }

        public abstract void e(Object obj, long j2, boolean z);

        public abstract void f(byte[] bArr, long j2, long j3, long j4);

        public final void g(Object obj, long j2, int i2) {
            this.a.putInt(obj, j2, i2);
        }

        public abstract void h(Object obj, long j2, byte b2);

        public final int i(Object obj, long j2) {
            return this.a.getInt(obj, j2);
        }

        public final long j(Object obj, long j2) {
            return this.a.getLong(obj, j2);
        }

        public abstract boolean k(Object obj, long j2);

        public abstract float l(Object obj, long j2);

        public abstract double m(Object obj, long j2);

        public abstract byte n(Object obj, long j2);
    }

    static {
        Unsafe r2 = r();
        f11547b = r2;
        f11548c = zt.b();
        boolean G = G(Long.TYPE);
        f11549d = G;
        boolean G2 = G(Integer.TYPE);
        f11550e = G2;
        d dVar = null;
        if (r2 != null) {
            if (!zt.a()) {
                dVar = new c(r2);
            } else if (G) {
                dVar = new b(r2);
            } else if (G2) {
                dVar = new a(r2);
            }
        }
        f11551f = dVar;
        f11552g = t();
        f11553h = s();
        f11554i = C(byte[].class);
        f11555j = C(boolean[].class);
        f11556k = D(boolean[].class);
        l = C(int[].class);
        m = D(int[].class);
        n = C(long[].class);
        o = D(long[].class);
        p = C(float[].class);
        q = D(float[].class);
        r = C(double[].class);
        s = D(double[].class);
        t = C(Object[].class);
        u = D(Object[].class);
        Field u2 = u();
        v = (u2 == null || dVar == null) ? -1L : dVar.a.objectFieldOffset(u2);
        w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private hx() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T B(Class<T> cls) {
        try {
            return (T) f11547b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static int C(Class<?> cls) {
        if (f11553h) {
            return f11551f.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int D(Class<?> cls) {
        if (f11553h) {
            return f11551f.a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int E(Object obj, long j2) {
        return f11551f.i(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long F(Object obj, long j2) {
        return f11551f.j(obj, j2);
    }

    private static boolean G(Class<?> cls) {
        if (!zt.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f11548c;
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
    public static boolean H(Object obj, long j2) {
        return f11551f.k(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float I(Object obj, long j2) {
        return f11551f.l(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long J(ByteBuffer byteBuffer) {
        return f11551f.j(byteBuffer, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double K(Object obj, long j2) {
        return f11551f.m(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object L(Object obj, long j2) {
        return f11551f.a.getObject(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte M(Object obj, long j2) {
        return (byte) (E(obj, (-4) & j2) >>> ((int) (((j2 ^ (-1)) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte N(Object obj, long j2) {
        return (byte) (E(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean O(Object obj, long j2) {
        return M(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean P(Object obj, long j2) {
        return N(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte a(byte[] bArr, long j2) {
        return f11551f.n(bArr, f11554i + j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(long j2, byte b2) {
        f11551f.a(j2, b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = ((((int) j2) ^ (-1)) & 3) << 3;
        n(obj, j3, ((255 & b2) << i2) | (E(obj, j3) & ((255 << i2) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Object obj, long j2, double d2) {
        f11551f.b(obj, j2, d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(Object obj, long j2, float f2) {
        f11551f.c(obj, j2, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Object obj, long j2, long j3) {
        f11551f.d(obj, j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Object obj, long j2, Object obj2) {
        f11551f.a.putObject(obj, j2, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(Object obj, long j2, boolean z) {
        f11551f.e(obj, j2, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(byte[] bArr, long j2, byte b2) {
        f11551f.h(bArr, f11554i + j2, b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(byte[] bArr, long j2, long j3, long j4) {
        f11551f.f(bArr, j2, j3, j4);
    }

    private static Field l(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        n(obj, j3, ((255 & b2) << i2) | (E(obj, j3) & ((255 << i2) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(Object obj, long j2, int i2) {
        f11551f.g(obj, j2, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(Object obj, long j2, boolean z) {
        c(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean p() {
        return f11553h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q() {
        return f11552g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe r() {
        try {
            return (Unsafe) AccessController.doPrivileged(new jx());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean s() {
        Unsafe unsafe = f11547b;
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
            if (zt.a()) {
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

    private static boolean t() {
        Unsafe unsafe = f11547b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (u() == null) {
                return false;
            }
            if (zt.a()) {
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

    private static Field u() {
        Field l2;
        if (zt.a() && (l2 = l(Buffer.class, "effectiveDirectAddress")) != null) {
            return l2;
        }
        Field l3 = l(Buffer.class, "address");
        if (l3 == null || l3.getType() != Long.TYPE) {
            return null;
        }
        return l3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void x(Object obj, long j2, boolean z) {
        m(obj, j2, z ? (byte) 1 : (byte) 0);
    }
}
