package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbp;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class zzen extends zzfk {
    private static final zzfl<zzch> n = new zzfl<>();
    private final Context o;
    private zzbk.zza p;

    public zzen(zzdy zzdyVar, String str, String str2, zzbp.zza.C0173zza c0173zza, int i2, int i3, Context context, zzbk.zza zzaVar) {
        super(zzdyVar, str, str2, c0173zza, i2, 27);
        this.p = null;
        this.o = context;
        this.p = zzaVar;
    }

    private static String c(zzbk.zza zzaVar) {
        if (zzaVar == null || !zzaVar.B() || zzef.f(zzaVar.C().x())) {
            return null;
        }
        return zzaVar.C().x();
    }

    private final String d() {
        try {
            if (this.f15044g.A() != null) {
                this.f15044g.A().get();
            }
            zzbp.zza z = this.f15044g.z();
            if (z == null || !z.g0()) {
                return null;
            }
            return z.W();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[Catch: all -> 0x011e, TryCatch #1 {, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001f, B:10:0x0029, B:15:0x0039, B:17:0x0045, B:18:0x0082, B:21:0x0091, B:23:0x00b7, B:25:0x00e7, B:26:0x00c1, B:30:0x00ce, B:32:0x00d8, B:33:0x00db, B:34:0x0048, B:37:0x0056, B:39:0x005c, B:42:0x006b, B:44:0x0075, B:46:0x007d, B:47:0x0080, B:49:0x00ea, B:50:0x00f0), top: B:3:0x000d }] */
    @Override // com.google.android.gms.internal.ads.zzfk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void a() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzen.a():void");
    }
}
