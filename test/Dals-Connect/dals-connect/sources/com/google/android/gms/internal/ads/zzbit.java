package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Callable;

@zzard
/* loaded from: classes2.dex */
public final class zzbit {
    public static zzbgz a(final Context context, final zzbin zzbinVar, final String str, final boolean z, final boolean z2, final zzdh zzdhVar, final zzbai zzbaiVar, zzadi zzadiVar, final zzj zzjVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzwj zzwjVar) throws zzbhj {
        try {
            final zzadi zzadiVar2 = null;
            return (zzbgz) zzazl.b(new Callable(context, zzbinVar, str, z, z2, zzdhVar, zzbaiVar, zzadiVar2, zzjVar, zzaVar, zzwjVar) { // from class: com.google.android.gms.internal.ads.nb

                /* renamed from: f, reason: collision with root package name */
                private final Context f11861f;

                /* renamed from: g, reason: collision with root package name */
                private final zzbin f11862g;

                /* renamed from: h, reason: collision with root package name */
                private final String f11863h;

                /* renamed from: i, reason: collision with root package name */
                private final boolean f11864i;

                /* renamed from: j, reason: collision with root package name */
                private final boolean f11865j;

                /* renamed from: k, reason: collision with root package name */
                private final zzdh f11866k;
                private final zzbai l;
                private final zzadi m;
                private final zzj n;
                private final com.google.android.gms.ads.internal.zza o;
                private final zzwj p;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11861f = context;
                    this.f11862g = zzbinVar;
                    this.f11863h = str;
                    this.f11864i = z;
                    this.f11865j = z2;
                    this.f11866k = zzdhVar;
                    this.l = zzbaiVar;
                    this.m = zzadiVar2;
                    this.n = zzjVar;
                    this.o = zzaVar;
                    this.p = zzwjVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = this.f11861f;
                    zzbin zzbinVar2 = this.f11862g;
                    String str2 = this.f11863h;
                    boolean z3 = this.f11864i;
                    boolean z4 = this.f11865j;
                    zzdh zzdhVar2 = this.f11866k;
                    zzbai zzbaiVar2 = this.l;
                    zzadi zzadiVar3 = this.m;
                    zzj zzjVar2 = this.n;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.o;
                    zzwj zzwjVar2 = this.p;
                    zzbio zzbioVar = new zzbio();
                    ob obVar = new ob(new zzbim(context2), zzbioVar, zzbinVar2, str2, z3, z4, zzdhVar2, zzbaiVar2, zzadiVar3, zzjVar2, zzaVar2, zzwjVar2);
                    zzbhk zzbhkVar = new zzbhk(obVar);
                    obVar.setWebChromeClient(new zzbgr(zzbhkVar));
                    zzbioVar.y(zzbhkVar, z4);
                    return zzbhkVar;
                }
            });
        } catch (Throwable th) {
            zzk.zzlk().e(th, "AdWebViewFactory.newAdWebView2");
            throw new zzbhj("Webview initialization failed.", th);
        }
    }
}
