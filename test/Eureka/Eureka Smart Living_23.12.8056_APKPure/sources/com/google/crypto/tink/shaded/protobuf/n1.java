package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f5552a = D();

    /* renamed from: b, reason: collision with root package name */
    private static final Class f5553b = com.google.crypto.tink.shaded.protobuf.d.b();

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f5554c = o(Long.TYPE);

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f5555d = o(Integer.TYPE);

    /* renamed from: e, reason: collision with root package name */
    private static final e f5556e = B();

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f5557f = T();

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f5558g = S();

    /* renamed from: h, reason: collision with root package name */
    static final long f5559h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f5560i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f5561j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f5562k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f5563l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f5564m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f5565n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f5566o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f5567p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f5568q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f5569r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f5570s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f5571t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f5572u;

    /* renamed from: v, reason: collision with root package name */
    private static final int f5573v;

    /* renamed from: w, reason: collision with root package name */
    static final boolean f5574w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public boolean c(Object obj, long j6) {
            return n1.f5574w ? n1.s(obj, j6) : n1.t(obj, j6);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public byte d(Object obj, long j6) {
            return n1.f5574w ? n1.v(obj, j6) : n1.w(obj, j6);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public double e(Object obj, long j6) {
            return Double.longBitsToDouble(h(obj, j6));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public float f(Object obj, long j6) {
            return Float.intBitsToFloat(g(obj, j6));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public void k(Object obj, long j6, boolean z5) {
            if (n1.f5574w) {
                n1.I(obj, j6, z5);
            } else {
                n1.J(obj, j6, z5);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public void l(Object obj, long j6, byte b6) {
            if (n1.f5574w) {
                n1.L(obj, j6, b6);
            } else {
                n1.M(obj, j6, b6);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public void m(Object obj, long j6, double d6) {
            p(obj, j6, Double.doubleToLongBits(d6));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public void n(Object obj, long j6, float f6) {
            o(obj, j6, Float.floatToIntBits(f6));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public boolean s() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public boolean c(Object obj, long j6) {
            return n1.f5574w ? n1.s(obj, j6) : n1.t(obj, j6);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public byte d(Object obj, long j6) {
            return n1.f5574w ? n1.v(obj, j6) : n1.w(obj, j6);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public double e(Object obj, long j6) {
            return Double.longBitsToDouble(h(obj, j6));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public float f(Object obj, long j6) {
            return Float.intBitsToFloat(g(obj, j6));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public void k(Object obj, long j6, boolean z5) {
            if (n1.f5574w) {
                n1.I(obj, j6, z5);
            } else {
                n1.J(obj, j6, z5);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public void l(Object obj, long j6, byte b6) {
            if (n1.f5574w) {
                n1.L(obj, j6, b6);
            } else {
                n1.M(obj, j6, b6);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public void m(Object obj, long j6, double d6) {
            p(obj, j6, Double.doubleToLongBits(d6));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public void n(Object obj, long j6, float f6) {
            o(obj, j6, Float.floatToIntBits(f6));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public boolean s() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public boolean c(Object obj, long j6) {
            return this.f5575a.getBoolean(obj, j6);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public byte d(Object obj, long j6) {
            return this.f5575a.getByte(obj, j6);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public double e(Object obj, long j6) {
            return this.f5575a.getDouble(obj, j6);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public float f(Object obj, long j6) {
            return this.f5575a.getFloat(obj, j6);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public void k(Object obj, long j6, boolean z5) {
            this.f5575a.putBoolean(obj, j6, z5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public void l(Object obj, long j6, byte b6) {
            this.f5575a.putByte(obj, j6, b6);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public void m(Object obj, long j6, double d6) {
            this.f5575a.putDouble(obj, j6, d6);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public void n(Object obj, long j6, float f6) {
            this.f5575a.putFloat(obj, j6, f6);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f5575a.getClass();
                Class<?> cls2 = Long.TYPE;
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
                n1.G(th);
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n1.e
        public boolean s() {
            if (!super.s()) {
                return false;
            }
            try {
                Class<?> cls = this.f5575a.getClass();
                Class<?> cls2 = Long.TYPE;
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
                n1.G(th);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f5575a;

        e(Unsafe unsafe) {
            this.f5575a = unsafe;
        }

        public final int a(Class cls) {
            return this.f5575a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f5575a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j6);

        public abstract byte d(Object obj, long j6);

        public abstract double e(Object obj, long j6);

        public abstract float f(Object obj, long j6);

        public final int g(Object obj, long j6) {
            return this.f5575a.getInt(obj, j6);
        }

        public final long h(Object obj, long j6) {
            return this.f5575a.getLong(obj, j6);
        }

        public final Object i(Object obj, long j6) {
            return this.f5575a.getObject(obj, j6);
        }

        public final long j(Field field) {
            return this.f5575a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j6, boolean z5);

        public abstract void l(Object obj, long j6, byte b6);

        public abstract void m(Object obj, long j6, double d6);

        public abstract void n(Object obj, long j6, float f6);

        public final void o(Object obj, long j6, int i6) {
            this.f5575a.putInt(obj, j6, i6);
        }

        public final void p(Object obj, long j6, long j7) {
            this.f5575a.putLong(obj, j6, j7);
        }

        public final void q(Object obj, long j6, Object obj2) {
            this.f5575a.putObject(obj, j6, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.f5575a;
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
                return true;
            } catch (Throwable th) {
                n1.G(th);
                return false;
            }
        }

        public boolean s() {
            Unsafe unsafe = this.f5575a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return n1.b() != null;
            } catch (Throwable th) {
                n1.G(th);
                return false;
            }
        }
    }

    static {
        long l6 = l(byte[].class);
        f5559h = l6;
        f5560i = l(boolean[].class);
        f5561j = m(boolean[].class);
        f5562k = l(int[].class);
        f5563l = m(int[].class);
        f5564m = l(long[].class);
        f5565n = m(long[].class);
        f5566o = l(float[].class);
        f5567p = m(float[].class);
        f5568q = l(double[].class);
        f5569r = m(double[].class);
        f5570s = l(Object[].class);
        f5571t = m(Object[].class);
        f5572u = q(n());
        f5573v = (int) (l6 & 7);
        f5574w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long A(Object obj, long j6) {
        return f5556e.h(obj, j6);
    }

    private static e B() {
        Unsafe unsafe = f5552a;
        if (unsafe == null) {
            return null;
        }
        if (!com.google.crypto.tink.shaded.protobuf.d.c()) {
            return new d(unsafe);
        }
        if (f5554c) {
            return new c(unsafe);
        }
        if (f5555d) {
            return new b(unsafe);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object C(Object obj, long j6) {
        return f5556e.i(obj, j6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean E() {
        return f5558g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean F() {
        return f5557f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Throwable th) {
        Logger.getLogger(n1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void H(Object obj, long j6, boolean z5) {
        f5556e.k(obj, j6, z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j6, boolean z5) {
        L(obj, j6, z5 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j6, boolean z5) {
        M(obj, j6, z5 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void K(byte[] bArr, long j6, byte b6) {
        f5556e.l(bArr, f5559h + j6, b6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void L(Object obj, long j6, byte b6) {
        long j7 = (-4) & j6;
        int z5 = z(obj, j7);
        int i6 = ((~((int) j6)) & 3) << 3;
        P(obj, j7, ((255 & b6) << i6) | (z5 & (~(255 << i6))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M(Object obj, long j6, byte b6) {
        long j7 = (-4) & j6;
        int i6 = (((int) j6) & 3) << 3;
        P(obj, j7, ((255 & b6) << i6) | (z(obj, j7) & (~(255 << i6))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void N(Object obj, long j6, double d6) {
        f5556e.m(obj, j6, d6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void O(Object obj, long j6, float f6) {
        f5556e.n(obj, j6, f6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void P(Object obj, long j6, int i6) {
        f5556e.o(obj, j6, i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void Q(Object obj, long j6, long j7) {
        f5556e.p(obj, j6, j7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void R(Object obj, long j6, Object obj2) {
        f5556e.q(obj, j6, obj2);
    }

    private static boolean S() {
        e eVar = f5556e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    private static boolean T() {
        e eVar = f5556e;
        if (eVar == null) {
            return false;
        }
        return eVar.s();
    }

    static /* synthetic */ Field b() {
        return n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object k(Class cls) {
        try {
            return f5552a.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    private static int l(Class cls) {
        if (f5558g) {
            return f5556e.a(cls);
        }
        return -1;
    }

    private static int m(Class cls) {
        if (f5558g) {
            return f5556e.b(cls);
        }
        return -1;
    }

    private static Field n() {
        Field p6;
        if (com.google.crypto.tink.shaded.protobuf.d.c() && (p6 = p(Buffer.class, "effectiveDirectAddress")) != null) {
            return p6;
        }
        Field p7 = p(Buffer.class, "address");
        if (p7 == null || p7.getType() != Long.TYPE) {
            return null;
        }
        return p7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean o(Class cls) {
        if (!com.google.crypto.tink.shaded.protobuf.d.c()) {
            return false;
        }
        try {
            Class cls2 = f5553b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
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

    private static Field p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long q(Field field) {
        e eVar;
        if (field == null || (eVar = f5556e) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean r(Object obj, long j6) {
        return f5556e.c(obj, j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean s(Object obj, long j6) {
        return v(obj, j6) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(Object obj, long j6) {
        return w(obj, j6) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte u(byte[] bArr, long j6) {
        return f5556e.d(bArr, f5559h + j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte v(Object obj, long j6) {
        return (byte) ((z(obj, (-4) & j6) >>> ((int) (((~j6) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte w(Object obj, long j6) {
        return (byte) ((z(obj, (-4) & j6) >>> ((int) ((j6 & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double x(Object obj, long j6) {
        return f5556e.e(obj, j6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float y(Object obj, long j6) {
        return f5556e.f(obj, j6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(Object obj, long j6) {
        return f5556e.g(obj, j6);
    }
}
