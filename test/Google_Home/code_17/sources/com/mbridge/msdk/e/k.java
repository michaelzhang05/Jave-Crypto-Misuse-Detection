package com.mbridge.msdk.e;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.e.w;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static x f19954a = null;

    /* renamed from: o, reason: collision with root package name */
    private static String f19955o = "";

    /* renamed from: b, reason: collision with root package name */
    private final String f19956b;

    /* renamed from: c, reason: collision with root package name */
    private final m f19957c;

    /* renamed from: d, reason: collision with root package name */
    private Context f19958d;

    /* renamed from: e, reason: collision with root package name */
    private w f19959e;

    /* renamed from: f, reason: collision with root package name */
    private JSONObject f19960f;

    /* renamed from: g, reason: collision with root package name */
    private List<String> f19961g;

    /* renamed from: h, reason: collision with root package name */
    private List<String> f19962h;

    /* renamed from: i, reason: collision with root package name */
    private volatile c f19963i;

    /* renamed from: j, reason: collision with root package name */
    private volatile l f19964j;

    /* renamed from: k, reason: collision with root package name */
    private volatile d f19965k;

    /* renamed from: l, reason: collision with root package name */
    private volatile j f19966l;

    /* renamed from: m, reason: collision with root package name */
    private volatile r f19967m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f19968n = true;

    /* renamed from: p, reason: collision with root package name */
    private n f19969p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(String str, m mVar) {
        this.f19956b = str;
        this.f19957c = mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        if (!y.a((Object) this.f19958d) && !y.a(this.f19959e)) {
            try {
                o().a();
                this.f19968n = false;
                if (TextUtils.isEmpty(f19955o)) {
                    f19955o = UUID.randomUUID().toString();
                }
                if (!y.a(f19954a)) {
                    try {
                        f19954a.a(b(), this.f19956b, this.f19957c);
                        t.a().b();
                    } catch (Exception e8) {
                        if (a.f19804a) {
                            Log.e("TrackManager", "track manager start exception", e8);
                        }
                    }
                }
                return f19955o;
            } catch (Exception e9) {
                if (a.f19804a) {
                    Log.e("TrackManager", "start error", e9);
                }
                this.f19968n = true;
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b() {
        if (TextUtils.isEmpty(f19955o)) {
            String uuid = UUID.randomUUID().toString();
            f19955o = uuid;
            return uuid;
        }
        return f19955o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c() {
        return this.f19956b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final w d() {
        w wVar = this.f19959e;
        if (wVar == null) {
            w a8 = new w.a().a();
            this.f19959e = a8;
            return a8;
        }
        return wVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context e() {
        return this.f19958d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject f() {
        JSONObject jSONObject = this.f19960f;
        if (jSONObject == null) {
            JSONObject jSONObject2 = new JSONObject();
            this.f19960f = jSONObject2;
            return jSONObject2;
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final c g() {
        String format;
        if (y.a(this.f19963i)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f19963i)) {
                        Context context = this.f19958d;
                        if (TextUtils.isEmpty(this.f19956b)) {
                            format = String.format("track_manager_%s.db", "default");
                        } else {
                            format = String.format("track_manager_%s.db", this.f19956b);
                        }
                        this.f19963i = new c(new b(context, format, "event_table"), "event_table");
                    }
                } finally {
                }
            }
        }
        return this.f19963i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final l h() {
        if (y.a(this.f19964j)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f19964j)) {
                        this.f19964j = new p(new g(g(), o(), i()));
                    }
                } finally {
                }
            }
        }
        return this.f19964j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j i() {
        if (y.a(this.f19966l)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f19966l)) {
                        this.f19966l = new j();
                    }
                } finally {
                }
            }
        }
        return this.f19966l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d j() {
        if (y.a(this.f19965k)) {
            this.f19965k = d().f20028h;
        }
        return this.f19965k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final m k() {
        return this.f19957c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int l() {
        if (d().f20021a < 0) {
            return 50;
        }
        return d().f20021a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int m() {
        return Math.max(d().f20022b, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int n() {
        return Math.max(d().f20025e, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r o() {
        if (y.a(this.f19967m)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f19967m)) {
                        this.f19967m = new r(this);
                    }
                } finally {
                }
            }
        }
        return this.f19967m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean p() throws IllegalStateException {
        if (!y.a(d())) {
            if (!y.a(j())) {
                if (!y.a(d().f20029i)) {
                    if (!y.a(d().f20027g) && !y.a(d().f20027g.c())) {
                        if (!TextUtils.isEmpty(d().f20027g.b())) {
                            return true;
                        }
                        throw new IllegalStateException("report url is null");
                    }
                    throw new IllegalStateException("networkStackConfig or stack can not be null");
                }
                throw new IllegalStateException("responseHandler can not be null");
            }
            throw new IllegalStateException("decorate can not be null");
        }
        throw new IllegalStateException("config can not be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final n q() {
        int i8;
        if (y.a(this.f19969p)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f19969p)) {
                        if (d().f20024d <= 0) {
                            i8 = 2;
                        } else {
                            i8 = d().f20024d;
                        }
                        this.f19969p = new n(i8, d().f20027g, d().f20029i, d().f20023c);
                    }
                } finally {
                }
            }
        }
        return this.f19969p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r() {
        return this.f19968n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Context context) {
        this.f19958d = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(w wVar) {
        this.f19959e = wVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(JSONObject jSONObject) {
        this.f19960f = jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(e eVar) {
        if (y.a(eVar)) {
            return false;
        }
        f fVar = d().f20030j;
        if (y.b(fVar)) {
            try {
                return fVar.a(eVar);
            } catch (Exception e8) {
                if (a.f19804a) {
                    Log.e("TrackManager", "event filter apply exception", e8);
                }
            }
        }
        String a8 = eVar.a();
        if (TextUtils.isEmpty(a8)) {
            return false;
        }
        if (this.f19962h != null) {
            try {
                return !r0.contains(a8);
            } catch (Exception e9) {
                if (a.f19804a) {
                    Log.e("TrackManager", "disallowTrackEventNames contains exception", e9);
                }
            }
        }
        List<String> list = this.f19961g;
        if (list != null) {
            try {
                return list.contains(a8);
            } catch (Exception e10) {
                if (a.f19804a) {
                    Log.e("TrackManager", "allowTrackEventNames contains exception", e10);
                }
            }
        }
        return true;
    }
}
