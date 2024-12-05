package com.facebook.internal.a0;

import android.os.Build;
import com.facebook.internal.x;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InstrumentData.java */
/* loaded from: classes.dex */
public final class b {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private c f9111b;

    /* renamed from: c, reason: collision with root package name */
    private JSONArray f9112c;

    /* renamed from: d, reason: collision with root package name */
    private String f9113d;

    /* renamed from: e, reason: collision with root package name */
    private String f9114e;

    /* renamed from: f, reason: collision with root package name */
    private String f9115f;

    /* renamed from: g, reason: collision with root package name */
    private Long f9116g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InstrumentData.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.Analysis.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.CrashReport.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.CrashShield.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.ThreadCheck.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: InstrumentData.java */
    /* renamed from: com.facebook.internal.a0.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0132b {
        public static b a(Throwable th, c cVar) {
            return new b(th, cVar, null);
        }

        public static b b(JSONArray jSONArray) {
            return new b(jSONArray, (a) null);
        }

        public static b c(File file) {
            return new b(file, (a) null);
        }
    }

    /* compiled from: InstrumentData.java */
    /* loaded from: classes.dex */
    public enum c {
        Unknown,
        Analysis,
        CrashReport,
        CrashShield,
        ThreadCheck;

        public String d() {
            int i2 = a.a[ordinal()];
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "analysis_log_";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i2 = a.a[ordinal()];
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "Analysis";
        }
    }

    /* synthetic */ b(File file, a aVar) {
        this(file);
    }

    private JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f9112c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l = this.f9116g;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f9113d;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l = this.f9116g;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            String str2 = this.f9114e;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.f9115f;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            c cVar = this.f9111b;
            if (cVar != null) {
                jSONObject.put("type", cVar);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private JSONObject e() {
        int i2 = a.a[this.f9111b.ordinal()];
        if (i2 == 1) {
            return c();
        }
        if (i2 == 2 || i2 == 3 || i2 == 4) {
            return d();
        }
        return null;
    }

    private static c f(String str) {
        if (str.startsWith("crash_log_")) {
            return c.CrashReport;
        }
        if (str.startsWith("shield_log_")) {
            return c.CrashShield;
        }
        if (str.startsWith("thread_check_log_")) {
            return c.ThreadCheck;
        }
        if (str.startsWith("analysis_log_")) {
            return c.Analysis;
        }
        return c.Unknown;
    }

    public void a() {
        d.a(this.a);
    }

    public int b(b bVar) {
        Long l = this.f9116g;
        if (l == null) {
            return -1;
        }
        Long l2 = bVar.f9116g;
        if (l2 == null) {
            return 1;
        }
        return l2.compareTo(l);
    }

    public boolean g() {
        int i2 = a.a[this.f9111b.ordinal()];
        return i2 != 1 ? ((i2 != 2 && i2 != 3 && i2 != 4) || this.f9115f == null || this.f9116g == null) ? false : true : (this.f9112c == null || this.f9116g == null) ? false : true;
    }

    public void h() {
        if (g()) {
            d.j(this.a, toString());
        }
    }

    public String toString() {
        JSONObject e2 = e();
        if (e2 == null) {
            return null;
        }
        return e2.toString();
    }

    /* synthetic */ b(Throwable th, c cVar, a aVar) {
        this(th, cVar);
    }

    /* synthetic */ b(JSONArray jSONArray, a aVar) {
        this(jSONArray);
    }

    private b(JSONArray jSONArray) {
        this.f9111b = c.Analysis;
        this.f9116g = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f9112c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(this.f9116g.toString());
        stringBuffer.append(".json");
        this.a = stringBuffer.toString();
    }

    private b(Throwable th, c cVar) {
        this.f9111b = cVar;
        this.f9113d = x.s();
        this.f9114e = d.b(th);
        this.f9115f = d.d(th);
        this.f9116g = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cVar.d());
        stringBuffer.append(this.f9116g.toString());
        stringBuffer.append(".json");
        this.a = stringBuffer.toString();
    }

    private b(File file) {
        String name = file.getName();
        this.a = name;
        this.f9111b = f(name);
        JSONObject h2 = d.h(this.a, true);
        if (h2 != null) {
            this.f9116g = Long.valueOf(h2.optLong("timestamp", 0L));
            this.f9113d = h2.optString("app_version", null);
            this.f9114e = h2.optString("reason", null);
            this.f9115f = h2.optString("callstack", null);
            this.f9112c = h2.optJSONArray("feature_names");
        }
    }
}
