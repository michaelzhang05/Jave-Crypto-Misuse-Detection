package io.rakam.api;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Diagnostics.java */
/* loaded from: classes2.dex */
public class e {
    private static final h a = h.d();

    /* renamed from: b, reason: collision with root package name */
    protected static e f18462b;

    /* renamed from: d, reason: collision with root package name */
    private volatile String f18464d;

    /* renamed from: e, reason: collision with root package name */
    private volatile OkHttpClient f18465e;

    /* renamed from: f, reason: collision with root package name */
    private volatile String f18466f;

    /* renamed from: i, reason: collision with root package name */
    k f18469i = new k("diagnosticThread");

    /* renamed from: c, reason: collision with root package name */
    volatile boolean f18463c = false;

    /* renamed from: g, reason: collision with root package name */
    int f18467g = 50;

    /* renamed from: h, reason: collision with root package name */
    String f18468h = "https://diagnostics.rakam.io/event/batch";

    /* renamed from: j, reason: collision with root package name */
    List<String> f18470j = new ArrayList(this.f18467g);

    /* renamed from: k, reason: collision with root package name */
    Map<String, JSONObject> f18471k = new HashMap(this.f18467g);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Diagnostics.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f18472f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Throwable f18473g;

        a(String str, Throwable th) {
            this.f18472f = str;
            this.f18473g = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject = e.this.f18471k.get(this.f18472f);
            try {
                if (jSONObject == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", g.i0(this.f18472f));
                    jSONObject2.put("timestamp", System.currentTimeMillis());
                    jSONObject2.put("device_id", e.this.f18466f);
                    jSONObject2.put("count", 1);
                    Throwable th = this.f18473g;
                    if (th != null) {
                        String stackTraceString = Log.getStackTraceString(th);
                        if (!j.d(stackTraceString)) {
                            jSONObject2.put("stack_trace", g.i0(stackTraceString));
                        }
                    }
                    if (e.this.f18470j.size() >= e.this.f18467g) {
                        for (int i2 = 0; i2 < 5; i2++) {
                            e.this.f18471k.remove(e.this.f18470j.remove(0));
                        }
                    }
                    e.this.f18471k.put(this.f18472f, jSONObject2);
                    e.this.f18470j.add(this.f18472f);
                    return;
                }
                jSONObject.put("count", jSONObject.optInt("count", 0) + 1);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Diagnostics.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f18470j.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList(e.this.f18470j.size());
            Iterator<String> it = e.this.f18470j.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(new JSONObject().put("properties", e.this.f18471k.get(it.next())).put("collection", "android_sdk_error"));
                } catch (JSONException e2) {
                    e.a.b("RakamDiagnostics", "Unable to serialize events: " + e2.getMessage());
                }
            }
            if (new JSONArray((Collection) arrayList).length() > 0) {
                e.this.h(new JSONArray((Collection) arrayList));
            }
        }
    }

    private e() {
        this.f18469i.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized e e() {
        e eVar;
        synchronized (e.class) {
            if (f18462b == null) {
                f18462b = new e();
            }
            eVar = f18462b;
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e c(OkHttpClient okHttpClient, String str, String str2) {
        this.f18463c = true;
        this.f18464d = str;
        this.f18465e = okHttpClient;
        this.f18466f = str2;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e d() {
        if (this.f18463c && !j.d(this.f18464d) && this.f18465e != null && !j.d(this.f18466f)) {
            i(new b());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e f(String str) {
        return g(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e g(String str, Throwable th) {
        if (this.f18463c && !j.d(str) && !j.d(this.f18466f)) {
            i(new a(str, th));
        }
        return this;
    }

    protected void h(JSONArray jSONArray) {
        try {
            try {
                if (this.f18465e.newCall(new Request.Builder().url(this.f18468h).post(RequestBody.create(g.a, new JSONObject().put("api", new JSONObject().put("api_key", this.f18464d).put("library", new JSONObject().put("name", "rakam-android").put("version", "2.7.14")).put("upload_time", System.currentTimeMillis())).put("events", jSONArray).toString())).build()).execute().body().string().equals("1")) {
                    this.f18471k.clear();
                    this.f18470j.clear();
                }
            } catch (IOException | AssertionError | Exception unused) {
            }
        } catch (JSONException e2) {
            a.b("RakamDiagnostics", String.format("Failed to convert revenue object to JSON: %s", e2.toString()));
        }
    }

    protected void i(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        k kVar = this.f18469i;
        if (currentThread != kVar) {
            kVar.a(runnable);
        } else {
            runnable.run();
        }
    }
}
