package com.facebook.t.v;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.GraphRequest;
import com.facebook.internal.k;
import com.facebook.internal.x;
import com.facebook.t.u.f;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ModelManager.java */
/* loaded from: classes.dex */
public final class c {
    private static final Map<String, f> a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Integer f9658b = 259200000;

    /* renamed from: c, reason: collision with root package name */
    private static final List<String> f9659c = Arrays.asList("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* renamed from: d, reason: collision with root package name */
    private static final List<String> f9660d = Arrays.asList("none", "address", "health");

    /* compiled from: ModelManager.java */
    /* loaded from: classes.dex */
    static class a implements Runnable {
        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0050 A[Catch: all -> 0x006e, Exception -> 0x0072, TryCatch #2 {Exception -> 0x0072, all -> 0x006e, blocks: (B:6:0x000b, B:8:0x001d, B:11:0x0024, B:12:0x002f, B:14:0x003d, B:16:0x0043, B:18:0x0067, B:21:0x0049, B:24:0x0050, B:25:0x002a), top: B:5:0x000b }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r7 = this;
                java.lang.String r0 = "model_request_timestamp"
                java.lang.String r1 = "models"
                boolean r2 = com.facebook.internal.a0.f.a.c(r7)
                if (r2 == 0) goto Lb
                return
            Lb:
                android.content.Context r2 = com.facebook.f.e()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                java.lang.String r3 = "com.facebook.internal.MODEL_STORE"
                r4 = 0
                android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r4)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                r3 = 0
                java.lang.String r3 = r2.getString(r1, r3)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                if (r3 == 0) goto L2a
                boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                if (r4 == 0) goto L24
                goto L2a
            L24:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                r4.<init>(r3)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                goto L2f
            L2a:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                r4.<init>()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
            L2f:
                r5 = 0
                long r5 = r2.getLong(r0, r5)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                com.facebook.internal.k$d r3 = com.facebook.internal.k.d.ModelRequest     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                boolean r3 = com.facebook.internal.k.g(r3)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                if (r3 == 0) goto L49
                int r3 = r4.length()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                if (r3 == 0) goto L49
                boolean r3 = com.facebook.t.v.c.a(r5)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                if (r3 != 0) goto L67
            L49:
                org.json.JSONObject r4 = com.facebook.t.v.c.b()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                if (r4 != 0) goto L50
                return
            L50:
                android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                android.content.SharedPreferences$Editor r1 = r2.putString(r1, r3)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                r0.apply()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
            L67:
                com.facebook.t.v.c.c(r4)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                com.facebook.t.v.c.d()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72
                goto L72
            L6e:
                r0 = move-exception
                com.facebook.internal.a0.f.a.b(r0, r7)
            L72:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.t.v.c.a.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModelManager.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                com.facebook.t.x.d.a();
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModelManager.java */
    /* renamed from: com.facebook.t.v.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0154c implements Runnable {
        RunnableC0154c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                com.facebook.t.t.a.a();
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModelManager.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.values().length];
            a = iArr;
            try {
                iArr[e.MTML_INTEGRITY_DETECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ModelManager.java */
    /* loaded from: classes.dex */
    public enum e {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        public String d() {
            int i2 = d.a[ordinal()];
            return i2 != 1 ? i2 != 2 ? "Unknown" : "app_event_pred" : "integrity_detect";
        }

        public String f() {
            int i2 = d.a[ordinal()];
            if (i2 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i2 != 2) {
                return null;
            }
            return "MTML_APP_EVENT_PRED";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModelManager.java */
    /* loaded from: classes.dex */
    public static class f {
        String a;

        /* renamed from: b, reason: collision with root package name */
        String f9664b;

        /* renamed from: c, reason: collision with root package name */
        String f9665c;

        /* renamed from: d, reason: collision with root package name */
        int f9666d;

        /* renamed from: e, reason: collision with root package name */
        float[] f9667e;

        /* renamed from: f, reason: collision with root package name */
        File f9668f;

        /* renamed from: g, reason: collision with root package name */
        com.facebook.t.v.b f9669g;

        /* renamed from: h, reason: collision with root package name */
        private Runnable f9670h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ModelManager.java */
        /* loaded from: classes.dex */
        public static class a implements f.a {
            final /* synthetic */ List a;

            /* compiled from: ModelManager.java */
            /* renamed from: com.facebook.t.v.c$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class C0155a implements f.a {
                final /* synthetic */ f a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ com.facebook.t.v.b f9671b;

                C0155a(f fVar, com.facebook.t.v.b bVar) {
                    this.a = fVar;
                    this.f9671b = bVar;
                }

                @Override // com.facebook.t.u.f.a
                public void a(File file) {
                    f fVar = this.a;
                    fVar.f9669g = this.f9671b;
                    fVar.f9668f = file;
                    if (fVar.f9670h != null) {
                        this.a.f9670h.run();
                    }
                }
            }

            a(List list) {
                this.a = list;
            }

            @Override // com.facebook.t.u.f.a
            public void a(File file) {
                com.facebook.t.v.b a = com.facebook.t.v.b.a(file);
                if (a != null) {
                    for (f fVar : this.a) {
                        f.e(fVar.f9665c, fVar.a + "_" + fVar.f9666d + "_rule", new C0155a(fVar, a));
                    }
                }
            }
        }

        f(String str, String str2, String str3, int i2, float[] fArr) {
            this.a = str;
            this.f9664b = str2;
            this.f9665c = str3;
            this.f9666d = i2;
            this.f9667e = fArr;
        }

        static f c(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                return new f(jSONObject.getString("use_case"), jSONObject.getString("asset_uri"), jSONObject.optString("rules_uri", null), jSONObject.getInt("version_id"), c.e(jSONObject.getJSONArray("thresholds")));
            } catch (Exception unused) {
                return null;
            }
        }

        private static void d(String str, int i2) {
            File[] listFiles;
            File a2 = com.facebook.t.v.e.a();
            if (a2 == null || (listFiles = a2.listFiles()) == null || listFiles.length == 0) {
                return;
            }
            String str2 = str + "_" + i2;
            for (File file : listFiles) {
                String name = file.getName();
                if (name.startsWith(str) && !name.startsWith(str2)) {
                    file.delete();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void e(String str, String str2, f.a aVar) {
            File file = new File(com.facebook.t.v.e.a(), str2);
            if (str != null && !file.exists()) {
                new com.facebook.t.u.f(str, file, aVar).execute(new String[0]);
            } else {
                aVar.a(file);
            }
        }

        static void f(f fVar, List<f> list) {
            d(fVar.a, fVar.f9666d);
            e(fVar.f9664b, fVar.a + "_" + fVar.f9666d, new a(list));
        }

        f g(Runnable runnable) {
            this.f9670h = runnable;
            return this;
        }
    }

    static /* synthetic */ boolean a(long j2) {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return false;
        }
        try {
            return l(j2);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return false;
        }
    }

    static /* synthetic */ JSONObject b() {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return null;
        }
        try {
            return i();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return null;
        }
    }

    static /* synthetic */ void c(JSONObject jSONObject) {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return;
        }
        try {
            f(jSONObject);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
        }
    }

    static /* synthetic */ void d() {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return;
        }
        try {
            h();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
        }
    }

    static /* synthetic */ float[] e(JSONArray jSONArray) {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return null;
        }
        try {
            return m(jSONArray);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return null;
        }
    }

    private static void f(JSONObject jSONObject) {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    f c2 = f.c(jSONObject.getJSONObject(keys.next()));
                    if (c2 != null) {
                        a.put(c2.a, c2);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
        }
    }

    public static void g() {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return;
        }
        try {
            x.m0(new a());
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
        }
    }

    private static void h() {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String str = null;
            int i2 = 0;
            for (Map.Entry<String, f> entry : a.entrySet()) {
                String key = entry.getKey();
                if (key.equals(e.MTML_APP_EVENT_PREDICTION.f())) {
                    f value = entry.getValue();
                    str = value.f9664b;
                    i2 = Math.max(i2, value.f9666d);
                    if (k.g(k.d.SuggestedEvents) && k()) {
                        arrayList.add(value.g(new b()));
                    }
                }
                if (key.equals(e.MTML_INTEGRITY_DETECT.f())) {
                    f value2 = entry.getValue();
                    String str2 = value2.f9664b;
                    int max = Math.max(i2, value2.f9666d);
                    if (k.g(k.d.IntelligentIntegrity)) {
                        arrayList.add(value2.g(new RunnableC0154c()));
                    }
                    str = str2;
                    i2 = max;
                }
            }
            if (str == null || i2 <= 0 || arrayList.isEmpty()) {
                return;
            }
            f.f(new f("MTML", str, null, i2, null), arrayList);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
        }
    }

    private static JSONObject i() {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            GraphRequest J = GraphRequest.J(null, String.format("%s/model_asset", com.facebook.f.f()), null);
            J.b0(true);
            J.a0(bundle);
            JSONObject h2 = J.g().h();
            if (h2 == null) {
                return null;
            }
            return n(h2);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return null;
        }
    }

    public static File j(e eVar) {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return null;
        }
        try {
            f fVar = a.get(eVar.f());
            if (fVar == null) {
                return null;
            }
            return fVar.f9668f;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return null;
        }
    }

    private static boolean k() {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return false;
        }
        try {
            Locale C = x.C();
            if (C != null) {
                if (!C.getLanguage().contains("en")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return false;
        }
    }

    private static boolean l(long j2) {
        if (com.facebook.internal.a0.f.a.c(c.class) || j2 == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j2 < ((long) f9658b.intValue());
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return false;
        }
    }

    private static float[] m(JSONArray jSONArray) {
        if (com.facebook.internal.a0.f.a.c(c.class) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    fArr[i2] = Float.parseFloat(jSONArray.getString(i2));
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return null;
        }
    }

    private static JSONObject n(JSONObject jSONObject) {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return null;
        }
    }

    public static String[] o(e eVar, float[][] fArr, String[] strArr) {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return null;
        }
        try {
            f fVar = a.get(eVar.f());
            if (fVar != null && fVar.f9669g != null) {
                int length = strArr.length;
                int length2 = fArr[0].length;
                com.facebook.t.v.a aVar = new com.facebook.t.v.a(new int[]{length, length2});
                for (int i2 = 0; i2 < length; i2++) {
                    System.arraycopy(fArr[i2], 0, aVar.b(), i2 * length2, length2);
                }
                com.facebook.t.v.a d2 = fVar.f9669g.d(aVar, strArr, eVar.d());
                float[] fArr2 = fVar.f9667e;
                if (d2 != null && fArr2 != null && d2.b().length != 0 && fArr2.length != 0) {
                    int i3 = d.a[eVar.ordinal()];
                    if (i3 == 1) {
                        return p(d2, fArr2);
                    }
                    if (i3 != 2) {
                        return null;
                    }
                    return q(d2, fArr2);
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return null;
        }
    }

    private static String[] p(com.facebook.t.v.a aVar, float[] fArr) {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return null;
        }
        try {
            int c2 = aVar.c(0);
            int c3 = aVar.c(1);
            float[] b2 = aVar.b();
            String[] strArr = new String[c2];
            if (c3 != fArr.length) {
                return null;
            }
            for (int i2 = 0; i2 < c2; i2++) {
                strArr[i2] = "none";
                for (int i3 = 0; i3 < fArr.length; i3++) {
                    if (b2[(i2 * c3) + i3] >= fArr[i3]) {
                        strArr[i2] = f9660d.get(i3);
                    }
                }
            }
            return strArr;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return null;
        }
    }

    private static String[] q(com.facebook.t.v.a aVar, float[] fArr) {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return null;
        }
        try {
            int c2 = aVar.c(0);
            int c3 = aVar.c(1);
            float[] b2 = aVar.b();
            String[] strArr = new String[c2];
            if (c3 != fArr.length) {
                return null;
            }
            for (int i2 = 0; i2 < c2; i2++) {
                strArr[i2] = "other";
                for (int i3 = 0; i3 < fArr.length; i3++) {
                    if (b2[(i2 * c3) + i3] >= fArr[i3]) {
                        strArr[i2] = f9659c.get(i3);
                    }
                }
            }
            return strArr;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return null;
        }
    }
}
