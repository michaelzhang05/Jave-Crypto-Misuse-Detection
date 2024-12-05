package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.internal.ads.zzwt;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zj implements zzban<Bundle> {
    private final /* synthetic */ boolean a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ zzcjm f12533b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zj(zzcjm zzcjmVar, boolean z) {
        this.f12533b = zzcjmVar;
        this.a = z;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void a(Throwable th) {
        zzbad.g("Failed to get signals bundle");
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final /* synthetic */ void b(Bundle bundle) {
        final ArrayList k2;
        final zzwt.zzi.zzc j2;
        final zzwt.zzg i2;
        zzcjc zzcjcVar;
        Bundle bundle2 = bundle;
        zzcjm zzcjmVar = this.f12533b;
        k2 = zzcjm.k(bundle2);
        zzcjm zzcjmVar2 = this.f12533b;
        j2 = zzcjm.j(bundle2);
        i2 = this.f12533b.i(bundle2);
        zzcjcVar = this.f12533b.f14126f;
        final boolean z = this.a;
        zzcjcVar.a(new zzczc(this, z, k2, i2, j2) { // from class: com.google.android.gms.internal.ads.ak
            private final zj a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f11090b;

            /* renamed from: c, reason: collision with root package name */
            private final ArrayList f11091c;

            /* renamed from: d, reason: collision with root package name */
            private final zzwt.zzg f11092d;

            /* renamed from: e, reason: collision with root package name */
            private final zzwt.zzi.zzc f11093e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f11090b = z;
                this.f11091c = k2;
                this.f11092d = i2;
                this.f11093e = j2;
            }

            @Override // com.google.android.gms.internal.ads.zzczc
            public final Object a(Object obj) {
                byte[] d2;
                zj zjVar = this.a;
                boolean z2 = this.f11090b;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                d2 = zjVar.f12533b.d(z2, this.f11091c, this.f11092d, this.f11093e);
                ContentValues contentValues = new ContentValues();
                contentValues.put("timestamp", Long.valueOf(zzk.zzln().a()));
                contentValues.put("serialized_proto_data", d2);
                sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
                sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET total = total+1 WHERE statistic_name = '%s'", "total_requests"));
                if (!z2) {
                    sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET total = total+1 WHERE statistic_name = '%s'", "failed_requests"));
                }
                return null;
            }
        });
    }
}
