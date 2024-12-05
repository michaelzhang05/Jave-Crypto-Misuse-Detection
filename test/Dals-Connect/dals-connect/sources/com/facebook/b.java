package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import cm.aptoide.pt.notification.PullingContentService;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.h;
import com.facebook.internal.x;
import com.facebook.internal.y;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AccessTokenManager.java */
/* loaded from: classes.dex */
public final class b {
    private static volatile b a;

    /* renamed from: b, reason: collision with root package name */
    private final c.m.a.a f9029b;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.a f9030c;

    /* renamed from: d, reason: collision with root package name */
    private AccessToken f9031d;

    /* renamed from: e, reason: collision with root package name */
    private AtomicBoolean f9032e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private Date f9033f = new Date(0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccessTokenManager.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AccessToken.b f9034f;

        a(AccessToken.b bVar) {
            this.f9034f = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                b.this.k(this.f9034f);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccessTokenManager.java */
    /* renamed from: com.facebook.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0128b implements GraphRequest.f {
        final /* synthetic */ AtomicBoolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f9036b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f9037c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set f9038d;

        C0128b(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
            this.a = atomicBoolean;
            this.f9036b = set;
            this.f9037c = set2;
            this.f9038d = set3;
        }

        @Override // com.facebook.GraphRequest.f
        public void b(i iVar) {
            JSONArray optJSONArray;
            JSONObject h2 = iVar.h();
            if (h2 == null || (optJSONArray = h2.optJSONArray("data")) == null) {
                return;
            }
            this.a.set(true);
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("permission");
                    String optString2 = optJSONObject.optString("status");
                    if (!x.Q(optString) && !x.Q(optString2)) {
                        String lowerCase = optString2.toLowerCase(Locale.US);
                        if (lowerCase.equals("granted")) {
                            this.f9036b.add(optString);
                        } else if (lowerCase.equals("declined")) {
                            this.f9037c.add(optString);
                        } else if (lowerCase.equals("expired")) {
                            this.f9038d.add(optString);
                        } else {
                            Log.w("AccessTokenManager", "Unexpected status: " + lowerCase);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccessTokenManager.java */
    /* loaded from: classes.dex */
    public class c implements GraphRequest.f {
        final /* synthetic */ e a;

        c(e eVar) {
            this.a = eVar;
        }

        @Override // com.facebook.GraphRequest.f
        public void b(i iVar) {
            JSONObject h2 = iVar.h();
            if (h2 == null) {
                return;
            }
            this.a.a = h2.optString("access_token");
            this.a.f9048b = h2.optInt("expires_at");
            this.a.f9049c = Long.valueOf(h2.optLong("data_access_expiration_time"));
            this.a.f9050d = h2.optString("graph_domain", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccessTokenManager.java */
    /* loaded from: classes.dex */
    public class d implements h.a {
        final /* synthetic */ AccessToken a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AccessToken.b f9041b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f9042c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f9043d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f9044e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Set f9045f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set f9046g;

        d(AccessToken accessToken, AccessToken.b bVar, AtomicBoolean atomicBoolean, e eVar, Set set, Set set2, Set set3) {
            this.a = accessToken;
            this.f9041b = bVar;
            this.f9042c = atomicBoolean;
            this.f9043d = eVar;
            this.f9044e = set;
            this.f9045f = set2;
            this.f9046g = set3;
        }

        @Override // com.facebook.h.a
        public void a(h hVar) {
            AccessToken accessToken;
            Date h2;
            try {
                if (b.h().g() != null && b.h().g().s() == this.a.s()) {
                    if (!this.f9042c.get()) {
                        e eVar = this.f9043d;
                        if (eVar.a == null && eVar.f9048b == 0) {
                            AccessToken.b bVar = this.f9041b;
                            if (bVar != null) {
                                bVar.a(new FacebookException("Failed to refresh access token"));
                            }
                            b.this.f9032e.set(false);
                            AccessToken.b bVar2 = this.f9041b;
                            return;
                        }
                    }
                    String str = this.f9043d.a;
                    if (str == null) {
                        str = this.a.r();
                    }
                    String str2 = str;
                    String f2 = this.a.f();
                    String s = this.a.s();
                    Set<String> n = this.f9042c.get() ? this.f9044e : this.a.n();
                    Set<String> i2 = this.f9042c.get() ? this.f9045f : this.a.i();
                    Set<String> j2 = this.f9042c.get() ? this.f9046g : this.a.j();
                    com.facebook.c q = this.a.q();
                    Date date = this.f9043d.f9048b != 0 ? new Date(this.f9043d.f9048b * 1000) : this.a.k();
                    Date date2 = new Date();
                    if (this.f9043d.f9049c != null) {
                        h2 = new Date(1000 * this.f9043d.f9049c.longValue());
                    } else {
                        h2 = this.a.h();
                    }
                    accessToken = r15;
                    AccessToken accessToken2 = new AccessToken(str2, f2, s, n, i2, j2, q, date, date2, h2, this.f9043d.f9050d);
                    try {
                        b.h().m(accessToken);
                        b.this.f9032e.set(false);
                        AccessToken.b bVar3 = this.f9041b;
                        if (bVar3 != null) {
                            bVar3.b(accessToken);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        b.this.f9032e.set(false);
                        AccessToken.b bVar4 = this.f9041b;
                        if (bVar4 != null && accessToken != null) {
                            bVar4.b(accessToken);
                        }
                        throw th;
                    }
                }
                AccessToken.b bVar5 = this.f9041b;
                if (bVar5 != null) {
                    bVar5.a(new FacebookException("No current access token to refresh"));
                }
                b.this.f9032e.set(false);
                AccessToken.b bVar6 = this.f9041b;
            } catch (Throwable th2) {
                th = th2;
                accessToken = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AccessTokenManager.java */
    /* loaded from: classes.dex */
    public static class e {
        public String a;

        /* renamed from: b, reason: collision with root package name */
        public int f9048b;

        /* renamed from: c, reason: collision with root package name */
        public Long f9049c;

        /* renamed from: d, reason: collision with root package name */
        public String f9050d;

        private e() {
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    b(c.m.a.a aVar, com.facebook.a aVar2) {
        y.i(aVar, "localBroadcastManager");
        y.i(aVar2, "accessTokenCache");
        this.f9029b = aVar;
        this.f9030c = aVar2;
    }

    private static GraphRequest c(AccessToken accessToken, GraphRequest.f fVar) {
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        bundle.putString("client_id", accessToken.f());
        return new GraphRequest(accessToken, "oauth/access_token", bundle, j.GET, fVar);
    }

    private static GraphRequest d(AccessToken accessToken, GraphRequest.f fVar) {
        return new GraphRequest(accessToken, "me/permissions", new Bundle(), j.GET, fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b h() {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new b(c.m.a.a.b(f.e()), new com.facebook.a());
                }
            }
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(AccessToken.b bVar) {
        AccessToken accessToken = this.f9031d;
        if (accessToken == null) {
            if (bVar != null) {
                bVar.a(new FacebookException("No current access token to refresh"));
            }
        } else {
            if (!this.f9032e.compareAndSet(false, true)) {
                if (bVar != null) {
                    bVar.a(new FacebookException("Refresh already in progress"));
                    return;
                }
                return;
            }
            this.f9033f = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            e eVar = new e(null);
            h hVar = new h(d(accessToken, new C0128b(atomicBoolean, hashSet, hashSet2, hashSet3)), c(accessToken, new c(eVar)));
            hVar.f(new d(accessToken, bVar, atomicBoolean, eVar, hashSet, hashSet2, hashSet3));
            hVar.x();
        }
    }

    private void l(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(f.e(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f9029b.d(intent);
    }

    private void n(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f9031d;
        this.f9031d = accessToken;
        this.f9032e.set(false);
        this.f9033f = new Date(0L);
        if (z) {
            if (accessToken != null) {
                this.f9030c.g(accessToken);
            } else {
                this.f9030c.a();
                x.g(f.e());
            }
        }
        if (x.b(accessToken2, accessToken)) {
            return;
        }
        l(accessToken2, accessToken);
        o();
    }

    private void o() {
        Context e2 = f.e();
        AccessToken g2 = AccessToken.g();
        AlarmManager alarmManager = (AlarmManager) e2.getSystemService("alarm");
        if (!AccessToken.t() || g2.k() == null || alarmManager == null) {
            return;
        }
        Intent intent = new Intent(e2, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        try {
            alarmManager.set(1, g2.k().getTime(), PendingIntent.getBroadcast(e2, 0, intent, 0));
        } catch (Exception unused) {
        }
    }

    private boolean p() {
        if (this.f9031d == null) {
            return false;
        }
        Long valueOf = Long.valueOf(new Date().getTime());
        return this.f9031d.q().d() && valueOf.longValue() - this.f9033f.getTime() > 3600000 && valueOf.longValue() - this.f9031d.m().getTime() > PullingContentService.UPDATES_INTERVAL;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        AccessToken accessToken = this.f9031d;
        l(accessToken, accessToken);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (p()) {
            j(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AccessToken g() {
        return this.f9031d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        AccessToken f2 = this.f9030c.f();
        if (f2 == null) {
            return false;
        }
        n(f2, false);
        return true;
    }

    void j(AccessToken.b bVar) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            k(bVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new a(bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(AccessToken accessToken) {
        n(accessToken, true);
    }
}
