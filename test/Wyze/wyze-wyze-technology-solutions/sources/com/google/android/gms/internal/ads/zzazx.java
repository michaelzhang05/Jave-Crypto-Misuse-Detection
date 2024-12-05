package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@zzard
/* loaded from: classes2.dex */
public final class zzazx {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f13145b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f13146c = false;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f13149f;
    private static Object a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static Clock f13147d = DefaultClock.c();

    /* renamed from: e, reason: collision with root package name */
    private static final Set<String> f13148e = new HashSet(Arrays.asList(new String[0]));

    public zzazx() {
        this(null);
    }

    public static boolean a() {
        boolean z;
        synchronized (a) {
            z = f13145b && f13146c;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void b(int i2, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i2);
        jsonWriter.endObject();
        c(jsonWriter, map);
        jsonWriter.endObject();
    }

    private static void c(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            if (!f13148e.contains(key)) {
                if (next.getValue() instanceof List) {
                    for (String str : (List) next.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(key);
                        jsonWriter.name("value").value(str);
                        jsonWriter.endObject();
                    }
                } else if (next.getValue() instanceof String) {
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(key);
                    jsonWriter.name("value").value((String) next.getValue());
                    jsonWriter.endObject();
                } else {
                    zzbad.g("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                    break;
                }
            }
        }
        jsonWriter.endArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void d(String str, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    private final void e(String str, l6 l6Var) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f13147d.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator<String> it = this.f13149f.iterator();
            while (it.hasNext()) {
                jsonWriter.value(it.next());
            }
            jsonWriter.endArray();
            l6Var.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            zzbad.c("unable to log", e2);
        }
        r(stringWriter.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void g(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name(DeepLinkIntentReceiver.DeepLinksKeys.URI).value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        c(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.a(bArr));
        }
        jsonWriter.endObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void k(byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String a2 = Base64Utils.a(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(a2);
        } else {
            String t = zzazt.t(a2);
            if (t != null) {
                jsonWriter.name("bodydigest").value(t);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    public static void l(boolean z) {
        synchronized (a) {
            f13145b = true;
            f13146c = z;
        }
    }

    private final void m(final String str, final String str2, final Map<String, ?> map, final byte[] bArr) {
        e("onNetworkRequest", new l6(str, str2, map, bArr) { // from class: com.google.android.gms.internal.ads.h6
            private final String a;

            /* renamed from: b, reason: collision with root package name */
            private final String f11513b;

            /* renamed from: c, reason: collision with root package name */
            private final Map f11514c;

            /* renamed from: d, reason: collision with root package name */
            private final byte[] f11515d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = str;
                this.f11513b = str2;
                this.f11514c = map;
                this.f11515d = bArr;
            }

            @Override // com.google.android.gms.internal.ads.l6
            public final void a(JsonWriter jsonWriter) {
                zzazx.g(this.a, this.f11513b, this.f11514c, this.f11515d, jsonWriter);
            }
        });
    }

    private final void n(final Map<String, ?> map, final int i2) {
        e("onNetworkResponse", new l6(i2, map) { // from class: com.google.android.gms.internal.ads.i6
            private final int a;

            /* renamed from: b, reason: collision with root package name */
            private final Map f11582b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = i2;
                this.f11582b = map;
            }

            @Override // com.google.android.gms.internal.ads.l6
            public final void a(JsonWriter jsonWriter) {
                zzazx.b(this.a, this.f11582b, jsonWriter);
            }
        });
    }

    public static boolean o(Context context) {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((Boolean) zzyt.e().c(zzacu.I1)).booleanValue()) {
            return false;
        }
        try {
            return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (Exception e2) {
            zzbad.d("Fail to determine debug setting.", e2);
            return false;
        }
    }

    private final void q(final String str) {
        e("onNetworkRequestError", new l6(str) { // from class: com.google.android.gms.internal.ads.k6
            private final String a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = str;
            }

            @Override // com.google.android.gms.internal.ads.l6
            public final void a(JsonWriter jsonWriter) {
                zzazx.d(this.a, jsonWriter);
            }
        });
    }

    private static synchronized void r(String str) {
        synchronized (zzazx.class) {
            zzbad.h("GMA Debug BEGIN");
            int i2 = 0;
            while (i2 < str.length()) {
                int i3 = i2 + 4000;
                String valueOf = String.valueOf(str.substring(i2, Math.min(i3, str.length())));
                zzbad.h(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i2 = i3;
            }
            zzbad.h("GMA Debug FINISH");
        }
    }

    public static void t() {
        synchronized (a) {
            f13145b = false;
            f13146c = false;
            zzbad.i("Ad debug logging enablement is out of date.");
        }
    }

    public static boolean u() {
        boolean z;
        synchronized (a) {
            z = f13145b;
        }
        return z;
    }

    public final void f(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (a()) {
            m(str, str2, map, bArr);
        }
    }

    public final void h(HttpURLConnection httpURLConnection, int i2) {
        if (a()) {
            String str = null;
            n(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i2);
            if (i2 < 200 || i2 >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    zzbad.i(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                q(str);
            }
        }
    }

    public final void i(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (a()) {
            m(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void j(Map<String, ?> map, int i2) {
        if (a()) {
            n(map, i2);
            if (i2 < 200 || i2 >= 300) {
                q(null);
            }
        }
    }

    public final void p(String str) {
        if (a() && str != null) {
            s(str.getBytes());
        }
    }

    public final void s(final byte[] bArr) {
        e("onNetworkResponseBody", new l6(bArr) { // from class: com.google.android.gms.internal.ads.j6
            private final byte[] a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = bArr;
            }

            @Override // com.google.android.gms.internal.ads.l6
            public final void a(JsonWriter jsonWriter) {
                zzazx.k(this.a, jsonWriter);
            }
        });
    }

    public zzazx(String str) {
        List<String> asList;
        if (!a()) {
            asList = new ArrayList<>();
        } else {
            String[] strArr = new String[1];
            String valueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
            asList = Arrays.asList(strArr);
        }
        this.f13149f = asList;
    }
}
