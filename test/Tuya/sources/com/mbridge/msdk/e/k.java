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
    private static x f18899a = null;

    /* renamed from: o, reason: collision with root package name */
    private static String f18900o = "";

    /* renamed from: b, reason: collision with root package name */
    private final String f18901b;

    /* renamed from: c, reason: collision with root package name */
    private final m f18902c;

    /* renamed from: d, reason: collision with root package name */
    private Context f18903d;

    /* renamed from: e, reason: collision with root package name */
    private w f18904e;

    /* renamed from: f, reason: collision with root package name */
    private JSONObject f18905f;

    /* renamed from: g, reason: collision with root package name */
    private List<String> f18906g;

    /* renamed from: h, reason: collision with root package name */
    private List<String> f18907h;

    /* renamed from: i, reason: collision with root package name */
    private volatile c f18908i;

    /* renamed from: j, reason: collision with root package name */
    private volatile l f18909j;

    /* renamed from: k, reason: collision with root package name */
    private volatile d f18910k;

    /* renamed from: l, reason: collision with root package name */
    private volatile j f18911l;

    /* renamed from: m, reason: collision with root package name */
    private volatile r f18912m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f18913n = true;

    /* renamed from: p, reason: collision with root package name */
    private n f18914p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(String str, m mVar) {
        this.f18901b = str;
        this.f18902c = mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        if (!y.a((Object) this.f18903d) && !y.a(this.f18904e)) {
            try {
                o().a();
                this.f18913n = false;
                if (TextUtils.isEmpty(f18900o)) {
                    f18900o = UUID.randomUUID().toString();
                }
                if (!y.a(f18899a)) {
                    try {
                        f18899a.a(b(), this.f18901b, this.f18902c);
                        t.a().b();
                    } catch (Exception e8) {
                        if (a.f18749a) {
                            Log.e("TrackManager", "track manager start exception", e8);
                        }
                    }
                }
                return f18900o;
            } catch (Exception e9) {
                if (a.f18749a) {
                    Log.e("TrackManager", "start error", e9);
                }
                this.f18913n = true;
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b() {
        if (TextUtils.isEmpty(f18900o)) {
            String uuid = UUID.randomUUID().toString();
            f18900o = uuid;
            return uuid;
        }
        return f18900o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c() {
        return this.f18901b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final w d() {
        w wVar = this.f18904e;
        if (wVar == null) {
            w a8 = new w.a().a();
            this.f18904e = a8;
            return a8;
        }
        return wVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context e() {
        return this.f18903d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject f() {
        JSONObject jSONObject = this.f18905f;
        if (jSONObject == null) {
            JSONObject jSONObject2 = new JSONObject();
            this.f18905f = jSONObject2;
            return jSONObject2;
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final c g() {
        String format;
        if (y.a(this.f18908i)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f18908i)) {
                        Context context = this.f18903d;
                        if (TextUtils.isEmpty(this.f18901b)) {
                            format = String.format("track_manager_%s.db", "default");
                        } else {
                            format = String.format("track_manager_%s.db", this.f18901b);
                        }
                        this.f18908i = new c(new b(context, format, "event_table"), "event_table");
                    }
                } finally {
                }
            }
        }
        return this.f18908i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final l h() {
        if (y.a(this.f18909j)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f18909j)) {
                        this.f18909j = new p(new g(g(), o(), i()));
                    }
                } finally {
                }
            }
        }
        return this.f18909j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j i() {
        if (y.a(this.f18911l)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f18911l)) {
                        this.f18911l = new j();
                    }
                } finally {
                }
            }
        }
        return this.f18911l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d j() {
        if (y.a(this.f18910k)) {
            this.f18910k = d().f18973h;
        }
        return this.f18910k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final m k() {
        return this.f18902c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int l() {
        if (d().f18966a < 0) {
            return 50;
        }
        return d().f18966a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int m() {
        return Math.max(d().f18967b, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int n() {
        return Math.max(d().f18970e, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r o() {
        if (y.a(this.f18912m)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f18912m)) {
                        this.f18912m = new r(this);
                    }
                } finally {
                }
            }
        }
        return this.f18912m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean p() throws IllegalStateException {
        if (!y.a(d())) {
            if (!y.a(j())) {
                if (!y.a(d().f18974i)) {
                    if (!y.a(d().f18972g) && !y.a(d().f18972g.c())) {
                        if (!TextUtils.isEmpty(d().f18972g.b())) {
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
        if (y.a(this.f18914p)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f18914p)) {
                        if (d().f18969d <= 0) {
                            i8 = 2;
                        } else {
                            i8 = d().f18969d;
                        }
                        this.f18914p = new n(i8, d().f18972g, d().f18974i, d().f18968c);
                    }
                } finally {
                }
            }
        }
        return this.f18914p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r() {
        return this.f18913n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Context context) {
        this.f18903d = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(w wVar) {
        this.f18904e = wVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(JSONObject jSONObject) {
        this.f18905f = jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(e eVar) {
        if (y.a(eVar)) {
            return false;
        }
        f fVar = d().f18975j;
        if (y.b(fVar)) {
            try {
                return fVar.a(eVar);
            } catch (Exception e8) {
                if (a.f18749a) {
                    Log.e("TrackManager", "event filter apply exception", e8);
                }
            }
        }
        String a8 = eVar.a();
        if (TextUtils.isEmpty(a8)) {
            return false;
        }
        if (this.f18907h != null) {
            try {
                return !r0.contains(a8);
            } catch (Exception e9) {
                if (a.f18749a) {
                    Log.e("TrackManager", "disallowTrackEventNames contains exception", e9);
                }
            }
        }
        List<String> list = this.f18906g;
        if (list != null) {
            try {
                return list.contains(a8);
            } catch (Exception e10) {
                if (a.f18749a) {
                    Log.e("TrackManager", "allowTrackEventNames contains exception", e10);
                }
            }
        }
        return true;
    }
}
