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
    public static final String f19052a = c.class.getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    public static HashMap<String, String> f19053b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    protected String f19054c;

    /* renamed from: d, reason: collision with root package name */
    protected Context f19055d;

    /* renamed from: e, reason: collision with root package name */
    protected String f19056e;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference<Activity> f19058g;

    /* renamed from: h, reason: collision with root package name */
    private String f19059h;

    /* renamed from: i, reason: collision with root package name */
    private int f19060i;

    /* renamed from: l, reason: collision with root package name */
    private String f19063l;

    /* renamed from: m, reason: collision with root package name */
    private String f19064m;

    /* renamed from: n, reason: collision with root package name */
    private int f19065n;

    /* renamed from: p, reason: collision with root package name */
    private WeakReference<Context> f19067p;

    /* renamed from: q, reason: collision with root package name */
    private JSONObject f19068q;

    /* renamed from: s, reason: collision with root package name */
    private String f19070s;

    /* renamed from: f, reason: collision with root package name */
    private final g f19057f = new g();

    /* renamed from: j, reason: collision with root package name */
    private JSONObject f19061j = new JSONObject();

    /* renamed from: k, reason: collision with root package name */
    private boolean f19062k = false;

    /* renamed from: o, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f19066o = new ConcurrentHashMap<>();

    /* renamed from: r, reason: collision with root package name */
    private int f19069r = 0;

    /* renamed from: com.mbridge.msdk.foundation.controller.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0396a {
    }

    public final WeakReference<Activity> a() {
        return this.f19058g;
    }

    protected abstract void a(InterfaceC0396a interfaceC0396a);

    public final String b() {
        if (!TextUtils.isEmpty(this.f19063l)) {
            return this.f19063l;
        }
        Context context = this.f19055d;
        if (context != null) {
            return (String) al.a(context, "sp_appKey", "");
        }
        return null;
    }

    public final Context c() {
        return this.f19055d;
    }

    public final g d() {
        return this.f19057f;
    }

    public final Context e() {
        WeakReference<Context> weakReference = this.f19067p;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final int f() {
        return this.f19060i;
    }

    public final String g() {
        try {
            if (!TextUtils.isEmpty(this.f19056e)) {
                return this.f19056e;
            }
            Context context = this.f19055d;
            if (context != null) {
                String packageName = context.getPackageName();
                this.f19056e = packageName;
                return packageName;
            }
            return null;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final String h() {
        if (!TextUtils.isEmpty(this.f19064m)) {
            return this.f19064m;
        }
        Context context = this.f19055d;
        if (context != null) {
            return (String) al.a(context, "sp_wx_appKey", "");
        }
        return null;
    }

    public final JSONObject i() {
        return this.f19068q;
    }

    public final int j() {
        return this.f19069r;
    }

    public final String k() {
        try {
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (!TextUtils.isEmpty(this.f19054c)) {
            return this.f19054c;
        }
        Context context = this.f19055d;
        if (context != null) {
            return (String) al.a(context, "sp_appId", "");
        }
        return "";
    }

    public final String l() {
        if (!TextUtils.isEmpty(this.f19070s)) {
            return this.f19070s;
        }
        try {
            String md5 = SameMD5.getMD5(c.m().k() + c.m().b());
            this.f19070s = md5;
            return md5;
        } catch (Exception unused) {
            return "";
        }
    }

    public final void a(WeakReference<Activity> weakReference) {
        this.f19058g = weakReference;
    }

    public final void c(int i8) {
        this.f19069r = i8;
    }

    public final void d(String str) {
        Context context;
        try {
            this.f19054c = str;
            if (TextUtils.isEmpty(str) || (context = this.f19055d) == null) {
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
            this.f19063l = str;
            if (TextUtils.isEmpty(str) || (context = this.f19055d) == null) {
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
        this.f19056e = str;
    }

    public final void a(Context context) {
        if (context instanceof Activity) {
            this.f19067p = new WeakReference<>(context);
        }
    }

    public final void c(String str) {
        Context context;
        try {
            this.f19059h = str;
            if (TextUtils.isEmpty(str) || (context = this.f19055d) == null) {
                return;
            }
            al.b(context, "applicationIds", str);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void a(int i8) {
        this.f19060i = i8;
    }

    public final void b(int i8) {
        this.f19065n = i8;
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f19064m = str;
            Context context = this.f19055d;
            if (context != null) {
                al.b(context, "sp_wx_appKey", str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void b(String str) {
        try {
            if (this.f19066o != null && !TextUtils.isEmpty(str) && this.f19066o.containsKey(str)) {
                this.f19066o.remove(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void b(Context context) {
        this.f19055d = context;
    }

    public final BitmapDrawable a(String str, int i8) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.f19066o) == null || !concurrentHashMap.containsKey(str) || !af.a().a("w_m_r_l", true)) {
            return null;
        }
        String str2 = this.f19066o.get(str);
        BitmapDrawable n8 = ai.n(str2);
        k.a(str, i8, TextUtils.isEmpty(str2) ? 2 : 1, TextUtils.isEmpty(str2) ? "get watermark failed" : n8 != null ? "" : "str to bitmap failed", n8 == null ? 2 : 1, str2);
        return n8;
    }

    public final void a(JSONObject jSONObject) {
        this.f19068q = jSONObject;
    }

    public final void a(final InterfaceC0396a interfaceC0396a, final Handler handler) {
        if (this.f19062k) {
            return;
        }
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.a() && com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                Object a8 = al.a(this.f19055d, MBridgeConstans.SP_GA_ID, "");
                Object a9 = al.a(this.f19055d, MBridgeConstans.SP_GA_ID_LIMIT, 0);
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
            ad.b(f19052a, e8.getMessage());
        }
        try {
            JSONObject jSONObject = new JSONObject();
            this.f19068q = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e9) {
            ad.b(f19052a, e9.getMessage());
        }
        new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.a.1
            @Override // java.lang.Runnable
            public final void run() {
                int i8;
                try {
                    z.o(a.this.f19055d);
                    a.this.a(interfaceC0396a);
                    a aVar = a.this;
                    h.a(aVar.f19055d, aVar.f19054c);
                } catch (Exception e10) {
                    ad.b(a.f19052a, e10.getMessage());
                }
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                    try {
                        if (a.this.f19055d.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                            i8 = 1;
                        } else {
                            i8 = 2;
                        }
                        z.c(i8);
                    } catch (PackageManager.NameNotFoundException unused) {
                        z.c(0);
                    } catch (Throwable th) {
                        ad.b(a.f19052a, th.getMessage());
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
                    ad.b(a.f19052a, e11.getMessage());
                }
            }
        }).start();
    }

    public final void a(String str, JSONObject jSONObject) {
        if (af.a().a("w_m_r_l", true)) {
            try {
                if (this.f19061j == null) {
                    this.f19061j = jSONObject;
                } else if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        this.f19061j.put(next, jSONObject.get(next));
                    }
                }
                if (this.f19061j.has(MBridgeConstans.EXTRA_KEY_WM)) {
                    if (this.f19066o == null) {
                        this.f19066o = new ConcurrentHashMap<>();
                    }
                    this.f19066o.put(str, this.f19061j.getString(MBridgeConstans.EXTRA_KEY_WM));
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }
}
