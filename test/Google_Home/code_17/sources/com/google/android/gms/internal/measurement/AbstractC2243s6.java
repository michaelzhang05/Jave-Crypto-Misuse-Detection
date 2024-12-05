package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.s6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2243s6 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f16824a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f16825b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f16826c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f16827d;

    /* renamed from: e, reason: collision with root package name */
    private static final b f16828e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f16829f;

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f16830g;

    /* renamed from: h, reason: collision with root package name */
    private static final long f16831h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f16832i;

    /* renamed from: com.google.android.gms.internal.measurement.s6$a */
    /* loaded from: classes3.dex */
    private static final class a extends b {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2243s6.b
        public final double a(Object obj, long j8) {
            return Double.longBitsToDouble(m(obj, j8));
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2243s6.b
        public final void b(Object obj, long j8, byte b8) {
            if (AbstractC2243s6.f16832i) {
                AbstractC2243s6.u(obj, j8, b8);
            } else {
                AbstractC2243s6.y(obj, j8, b8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2243s6.b
        public final void c(Object obj, long j8, double d8) {
            f(obj, j8, Double.doubleToLongBits(d8));
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2243s6.b
        public final void d(Object obj, long j8, float f8) {
            e(obj, j8, Float.floatToIntBits(f8));
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2243s6.b
        public final void g(Object obj, long j8, boolean z8) {
            if (AbstractC2243s6.f16832i) {
                AbstractC2243s6.k(obj, j8, z8);
            } else {
                AbstractC2243s6.r(obj, j8, z8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2243s6.b
        public final float i(Object obj, long j8) {
            return Float.intBitsToFloat(l(obj, j8));
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2243s6.b
        public final boolean k(Object obj, long j8) {
            if (AbstractC2243s6.f16832i) {
                return AbstractC2243s6.D(obj, j8);
            }
            return AbstractC2243s6.E(obj, j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.measurement.s6$b */
    /* loaded from: classes3.dex */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f16833a;

        b(Unsafe unsafe) {
            this.f16833a = unsafe;
        }

        public abstract double a(Object obj, long j8);

        public abstract void b(Object obj, long j8, byte b8);

        public abstract void c(Object obj, long j8, double d8);

        public abstract void d(Object obj, long j8, float f8);

        public final void e(Object obj, long j8, int i8) {
            this.f16833a.putInt(obj, j8, i8);
        }

        public final void f(Object obj, long j8, long j9) {
            this.f16833a.putLong(obj, j8, j9);
        }

        public abstract void g(Object obj, long j8, boolean z8);

        public final boolean h() {
            Unsafe unsafe = this.f16833a;
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
                AbstractC2243s6.l(th);
                return false;
            }
        }

        public abstract float i(Object obj, long j8);

        public final boolean j() {
            Unsafe unsafe = this.f16833a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                if (AbstractC2243s6.c() != null) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                AbstractC2243s6.l(th);
                return false;
            }
        }

        public abstract boolean k(Object obj, long j8);

        public final int l(Object obj, long j8) {
            return this.f16833a.getInt(obj, j8);
        }

        public final long m(Object obj, long j8) {
            return this.f16833a.getLong(obj, j8);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.s6$c */
    /* loaded from: classes3.dex */
    private static final class c extends b {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2243s6.b
        public final double a(Object obj, long j8) {
            return Double.longBitsToDouble(m(obj, j8));
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2243s6.b
        public final void b(Object obj, long j8, byte b8) {
            if (AbstractC2243s6.f16832i) {
                AbstractC2243s6.u(obj, j8, b8);
            } else {
                AbstractC2243s6.y(obj, j8, b8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2243s6.b
        public final void c(Object obj, long j8, double d8) {
            f(obj, j8, Double.doubleToLongBits(d8));
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2243s6.b
        public final void d(Object obj, long j8, float f8) {
            e(obj, j8, Float.floatToIntBits(f8));
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2243s6.b
        public final void g(Object obj, long j8, boolean z8) {
            if (AbstractC2243s6.f16832i) {
                AbstractC2243s6.k(obj, j8, z8);
            } else {
                AbstractC2243s6.r(obj, j8, z8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2243s6.b
        public final float i(Object obj, long j8) {
            return Float.intBitsToFloat(l(obj, j8));
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2243s6.b
        public final boolean k(Object obj, long j8) {
            if (AbstractC2243s6.f16832i) {
                return AbstractC2243s6.D(obj, j8);
            }
            return AbstractC2243s6.E(obj, j8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    static {
        /*
            sun.misc.Unsafe r0 = p()
            com.google.android.gms.internal.measurement.AbstractC2243s6.f16824a = r0
            java.lang.Class r1 = com.google.android.gms.internal.measurement.AbstractC2179l4.a()
            com.google.android.gms.internal.measurement.AbstractC2243s6.f16825b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = A(r1)
            com.google.android.gms.internal.measurement.AbstractC2243s6.f16826c = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = A(r2)
            com.google.android.gms.internal.measurement.AbstractC2243s6.f16827d = r2
            if (r0 == 0) goto L2e
            if (r1 == 0) goto L26
            com.google.android.gms.internal.measurement.s6$c r1 = new com.google.android.gms.internal.measurement.s6$c
            r1.<init>(r0)
            goto L2f
        L26:
            if (r2 == 0) goto L2e
            com.google.android.gms.internal.measurement.s6$a r1 = new com.google.android.gms.internal.measurement.s6$a
            r1.<init>(r0)
            goto L2f
        L2e:
            r1 = 0
        L2f:
            com.google.android.gms.internal.measurement.AbstractC2243s6.f16828e = r1
            r0 = 0
            if (r1 != 0) goto L36
            r2 = 0
            goto L3a
        L36:
            boolean r2 = r1.j()
        L3a:
            com.google.android.gms.internal.measurement.AbstractC2243s6.f16829f = r2
            if (r1 != 0) goto L40
            r2 = 0
            goto L44
        L40:
            boolean r2 = r1.h()
        L44:
            com.google.android.gms.internal.measurement.AbstractC2243s6.f16830g = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = o(r2)
            long r2 = (long) r2
            com.google.android.gms.internal.measurement.AbstractC2243s6.f16831h = r2
            java.lang.Class<boolean[]> r2 = boolean[].class
            o(r2)
            s(r2)
            java.lang.Class<int[]> r2 = int[].class
            o(r2)
            s(r2)
            java.lang.Class<long[]> r2 = long[].class
            o(r2)
            s(r2)
            java.lang.Class<float[]> r2 = float[].class
            o(r2)
            s(r2)
            java.lang.Class<double[]> r2 = double[].class
            o(r2)
            s(r2)
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            o(r2)
            s(r2)
            java.lang.reflect.Field r2 = C()
            if (r2 == 0) goto L8d
            if (r1 != 0) goto L88
            goto L8d
        L88:
            sun.misc.Unsafe r1 = r1.f16833a
            r1.objectFieldOffset(r2)
        L8d:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto L96
            r0 = 1
        L96:
            com.google.android.gms.internal.measurement.AbstractC2243s6.f16832i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC2243s6.<clinit>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean A(Class cls) {
        try {
            Class cls2 = f16825b;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object B(Object obj, long j8) {
        return f16828e.f16833a.getObject(obj, j8);
    }

    private static Field C() {
        Field d8 = d(Buffer.class, "effectiveDirectAddress");
        if (d8 != null) {
            return d8;
        }
        Field d9 = d(Buffer.class, "address");
        if (d9 != null && d9.getType() == Long.TYPE) {
            return d9;
        }
        return null;
    }

    static /* synthetic */ boolean D(Object obj, long j8) {
        if (((byte) (t(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3)))) != 0) {
            return true;
        }
        return false;
    }

    static /* synthetic */ boolean E(Object obj, long j8) {
        if (((byte) (t(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3)))) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean F(Object obj, long j8) {
        return f16828e.k(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double a(Object obj, long j8) {
        return f16828e.a(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object b(Class cls) {
        try {
            return f16824a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    static /* synthetic */ Field c() {
        return C();
    }

    private static Field d(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Object obj, long j8, double d8) {
        f16828e.c(obj, j8, d8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Object obj, long j8, float f8) {
        f16828e.d(obj, j8, f8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(Object obj, long j8, int i8) {
        f16828e.e(obj, j8, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Object obj, long j8, long j9) {
        f16828e.f(obj, j8, j9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(Object obj, long j8, Object obj2) {
        f16828e.f16833a.putObject(obj, j8, obj2);
    }

    static /* synthetic */ void k(Object obj, long j8, boolean z8) {
        u(obj, j8, z8 ? (byte) 1 : (byte) 0);
    }

    static /* synthetic */ void l(Throwable th) {
        Logger.getLogger(AbstractC2243s6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + String.valueOf(th));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(byte[] bArr, long j8, byte b8) {
        f16828e.b(bArr, f16831h + j8, b8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float n(Object obj, long j8) {
        return f16828e.i(obj, j8);
    }

    private static int o(Class cls) {
        if (f16830g) {
            return f16828e.f16833a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C2270v6());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void r(Object obj, long j8, boolean z8) {
        y(obj, j8, z8 ? (byte) 1 : (byte) 0);
    }

    private static int s(Class cls) {
        if (f16830g) {
            return f16828e.f16833a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(Object obj, long j8) {
        return f16828e.l(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(Object obj, long j8, byte b8) {
        long j9 = (-4) & j8;
        int t8 = t(obj, j9);
        int i8 = ((~((int) j8)) & 3) << 3;
        h(obj, j9, ((255 & b8) << i8) | (t8 & (~(255 << i8))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void v(Object obj, long j8, boolean z8) {
        f16828e.g(obj, j8, z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean w() {
        return f16830g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long x(Object obj, long j8) {
        return f16828e.m(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Object obj, long j8, byte b8) {
        long j9 = (-4) & j8;
        int i8 = (((int) j8) & 3) << 3;
        h(obj, j9, ((255 & b8) << i8) | (t(obj, j9) & (~(255 << i8))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean z() {
        return f16829f;
    }
}
