package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class U4 {

    /* renamed from: d, reason: collision with root package name */
    private static final U4 f16344d = new U4(true);

    /* renamed from: a, reason: collision with root package name */
    final Z5 f16345a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16346b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16347c;

    private U4() {
        this.f16345a = new C2092c6();
    }

    public static int b(W4 w42, Object obj) {
        A6 x8 = w42.x();
        int w8 = w42.w();
        if (w42.z()) {
            List list = (List) obj;
            int size = list.size();
            int i8 = 0;
            if (w42.y()) {
                if (list.isEmpty()) {
                    return 0;
                }
                int i9 = 0;
                while (i8 < size) {
                    i9 += d(x8, list.get(i8));
                    i8++;
                }
                return K4.s0(w8) + i9 + K4.v0(i9);
            }
            int i10 = 0;
            while (i8 < size) {
                i10 += c(x8, w8, list.get(i8));
                i8++;
            }
            return i10;
        }
        return c(x8, w8, obj);
    }

    static int c(A6 a62, int i8, Object obj) {
        int s02 = K4.s0(i8);
        if (a62 == A6.f16062l) {
            AbstractC2111e5.g((I5) obj);
            s02 <<= 1;
        }
        return s02 + d(a62, obj);
    }

    private static int d(A6 a62, Object obj) {
        switch (T4.f16284b[a62.ordinal()]) {
            case 1:
                return K4.c(((Double) obj).doubleValue());
            case 2:
                return K4.d(((Float) obj).floatValue());
            case 3:
                return K4.a0(((Long) obj).longValue());
            case 4:
                return K4.n0(((Long) obj).longValue());
            case 5:
                return K4.g0(((Integer) obj).intValue());
            case 6:
                return K4.S(((Long) obj).longValue());
            case 7:
                return K4.c0(((Integer) obj).intValue());
            case 8:
                return K4.h(((Boolean) obj).booleanValue());
            case 9:
                return K4.B((I5) obj);
            case 10:
                return K4.T((I5) obj);
            case 11:
                if (obj instanceof AbstractC2241s4) {
                    return K4.A((AbstractC2241s4) obj);
                }
                return K4.C((String) obj);
            case 12:
                if (obj instanceof AbstractC2241s4) {
                    return K4.A((AbstractC2241s4) obj);
                }
                return K4.i((byte[]) obj);
            case 13:
                return K4.v0(((Integer) obj).intValue());
            case 14:
                return K4.k0(((Integer) obj).intValue());
            case 15:
                return K4.f0(((Long) obj).longValue());
            case 16:
                return K4.o0(((Integer) obj).intValue());
            case 17:
                return K4.j0(((Long) obj).longValue());
            case 18:
                if (obj instanceof InterfaceC2141h5) {
                    return K4.X(((InterfaceC2141h5) obj).w());
                }
                return K4.X(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int e(Map.Entry entry) {
        android.support.v4.media.a.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    private final void g(W4 w42, Object obj) {
        if (w42.z()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i8 = 0; i8 < size; i8++) {
                    Object obj2 = list.get(i8);
                    j(w42, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            j(w42, obj);
        }
        this.f16345a.put(w42, obj);
    }

    private final void h(Map.Entry entry) {
        android.support.v4.media.a.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.measurement.I5) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.measurement.InterfaceC2141h5) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if ((r6 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(com.google.android.gms.internal.measurement.W4 r5, java.lang.Object r6) {
        /*
            com.google.android.gms.internal.measurement.A6 r0 = r5.x()
            com.google.android.gms.internal.measurement.AbstractC2111e5.e(r6)
            int[] r1 = com.google.android.gms.internal.measurement.T4.f16283a
            com.google.android.gms.internal.measurement.K6 r0 = r0.a()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L2a;
                case 8: goto L21;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r0 = 0
            goto L44
        L1a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.I5
            if (r0 != 0) goto L1f
            goto L18
        L1f:
            r0 = 1
            goto L44
        L21:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L1f
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.InterfaceC2141h5
            if (r0 == 0) goto L18
            goto L1f
        L2a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.AbstractC2241s4
            if (r0 != 0) goto L1f
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L18
            goto L1f
        L33:
            boolean r0 = r6 instanceof java.lang.String
            goto L44
        L36:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L44
        L39:
            boolean r0 = r6 instanceof java.lang.Double
            goto L44
        L3c:
            boolean r0 = r6 instanceof java.lang.Float
            goto L44
        L3f:
            boolean r0 = r6 instanceof java.lang.Long
            goto L44
        L42:
            boolean r0 = r6 instanceof java.lang.Integer
        L44:
            if (r0 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r3 = r5.w()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.gms.internal.measurement.A6 r5 = r5.x()
            com.google.android.gms.internal.measurement.K6 r5 = r5.a()
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r3
            r4[r1] = r5
            r5 = 2
            r4[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r4)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.U4.j(com.google.android.gms.internal.measurement.W4, java.lang.Object):void");
    }

    private static boolean k(Map.Entry entry) {
        android.support.v4.media.a.a(entry.getKey());
        throw null;
    }

    public final int a() {
        int a8 = this.f16345a.a();
        int i8 = 0;
        for (int i9 = 0; i9 < a8; i9++) {
            i8 += e(this.f16345a.g(i9));
        }
        Iterator it = this.f16345a.h().iterator();
        while (it.hasNext()) {
            i8 += e((Map.Entry) it.next());
        }
        return i8;
    }

    public final /* synthetic */ Object clone() {
        U4 u42 = new U4();
        int a8 = this.f16345a.a();
        for (int i8 = 0; i8 < a8; i8++) {
            Map.Entry g8 = this.f16345a.g(i8);
            android.support.v4.media.a.a(g8.getKey());
            u42.g(null, g8.getValue());
        }
        for (Map.Entry entry : this.f16345a.h()) {
            android.support.v4.media.a.a(entry.getKey());
            u42.g(null, entry.getValue());
        }
        u42.f16347c = this.f16347c;
        return u42;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U4)) {
            return false;
        }
        return this.f16345a.equals(((U4) obj).f16345a);
    }

    public final void f(U4 u42) {
        int a8 = u42.f16345a.a();
        for (int i8 = 0; i8 < a8; i8++) {
            h(u42.f16345a.g(i8));
        }
        Iterator it = u42.f16345a.h().iterator();
        while (it.hasNext()) {
            h((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f16345a.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator i() {
        if (this.f16345a.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.f16347c) {
            return new C2207o5(this.f16345a.l().iterator());
        }
        return this.f16345a.l().iterator();
    }

    public final Iterator l() {
        if (this.f16345a.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.f16347c) {
            return new C2207o5(this.f16345a.entrySet().iterator());
        }
        return this.f16345a.entrySet().iterator();
    }

    public final void m() {
        if (this.f16346b) {
            return;
        }
        int a8 = this.f16345a.a();
        for (int i8 = 0; i8 < a8; i8++) {
            Map.Entry g8 = this.f16345a.g(i8);
            if (g8.getValue() instanceof AbstractC2091c5) {
                ((AbstractC2091c5) g8.getValue()).D();
            }
        }
        this.f16345a.m();
        this.f16346b = true;
    }

    public final boolean n() {
        int a8 = this.f16345a.a();
        for (int i8 = 0; i8 < a8; i8++) {
            if (!k(this.f16345a.g(i8))) {
                return false;
            }
        }
        Iterator it = this.f16345a.h().iterator();
        while (it.hasNext()) {
            if (!k((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private U4(Z5 z52) {
        this.f16345a = z52;
        m();
    }

    private U4(boolean z8) {
        this(new C2092c6());
        m();
    }
}
