package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzdsp extends zzdrr<zzdsp> {

    /* renamed from: c, reason: collision with root package name */
    private static volatile zzdsp[] f14954c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f14955d = null;

    /* renamed from: e, reason: collision with root package name */
    public String f14956e = null;

    /* renamed from: f, reason: collision with root package name */
    public zzdsm f14957f = null;

    /* renamed from: g, reason: collision with root package name */
    private zzdsn f14958g = null;

    /* renamed from: h, reason: collision with root package name */
    private Integer f14959h = null;

    /* renamed from: i, reason: collision with root package name */
    private int[] f14960i = zzdry.a;

    /* renamed from: j, reason: collision with root package name */
    private String f14961j = null;

    /* renamed from: k, reason: collision with root package name */
    public Integer f14962k = null;
    public String[] l = zzdry.f14907f;

    public zzdsp() {
        this.f14895b = null;
        this.a = -1;
    }

    public static zzdsp[] f() {
        if (f14954c == null) {
            synchronized (zzdrv.f14902c) {
                if (f14954c == null) {
                    f14954c = new zzdsp[0];
                }
            }
        }
        return f14954c;
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    public final void a(zzdrp zzdrpVar) throws IOException {
        zzdrpVar.x(1, this.f14955d.intValue());
        String str = this.f14956e;
        if (str != null) {
            zzdrpVar.k(2, str);
        }
        zzdsm zzdsmVar = this.f14957f;
        if (zzdsmVar != null) {
            zzdrpVar.b(3, zzdsmVar);
        }
        int[] iArr = this.f14960i;
        int i2 = 0;
        if (iArr != null && iArr.length > 0) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.f14960i;
                if (i3 >= iArr2.length) {
                    break;
                }
                zzdrpVar.x(6, iArr2[i3]);
                i3++;
            }
        }
        Integer num = this.f14962k;
        if (num != null) {
            zzdrpVar.x(8, num.intValue());
        }
        String[] strArr = this.l;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.l;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i2];
                if (str2 != null) {
                    zzdrpVar.k(9, str2);
                }
                i2++;
            }
        }
        super.a(zzdrpVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    public final int e() {
        int[] iArr;
        int e2 = super.e() + zzdrp.d(1, this.f14955d.intValue());
        String str = this.f14956e;
        if (str != null) {
            e2 += zzdrp.n(2, str);
        }
        zzdsm zzdsmVar = this.f14957f;
        if (zzdsmVar != null) {
            e2 += zzdrp.g(3, zzdsmVar);
        }
        int[] iArr2 = this.f14960i;
        int i2 = 0;
        if (iArr2 != null && iArr2.length > 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                iArr = this.f14960i;
                if (i3 >= iArr.length) {
                    break;
                }
                i4 += zzdrp.p(iArr[i3]);
                i3++;
            }
            e2 = e2 + i4 + (iArr.length * 1);
        }
        Integer num = this.f14962k;
        if (num != null) {
            e2 += zzdrp.d(8, num.intValue());
        }
        String[] strArr = this.l;
        if (strArr == null || strArr.length <= 0) {
            return e2;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr2 = this.l;
            if (i2 >= strArr2.length) {
                return e2 + i5 + (i6 * 1);
            }
            String str2 = strArr2[i2];
            if (str2 != null) {
                i6++;
                i5 += zzdrp.r(str2);
            }
            i2++;
        }
    }
}
