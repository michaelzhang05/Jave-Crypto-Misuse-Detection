package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.internal.ads.zzwl;
import com.google.android.gms.internal.ads.zzwt;

/* loaded from: classes2.dex */
public final class zzcjr {
    private zzwj a;

    /* renamed from: b, reason: collision with root package name */
    private Context f14131b;

    /* renamed from: c, reason: collision with root package name */
    private zzcjc f14132c;

    /* renamed from: d, reason: collision with root package name */
    private zzbai f14133d;

    public zzcjr(Context context, zzbai zzbaiVar, zzwj zzwjVar, zzcjc zzcjcVar) {
        this.f14131b = context;
        this.f14133d = zzbaiVar;
        this.a = zzwjVar;
        this.f14132c = zzcjcVar;
    }

    public final void a() {
        try {
            this.f14132c.a(new zzczc(this) { // from class: com.google.android.gms.internal.ads.bk
                private final zzcjr a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = this;
                }

                @Override // com.google.android.gms.internal.ads.zzczc
                public final Object a(Object obj) {
                    return this.a.b((SQLiteDatabase) obj);
                }
            });
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2.getMessage());
            zzbad.g(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void b(SQLiteDatabase sQLiteDatabase) throws Exception {
        final zzwt.zzi zziVar = (zzwt.zzi) ((zzdob) zzwt.zzi.L().u(this.f14131b.getPackageName()).v(Build.MODEL).x(zzcjq.a(sQLiteDatabase, 1)).A(zzcjq.b(sQLiteDatabase)).y(zzcjq.a(sQLiteDatabase, 2)).B(zzk.zzln().a()).J());
        this.a.a(new zzwk(zziVar) { // from class: com.google.android.gms.internal.ads.ck
            private final zzwt.zzi a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = zziVar;
            }

            @Override // com.google.android.gms.internal.ads.zzwk
            public final void a(zzxn zzxnVar) {
                zzxnVar.m = this.a;
            }
        });
        final zzxo zzxoVar = new zzxo();
        zzxoVar.f15774c = Integer.valueOf(this.f14133d.f13151g);
        zzxoVar.f15775d = Integer.valueOf(this.f14133d.f13152h);
        zzxoVar.f15776e = Integer.valueOf(this.f14133d.f13153i ? 0 : 2);
        this.a.a(new zzwk(zzxoVar) { // from class: com.google.android.gms.internal.ads.dk
            private final zzxo a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = zzxoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzwk
            public final void a(zzxn zzxnVar) {
                zzxnVar.f15771i.f15760f = this.a;
            }
        });
        this.a.b(zzwl.zza.zzb.OFFLINE_UPLOAD);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        ContentValues contentValues = new ContentValues();
        contentValues.put("total", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("total", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }
}
