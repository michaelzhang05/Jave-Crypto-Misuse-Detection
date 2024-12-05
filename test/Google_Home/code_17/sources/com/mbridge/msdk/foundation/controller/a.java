package com.mbridge.msdk.foundation.controller;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.z;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20107a = c.class.getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    public static HashMap<String, String> f20108b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    protected String f20109c;

    /* renamed from: d, reason: collision with root package name */
    protected Context f20110d;

    /* renamed from: e, reason: collision with root package name */
    protected String f20111e;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference<Activity> f20113g;

    /* renamed from: h, reason: collision with root package name */
    private String f20114h;

    /* renamed from: i, reason: collision with root package name */
    private int f20115i;

    /* renamed from: l, reason: collision with root package name */
    private String f20118l;

    /* renamed from: m, reason: collision with root package name */
    private String f20119m;

    /* renamed from: n, reason: collision with root package name */
    private int f20120n;

    /* renamed from: p, reason: collision with root package name */
    private WeakReference<Context> f20122p;

    /* renamed from: q, reason: collision with root package name */
    private JSONObject f20123q;

    /* renamed from: s, reason: collision with root package name */
    private String f20125s;

    /* renamed from: f, reason: collision with root package name */
    private final g f20112f = new g();

    /* renamed from: j, reason: collision with root package name */
    private JSONObject f20116j = new JSONObject();

    /* renamed from: k, reason: collision with root package name */
    private boolean f20117k = false;

    /* renamed from: o, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f20121o = new ConcurrentHashMap<>();

    /* renamed from: r, reason: collision with root package name */
    private int f20124r = 0;

    /* renamed from: com.mbridge.msdk.foundation.controller.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0392a {
    }

    public final WeakReference<Activity> a() {
        return this.f20113g;
    }

    protected abstract void a(InterfaceC0392a interfaceC0392a);

    public final String b() {
        if (!TextUtils.isEmpty(this.f20118l)) {
            return this.f20118l;
        }
        Context context = this.f20110d;
        if (context != null) {
            return (String) al.a(context, "sp_appKey", "");
        }
        return null;
    }

    public final Context c() {
        return this.f20110d;
    }

    public final g d() {
        return this.f20112f;
    }

    public final Context e() {
        WeakReference<Context> weakReference = this.f20122p;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final int f() {
        return this.f20115i;
    }

    public final String g() {
        try {
            if (!TextUtils.isEmpty(this.f20111e)) {
                return this.f20111e;
            }
            Context context = this.f20110d;
            if (context != null) {
                String packageName = context.getPackageName();
                this.f20111e = packageName;
                return packageName;
            }
            return null;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final String h() {
        if (!TextUtils.isEmpty(this.f20119m)) {
            return this.f20119m;
        }
        Context context = this.f20110d;
        if (context != null) {
            return (String) al.a(context, "sp_wx_appKey", "");
        }
        return null;
    }

    public final JSONObject i() {
        return this.f20123q;
    }

    public final int j() {
        return this.f20124r;
    }

    public final String k() {
        try {
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (!TextUtils.isEmpty(this.f20109c)) {
            return this.f20109c;
        }
        Context context = this.f20110d;
        if (context != null) {
            return (String) al.a(context, "sp_appId", "");
        }
        return "";
    }

    public final String l() {
        if (!TextUtils.isEmpty(this.f20125s)) {
            return this.f20125s;
        }
        try {
            String md5 = SameMD5.getMD5(c.m().k() + c.m().b());
            this.f20125s = md5;
            return md5;
        } catch (Exception unused) {
            return "";
        }
    }

    public final void a(WeakReference<Activity> weakReference) {
        this.f20113g = weakReference;
    }

    public final void c(int i8) {
        this.f20124r = i8;
    }

    public final void d(String str) {
        Context context;
        try {
            this.f20109c = str;
            if (TextUtils.isEmpty(str) || (context = this.f20110d) == null) {
                return;
            }
            al.b(context, "sp_appId", str);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void e(String str) {
        Context context;
        try {
            this.f20118l = str;
            if (TextUtils.isEmpty(str) || (context = this.f20110d) == null) {
                return;
            }
            al.b(context, "sp_appKey", str);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f20111e = str;
    }

    public final void a(Context context) {
        if (context instanceof Activity) {
            this.f20122p = new WeakReference<>(context);
        }
    }

    public final void c(String str) {
        Context context;
        try {
            this.f20114h = str;
            if (TextUtils.isEmpty(str) || (context = this.f20110d) == null) {
                return;
            }
            al.b(context, "applicationIds", str);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void a(int i8) {
        this.f20115i = i8;
    }

    public final void b(int i8) {
        this.f20120n = i8;
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f20119m = str;
            Context context = this.f20110d;
            if (context != null) {
                al.b(context, "sp_wx_appKey", str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void b(String str) {
        try {
            if (this.f20121o != null && !TextUtils.isEmpty(str) && this.f20121o.containsKey(str)) {
                this.f20121o.remove(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void b(Context context) {
        this.f20110d = context;
    }

    public final BitmapDrawable a(String str, int i8) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.f20121o) == null || !concurrentHashMap.containsKey(str) || !af.a().a("w_m_r_l", true)) {
            return null;
        }
        String str2 = this.f20121o.get(str);
        BitmapDrawable n8 = ai.n(str2);
        k.a(str, i8, TextUtils.isEmpty(str2) ? 2 : 1, TextUtils.isEmpty(str2) ? "get watermark failed" : n8 != null ? "" : "str to bitmap failed", n8 == null ? 2 : 1, str2);
        return n8;
    }

    public final void a(JSONObject jSONObject) {
        this.f20123q = jSONObject;
    }

    public final void a(final InterfaceC0392a interfaceC0392a, final Handler handler) {
        if (this.f20117k) {
            return;
        }
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.a() && com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                Object a8 = al.a(this.f20110d, MBridgeConstans.SP_GA_ID, "");
                Object a9 = al.a(this.f20110d, MBridgeConstans.SP_GA_ID_LIMIT, 0);
                if (a8 instanceof String) {
                    String str = (String) a8;
                    if (!TextUtils.isEmpty(str)) {
                        com.mbridge.msdk.foundation.tools.e.a(str);
                    } else {
                        com.mbridge.msdk.foundation.tools.e.c();
                    }
                    if (a9 instanceof Integer) {
                        com.mbridge.msdk.foundation.tools.e.a(((Integer) a9).intValue());
                    }
                }
            }
        } catch (Exception e8) {
            ad.b(f20107a, e8.getMessage());
        }
        try {
            JSONObject jSONObject = new JSONObject();
            this.f20123q = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e9) {
            ad.b(f20107a, e9.getMessage());
        }
        new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.a.1
            @Override // java.lang.Runnable
            public final void run() {
                int i8;
                try {
                    z.o(a.this.f20110d);
                    a.this.a(interfaceC0392a);
                    a aVar = a.this;
                    h.a(aVar.f20110d, aVar.f20109c);
                } catch (Exception e10) {
                    ad.b(a.f20107a, e10.getMessage());
                }
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                    try {
                        if (a.this.f20110d.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                            i8 = 1;
                        } else {
                            i8 = 2;
                        }
                        z.c(i8);
                    } catch (PackageManager.NameNotFoundException unused) {
                        z.c(0);
                    } catch (Throwable th) {
                        ad.b(a.f20107a, th.getMessage());
                    }
                }
                try {
                    com.mbridge.msdk.c.g b8 = h.a().b(c.m().k());
                    if (b8 == null) {
                        h.a();
                        b8 = i.a();
                    }
                    Message obtain = Message.obtain();
                    obtain.obj = b8;
                    obtain.what = 9;
                    handler.sendMessage(obtain);
                } catch (Exception e11) {
                    ad.b(a.f20107a, e11.getMessage());
                }
            }
        }).start();
    }

    public final void a(String str, JSONObject jSONObject) {
        if (af.a().a("w_m_r_l", true)) {
            try {
                if (this.f20116j == null) {
                    this.f20116j = jSONObject;
                } else if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        this.f20116j.put(next, jSONObject.get(next));
                    }
                }
                if (this.f20116j.has(MBridgeConstans.EXTRA_KEY_WM)) {
                    if (this.f20121o == null) {
                        this.f20121o = new ConcurrentHashMap<>();
                    }
                    this.f20121o.put(str, this.f20116j.getString(MBridgeConstans.EXTRA_KEY_WM));
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }
}
