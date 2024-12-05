package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzuh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class y0<FieldDescriptorType extends zzuh<FieldDescriptorType>> {
    private static final y0 a = new y0(true);

    /* renamed from: c, reason: collision with root package name */
    private boolean f16059c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16060d = false;

    /* renamed from: b, reason: collision with root package name */
    private final h2<FieldDescriptorType, Object> f16058b = h2.g(16);

    private y0() {
    }

    static int f(zzxs zzxsVar, int i2, Object obj) {
        int O = zztv.O(i2);
        if (zzxsVar == zzxs.o) {
            zzuq.g((zzvv) obj);
            O <<= 1;
        }
        return O + l(zzxsVar, obj);
    }

    private final Object g(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f16058b.get(fielddescriptortype);
        return obj instanceof zzuy ? zzuy.e() : obj;
    }

    private final void i(FieldDescriptorType fielddescriptortype, Object obj) {
        if (fielddescriptortype.v()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    j(fielddescriptortype.t(), obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            j(fielddescriptortype.t(), obj);
        }
        if (obj instanceof zzuy) {
            this.f16060d = true;
        }
        this.f16058b.put(fielddescriptortype, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzur) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzuy) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(com.google.android.gms.internal.measurement.zzxs r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.zzuq.a(r3)
            int[] r0 = com.google.android.gms.internal.measurement.z0.a
            com.google.android.gms.internal.measurement.zzxx r2 = r2.d()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L41;
                case 2: goto L3e;
                case 3: goto L3b;
                case 4: goto L38;
                case 5: goto L35;
                case 6: goto L32;
                case 7: goto L29;
                case 8: goto L20;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzvv
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzuy
            if (r2 == 0) goto L1e
            goto L43
        L1e:
            r0 = 0
            goto L43
        L20:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzur
            if (r2 == 0) goto L1e
            goto L43
        L29:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzte
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1e
            goto L43
        L32:
            boolean r0 = r3 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r3 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r3 instanceof java.lang.Integer
        L43:
            r1 = r0
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L50
        L4f:
            throw r2
        L50:
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.y0.j(com.google.android.gms.internal.measurement.zzxs, java.lang.Object):void");
    }

    private static int k(zzuh<?> zzuhVar, Object obj) {
        zzxs t = zzuhVar.t();
        int g2 = zzuhVar.g();
        if (zzuhVar.v()) {
            int i2 = 0;
            if (zzuhVar.s()) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    i2 += l(t, it.next());
                }
                return zztv.O(g2) + i2 + zztv.W(i2);
            }
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                i2 += f(t, g2, it2.next());
            }
            return i2;
        }
        return f(t, g2, obj);
    }

    private static int l(zzxs zzxsVar, Object obj) {
        switch (z0.f16065b[zzxsVar.ordinal()]) {
            case 1:
                return zztv.X(((Double) obj).doubleValue());
            case 2:
                return zztv.v(((Float) obj).floatValue());
            case 3:
                return zztv.q(((Long) obj).longValue());
            case 4:
                return zztv.r(((Long) obj).longValue());
            case 5:
                return zztv.P(((Integer) obj).intValue());
            case 6:
                return zztv.t(((Long) obj).longValue());
            case 7:
                return zztv.S(((Integer) obj).intValue());
            case 8:
                return zztv.E0(((Boolean) obj).booleanValue());
            case 9:
                return zztv.k0((zzvv) obj);
            case 10:
                if (obj instanceof zzuy) {
                    return zztv.d((zzuy) obj);
                }
                return zztv.d0((zzvv) obj);
            case 11:
                if (obj instanceof zzte) {
                    return zztv.A((zzte) obj);
                }
                return zztv.t0((String) obj);
            case 12:
                if (obj instanceof zzte) {
                    return zztv.A((zzte) obj);
                }
                return zztv.A0((byte[]) obj);
            case 13:
                return zztv.Q(((Integer) obj).intValue());
            case 14:
                return zztv.T(((Integer) obj).intValue());
            case 15:
                return zztv.J(((Long) obj).longValue());
            case 16:
                return zztv.R(((Integer) obj).intValue());
            case 17:
                return zztv.s(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzur) {
                    return zztv.U(((zzur) obj).g());
                }
                return zztv.U(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static boolean m(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.z() == zzxx.MESSAGE) {
            if (key.v()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((zzvv) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzvv) {
                    if (!((zzvv) value).isInitialized()) {
                        return false;
                    }
                } else {
                    if (value instanceof zzuy) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private final void n(Map.Entry<FieldDescriptorType, Object> entry) {
        zzvv D;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzuy) {
            value = zzuy.e();
        }
        if (key.v()) {
            Object g2 = g(key);
            if (g2 == null) {
                g2 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) g2).add(t(it.next()));
            }
            this.f16058b.put(key, g2);
            return;
        }
        if (key.z() == zzxx.MESSAGE) {
            Object g3 = g(key);
            if (g3 == null) {
                this.f16058b.put(key, t(value));
                return;
            }
            if (g3 instanceof zzwb) {
                D = key.u((zzwb) g3, (zzwb) value);
            } else {
                D = key.q(((zzvv) g3).b(), (zzvv) value).D();
            }
            this.f16058b.put(key, D);
            return;
        }
        this.f16058b.put(key, t(value));
    }

    private static int o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.z() == zzxx.MESSAGE && !key.v() && !key.s()) {
            if (value instanceof zzuy) {
                return zztv.y(entry.getKey().g(), (zzuy) value);
            }
            return zztv.j0(entry.getKey().g(), (zzvv) value);
        }
        return k(key, value);
    }

    public static <T extends zzuh<T>> y0<T> q() {
        return a;
    }

    private static Object t(Object obj) {
        if (obj instanceof zzwb) {
            return ((zzwb) obj).f();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> a() {
        if (this.f16060d) {
            return new g1(this.f16058b.p().iterator());
        }
        return this.f16058b.p().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.f16058b.isEmpty();
    }

    public final boolean c() {
        return this.f16059c;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        y0 y0Var = new y0();
        for (int i2 = 0; i2 < this.f16058b.m(); i2++) {
            Map.Entry<FieldDescriptorType, Object> h2 = this.f16058b.h(i2);
            y0Var.i(h2.getKey(), h2.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f16058b.n()) {
            y0Var.i(entry.getKey(), entry.getValue());
        }
        y0Var.f16060d = this.f16060d;
        return y0Var;
    }

    public final boolean d() {
        for (int i2 = 0; i2 < this.f16058b.m(); i2++) {
            if (!m(this.f16058b.h(i2))) {
                return false;
            }
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = this.f16058b.n().iterator();
        while (it.hasNext()) {
            if (!m(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> e() {
        if (this.f16060d) {
            return new g1(this.f16058b.entrySet().iterator());
        }
        return this.f16058b.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y0) {
            return this.f16058b.equals(((y0) obj).f16058b);
        }
        return false;
    }

    public final void h(y0<FieldDescriptorType> y0Var) {
        for (int i2 = 0; i2 < y0Var.f16058b.m(); i2++) {
            n(y0Var.f16058b.h(i2));
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = y0Var.f16058b.n().iterator();
        while (it.hasNext()) {
            n(it.next());
        }
    }

    public final int hashCode() {
        return this.f16058b.hashCode();
    }

    public final void p() {
        if (this.f16059c) {
            return;
        }
        this.f16058b.l();
        this.f16059c = true;
    }

    public final int r() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f16058b.m(); i3++) {
            Map.Entry<FieldDescriptorType, Object> h2 = this.f16058b.h(i3);
            i2 += k(h2.getKey(), h2.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f16058b.n()) {
            i2 += k(entry.getKey(), entry.getValue());
        }
        return i2;
    }

    public final int s() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f16058b.m(); i3++) {
            i2 += o(this.f16058b.h(i3));
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = this.f16058b.n().iterator();
        while (it.hasNext()) {
            i2 += o(it.next());
        }
        return i2;
    }

    private y0(boolean z) {
        p();
    }
}
