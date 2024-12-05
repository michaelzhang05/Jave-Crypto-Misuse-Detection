package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class cw<T> implements mw<T> {
    private final zzdpk a;

    /* renamed from: b, reason: collision with root package name */
    private final dx<?, ?> f11263b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f11264c;

    /* renamed from: d, reason: collision with root package name */
    private final wu<?> f11265d;

    private cw(dx<?, ?> dxVar, wu<?> wuVar, zzdpk zzdpkVar) {
        this.f11263b = dxVar;
        this.f11264c = wuVar.h(zzdpkVar);
        this.f11265d = wuVar;
        this.a = zzdpkVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> cw<T> k(dx<?, ?> dxVar, wu<?> wuVar, zzdpk zzdpkVar) {
        return new cw<>(dxVar, wuVar, zzdpkVar);
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void a(T t, T t2) {
        ow.h(this.f11263b, t, t2);
        if (this.f11264c) {
            ow.f(this.f11265d, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final boolean b(T t, T t2) {
        if (!this.f11263b.j(t).equals(this.f11263b.j(t2))) {
            return false;
        }
        if (this.f11264c) {
            return this.f11265d.i(t).equals(this.f11265d.i(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final int c(T t) {
        int hashCode = this.f11263b.j(t).hashCode();
        return this.f11264c ? (hashCode * 53) + this.f11265d.i(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void d(T t, vx vxVar) throws IOException {
        Iterator<Map.Entry<?, Object>> e2 = this.f11265d.i(t).e();
        while (e2.hasNext()) {
            Map.Entry<?, Object> next = e2.next();
            zzdnu zzdnuVar = (zzdnu) next.getKey();
            if (zzdnuVar.l() == zzdrn.MESSAGE && !zzdnuVar.m() && !zzdnuVar.p()) {
                if (next instanceof jv) {
                    vxVar.F(zzdnuVar.b(), ((jv) next).a().a());
                } else {
                    vxVar.F(zzdnuVar.b(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        dx<?, ?> dxVar = this.f11263b;
        dxVar.p(dxVar.j(t), vxVar);
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void e(T t) {
        this.f11263b.g(t);
        this.f11265d.g(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8 A[EDGE_INSN: B:27:0x00a8->B:28:0x00a8 BREAK  A[LOOP:1: B:13:0x0062->B:21:0x0062], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.mw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.ads.bu r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.ads.zzdob r0 = (com.google.android.gms.internal.ads.zzdob) r0
            com.google.android.gms.internal.ads.zzdqu r1 = r0.zzhhd
            com.google.android.gms.internal.ads.zzdqu r2 = com.google.android.gms.internal.ads.zzdqu.f()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.ads.zzdqu r1 = com.google.android.gms.internal.ads.zzdqu.i()
            r0.zzhhd = r1
        L11:
            com.google.android.gms.internal.ads.zzdob$zzc r10 = (com.google.android.gms.internal.ads.zzdob.zzc) r10
            com.google.android.gms.internal.ads.zu<java.lang.Object> r0 = r10.zzhhj
            boolean r0 = r0.c()
            if (r0 == 0) goto L25
            com.google.android.gms.internal.ads.zu<java.lang.Object> r0 = r10.zzhhj
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.ads.zu r0 = (com.google.android.gms.internal.ads.zu) r0
            r10.zzhhj = r0
        L25:
            r10 = 0
            r0 = r10
        L27:
            if (r12 >= r13) goto Lb3
            int r4 = com.google.android.gms.internal.ads.au.h(r11, r12, r14)
            int r2 = r14.a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L60
            r12 = r2 & 7
            if (r12 != r3) goto L5b
            com.google.android.gms.internal.ads.wu<?> r12 = r9.f11265d
            com.google.android.gms.internal.ads.zzdno r0 = r14.f11171d
            com.google.android.gms.internal.ads.zzdpk r3 = r9.a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.b(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.ads.zzdob$zzd r0 = (com.google.android.gms.internal.ads.zzdob.zzd) r0
            if (r0 != 0) goto L52
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.ads.au.c(r2, r3, r4, r5, r6, r7)
            goto L27
        L52:
            com.google.android.gms.internal.ads.hw.b()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L5b:
            int r12 = com.google.android.gms.internal.ads.au.a(r2, r11, r4, r13, r14)
            goto L27
        L60:
            r12 = 0
            r2 = r10
        L62:
            if (r4 >= r13) goto La8
            int r4 = com.google.android.gms.internal.ads.au.h(r11, r4, r14)
            int r5 = r14.a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L8a
            r8 = 3
            if (r6 == r8) goto L74
            goto L9f
        L74:
            if (r0 != 0) goto L81
            if (r7 != r3) goto L9f
            int r4 = com.google.android.gms.internal.ads.au.m(r11, r4, r14)
            java.lang.Object r2 = r14.f11170c
            com.google.android.gms.internal.ads.zzdmr r2 = (com.google.android.gms.internal.ads.zzdmr) r2
            goto L62
        L81:
            com.google.android.gms.internal.ads.hw.b()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L8a:
            if (r7 != 0) goto L9f
            int r4 = com.google.android.gms.internal.ads.au.h(r11, r4, r14)
            int r12 = r14.a
            com.google.android.gms.internal.ads.wu<?> r0 = r9.f11265d
            com.google.android.gms.internal.ads.zzdno r5 = r14.f11171d
            com.google.android.gms.internal.ads.zzdpk r6 = r9.a
            java.lang.Object r0 = r0.b(r5, r6, r12)
            com.google.android.gms.internal.ads.zzdob$zzd r0 = (com.google.android.gms.internal.ads.zzdob.zzd) r0
            goto L62
        L9f:
            r6 = 12
            if (r5 == r6) goto La8
            int r4 = com.google.android.gms.internal.ads.au.a(r5, r11, r4, r13, r14)
            goto L62
        La8:
            if (r2 == 0) goto Lb0
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.k(r12, r2)
        Lb0:
            r12 = r4
            goto L27
        Lb3:
            if (r12 != r13) goto Lb6
            return
        Lb6:
            com.google.android.gms.internal.ads.zzdok r10 = com.google.android.gms.internal.ads.zzdok.g()
            goto Lbc
        Lbb:
            throw r10
        Lbc:
            goto Lbb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cw.f(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.bu):void");
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void g(T t, lw lwVar, zzdno zzdnoVar) throws IOException {
        boolean z;
        dx<?, ?> dxVar = this.f11263b;
        wu<?> wuVar = this.f11265d;
        Object k2 = dxVar.k(t);
        zu<?> j2 = wuVar.j(t);
        do {
            try {
                if (lwVar.n() == Integer.MAX_VALUE) {
                    return;
                }
                int tag = lwVar.getTag();
                if (tag == 11) {
                    int i2 = 0;
                    Object obj = null;
                    zzdmr zzdmrVar = null;
                    while (lwVar.n() != Integer.MAX_VALUE) {
                        int tag2 = lwVar.getTag();
                        if (tag2 == 16) {
                            i2 = lwVar.y();
                            obj = wuVar.b(zzdnoVar, this.a, i2);
                        } else if (tag2 == 26) {
                            if (obj != null) {
                                wuVar.e(lwVar, obj, zzdnoVar, j2);
                            } else {
                                zzdmrVar = lwVar.u();
                            }
                        } else if (!lwVar.t()) {
                            break;
                        }
                    }
                    if (lwVar.getTag() != 12) {
                        throw zzdok.e();
                    }
                    if (zzdmrVar != null) {
                        if (obj != null) {
                            wuVar.d(zzdmrVar, obj, zzdnoVar, j2);
                        } else {
                            dxVar.b(k2, i2, zzdmrVar);
                        }
                    }
                } else if ((tag & 7) == 2) {
                    Object b2 = wuVar.b(zzdnoVar, this.a, tag >>> 3);
                    if (b2 != null) {
                        wuVar.e(lwVar, b2, zzdnoVar, j2);
                    } else {
                        z = dxVar.f(k2, lwVar);
                    }
                } else {
                    z = lwVar.t();
                }
                z = true;
            } finally {
                dxVar.r(t, k2);
            }
        } while (z);
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final int h(T t) {
        dx<?, ?> dxVar = this.f11263b;
        int l = dxVar.l(dxVar.j(t)) + 0;
        return this.f11264c ? l + this.f11265d.i(t).o() : l;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final boolean i(T t) {
        return this.f11265d.i(t).d();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final T j() {
        return (T) this.a.c().i0();
    }
}
