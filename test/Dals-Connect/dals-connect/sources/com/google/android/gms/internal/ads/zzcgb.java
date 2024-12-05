package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcgb {

    /* renamed from: e, reason: collision with root package name */
    private final Context f14022e;

    /* renamed from: f, reason: collision with root package name */
    private final zzclc f14023f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f14024g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f14025h;

    /* renamed from: i, reason: collision with root package name */
    private final ScheduledExecutorService f14026i;
    private boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14019b = false;

    /* renamed from: d, reason: collision with root package name */
    private final zzbbr<Boolean> f14021d = new zzbbr<>();

    /* renamed from: j, reason: collision with root package name */
    private Map<String, zzaio> f14027j = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final long f14020c = zzk.zzln().b();

    public zzcgb(Executor executor, Context context, Executor executor2, zzclc zzclcVar, ScheduledExecutorService scheduledExecutorService) {
        this.f14023f = zzclcVar;
        this.f14022e = context;
        this.f14024g = executor2;
        this.f14026i = scheduledExecutorService;
        this.f14025h = executor;
        d("com.google.android.gms.ads.MobileAds", false, HttpUrl.FRAGMENT_ENCODE_SET, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(String str, boolean z, String str2, int i2) {
        this.f14027j.put(str, new zzaio(str, z, i2, str2));
    }

    private final synchronized void g() {
        if (!this.f14019b) {
            zzk.zzlk().r().C(new Runnable(this) { // from class: com.google.android.gms.internal.ads.li

                /* renamed from: f, reason: collision with root package name */
                private final zzcgb f11776f;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11776f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f11776f.j();
                }
            });
            this.f14019b = true;
            this.f14026i.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.mi

                /* renamed from: f, reason: collision with root package name */
                private final zzcgb f11823f;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11823f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f11823f.i();
                }
            }, ((Long) zzyt.e().c(zzacu.h2)).longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(zzams zzamsVar, zzaiq zzaiqVar, List list) {
        try {
            try {
                zzamsVar.M4(ObjectWrapper.i0(this.f14022e), zzaiqVar, list);
            } catch (RemoteException e2) {
                zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            }
        } catch (RemoteException unused) {
            zzaiqVar.onInitializationFailed("Failed to create Adapter.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c(Object obj, zzbbr zzbbrVar, String str, long j2) {
        synchronized (obj) {
            if (!zzbbrVar.isDone()) {
                d(str, false, "timeout", (int) (zzk.zzln().b() - j2));
                zzbbrVar.b(Boolean.FALSE);
            }
        }
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void k() {
        if (((Boolean) zzyt.e().c(zzacu.f2)).booleanValue() && !this.a) {
            synchronized (this) {
                if (this.a) {
                    return;
                }
                final String c2 = zzk.zzlk().r().z().c();
                if (TextUtils.isEmpty(c2)) {
                    g();
                    return;
                }
                this.a = true;
                d("com.google.android.gms.ads.MobileAds", true, HttpUrl.FRAGMENT_ENCODE_SET, (int) (zzk.zzln().b() - this.f14020c));
                this.f14024g.execute(new Runnable(this, c2) { // from class: com.google.android.gms.internal.ads.ki

                    /* renamed from: f, reason: collision with root package name */
                    private final zzcgb f11723f;

                    /* renamed from: g, reason: collision with root package name */
                    private final String f11724g;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.f11723f = this;
                        this.f11724g = c2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11723f.n(this.f11724g);
                    }
                });
            }
        }
    }

    public final List<zzaio> f() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f14027j.keySet()) {
            zzaio zzaioVar = this.f14027j.get(str);
            arrayList.add(new zzaio(str, zzaioVar.f12740g, zzaioVar.f12741h, zzaioVar.f12742i));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object h() throws Exception {
        this.f14021d.b(Boolean.TRUE);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void i() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            d("com.google.android.gms.ads.MobileAds", false, "timeout", (int) (zzk.zzln().b() - this.f14020c));
            this.f14021d.b(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void j() {
        this.f14024g.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.qi

            /* renamed from: f, reason: collision with root package name */
            private final zzcgb f12059f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12059f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12059f.k();
            }
        });
    }

    public final void l(final zzait zzaitVar) {
        this.f14021d.f(new Runnable(this, zzaitVar) { // from class: com.google.android.gms.internal.ads.ji

            /* renamed from: f, reason: collision with root package name */
            private final zzcgb f11651f;

            /* renamed from: g, reason: collision with root package name */
            private final zzait f11652g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11651f = this;
                this.f11652g = zzaitVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11651f.m(this.f11652g);
            }
        }, this.f14025h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void m(zzait zzaitVar) {
        try {
            zzaitVar.B4(f());
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void n(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final Object obj = new Object();
                final zzbbr zzbbrVar = new zzbbr();
                zzbbh b2 = zzbar.b(zzbbrVar, ((Long) zzyt.e().c(zzacu.g2)).longValue(), TimeUnit.SECONDS, this.f14026i);
                final long b3 = zzk.zzln().b();
                Iterator<String> it = keys;
                b2.f(new Runnable(this, obj, zzbbrVar, next, b3) { // from class: com.google.android.gms.internal.ads.ni

                    /* renamed from: f, reason: collision with root package name */
                    private final zzcgb f11884f;

                    /* renamed from: g, reason: collision with root package name */
                    private final Object f11885g;

                    /* renamed from: h, reason: collision with root package name */
                    private final zzbbr f11886h;

                    /* renamed from: i, reason: collision with root package name */
                    private final String f11887i;

                    /* renamed from: j, reason: collision with root package name */
                    private final long f11888j;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.f11884f = this;
                        this.f11885g = obj;
                        this.f11886h = zzbbrVar;
                        this.f11887i = next;
                        this.f11888j = b3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11884f.c(this.f11885g, this.f11886h, this.f11887i, this.f11888j);
                    }
                }, this.f14024g);
                arrayList.add(b2);
                final ri riVar = new ri(this, obj, next, b3, zzbbrVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject2.optString("format", HttpUrl.FRAGMENT_ENCODE_SET);
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, HttpUrl.FRAGMENT_ENCODE_SET));
                                }
                            }
                            arrayList2.add(new zzaiw(optString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                d(next, false, HttpUrl.FRAGMENT_ENCODE_SET, 0);
                try {
                    try {
                        final zzams e2 = this.f14023f.e(next, new JSONObject());
                        this.f14025h.execute(new Runnable(this, e2, riVar, arrayList2) { // from class: com.google.android.gms.internal.ads.pi

                            /* renamed from: f, reason: collision with root package name */
                            private final zzcgb f11994f;

                            /* renamed from: g, reason: collision with root package name */
                            private final zzams f11995g;

                            /* renamed from: h, reason: collision with root package name */
                            private final zzaiq f11996h;

                            /* renamed from: i, reason: collision with root package name */
                            private final List f11997i;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.f11994f = this;
                                this.f11995g = e2;
                                this.f11996h = riVar;
                                this.f11997i = arrayList2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f11994f.a(this.f11995g, this.f11996h, this.f11997i);
                            }
                        });
                    } catch (RemoteException e3) {
                        zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e3);
                    }
                } catch (RemoteException unused2) {
                    riVar.onInitializationFailed("Failed to create Adapter.");
                }
                keys = it;
            }
            zzbar.n(arrayList).a(new Callable(this) { // from class: com.google.android.gms.internal.ads.oi

                /* renamed from: f, reason: collision with root package name */
                private final zzcgb f11939f;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11939f = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f11939f.h();
                }
            }, this.f14024g);
        } catch (JSONException e4) {
            zzawz.l("Malformed CLD response", e4);
        }
    }
}
