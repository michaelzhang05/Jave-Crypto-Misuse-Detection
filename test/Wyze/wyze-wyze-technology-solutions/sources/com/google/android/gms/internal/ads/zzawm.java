package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

@zzard
/* loaded from: classes2.dex */
public final class zzawm {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private zztz f13041b;

    /* renamed from: c, reason: collision with root package name */
    private final zzaxc f13042c;

    /* renamed from: d, reason: collision with root package name */
    private final zzawu f13043d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13044e;

    /* renamed from: f, reason: collision with root package name */
    private Context f13045f;

    /* renamed from: g, reason: collision with root package name */
    private zzbai f13046g;

    /* renamed from: h, reason: collision with root package name */
    private zzacy f13047h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f13048i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicInteger f13049j;

    /* renamed from: k, reason: collision with root package name */
    private final x4 f13050k;
    private final Object l;
    private zzbbh<ArrayList<String>> m;

    public zzawm() {
        zzaxc zzaxcVar = new zzaxc();
        this.f13042c = zzaxcVar;
        this.f13043d = new zzawu(zzyt.f(), zzaxcVar);
        this.f13044e = false;
        this.f13047h = null;
        this.f13048i = null;
        this.f13049j = new AtomicInteger(0);
        this.f13050k = new x4(null);
        this.l = new Object();
    }

    @TargetApi(16)
    private static ArrayList<String> f(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo e2 = Wrappers.a(context).e(context.getApplicationInfo().packageName, RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT);
            if (e2.requestedPermissions != null && e2.requestedPermissionsFlags != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = e2.requestedPermissions;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if ((e2.requestedPermissionsFlags[i2] & 2) != 0) {
                        arrayList.add(strArr[i2]);
                    }
                    i2++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final Context a() {
        return this.f13045f;
    }

    public final Resources b() {
        if (this.f13046g.f13153i) {
            return this.f13045f.getResources();
        }
        try {
            zzbae.b(this.f13045f).getResources();
            return null;
        } catch (zzbag e2) {
            zzbad.d("Cannot load resource from dynamite apk or local jar", e2);
            return null;
        }
    }

    public final void d(Boolean bool) {
        synchronized (this.a) {
            this.f13048i = bool;
        }
    }

    public final void e(Throwable th, String str) {
        zzaqx.e(this.f13045f, this.f13046g).a(th, str);
    }

    public final void h(Throwable th, String str) {
        zzaqx.e(this.f13045f, this.f13046g).b(th, str, ((Float) zzyt.e().c(zzacu.p)).floatValue());
    }

    @TargetApi(23)
    public final void k(Context context, zzbai zzbaiVar) {
        synchronized (this.a) {
            if (!this.f13044e) {
                this.f13045f = context.getApplicationContext();
                this.f13046g = zzbaiVar;
                zzk.zzlj().d(this.f13043d);
                zzacy zzacyVar = null;
                this.f13042c.a(this.f13045f, null, true);
                zzaqx.e(this.f13045f, this.f13046g);
                this.f13041b = new zztz(context.getApplicationContext(), this.f13046g);
                zzk.zzlp();
                if (!((Boolean) zzyt.e().c(zzacu.e0)).booleanValue()) {
                    zzawz.m("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                } else {
                    zzacyVar = new zzacy();
                }
                this.f13047h = zzacyVar;
                if (zzacyVar != null) {
                    zzbao.a(new w4(this).zzvi(), "AppState.registerCsiReporter");
                }
                this.f13044e = true;
                s();
            }
        }
        zzk.zzlg().g0(context, zzbaiVar.f13150f);
    }

    public final zzacy l() {
        zzacy zzacyVar;
        synchronized (this.a) {
            zzacyVar = this.f13047h;
        }
        return zzacyVar;
    }

    public final Boolean m() {
        Boolean bool;
        synchronized (this.a) {
            bool = this.f13048i;
        }
        return bool;
    }

    public final void n() {
        this.f13050k.a();
    }

    public final void o() {
        this.f13049j.incrementAndGet();
    }

    public final void p() {
        this.f13049j.decrementAndGet();
    }

    public final int q() {
        return this.f13049j.get();
    }

    public final zzaxb r() {
        zzaxc zzaxcVar;
        synchronized (this.a) {
            zzaxcVar = this.f13042c;
        }
        return zzaxcVar;
    }

    public final zzbbh<ArrayList<String>> s() {
        if (PlatformVersion.c() && this.f13045f != null) {
            if (!((Boolean) zzyt.e().c(zzacu.p2)).booleanValue()) {
                synchronized (this.l) {
                    zzbbh<ArrayList<String>> zzbbhVar = this.m;
                    if (zzbbhVar != null) {
                        return zzbbhVar;
                    }
                    zzbbh<ArrayList<String>> a = zzaxg.a(new Callable(this) { // from class: com.google.android.gms.internal.ads.v4

                        /* renamed from: f, reason: collision with root package name */
                        private final zzawm f12268f;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.f12268f = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f12268f.u();
                        }
                    });
                    this.m = a;
                    return a;
                }
            }
        }
        return zzbar.o(new ArrayList());
    }

    public final zzawu t() {
        return this.f13043d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList u() throws Exception {
        return f(zzasq.f(this.f13045f));
    }
}
