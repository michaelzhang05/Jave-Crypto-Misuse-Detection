package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class x extends com.google.crypto.tink.shaded.protobuf.a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, x> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected k1 unknownFields = k1.c();

    /* loaded from: classes.dex */
    public static abstract class a extends a.AbstractC0088a {

        /* renamed from: a, reason: collision with root package name */
        private final x f5693a;

        /* renamed from: b, reason: collision with root package name */
        protected x f5694b;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(x xVar) {
            this.f5693a = xVar;
            if (xVar.D()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f5694b = q();
        }

        private static void p(Object obj, Object obj2) {
            z0.a().d(obj).a(obj, obj2);
        }

        private x q() {
            return this.f5693a.J();
        }

        public final x i() {
            x j6 = j();
            if (j6.B()) {
                return j6;
            }
            throw a.AbstractC0088a.h(j6);
        }

        public x j() {
            if (!this.f5694b.D()) {
                return this.f5694b;
            }
            this.f5694b.E();
            return this.f5694b;
        }

        public a k() {
            a H = n().H();
            H.f5694b = j();
            return H;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void l() {
            if (this.f5694b.D()) {
                return;
            }
            m();
        }

        protected void m() {
            x q6 = q();
            p(q6, this.f5694b);
            this.f5694b = q6;
        }

        public x n() {
            return this.f5693a;
        }

        public a o(x xVar) {
            if (n().equals(xVar)) {
                return this;
            }
            l();
            p(this.f5694b, xVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    protected static class b extends com.google.crypto.tink.shaded.protobuf.b {

        /* renamed from: b, reason: collision with root package name */
        private final x f5695b;

        public b(x xVar) {
            this.f5695b = xVar;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends n {
    }

    /* loaded from: classes.dex */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object A(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e6);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final boolean C(x xVar, boolean z5) {
        byte byteValue = ((Byte) xVar.r(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b6 = z0.a().d(xVar).b(xVar);
        if (z5) {
            xVar.s(d.SET_MEMOIZED_IS_INITIALIZED, b6 ? xVar : null);
        }
        return b6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static z.d G(z.d dVar) {
        int size = dVar.size();
        return dVar.d(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object I(o0 o0Var, String str, Object[] objArr) {
        return new b1(o0Var, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static x K(x xVar, h hVar, p pVar) {
        return l(N(xVar, hVar, pVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static x L(x xVar, InputStream inputStream, p pVar) {
        return l(O(xVar, i.f(inputStream), pVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static x M(x xVar, byte[] bArr, p pVar) {
        return l(P(xVar, bArr, 0, bArr.length, pVar));
    }

    private static x N(x xVar, h hVar, p pVar) {
        i t5 = hVar.t();
        x O = O(xVar, t5, pVar);
        try {
            t5.a(0);
            return O;
        } catch (a0 e6) {
            throw e6.k(O);
        }
    }

    static x O(x xVar, i iVar, p pVar) {
        x J = xVar.J();
        try {
            d1 d6 = z0.a().d(J);
            d6.h(J, j.O(iVar), pVar);
            d6.i(J);
            return J;
        } catch (a0 e6) {
            e = e6;
            if (e.a()) {
                e = new a0(e);
            }
            throw e.k(J);
        } catch (i1 e7) {
            throw e7.a().k(J);
        } catch (IOException e8) {
            if (e8.getCause() instanceof a0) {
                throw ((a0) e8.getCause());
            }
            throw new a0(e8).k(J);
        } catch (RuntimeException e9) {
            if (e9.getCause() instanceof a0) {
                throw ((a0) e9.getCause());
            }
            throw e9;
        }
    }

    private static x P(x xVar, byte[] bArr, int i6, int i7, p pVar) {
        x J = xVar.J();
        try {
            d1 d6 = z0.a().d(J);
            d6.d(J, bArr, i6, i6 + i7, new e.a(pVar));
            d6.i(J);
            return J;
        } catch (a0 e6) {
            e = e6;
            if (e.a()) {
                e = new a0(e);
            }
            throw e.k(J);
        } catch (i1 e7) {
            throw e7.a().k(J);
        } catch (IOException e8) {
            if (e8.getCause() instanceof a0) {
                throw ((a0) e8.getCause());
            }
            throw new a0(e8).k(J);
        } catch (IndexOutOfBoundsException unused) {
            throw a0.m().k(J);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void Q(Class cls, x xVar) {
        xVar.F();
        defaultInstanceMap.put(cls, xVar);
    }

    private static x l(x xVar) {
        if (xVar == null || xVar.B()) {
            return xVar;
        }
        throw xVar.j().a().k(xVar);
    }

    private int p(d1 d1Var) {
        return d1Var == null ? z0.a().d(this).f(this) : d1Var.f(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static z.d u() {
        return a1.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x v(Class cls) {
        x xVar = defaultInstanceMap.get(cls);
        if (xVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                xVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (xVar == null) {
            xVar = ((x) n1.k(cls)).w();
            if (xVar == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, xVar);
        }
        return xVar;
    }

    public final boolean B() {
        return C(this, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean D() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    protected void E() {
        z0.a().d(this).i(this);
        F();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final a H() {
        return (a) r(d.NEW_BUILDER);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x J() {
        return (x) r(d.NEW_MUTABLE_INSTANCE);
    }

    void R(int i6) {
        this.memoizedHashCode = i6;
    }

    void S(int i6) {
        if (i6 >= 0) {
            this.memoizedSerializedSize = (i6 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i6);
        }
    }

    public final a T() {
        return ((a) r(d.NEW_BUILDER)).o(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void b(k kVar) {
        z0.a().d(this).e(this, l.P(kVar));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public int c() {
        return h(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return z0.a().d(this).c(this, (x) obj);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    int h(d1 d1Var) {
        if (!D()) {
            if (y() != Integer.MAX_VALUE) {
                return y();
            }
            int p6 = p(d1Var);
            S(p6);
            return p6;
        }
        int p7 = p(d1Var);
        if (p7 >= 0) {
            return p7;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + p7);
    }

    public int hashCode() {
        if (D()) {
            return o();
        }
        if (z()) {
            R(o());
        }
        return x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object k() {
        return r(d.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        this.memoizedHashCode = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        S(Integer.MAX_VALUE);
    }

    int o() {
        return z0.a().d(this).j(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final a q() {
        return (a) r(d.NEW_BUILDER);
    }

    protected Object r(d dVar) {
        return t(dVar, null, null);
    }

    protected Object s(d dVar, Object obj) {
        return t(dVar, obj, null);
    }

    protected abstract Object t(d dVar, Object obj, Object obj2);

    public String toString() {
        return q0.f(this, super.toString());
    }

    public final x w() {
        return (x) r(d.GET_DEFAULT_INSTANCE);
    }

    int x() {
        return this.memoizedHashCode;
    }

    int y() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    boolean z() {
        return x() == 0;
    }
}
