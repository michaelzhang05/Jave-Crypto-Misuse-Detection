package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import j$.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class af {

    /* renamed from: a */
    public volatile JSONObject f19982a;

    /* renamed from: b */
    private final Object f19983b;

    /* renamed from: c */
    private final Object f19984c;

    /* renamed from: d */
    private final Object f19985d;

    /* renamed from: e */
    private final Object f19986e;

    /* renamed from: f */
    private String f19987f;

    /* renamed from: g */
    private volatile ConcurrentHashMap<String, Boolean> f19988g;

    /* renamed from: h */
    private volatile ConcurrentHashMap<String, Integer> f19989h;

    /* renamed from: i */
    private volatile com.mbridge.msdk.c.g f19990i;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private static final af f19991a = new af();

        public static /* synthetic */ af a() {
            return f19991a;
        }
    }

    /* synthetic */ af(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static af a() {
        return a.f19991a;
    }

    private int b(String str, String str2, int i8) {
        if (a(true)) {
            return i8;
        }
        try {
            String optString = this.f19982a.optString(str, "");
            if (TextUtils.isEmpty(optString)) {
                return i8;
            }
            String a8 = x.a(optString);
            return TextUtils.isEmpty(a8) ? i8 : new JSONObject(a8).optInt(str2, i8);
        } catch (Exception unused) {
            return i8;
        }
    }

    private ConcurrentHashMap<String, Boolean> c() {
        synchronized (this.f19985d) {
            try {
                if (this.f19988g == null) {
                    this.f19988g = new ConcurrentHashMap<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f19988g;
    }

    private af() {
        this.f19983b = new Object();
        this.f19984c = new Object();
        this.f19985d = new Object();
        this.f19986e = new Object();
    }

    private static Integer a(String str, ConcurrentHashMap<String, Integer> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final int a(String str, int i8) {
        Integer valueOf;
        try {
            if (TextUtils.isEmpty(str)) {
                return i8;
            }
            ConcurrentHashMap<String, Integer> b8 = b();
            Integer a8 = a(str, b8);
            if (a8 != null) {
                return a8.intValue();
            }
            try {
                valueOf = Integer.valueOf(b(str, i8));
            } catch (Exception unused) {
                valueOf = Integer.valueOf(i8);
            }
            b8.put(str, valueOf);
            return valueOf.intValue();
        } catch (Exception unused2) {
            return i8;
        }
    }

    private int b(String str, int i8) {
        if (a(true)) {
            return i8;
        }
        try {
            return this.f19982a.optInt(str, i8);
        } catch (Exception unused) {
            return i8;
        }
    }

    private ConcurrentHashMap<String, Integer> b() {
        synchronized (this.f19983b) {
            try {
                if (this.f19989h == null) {
                    this.f19989h = new ConcurrentHashMap<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f19989h;
    }

    public final int a(String str, String str2, int i8) {
        Integer valueOf;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                String str3 = str + "_" + str2;
                ConcurrentHashMap<String, Integer> b8 = b();
                Integer a8 = a(str3, b8);
                if (a8 != null) {
                    return a8.intValue();
                }
                try {
                    valueOf = Integer.valueOf(b(str, str2, i8));
                } catch (Exception unused) {
                    valueOf = Integer.valueOf(i8);
                }
                b8.put(str3, valueOf);
                return valueOf.intValue();
            }
            return a(str2, i8);
        } catch (Exception unused2) {
            return i8;
        }
    }

    private static Boolean b(String str, ConcurrentHashMap<String, Boolean> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean b(String str, boolean z8, boolean z9) {
        if (a(z9)) {
            return z8;
        }
        try {
            return this.f19982a.optInt(str, z8 ? 1 : 0) != 0;
        } catch (Exception unused) {
            return z8;
        }
    }

    public final boolean a(String str, boolean z8) {
        try {
            return a(str, z8, true);
        } catch (Exception unused) {
            return z8;
        }
    }

    public final boolean a(String str, boolean z8, boolean z9) {
        Boolean valueOf;
        Boolean b8;
        try {
            if (TextUtils.isEmpty(str)) {
                return z8;
            }
            ConcurrentHashMap<String, Boolean> c8 = c();
            if (z9 && (b8 = b(str, c8)) != null) {
                return b8.booleanValue();
            }
            try {
                valueOf = Boolean.valueOf(b(str, z8, z9));
            } catch (Exception unused) {
                valueOf = Boolean.valueOf(z8);
            }
            c8.put(str, valueOf);
            return valueOf.booleanValue();
        } catch (Exception unused2) {
            return z8;
        }
    }

    private boolean a(boolean z8) {
        synchronized (this.f19986e) {
            if (this.f19990i == null || this.f19990i.I() == 1 || !z8) {
                try {
                    if (TextUtils.isEmpty(this.f19987f)) {
                        this.f19987f = com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.SDK_APP_ID);
                    }
                    this.f19990i = com.mbridge.msdk.c.h.a().a(this.f19987f);
                } catch (Exception unused) {
                    this.f19990i = null;
                }
            }
            if (this.f19990i != null) {
                this.f19982a = this.f19990i.al();
            }
        }
        return this.f19990i == null || this.f19982a == null;
    }
}
