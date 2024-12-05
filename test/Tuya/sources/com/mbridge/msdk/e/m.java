package com.mbridge.msdk.e;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, m> f18915b = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private final k f18916a;

    private m(String str, Context context, w wVar) {
        k kVar = new k(str, this);
        this.f18916a = kVar;
        kVar.a(context);
        kVar.a(wVar);
    }

    public static m[] d() {
        ConcurrentHashMap<String, m> concurrentHashMap = f18915b;
        m[] mVarArr = new m[concurrentHashMap.size()];
        try {
            Iterator<Map.Entry<String, m>> it = concurrentHashMap.entrySet().iterator();
            int i8 = 0;
            while (it.hasNext()) {
                mVarArr[i8] = it.next().getValue();
                i8++;
            }
        } catch (Exception e8) {
            if (a.f18749a) {
                Log.e("TrackManager", "getAllTrackManager error", e8);
            }
        }
        return mVarArr;
    }

    public final String b() {
        return this.f18916a.b();
    }

    public final String c() {
        return this.f18916a.c();
    }

    public final void e() {
        try {
            this.f18916a.i().a(new Runnable() { // from class: com.mbridge.msdk.e.m.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        t.a().c();
                        m.this.f18916a.o().b();
                    } catch (Exception e8) {
                        if (a.f18749a) {
                            Log.e("TrackManager", "flush error", e8);
                        }
                    }
                }
            });
        } catch (Exception e8) {
            if (a.f18749a) {
                Log.e("TrackManager", "flush error", e8);
            }
        }
    }

    public final JSONObject f() {
        return this.f18916a.f();
    }

    public final long[] g() {
        return this.f18916a.h().a();
    }

    private boolean b(e eVar) {
        try {
            return c(eVar);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(e eVar) {
        if (y.a(eVar) || TextUtils.isEmpty(eVar.a())) {
            return false;
        }
        return this.f18916a.a(eVar);
    }

    public static m a(String str, Context context, w wVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = f18915b;
        m mVar = concurrentHashMap.get(str);
        if (!y.a(mVar)) {
            return mVar;
        }
        m mVar2 = new m(str, context, wVar);
        concurrentHashMap.put(str, mVar2);
        return mVar2;
    }

    public final void a(JSONObject jSONObject) {
        this.f18916a.a(jSONObject);
    }

    public final boolean a(String str) {
        return b(new e(str));
    }

    public final void a(final e eVar) {
        if (this.f18916a.r()) {
            if (a.f18749a) {
                Log.d("TrackManager", "SDK is shutdown, track event will not be processed");
                return;
            }
            return;
        }
        try {
            this.f18916a.i().a(new Runnable() { // from class: com.mbridge.msdk.e.m.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (!m.this.c(eVar)) {
                        return;
                    }
                    m.this.f18916a.h().a(eVar);
                    eVar.c(m.this.f18916a.d().f18971f);
                    JSONObject d8 = eVar.d();
                    if (d8 != null) {
                        try {
                            d8.put("session_id", m.this.b());
                            long[] g8 = m.this.g();
                            d8.put("track_time", g8[0]);
                            d8.put("track_count", g8[1]);
                        } catch (JSONException e8) {
                            e8.printStackTrace();
                        }
                        eVar.a(d8);
                    }
                    m.this.f18916a.h().b(eVar);
                }
            });
        } catch (Exception e8) {
            if (a.f18749a) {
                Log.e("TrackManager", "trackEvent error", e8);
            }
        }
    }

    public final String a() {
        if (!this.f18916a.r()) {
            if (a.f18749a) {
                Log.e("TrackManager", "MBridgeTrackManager is already running");
            }
            return this.f18916a.b();
        }
        return this.f18916a.a();
    }
}
