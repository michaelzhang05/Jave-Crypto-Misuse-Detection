package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbkz extends zzaac {

    /* renamed from: f, reason: collision with root package name */
    private final Context f13334f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbai f13335g;

    /* renamed from: h, reason: collision with root package name */
    private final zzclc f13336h;

    /* renamed from: i, reason: collision with root package name */
    private final zzcjz<zzams, zzclb> f13337i;

    /* renamed from: j, reason: collision with root package name */
    private final zzcpf f13338j;

    /* renamed from: k, reason: collision with root package name */
    private final zzcgb f13339k;
    private boolean l = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkz(Context context, zzbai zzbaiVar, zzclc zzclcVar, zzcjz<zzams, zzclb> zzcjzVar, zzcpf zzcpfVar, zzcgb zzcgbVar) {
        this.f13334f = context;
        this.f13335g = zzbaiVar;
        this.f13336h = zzclcVar;
        this.f13337i = zzcjzVar;
        this.f13338j = zzcpfVar;
        this.f13339k = zzcgbVar;
    }

    private final String H7() {
        Context applicationContext = this.f13334f.getApplicationContext() == null ? this.f13334f : this.f13334f.getApplicationContext();
        try {
            return Wrappers.a(applicationContext).c(applicationContext.getPackageName(), 128).metaData.getString("com.google.android.gms.ads.APPLICATION_ID");
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            zzawz.l("Error getting metadata", e2);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void D2(String str) {
        this.f13338j.g(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final String F3() {
        return this.f13335g.f13150f;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final synchronized boolean H3() {
        return zzk.zzll().e();
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final synchronized float I4() {
        return zzk.zzll().d();
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final synchronized void I5(float f2) {
        zzk.zzll().b(f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void I7(Runnable runnable) {
        Preconditions.f("Adapters must be initialized on the main thread.");
        Map<String, zzamm> e2 = zzk.zzlk().r().z().e();
        if (e2 == null || e2.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzbad.d("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.f13336h.a()) {
            HashMap hashMap = new HashMap();
            IObjectWrapper i0 = ObjectWrapper.i0(this.f13334f);
            Iterator<zzamm> it = e2.values().iterator();
            while (it.hasNext()) {
                for (zzaml zzamlVar : it.next().a) {
                    String str = zzamlVar.f12801k;
                    for (String str2 : zzamlVar.f12793c) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((Collection) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzcjy<zzams, zzclb> a = this.f13337i.a(str3, jSONObject);
                    if (a != null) {
                        zzams zzamsVar = a.f14136b;
                        if (!zzamsVar.isInitialized() && zzamsVar.s3()) {
                            zzamsVar.O4(i0, a.f14137c, (List) entry.getValue());
                            String valueOf = String.valueOf(str3);
                            zzbad.e(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                        }
                    }
                } catch (Throwable th2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb.append("Failed to initialize rewarded video mediation adapter \"");
                    sb.append(str3);
                    sb.append("\"");
                    zzbad.d(sb.toString(), th2);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final List<zzaio> K2() throws RemoteException {
        return this.f13339k.f();
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void M6(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzbad.g("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.R(iObjectWrapper);
        if (context == null) {
            zzbad.g("Context is null. Failed to open debug menu.");
            return;
        }
        zzayb zzaybVar = new zzayb(context);
        zzaybVar.a(str);
        zzaybVar.j(this.f13335g.f13150f);
        zzaybVar.b();
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void P1(zzait zzaitVar) throws RemoteException {
        this.f13339k.l(zzaitVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final synchronized void S1(boolean z) {
        zzk.zzll().a(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final synchronized void f0() {
        if (this.l) {
            zzbad.i("Mobile ads is initialized already.");
            return;
        }
        zzacu.a(this.f13334f);
        zzk.zzlk().k(this.f13334f, this.f13335g);
        zzk.zzlm().c(this.f13334f);
        this.l = true;
        this.f13339k.k();
        if (((Boolean) zzyt.e().c(zzacu.b2)).booleanValue()) {
            this.f13338j.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void p2(String str, IObjectWrapper iObjectWrapper) {
        String H7 = ((Boolean) zzyt.e().c(zzacu.e3)).booleanValue() ? H7() : HttpUrl.FRAGMENT_ENCODE_SET;
        if (!TextUtils.isEmpty(H7)) {
            str = H7;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzacu.a(this.f13334f);
        boolean booleanValue = ((Boolean) zzyt.e().c(zzacu.c3)).booleanValue();
        zzacj<Boolean> zzacjVar = zzacu.a1;
        boolean booleanValue2 = booleanValue | ((Boolean) zzyt.e().c(zzacjVar)).booleanValue();
        Runnable runnable = null;
        if (((Boolean) zzyt.e().c(zzacjVar)).booleanValue()) {
            booleanValue2 = true;
            final Runnable runnable2 = (Runnable) ObjectWrapper.R(iObjectWrapper);
            runnable = new Runnable(this, runnable2) { // from class: com.google.android.gms.internal.ads.pc

                /* renamed from: f, reason: collision with root package name */
                private final zzbkz f11986f;

                /* renamed from: g, reason: collision with root package name */
                private final Runnable f11987g;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11986f = this;
                    this.f11987g = runnable2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final zzbkz zzbkzVar = this.f11986f;
                    final Runnable runnable3 = this.f11987g;
                    zzbbm.a.execute(new Runnable(zzbkzVar, runnable3) { // from class: com.google.android.gms.internal.ads.qc

                        /* renamed from: f, reason: collision with root package name */
                        private final zzbkz f12055f;

                        /* renamed from: g, reason: collision with root package name */
                        private final Runnable f12056g;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.f12055f = zzbkzVar;
                            this.f12056g = runnable3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f12055f.I7(this.f12056g);
                        }
                    });
                }
            };
        }
        if (booleanValue2) {
            zzk.zzlo().zza(this.f13334f, this.f13335g, str, runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final synchronized void p5(String str) {
        zzacu.a(this.f13334f);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzyt.e().c(zzacu.c3)).booleanValue()) {
                zzk.zzlo().zza(this.f13334f, this.f13335g, str, (Runnable) null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void s0(zzamp zzampVar) throws RemoteException {
        this.f13336h.c(zzampVar);
    }
}
