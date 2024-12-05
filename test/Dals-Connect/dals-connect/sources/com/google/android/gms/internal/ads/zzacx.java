package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.zzk;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@zzard
/* loaded from: classes2.dex */
public final class zzacx {
    private String a = (String) zzyt.e().c(zzacu.f0);

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f12632b;

    /* renamed from: c, reason: collision with root package name */
    private Context f12633c;

    /* renamed from: d, reason: collision with root package name */
    private String f12634d;

    public zzacx(Context context, String str) {
        String packageName;
        this.f12633c = null;
        this.f12634d = null;
        this.f12633c = context;
        this.f12634d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f12632b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        this.f12632b.put("v", "3");
        this.f12632b.put("os", Build.VERSION.RELEASE);
        this.f12632b.put("sdk", Build.VERSION.SDK);
        Map<String, String> map = this.f12632b;
        zzk.zzlg();
        map.put("device", zzaxi.k0());
        Map<String, String> map2 = this.f12632b;
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        map2.put("app", packageName);
        Map<String, String> map3 = this.f12632b;
        zzk.zzlg();
        map3.put("is_lite_sdk", zzaxi.E(context) ? "1" : "0");
        Future<zzase> b2 = zzk.zzlr().b(this.f12633c);
        try {
            this.f12632b.put("network_coarse", Integer.toString(b2.get().o));
            this.f12632b.put("network_fine", Integer.toString(b2.get().p));
        } catch (Exception e2) {
            zzk.zzlk().e(e2, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context a() {
        return this.f12633c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b() {
        return this.f12634d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> d() {
        return this.f12632b;
    }
}
