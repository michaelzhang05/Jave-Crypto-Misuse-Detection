package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdnu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zu<FieldDescriptorType extends zzdnu<FieldDescriptorType>> {
    private static final zu a = new zu(true);

    /* renamed from: c, reason: collision with root package name */
    private boolean f12542c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12543d = false;

    /* renamed from: b, reason: collision with root package name */
    private final pw<FieldDescriptorType, Object> f12541b = pw.p(16);

    private zu() {
    }

    static int f(zzdri zzdriVar, int i2, Object obj) {
        int h0 = zzdni.h0(i2);
        if (zzdriVar == zzdri.o) {
            zzdod.j((zzdpk) obj);
            h0 <<= 1;
        }
        return h0 + q(zzdriVar, obj);
    }

    private final Object g(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f12541b.get(fielddescriptortype);
        return obj instanceof zzdon ? zzdon.e() : obj;
    }

    private final void i(FieldDescriptorType fielddescriptortype, Object obj) {
        if (fielddescriptortype.m()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    j(fielddescriptortype.e(), obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            j(fielddescriptortype.e(), obj);
        }
        if (obj instanceof zzdon) {
            this.f12543d = true;
        }
        this.f12541b.put(fielddescriptortype, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.ads.zzdoe) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.ads.zzdon) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(com.google.android.gms.internal.ads.zzdri r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.zzdod.a(r3)
            int[] r0 = com.google.android.gms.internal.ads.av.a
            com.google.android.gms.internal.ads.zzdrn r2 = r2.d()
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
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzdpk
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzdon
            if (r2 == 0) goto L1e
            goto L43
        L1e:
            r0 = 0
            goto L43
        L20:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzdoe
            if (r2 == 0) goto L1e
            goto L43
        L29:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzdmr
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zu.j(com.google.android.gms.internal.ads.zzdri, java.lang.Object):void");
    }

    private static Object k(Object obj) {
        if (obj instanceof zzdpr) {
            return ((zzdpr) obj).z();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static <T extends zzdnu<T>> zu<T> m() {
        return a;
    }

    private static int p(zzdnu<?> zzdnuVar, Object obj) {
        zzdri e2 = zzdnuVar.e();
        int b2 = zzdnuVar.b();
        if (zzdnuVar.m()) {
            int i2 = 0;
            if (zzdnuVar.p()) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    i2 += q(e2, it.next());
                }
                return zzdni.h0(b2) + i2 + zzdni.p0(i2);
            }
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                i2 += f(e2, b2, it2.next());
            }
            return i2;
        }
        return f(e2, b2, obj);
    }

    private static int q(zzdri zzdriVar, Object obj) {
        switch (av.f11101b[zzdriVar.ordinal()]) {
            case 1:
                return zzdni.H(((Double) obj).doubleValue());
            case 2:
                return zzdni.s0(((Float) obj).floatValue());
            case 3:
                return zzdni.V(((Long) obj).longValue());
            case 4:
                return zzdni.W(((Long) obj).longValue());
            case 5:
                return zzdni.i0(((Integer) obj).intValue());
            case 6:
                return zzdni.Y(((Long) obj).longValue());
            case 7:
                return zzdni.l0(((Integer) obj).intValue());
            case 8:
                return zzdni.G(((Boolean) obj).booleanValue());
            case 9:
                return zzdni.C0((zzdpk) obj);
            case 10:
                if (obj instanceof zzdon) {
                    return zzdni.e((zzdon) obj);
                }
                return zzdni.A0((zzdpk) obj);
            case 11:
                if (obj instanceof zzdmr) {
                    return zzdni.Q((zzdmr) obj);
                }
                return zzdni.r0((String) obj);
            case 12:
                if (obj instanceof zzdmr) {
                    return zzdni.Q((zzdmr) obj);
                }
                return zzdni.p((byte[]) obj);
            case 13:
                return zzdni.j0(((Integer) obj).intValue());
            case 14:
                return zzdni.m0(((Integer) obj).intValue());
            case 15:
                return zzdni.Z(((Long) obj).longValue());
            case 16:
                return zzdni.k0(((Integer) obj).intValue());
            case 17:
                return zzdni.X(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzdoe) {
                    return zzdni.n0(((zzdoe) obj).b());
                }
                return zzdni.n0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static boolean r(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.l() == zzdrn.MESSAGE) {
            if (key.m()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((zzdpk) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzdpk) {
                    if (!((zzdpk) value).isInitialized()) {
                        return false;
                    }
                } else {
                    if (value instanceof zzdon) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private final void s(Map.Entry<FieldDescriptorType, Object> entry) {
        zzdpk J;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzdon) {
            value = zzdon.e();
        }
        if (key.m()) {
            Object g2 = g(key);
            if (g2 == null) {
                g2 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) g2).add(k(it.next()));
            }
            this.f12541b.put(key, g2);
            return;
        }
        if (key.l() == zzdrn.MESSAGE) {
            Object g3 = g(key);
            if (g3 == null) {
                this.f12541b.put(key, k(value));
                return;
            }
            if (g3 instanceof zzdpr) {
                J = key.A((zzdpr) g3, (zzdpr) value);
            } else {
                J = key.k(((zzdpk) g3).b(), (zzdpk) value).J();
            }
            this.f12541b.put(key, J);
            return;
        }
        this.f12541b.put(key, k(value));
    }

    private static int t(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.l() == zzdrn.MESSAGE && !key.m() && !key.p()) {
            if (value instanceof zzdon) {
                return zzdni.y(entry.getKey().b(), (zzdon) value);
            }
            return zzdni.O(entry.getKey().b(), (zzdpk) value);
        }
        return p(key, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> a() {
        if (this.f12543d) {
            return new kv(this.f12541b.i().iterator());
        }
        return this.f12541b.i().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.f12541b.isEmpty();
    }

    public final boolean c() {
        return this.f12542c;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zu zuVar = new zu();
        for (int i2 = 0; i2 < this.f12541b.g(); i2++) {
            Map.Entry<FieldDescriptorType, Object> q = this.f12541b.q(i2);
            zuVar.i(q.getKey(), q.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f12541b.h()) {
            zuVar.i(entry.getKey(), entry.getValue());
        }
        zuVar.f12543d = this.f12543d;
        return zuVar;
    }

    public final boolean d() {
        for (int i2 = 0; i2 < this.f12541b.g(); i2++) {
            if (!r(this.f12541b.q(i2))) {
                return false;
            }
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = this.f12541b.h().iterator();
        while (it.hasNext()) {
            if (!r(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> e() {
        if (this.f12543d) {
            return new kv(this.f12541b.entrySet().iterator());
        }
        return this.f12541b.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zu) {
            return this.f12541b.equals(((zu) obj).f12541b);
        }
        return false;
    }

    public final void h(zu<FieldDescriptorType> zuVar) {
        for (int i2 = 0; i2 < zuVar.f12541b.g(); i2++) {
            s(zuVar.f12541b.q(i2));
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = zuVar.f12541b.h().iterator();
        while (it.hasNext()) {
            s(it.next());
        }
    }

    public final int hashCode() {
        return this.f12541b.hashCode();
    }

    public final void l() {
        if (this.f12542c) {
            return;
        }
        this.f12541b.f();
        this.f12542c = true;
    }

    public final int n() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f12541b.g(); i3++) {
            Map.Entry<FieldDescriptorType, Object> q = this.f12541b.q(i3);
            i2 += p(q.getKey(), q.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f12541b.h()) {
            i2 += p(entry.getKey(), entry.getValue());
        }
        return i2;
    }

    public final int o() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f12541b.g(); i3++) {
            i2 += t(this.f12541b.q(i3));
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = this.f12541b.h().iterator();
        while (it.hasNext()) {
            i2 += t(it.next());
        }
        return i2;
    }

    private zu(boolean z) {
        l();
    }
}
