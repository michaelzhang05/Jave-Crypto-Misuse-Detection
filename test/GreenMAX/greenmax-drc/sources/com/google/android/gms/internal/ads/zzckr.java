package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import c.c.b.c;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzckr implements zzcjv<zzbvx> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbws f14155b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f14156c;

    /* renamed from: d, reason: collision with root package name */
    private final zzcxk f14157d;

    public zzckr(Context context, Executor executor, zzbws zzbwsVar, zzcxk zzcxkVar) {
        this.a = context;
        this.f14155b = zzbwsVar;
        this.f14156c = executor;
        this.f14157d = zzcxkVar;
    }

    private static String d(zzcxm zzcxmVar) {
        try {
            return zzcxmVar.s.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final zzbbh<zzbvx> a(final zzcxu zzcxuVar, final zzcxm zzcxmVar) {
        String d2 = d(zzcxmVar);
        final Uri parse = d2 != null ? Uri.parse(d2) : null;
        return zzbar.c(zzbar.o(null), new zzbal(this, parse, zzcxuVar, zzcxmVar) { // from class: com.google.android.gms.internal.ads.pk
            private final zzckr a;

            /* renamed from: b, reason: collision with root package name */
            private final Uri f12000b;

            /* renamed from: c, reason: collision with root package name */
            private final zzcxu f12001c;

            /* renamed from: d, reason: collision with root package name */
            private final zzcxm f12002d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f12000b = parse;
                this.f12001c = zzcxuVar;
                this.f12002d = zzcxmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.a.c(this.f12000b, this.f12001c, this.f12002d, obj);
            }
        }, this.f14156c);
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final boolean b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        return (this.a instanceof Activity) && PlatformVersion.b() && zzads.a(this.a) && !TextUtils.isEmpty(d(zzcxmVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbh c(Uri uri, zzcxu zzcxuVar, zzcxm zzcxmVar, Object obj) throws Exception {
        try {
            c.c.b.c c2 = new c.a().c();
            c2.a.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(c2.a);
            final zzbbr zzbbrVar = new zzbbr();
            zzbvy a = this.f14155b.a(new zzbpr(zzcxuVar, zzcxmVar, null), new zzbvz(new zzbwz(zzbbrVar) { // from class: com.google.android.gms.internal.ads.qk
                private final zzbbr a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = zzbbrVar;
                }

                @Override // com.google.android.gms.internal.ads.zzbwz
                public final void a(boolean z, Context context) {
                    zzbbr zzbbrVar2 = this.a;
                    try {
                        zzk.zzlf();
                        com.google.android.gms.ads.internal.overlay.zzm.zza(context, (AdOverlayInfoParcel) zzbbrVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }));
            zzbbrVar.b(new AdOverlayInfoParcel(zzcVar, null, a.i(), null, new zzbai(0, 0, false)));
            this.f14157d.f();
            return zzbar.o(a.h());
        } catch (Throwable th) {
            zzbad.c("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
