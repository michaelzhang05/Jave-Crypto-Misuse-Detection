package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2091c5 extends AbstractC2160j4 {
    private static Map<Class<?>, AbstractC2091c5> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected C2226q6 zzb = C2226q6.k();

    /* renamed from: com.google.android.gms.internal.measurement.c5$a */
    /* loaded from: classes3.dex */
    protected static class a extends AbstractC2170k4 {
        public a(AbstractC2091c5 abstractC2091c5) {
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.c5$b */
    /* loaded from: classes3.dex */
    public static abstract class b extends AbstractC2150i4 {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC2091c5 f16583a;

        /* renamed from: b, reason: collision with root package name */
        protected AbstractC2091c5 f16584b;

        /* JADX INFO: Access modifiers changed from: protected */
        public b(AbstractC2091c5 abstractC2091c5) {
            this.f16583a = abstractC2091c5;
            if (!abstractC2091c5.F()) {
                this.f16584b = abstractC2091c5.z();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static void h(Object obj, Object obj2) {
            U5.a().c(obj).e(obj, obj2);
        }

        private final b n(byte[] bArr, int i8, int i9, O4 o42) {
            if (!this.f16584b.F()) {
                m();
            }
            try {
                U5.a().c(this.f16584b).f(this.f16584b, bArr, 0, i9, new C2197n4(o42));
                return this;
            } catch (C2171k5 e8) {
                throw e8;
            } catch (IOException e9) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
            } catch (IndexOutOfBoundsException unused) {
                throw C2171k5.g();
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2150i4
        public /* synthetic */ Object clone() {
            b bVar = (b) this.f16583a.o(c.f16589e, null, null);
            bVar.f16584b = (AbstractC2091c5) u();
            return bVar;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2150i4
        public final /* synthetic */ AbstractC2150i4 e(byte[] bArr, int i8, int i9) {
            return n(bArr, 0, i9, O4.f16242c);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2150i4
        public final /* synthetic */ AbstractC2150i4 f(byte[] bArr, int i8, int i9, O4 o42) {
            return n(bArr, 0, i9, o42);
        }

        public final b g(AbstractC2091c5 abstractC2091c5) {
            if (this.f16583a.equals(abstractC2091c5)) {
                return this;
            }
            if (!this.f16584b.F()) {
                m();
            }
            h(this.f16584b, abstractC2091c5);
            return this;
        }

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final AbstractC2091c5 k() {
            AbstractC2091c5 abstractC2091c5 = (AbstractC2091c5) u();
            if (AbstractC2091c5.s(abstractC2091c5, true)) {
                return abstractC2091c5;
            }
            throw new C2208o6(abstractC2091c5);
        }

        @Override // com.google.android.gms.internal.measurement.H5
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public AbstractC2091c5 u() {
            if (!this.f16584b.F()) {
                return this.f16584b;
            }
            this.f16584b.D();
            return this.f16584b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void l() {
            if (!this.f16584b.F()) {
                m();
            }
        }

        protected void m() {
            AbstractC2091c5 z8 = this.f16583a.z();
            h(z8, this.f16584b);
            this.f16584b = z8;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.c5$c */
    /* loaded from: classes3.dex */
    public enum c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f16585a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f16586b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f16587c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f16588d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f16589e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f16590f = 6;

        /* renamed from: g, reason: collision with root package name */
        public static final int f16591g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ int[] f16592h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f16592h.clone();
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.c5$d */
    /* loaded from: classes3.dex */
    public static class d extends P4 {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static InterfaceC2161j5 A() {
        return C2121f5.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static InterfaceC2151i5 B() {
        return C2242s5.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static InterfaceC2180l5 C() {
        return T5.f();
    }

    private final int j() {
        return U5.a().c(this).d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC2091c5 l(Class cls) {
        AbstractC2091c5 abstractC2091c5 = zzc.get(cls);
        if (abstractC2091c5 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2091c5 = zzc.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (abstractC2091c5 == null) {
            abstractC2091c5 = (AbstractC2091c5) ((AbstractC2091c5) AbstractC2243s6.b(cls)).o(c.f16590f, null, null);
            if (abstractC2091c5 != null) {
                zzc.put(cls, abstractC2091c5);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC2091c5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static InterfaceC2151i5 m(InterfaceC2151i5 interfaceC2151i5) {
        int i8;
        int size = interfaceC2151i5.size();
        if (size == 0) {
            i8 = 10;
        } else {
            i8 = size << 1;
        }
        return interfaceC2151i5.a(i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static InterfaceC2180l5 n(InterfaceC2180l5 interfaceC2180l5) {
        int i8;
        int size = interfaceC2180l5.size();
        if (size == 0) {
            i8 = 10;
        } else {
            i8 = size << 1;
        }
        return interfaceC2180l5.a(i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object p(I5 i52, String str, Object[] objArr) {
        return new W5(i52, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object q(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e8);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void r(Class cls, AbstractC2091c5 abstractC2091c5) {
        abstractC2091c5.E();
        zzc.put(cls, abstractC2091c5);
    }

    protected static final boolean s(AbstractC2091c5 abstractC2091c5, boolean z8) {
        Object obj;
        byte byteValue = ((Byte) abstractC2091c5.o(c.f16585a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b8 = U5.a().c(abstractC2091c5).b(abstractC2091c5);
        if (z8) {
            int i8 = c.f16586b;
            if (b8) {
                obj = abstractC2091c5;
            } else {
                obj = null;
            }
            abstractC2091c5.o(i8, obj, null);
        }
        return b8;
    }

    private final int t(Y5 y52) {
        if (y52 == null) {
            return U5.a().c(this).a(this);
        }
        return y52.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D() {
        U5.a().c(this).c(this);
        E();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean F() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void a(K4 k42) {
        U5.a().c(this).g(this, N4.P(k42));
    }

    @Override // com.google.android.gms.internal.measurement.K5
    public final /* synthetic */ I5 b() {
        return (AbstractC2091c5) o(c.f16590f, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final /* synthetic */ H5 c() {
        return (b) o(c.f16589e, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final int d() {
        return e(null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2160j4
    final int e(Y5 y52) {
        if (F()) {
            int t8 = t(y52);
            if (t8 >= 0) {
                return t8;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + t8);
        }
        if (g() != Integer.MAX_VALUE) {
            return g();
        }
        int t9 = t(y52);
        h(t9);
        return t9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return U5.a().c(this).h(this, (AbstractC2091c5) obj);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2160j4
    final int g() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2160j4
    final void h(int i8) {
        if (i8 >= 0) {
            this.zzd = (i8 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i8);
        }
    }

    public int hashCode() {
        if (F()) {
            return j();
        }
        if (this.zza == 0) {
            this.zza = j();
        }
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b k(AbstractC2091c5 abstractC2091c5) {
        return w().g(abstractC2091c5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object o(int i8, Object obj, Object obj2);

    public String toString() {
        return J5.a(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b w() {
        return (b) o(c.f16589e, null, null);
    }

    public final b x() {
        return ((b) o(c.f16589e, null, null)).g(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final AbstractC2091c5 z() {
        return (AbstractC2091c5) o(c.f16588d, null, null);
    }
}
