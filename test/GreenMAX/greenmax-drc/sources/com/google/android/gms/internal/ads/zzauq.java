package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzauq implements zzavb {
    private static List<Future<Void>> a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b, reason: collision with root package name */
    private static ScheduledExecutorService f12990b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c, reason: collision with root package name */
    private final zzdsj f12991c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashMap<String, zzdsp> f12992d;

    /* renamed from: g, reason: collision with root package name */
    private final Context f12995g;

    /* renamed from: h, reason: collision with root package name */
    private final zzavd f12996h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12997i;

    /* renamed from: j, reason: collision with root package name */
    private final zzauy f12998j;

    /* renamed from: k, reason: collision with root package name */
    private final c4 f12999k;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f12993e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f12994f = new ArrayList();
    private final Object l = new Object();
    private HashSet<String> m = new HashSet<>();
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;

    public zzauq(Context context, zzbai zzbaiVar, zzauy zzauyVar, String str, zzavd zzavdVar) {
        Preconditions.k(zzauyVar, "SafeBrowsing config is not present.");
        this.f12995g = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f12992d = new LinkedHashMap<>();
        this.f12996h = zzavdVar;
        this.f12998j = zzauyVar;
        Iterator<String> it = zzauyVar.f13004j.iterator();
        while (it.hasNext()) {
            this.m.add(it.next().toLowerCase(Locale.ENGLISH));
        }
        this.m.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzdsj zzdsjVar = new zzdsj();
        zzdsjVar.f14933c = 8;
        zzdsjVar.f14935e = str;
        zzdsjVar.f14936f = str;
        zzdsk zzdskVar = new zzdsk();
        zzdsjVar.f14938h = zzdskVar;
        zzdskVar.f14942c = this.f12998j.f13000f;
        zzdsq zzdsqVar = new zzdsq();
        zzdsqVar.f14963c = zzbaiVar.f13150f;
        zzdsqVar.f14965e = Boolean.valueOf(Wrappers.a(this.f12995g).f());
        long b2 = GoogleApiAvailabilityLight.h().b(this.f12995g);
        if (b2 > 0) {
            zzdsqVar.f14964d = Long.valueOf(b2);
        }
        zzdsjVar.r = zzdsqVar;
        this.f12991c = zzdsjVar;
        this.f12999k = new c4(this.f12995g, this.f12998j.m, this);
    }

    private final zzdsp m(String str) {
        zzdsp zzdspVar;
        synchronized (this.l) {
            zzdspVar = this.f12992d.get(str);
        }
        return zzdspVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Void n(String str) {
        return null;
    }

    private final zzbbh<Void> p() {
        zzbbh<Void> d2;
        boolean z = this.f12997i;
        if (!((z && this.f12998j.l) || (this.p && this.f12998j.f13005k) || (!z && this.f12998j.f13003i))) {
            return zzbar.o(null);
        }
        synchronized (this.l) {
            this.f12991c.f14939i = new zzdsp[this.f12992d.size()];
            this.f12992d.values().toArray(this.f12991c.f14939i);
            this.f12991c.s = (String[]) this.f12993e.toArray(new String[0]);
            this.f12991c.t = (String[]) this.f12994f.toArray(new String[0]);
            if (zzava.a()) {
                zzdsj zzdsjVar = this.f12991c;
                String str = zzdsjVar.f14935e;
                String str2 = zzdsjVar.f14940j;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(str);
                sb.append("\n  clickUrl: ");
                sb.append(str2);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (zzdsp zzdspVar : this.f12991c.f14939i) {
                    sb2.append("    [");
                    sb2.append(zzdspVar.l.length);
                    sb2.append("] ");
                    sb2.append(zzdspVar.f14956e);
                }
                zzava.b(sb2.toString());
            }
            zzbbh<String> a2 = new zzayu(this.f12995g).a(1, this.f12998j.f13001g, null, zzdrw.b(this.f12991c));
            if (zzava.a()) {
                a2.f(new b4(this), zzaxg.a);
            }
            d2 = zzbar.d(a2, y3.a, zzbbm.f13155b);
        }
        return d2;
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    public final void a(String str, Map<String, String> map, int i2) {
        synchronized (this.l) {
            if (i2 == 3) {
                this.p = true;
            }
            if (this.f12992d.containsKey(str)) {
                if (i2 == 3) {
                    this.f12992d.get(str).f14962k = Integer.valueOf(i2);
                }
                return;
            }
            zzdsp zzdspVar = new zzdsp();
            zzdspVar.f14962k = Integer.valueOf(i2);
            zzdspVar.f14955d = Integer.valueOf(this.f12992d.size());
            zzdspVar.f14956e = str;
            zzdspVar.f14957f = new zzdsm();
            if (this.m.size() > 0 && map != null) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    try {
                        String key = entry.getKey() != null ? entry.getKey() : HttpUrl.FRAGMENT_ENCODE_SET;
                        String value = entry.getValue() != null ? entry.getValue() : HttpUrl.FRAGMENT_ENCODE_SET;
                        if (this.m.contains(key.toLowerCase(Locale.ENGLISH))) {
                            zzdsl zzdslVar = new zzdsl();
                            zzdslVar.f14944d = key.getBytes("UTF-8");
                            zzdslVar.f14945e = value.getBytes("UTF-8");
                            arrayList.add(zzdslVar);
                        }
                    } catch (UnsupportedEncodingException unused) {
                        zzava.b("Cannot convert string to bytes, skip header.");
                    }
                }
                zzdsl[] zzdslVarArr = new zzdsl[arrayList.size()];
                arrayList.toArray(zzdslVarArr);
                zzdspVar.f14957f.f14947d = zzdslVarArr;
            }
            this.f12992d.put(str, zzdspVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    public final void b(String str) {
        synchronized (this.l) {
            this.f12991c.f14940j = str;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    public final void c() {
        synchronized (this.l) {
            zzbbh<Map<String, String>> a2 = this.f12996h.a(this.f12995g, this.f12992d.keySet());
            zzbal zzbalVar = new zzbal(this) { // from class: com.google.android.gms.internal.ads.x3
                private final zzauq a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = this;
                }

                @Override // com.google.android.gms.internal.ads.zzbal
                public final zzbbh zzf(Object obj) {
                    return this.a.o((Map) obj);
                }
            };
            Executor executor = zzbbm.f13155b;
            zzbbh c2 = zzbar.c(a2, zzbalVar, executor);
            zzbbh b2 = zzbar.b(c2, 10L, TimeUnit.SECONDS, f12990b);
            zzbar.f(c2, new a4(this, b2), executor);
            a.add(b2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    public final String[] d(String[] strArr) {
        return (String[]) this.f12999k.a(strArr).toArray(new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    public final void e() {
        this.n = true;
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    public final void f(View view) {
        if (this.f12998j.f13002h && !this.o) {
            zzk.zzlg();
            Bitmap a0 = zzaxi.a0(view);
            if (a0 == null) {
                zzava.b("Failed to capture the webview bitmap.");
            } else {
                this.o = true;
                zzaxi.O(new z3(this, a0));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    public final boolean g() {
        return PlatformVersion.f() && this.f12998j.f13002h && !this.o;
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    public final zzauy h() {
        return this.f12998j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(String str) {
        synchronized (this.l) {
            this.f12993e.add(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(String str) {
        synchronized (this.l) {
            this.f12994f.add(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbh o(Map map) throws Exception {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.l) {
                            int length = optJSONArray.length();
                            zzdsp m = m(str);
                            if (m == null) {
                                String valueOf = String.valueOf(str);
                                zzava.b(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                m.l = new String[length];
                                for (int i2 = 0; i2 < length; i2++) {
                                    m.l[i2] = optJSONArray.getJSONObject(i2).getString("threat_type");
                                }
                                this.f12997i = (length > 0) | this.f12997i;
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                if (((Boolean) zzyt.e().c(zzacu.q3)).booleanValue()) {
                    zzbad.b("Failed to get SafeBrowsing metadata", e2);
                }
                return zzbar.l(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f12997i) {
            synchronized (this.l) {
                this.f12991c.f14933c = 9;
            }
        }
        return p();
    }
}
