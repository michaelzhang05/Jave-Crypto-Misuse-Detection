package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.u4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2112u4 extends H3 {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected C2082q5 zzc = C2082q5.c();

    private final int h(InterfaceC2026j5 interfaceC2026j5) {
        if (interfaceC2026j5 == null) {
            return C2001g5.a().b(getClass()).g(this);
        }
        return interfaceC2026j5.g(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC2112u4 k(Class cls) {
        Map map = zza;
        AbstractC2112u4 abstractC2112u4 = (AbstractC2112u4) map.get(cls);
        if (abstractC2112u4 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2112u4 = (AbstractC2112u4) map.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (abstractC2112u4 == null) {
            abstractC2112u4 = (AbstractC2112u4) ((AbstractC2112u4) AbstractC2153z5.j(cls)).A(6, null, null);
            if (abstractC2112u4 != null) {
                map.put(cls, abstractC2112u4);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC2112u4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static InterfaceC2144y4 m() {
        return C2120v4.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static InterfaceC2152z4 n() {
        return N4.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static InterfaceC2152z4 o(InterfaceC2152z4 interfaceC2152z4) {
        int i8;
        int size = interfaceC2152z4.size();
        if (size == 0) {
            i8 = 10;
        } else {
            i8 = size + size;
        }
        return interfaceC2152z4.k(i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static A4 p() {
        return C2010h5.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static A4 q(A4 a42) {
        int i8;
        int size = a42.size();
        if (size == 0) {
            i8 = 10;
        } else {
            i8 = size + size;
        }
        return a42.k(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object r(Method method, Object obj, Object... objArr) {
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
    public static Object s(Y4 y42, String str, Object[] objArr) {
        return new C2018i5(y42, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void w(Class cls, AbstractC2112u4 abstractC2112u4) {
        abstractC2112u4.v();
        zza.put(cls, abstractC2112u4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object A(int i8, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.Y4
    public final int a() {
        int i8;
        if (y()) {
            i8 = h(null);
            if (i8 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i8);
            }
        } else {
            i8 = this.zzd & Integer.MAX_VALUE;
            if (i8 == Integer.MAX_VALUE) {
                i8 = h(null);
                if (i8 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i8;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i8);
                }
            }
        }
        return i8;
    }

    @Override // com.google.android.gms.internal.measurement.Z4
    public final /* synthetic */ Y4 b() {
        return (AbstractC2112u4) A(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.Y4
    public final /* synthetic */ X4 c() {
        return (AbstractC2088r4) A(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.Y4
    public final void d(AbstractC1991f4 abstractC1991f4) {
        C2001g5.a().b(getClass()).b(this, C2000g4.K(abstractC1991f4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.H3
    public final int e(InterfaceC2026j5 interfaceC2026j5) {
        if (y()) {
            int h8 = h(interfaceC2026j5);
            if (h8 >= 0) {
                return h8;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + h8);
        }
        int i8 = this.zzd & Integer.MAX_VALUE;
        if (i8 != Integer.MAX_VALUE) {
            return i8;
        }
        int h9 = h(interfaceC2026j5);
        if (h9 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | h9;
            return h9;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + h9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C2001g5.a().b(getClass()).i(this, (AbstractC2112u4) obj);
    }

    public final int hashCode() {
        if (!y()) {
            int i8 = this.zzb;
            if (i8 == 0) {
                int z8 = z();
                this.zzb = z8;
                return z8;
            }
            return i8;
        }
        return z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC2088r4 i() {
        return (AbstractC2088r4) A(5, null, null);
    }

    public final AbstractC2088r4 j() {
        AbstractC2088r4 abstractC2088r4 = (AbstractC2088r4) A(5, null, null);
        abstractC2088r4.i(this);
        return abstractC2088r4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final AbstractC2112u4 l() {
        return (AbstractC2112u4) A(4, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t() {
        C2001g5.a().b(getClass()).a(this);
        v();
    }

    public final String toString() {
        return AbstractC1947a5.a(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x(int i8) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean y() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    final int z() {
        return C2001g5.a().b(getClass()).d(this);
    }
}
