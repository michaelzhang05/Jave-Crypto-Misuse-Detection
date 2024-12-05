package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import cm.aptoide.pt.networking.BodyInterceptorV3;
import com.facebook.h;
import com.facebook.internal.v;
import com.facebook.internal.x;
import com.facebook.internal.y;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GraphRequest {
    public static final String a = "GraphRequest";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9001b;

    /* renamed from: c, reason: collision with root package name */
    private static String f9002c;

    /* renamed from: d, reason: collision with root package name */
    private static Pattern f9003d = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");

    /* renamed from: e, reason: collision with root package name */
    private static volatile String f9004e;

    /* renamed from: f, reason: collision with root package name */
    private AccessToken f9005f;

    /* renamed from: g, reason: collision with root package name */
    private com.facebook.j f9006g;

    /* renamed from: h, reason: collision with root package name */
    private String f9007h;

    /* renamed from: i, reason: collision with root package name */
    private JSONObject f9008i;

    /* renamed from: j, reason: collision with root package name */
    private String f9009j;

    /* renamed from: k, reason: collision with root package name */
    private String f9010k;
    private boolean l;
    private Bundle m;
    private f n;
    private String o;
    private Object p;
    private String q;
    private boolean r;

    /* loaded from: classes.dex */
    public static class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ParcelableResourceWithMimeType> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        private final String f9011f;

        /* renamed from: g, reason: collision with root package name */
        private final RESOURCE f9012g;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<ParcelableResourceWithMimeType> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType createFromParcel(Parcel parcel) {
                return new ParcelableResourceWithMimeType(parcel, (a) null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType[] newArray(int i2) {
                return new ParcelableResourceWithMimeType[i2];
            }
        }

        /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, a aVar) {
            this(parcel);
        }

        public String a() {
            return this.f9011f;
        }

        public RESOURCE b() {
            return this.f9012g;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f9011f);
            parcel.writeParcelable(this.f9012g, i2);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, String str) {
            this.f9011f = str;
            this.f9012g = resource;
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.f9011f = parcel.readString();
            this.f9012g = (RESOURCE) parcel.readParcelable(com.facebook.f.e().getClassLoader());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements f {
        final /* synthetic */ g a;

        a(g gVar) {
            this.a = gVar;
        }

        @Override // com.facebook.GraphRequest.f
        public void b(com.facebook.i iVar) {
            g gVar = this.a;
            if (gVar != null) {
                gVar.a(iVar.h(), iVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements f {
        final /* synthetic */ f a;

        b(f fVar) {
            this.a = fVar;
        }

        @Override // com.facebook.GraphRequest.f
        public void b(com.facebook.i iVar) {
            JSONObject h2 = iVar.h();
            JSONObject optJSONObject = h2 != null ? h2.optJSONObject("__debug__") : null;
            JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("messages") : null;
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                    String optString = optJSONObject2 != null ? optJSONObject2.optString("message") : null;
                    String optString2 = optJSONObject2 != null ? optJSONObject2.optString("type") : null;
                    String optString3 = optJSONObject2 != null ? optJSONObject2.optString("link") : null;
                    if (optString != null && optString2 != null) {
                        l lVar = l.GRAPH_API_DEBUG_INFO;
                        if (optString2.equals("warning")) {
                            lVar = l.GRAPH_API_DEBUG_WARNING;
                        }
                        if (!x.Q(optString3)) {
                            optString = optString + " Link: " + optString3;
                        }
                        com.facebook.internal.r.g(lVar, GraphRequest.a, optString);
                    }
                }
            }
            f fVar = this.a;
            if (fVar != null) {
                fVar.b(iVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f9014f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.facebook.h f9015g;

        c(ArrayList arrayList, com.facebook.h hVar) {
            this.f9014f = arrayList;
            this.f9015g = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                Iterator it = this.f9014f.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    ((f) pair.first).b((com.facebook.i) pair.second);
                }
                Iterator<h.a> it2 = this.f9015g.L().iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.f9015g);
                }
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements h {
        final /* synthetic */ ArrayList a;

        d(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // com.facebook.GraphRequest.h
        public void a(String str, String str2) throws IOException {
            this.a.add(String.format(Locale.US, "%s=%s", str, URLEncoder.encode(str2, "UTF-8")));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e {
        private final GraphRequest a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f9017b;

        public e(GraphRequest graphRequest, Object obj) {
            this.a = graphRequest;
            this.f9017b = obj;
        }

        public GraphRequest a() {
            return this.a;
        }

        public Object b() {
            return this.f9017b;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void b(com.facebook.i iVar);
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(JSONObject jSONObject, com.facebook.i iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface h {
        void a(String str, String str2) throws IOException;
    }

    /* loaded from: classes.dex */
    public interface i extends f {
        void a(long j2, long j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class j implements h {
        private final OutputStream a;

        /* renamed from: b, reason: collision with root package name */
        private final com.facebook.internal.r f9018b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9019c = true;

        /* renamed from: d, reason: collision with root package name */
        private boolean f9020d;

        public j(OutputStream outputStream, com.facebook.internal.r rVar, boolean z) {
            this.f9020d = false;
            this.a = outputStream;
            this.f9018b = rVar;
            this.f9020d = z;
        }

        private RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        @Override // com.facebook.GraphRequest.h
        public void a(String str, String str2) throws IOException {
            f(str, null, null);
            i("%s", str2);
            k();
            com.facebook.internal.r rVar = this.f9018b;
            if (rVar != null) {
                rVar.c("    " + str, str2);
            }
        }

        public void c(String str, Object... objArr) throws IOException {
            if (!this.f9020d) {
                if (this.f9019c) {
                    this.a.write("--".getBytes());
                    this.a.write(GraphRequest.f9001b.getBytes());
                    this.a.write("\r\n".getBytes());
                    this.f9019c = false;
                }
                this.a.write(String.format(str, objArr).getBytes());
                return;
            }
            this.a.write(URLEncoder.encode(String.format(Locale.US, str, objArr), "UTF-8").getBytes());
        }

        public void d(String str, Bitmap bitmap) throws IOException {
            f(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.a);
            i(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
            k();
            com.facebook.internal.r rVar = this.f9018b;
            if (rVar != null) {
                rVar.c("    " + str, "<Image>");
            }
        }

        public void e(String str, byte[] bArr) throws IOException {
            f(str, str, "content/unknown");
            this.a.write(bArr);
            i(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
            k();
            com.facebook.internal.r rVar = this.f9018b;
            if (rVar != null) {
                rVar.c("    " + str, String.format(Locale.ROOT, "<Data: %d>", Integer.valueOf(bArr.length)));
            }
        }

        public void f(String str, String str2, String str3) throws IOException {
            if (!this.f9020d) {
                c("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    c("; filename=\"%s\"", str2);
                }
                i(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
                if (str3 != null) {
                    i("%s: %s", "Content-Type", str3);
                }
                i(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
                return;
            }
            this.a.write(String.format("%s=", str).getBytes());
        }

        public void g(String str, Uri uri, String str2) throws IOException {
            int m;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            f(str, str, str2);
            if (this.a instanceof o) {
                ((o) this.a).b(x.u(uri));
                m = 0;
            } else {
                m = x.m(com.facebook.f.e().getContentResolver().openInputStream(uri), this.a) + 0;
            }
            i(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
            k();
            com.facebook.internal.r rVar = this.f9018b;
            if (rVar != null) {
                rVar.c("    " + str, String.format(Locale.ROOT, "<Data: %d>", Integer.valueOf(m)));
            }
        }

        public void h(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
            int m;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            f(str, str, str2);
            OutputStream outputStream = this.a;
            if (outputStream instanceof o) {
                ((o) outputStream).b(parcelFileDescriptor.getStatSize());
                m = 0;
            } else {
                m = x.m(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.a) + 0;
            }
            i(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
            k();
            com.facebook.internal.r rVar = this.f9018b;
            if (rVar != null) {
                rVar.c("    " + str, String.format(Locale.ROOT, "<Data: %d>", Integer.valueOf(m)));
            }
        }

        public void i(String str, Object... objArr) throws IOException {
            c(str, objArr);
            if (this.f9020d) {
                return;
            }
            c("\r\n", new Object[0]);
        }

        public void j(String str, Object obj, GraphRequest graphRequest) throws IOException {
            Closeable closeable = this.a;
            if (closeable instanceof q) {
                ((q) closeable).a(graphRequest);
            }
            if (GraphRequest.I(obj)) {
                a(str, GraphRequest.M(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                d(str, (Bitmap) obj);
                return;
            }
            if (obj instanceof byte[]) {
                e(str, (byte[]) obj);
                return;
            }
            if (obj instanceof Uri) {
                g(str, (Uri) obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                h(str, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                Parcelable b2 = parcelableResourceWithMimeType.b();
                String a = parcelableResourceWithMimeType.a();
                if (b2 instanceof ParcelFileDescriptor) {
                    h(str, (ParcelFileDescriptor) b2, a);
                    return;
                } else {
                    if (b2 instanceof Uri) {
                        g(str, (Uri) b2, a);
                        return;
                    }
                    throw b();
                }
            }
            throw b();
        }

        public void k() throws IOException {
            if (this.f9020d) {
                this.a.write("&".getBytes());
            } else {
                i("--%s", GraphRequest.f9001b);
            }
        }

        public void l(String str, JSONArray jSONArray, Collection<GraphRequest> collection) throws IOException, JSONException {
            Closeable closeable = this.a;
            if (!(closeable instanceof q)) {
                a(str, jSONArray.toString());
                return;
            }
            q qVar = (q) closeable;
            f(str, null, null);
            c("[", new Object[0]);
            int i2 = 0;
            for (GraphRequest graphRequest : collection) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                qVar.a(graphRequest);
                if (i2 > 0) {
                    c(",%s", jSONObject.toString());
                } else {
                    c("%s", jSONObject.toString());
                }
                i2++;
            }
            c("]", new Object[0]);
            com.facebook.internal.r rVar = this.f9018b;
            if (rVar != null) {
                rVar.c("    " + str, jSONArray.toString());
            }
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i2 = 0; i2 < nextInt; i2++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        f9001b = sb.toString();
    }

    public GraphRequest() {
        this(null, null, null, null, null);
    }

    private static String C() {
        if (f9004e == null) {
            f9004e = String.format("%s.%s", "FBAndroidSDK", "7.1.0");
            String a2 = com.facebook.internal.p.a();
            if (!x.Q(a2)) {
                f9004e = String.format(Locale.ROOT, "%s/%s", f9004e, a2);
            }
        }
        return f9004e;
    }

    private static boolean E(com.facebook.h hVar) {
        Iterator<h.a> it = hVar.L().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof h.b) {
                return true;
            }
        }
        Iterator<GraphRequest> it2 = hVar.iterator();
        while (it2.hasNext()) {
            if (it2.next().s() instanceof i) {
                return true;
            }
        }
        return false;
    }

    private static boolean F(com.facebook.h hVar) {
        Iterator<GraphRequest> it = hVar.iterator();
        while (it.hasNext()) {
            GraphRequest next = it.next();
            Iterator<String> it2 = next.m.keySet().iterator();
            while (it2.hasNext()) {
                if (H(next.m.get(it2.next()))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean G(String str) {
        Matcher matcher = f9003d.matcher(str);
        if (matcher.matches()) {
            str = matcher.group(1);
        }
        return str.startsWith("me/") || str.startsWith("/me/");
    }

    private static boolean H(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean I(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    public static GraphRequest J(AccessToken accessToken, String str, f fVar) {
        return new GraphRequest(accessToken, str, null, null, fVar);
    }

    public static GraphRequest K(AccessToken accessToken, g gVar) {
        return new GraphRequest(accessToken, "me", null, null, new a(gVar));
    }

    public static GraphRequest L(AccessToken accessToken, String str, JSONObject jSONObject, f fVar) {
        GraphRequest graphRequest = new GraphRequest(accessToken, str, null, com.facebook.j.POST, fVar);
        graphRequest.Y(jSONObject);
        return graphRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String M(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Number)) {
            if (obj instanceof Date) {
                return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
            }
            throw new IllegalArgumentException("Unsupported parameter type.");
        }
        return obj.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void N(org.json.JSONObject r6, java.lang.String r7, com.facebook.GraphRequest.h r8) throws java.io.IOException {
        /*
            boolean r0 = G(r7)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1e
            java.lang.String r0 = ":"
            int r0 = r7.indexOf(r0)
            java.lang.String r3 = "?"
            int r7 = r7.indexOf(r3)
            r3 = 3
            if (r0 <= r3) goto L1e
            r3 = -1
            if (r7 == r3) goto L1c
            if (r0 >= r7) goto L1e
        L1c:
            r7 = 1
            goto L1f
        L1e:
            r7 = 0
        L1f:
            java.util.Iterator r0 = r6.keys()
        L23:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r6.opt(r3)
            if (r7 == 0) goto L3f
            java.lang.String r5 = "image"
            boolean r5 = r3.equalsIgnoreCase(r5)
            if (r5 == 0) goto L3f
            r5 = 1
            goto L40
        L3f:
            r5 = 0
        L40:
            O(r3, r4, r8, r5)
            goto L23
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.N(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$h):void");
    }

    private static void O(String str, Object obj, h hVar, boolean z) throws IOException {
        Class<?> cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    O(String.format("%s[%s]", str, next), jSONObject.opt(next), hVar, z);
                }
                return;
            }
            if (jSONObject.has(DeepLinkIntentReceiver.DeepLinksKeys.ID)) {
                O(str, jSONObject.optString(DeepLinkIntentReceiver.DeepLinksKeys.ID), hVar, z);
                return;
            } else if (jSONObject.has("url")) {
                O(str, jSONObject.optString("url"), hVar, z);
                return;
            } else {
                if (jSONObject.has("fbsdk:create_object")) {
                    O(str, jSONObject.toString(), hVar, z);
                    return;
                }
                return;
            }
        }
        if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                O(String.format(Locale.ROOT, "%s[%d]", str, Integer.valueOf(i2)), jSONArray.opt(i2), hVar, z);
            }
            return;
        }
        if (!String.class.isAssignableFrom(cls) && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls)) {
            if (Date.class.isAssignableFrom(cls)) {
                hVar.a(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
                return;
            }
            return;
        }
        hVar.a(str, obj.toString());
    }

    private static void P(com.facebook.h hVar, com.facebook.internal.r rVar, int i2, URL url, OutputStream outputStream, boolean z) throws IOException, JSONException {
        j jVar = new j(outputStream, rVar, z);
        if (i2 == 1) {
            GraphRequest graphRequest = hVar.get(0);
            HashMap hashMap = new HashMap();
            for (String str : graphRequest.m.keySet()) {
                Object obj = graphRequest.m.get(str);
                if (H(obj)) {
                    hashMap.put(str, new e(graphRequest, obj));
                }
            }
            if (rVar != null) {
                rVar.a("  Parameters:\n");
            }
            S(graphRequest.m, jVar, graphRequest);
            if (rVar != null) {
                rVar.a("  Attachments:\n");
            }
            R(hashMap, jVar);
            JSONObject jSONObject = graphRequest.f9008i;
            if (jSONObject != null) {
                N(jSONObject, url.getPath(), jVar);
                return;
            }
            return;
        }
        String r = r(hVar);
        if (!x.Q(r)) {
            jVar.a("batch_app_id", r);
            HashMap hashMap2 = new HashMap();
            T(jVar, hVar, hashMap2);
            if (rVar != null) {
                rVar.a("  Attachments:\n");
            }
            R(hashMap2, jVar);
            return;
        }
        throw new FacebookException("App ID was not specified at the request or Settings.");
    }

    static void Q(com.facebook.h hVar, List<com.facebook.i> list) {
        int size = hVar.size();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            GraphRequest graphRequest = hVar.get(i2);
            if (graphRequest.n != null) {
                arrayList.add(new Pair(graphRequest.n, list.get(i2)));
            }
        }
        if (arrayList.size() > 0) {
            c cVar = new c(arrayList, hVar);
            Handler K = hVar.K();
            if (K == null) {
                cVar.run();
            } else {
                K.post(cVar);
            }
        }
    }

    private static void R(Map<String, e> map, j jVar) throws IOException {
        for (String str : map.keySet()) {
            e eVar = map.get(str);
            if (H(eVar.b())) {
                jVar.j(str, eVar.b(), eVar.a());
            }
        }
    }

    private static void S(Bundle bundle, j jVar, GraphRequest graphRequest) throws IOException {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (I(obj)) {
                jVar.j(str, obj, graphRequest);
            }
        }
    }

    private static void T(j jVar, Collection<GraphRequest> collection, Map<String, e> map) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        Iterator<GraphRequest> it = collection.iterator();
        while (it.hasNext()) {
            it.next().U(jSONArray, map);
        }
        jVar.l("batch", jSONArray, collection);
    }

    private void U(JSONArray jSONArray, Map<String, e> map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f9009j;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.l);
        }
        String str2 = this.f9010k;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String z = z();
        jSONObject.put("relative_url", z);
        jSONObject.put("method", this.f9006g);
        AccessToken accessToken = this.f9005f;
        if (accessToken != null) {
            com.facebook.internal.r.j(accessToken.r());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.m.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.m.get(it.next());
            if (H(obj)) {
                String format = String.format(Locale.ROOT, "%s%d", "file", Integer.valueOf(map.size()));
                arrayList.add(format);
                map.put(format, new e(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        if (this.f9008i != null) {
            ArrayList arrayList2 = new ArrayList();
            N(this.f9008i, z, new d(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final void V(com.facebook.h r13, java.net.HttpURLConnection r14) throws java.io.IOException, org.json.JSONException {
        /*
            com.facebook.internal.r r6 = new com.facebook.internal.r
            com.facebook.l r0 = com.facebook.l.REQUESTS
            java.lang.String r1 = "Request"
            r6.<init>(r0, r1)
            int r2 = r13.size()
            boolean r5 = F(r13)
            r0 = 0
            r1 = 1
            if (r2 != r1) goto L1c
            com.facebook.GraphRequest r3 = r13.get(r0)
            com.facebook.j r3 = r3.f9006g
            goto L1e
        L1c:
            com.facebook.j r3 = com.facebook.j.POST
        L1e:
            java.lang.String r4 = r3.name()
            r14.setRequestMethod(r4)
            X(r14, r5)
            java.net.URL r4 = r14.getURL()
            java.lang.String r7 = "Request:\n"
            r6.a(r7)
            java.lang.String r7 = r13.M()
            java.lang.String r8 = "Id"
            r6.c(r8, r7)
            java.lang.String r7 = "URL"
            r6.c(r7, r4)
            java.lang.String r7 = r14.getRequestMethod()
            java.lang.String r8 = "Method"
            r6.c(r8, r7)
            java.lang.String r7 = "User-Agent"
            java.lang.String r8 = r14.getRequestProperty(r7)
            r6.c(r7, r8)
            java.lang.String r7 = "Content-Type"
            java.lang.String r8 = r14.getRequestProperty(r7)
            r6.c(r7, r8)
            int r7 = r13.O()
            r14.setConnectTimeout(r7)
            int r7 = r13.O()
            r14.setReadTimeout(r7)
            com.facebook.j r7 = com.facebook.j.POST
            if (r3 != r7) goto L6d
            r0 = 1
        L6d:
            if (r0 != 0) goto L73
            r6.d()
            return
        L73:
            r14.setDoOutput(r1)
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> Lc9
            java.io.OutputStream r14 = r14.getOutputStream()     // Catch: java.lang.Throwable -> Lc9
            r1.<init>(r14)     // Catch: java.lang.Throwable -> Lc9
            if (r5 == 0) goto L8c
            java.util.zip.GZIPOutputStream r14 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L89
            r14.<init>(r1)     // Catch: java.lang.Throwable -> L89
            r0 = r14
            goto L8d
        L89:
            r13 = move-exception
            r0 = r1
            goto Lca
        L8c:
            r0 = r1
        L8d:
            boolean r14 = E(r13)     // Catch: java.lang.Throwable -> Lc9
            if (r14 == 0) goto Lb7
            com.facebook.o r14 = new com.facebook.o     // Catch: java.lang.Throwable -> Lc9
            android.os.Handler r1 = r13.K()     // Catch: java.lang.Throwable -> Lc9
            r14.<init>(r1)     // Catch: java.lang.Throwable -> Lc9
            r8 = 0
            r7 = r13
            r9 = r2
            r10 = r4
            r11 = r14
            r12 = r5
            P(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lc9
            int r1 = r14.f()     // Catch: java.lang.Throwable -> Lc9
            java.util.Map r10 = r14.o()     // Catch: java.lang.Throwable -> Lc9
            com.facebook.p r14 = new com.facebook.p     // Catch: java.lang.Throwable -> Lc9
            long r11 = (long) r1     // Catch: java.lang.Throwable -> Lc9
            r7 = r14
            r8 = r0
            r9 = r13
            r7.<init>(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lc9
            goto Lb8
        Lb7:
            r14 = r0
        Lb8:
            r0 = r13
            r1 = r6
            r3 = r4
            r4 = r14
            P(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lc6
            r14.close()
            r6.d()
            return
        Lc6:
            r13 = move-exception
            r0 = r14
            goto Lca
        Lc9:
            r13 = move-exception
        Lca:
            if (r0 == 0) goto Lcf
            r0.close()
        Lcf:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.V(com.facebook.h, java.net.HttpURLConnection):void");
    }

    private static void X(HttpURLConnection httpURLConnection, boolean z) {
        if (z) {
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        } else {
            httpURLConnection.setRequestProperty("Content-Type", x());
        }
    }

    private void d() {
        if (this.f9005f != null) {
            if (!this.m.containsKey("access_token")) {
                String r = this.f9005f.r();
                com.facebook.internal.r.j(r);
                this.m.putString("access_token", r);
            }
        } else if (!this.r && !this.m.containsKey("access_token")) {
            String f2 = com.facebook.f.f();
            String k2 = com.facebook.f.k();
            if (!x.Q(f2) && !x.Q(k2)) {
                this.m.putString("access_token", f2 + "|" + k2);
            } else {
                x.V(a, "Warning: Request without access token missing application ID or client token.");
            }
        }
        this.m.putString("sdk", "android");
        this.m.putString("format", BodyInterceptorV3.RESPONSE_MODE_JSON);
        if (com.facebook.f.y(l.GRAPH_API_DEBUG_INFO)) {
            this.m.putString("debug", "info");
        } else if (com.facebook.f.y(l.GRAPH_API_DEBUG_WARNING)) {
            this.m.putString("debug", "warning");
        }
    }

    static final boolean d0(GraphRequest graphRequest) {
        String D = graphRequest.D();
        if (x.Q(D)) {
            return true;
        }
        if (D.startsWith("v")) {
            D = D.substring(1);
        }
        String[] split = D.split("\\.");
        if (split.length < 2 || Integer.parseInt(split[0]) <= 2) {
            return Integer.parseInt(split[0]) >= 2 && Integer.parseInt(split[1]) >= 4;
        }
        return true;
    }

    private String e(String str, Boolean bool) {
        if (!bool.booleanValue() && this.f9006g == com.facebook.j.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.m.keySet()) {
            Object obj = this.m.get(str2);
            if (obj == null) {
                obj = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (I(obj)) {
                buildUpon.appendQueryParameter(str2, M(obj).toString());
            } else if (this.f9006g == com.facebook.j.GET) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", obj.getClass().getSimpleName()));
            }
        }
        return buildUpon.toString();
    }

    public static HttpURLConnection e0(com.facebook.h hVar) {
        URL url;
        f0(hVar);
        try {
            if (hVar.size() == 1) {
                url = new URL(hVar.get(0).B());
            } else {
                url = new URL(v.c());
            }
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnection = f(url);
                V(hVar, httpURLConnection);
                return httpURLConnection;
            } catch (IOException | JSONException e2) {
                x.n(httpURLConnection);
                throw new FacebookException("could not construct request body", e2);
            }
        } catch (MalformedURLException e3) {
            throw new FacebookException("could not construct URL for request", e3);
        }
    }

    private static HttpURLConnection f(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("User-Agent", C());
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    static final void f0(com.facebook.h hVar) {
        Iterator<GraphRequest> it = hVar.iterator();
        while (it.hasNext()) {
            GraphRequest next = it.next();
            if (com.facebook.j.GET.equals(next.w()) && d0(next)) {
                Bundle y = next.y();
                if (!y.containsKey("fields") || x.Q(y.getString("fields"))) {
                    com.facebook.internal.r.f(l.DEVELOPER_ERRORS, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", next.u());
                }
            }
        }
    }

    public static com.facebook.i h(GraphRequest graphRequest) {
        List<com.facebook.i> l = l(graphRequest);
        if (l != null && l.size() == 1) {
            return l.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    public static List<com.facebook.i> j(com.facebook.h hVar) {
        y.h(hVar, "requests");
        try {
            try {
                HttpURLConnection e0 = e0(hVar);
                List<com.facebook.i> p = p(e0, hVar);
                x.n(e0);
                return p;
            } catch (Exception e2) {
                List<com.facebook.i> a2 = com.facebook.i.a(hVar.N(), null, new FacebookException(e2));
                Q(hVar, a2);
                x.n(null);
                return a2;
            }
        } catch (Throwable th) {
            x.n(null);
            throw th;
        }
    }

    public static List<com.facebook.i> k(Collection<GraphRequest> collection) {
        return j(new com.facebook.h(collection));
    }

    public static List<com.facebook.i> l(GraphRequest... graphRequestArr) {
        y.i(graphRequestArr, "requests");
        return k(Arrays.asList(graphRequestArr));
    }

    public static com.facebook.g m(com.facebook.h hVar) {
        y.h(hVar, "requests");
        com.facebook.g gVar = new com.facebook.g(hVar);
        gVar.executeOnExecutor(com.facebook.f.m(), new Void[0]);
        return gVar;
    }

    public static com.facebook.g n(Collection<GraphRequest> collection) {
        return m(new com.facebook.h(collection));
    }

    public static com.facebook.g o(GraphRequest... graphRequestArr) {
        y.i(graphRequestArr, "requests");
        return n(Arrays.asList(graphRequestArr));
    }

    public static List<com.facebook.i> p(HttpURLConnection httpURLConnection, com.facebook.h hVar) {
        List<com.facebook.i> f2 = com.facebook.i.f(httpURLConnection, hVar);
        x.n(httpURLConnection);
        int size = hVar.size();
        if (size == f2.size()) {
            Q(hVar, f2);
            com.facebook.b.h().f();
            return f2;
        }
        throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", Integer.valueOf(f2.size()), Integer.valueOf(size)));
    }

    private static String r(com.facebook.h hVar) {
        String f2;
        if (!x.Q(hVar.J())) {
            return hVar.J();
        }
        Iterator<GraphRequest> it = hVar.iterator();
        while (it.hasNext()) {
            AccessToken accessToken = it.next().f9005f;
            if (accessToken != null && (f2 = accessToken.f()) != null) {
                return f2;
            }
        }
        if (!x.Q(f9002c)) {
            return f9002c;
        }
        return com.facebook.f.f();
    }

    private String v() {
        return f9003d.matcher(this.f9007h).matches() ? this.f9007h : String.format("%s/%s", this.q, this.f9007h);
    }

    private static String x() {
        return String.format("multipart/form-data; boundary=%s", f9001b);
    }

    public final Object A() {
        return this.p;
    }

    final String B() {
        String c2;
        String str;
        String str2 = this.o;
        if (str2 != null) {
            return str2.toString();
        }
        if (w() == com.facebook.j.POST && (str = this.f9007h) != null && str.endsWith("/videos")) {
            c2 = v.d();
        } else {
            c2 = v.c();
        }
        String format = String.format("%s/%s", c2, v());
        d();
        return e(format, Boolean.FALSE);
    }

    public final String D() {
        return this.q;
    }

    public final void W(f fVar) {
        if (!com.facebook.f.y(l.GRAPH_API_DEBUG_INFO) && !com.facebook.f.y(l.GRAPH_API_DEBUG_WARNING)) {
            this.n = fVar;
        } else {
            this.n = new b(fVar);
        }
    }

    public final void Y(JSONObject jSONObject) {
        this.f9008i = jSONObject;
    }

    public final void Z(com.facebook.j jVar) {
        if (this.o != null && jVar != com.facebook.j.GET) {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (jVar == null) {
            jVar = com.facebook.j.GET;
        }
        this.f9006g = jVar;
    }

    public final void a0(Bundle bundle) {
        this.m = bundle;
    }

    public final void b0(boolean z) {
        this.r = z;
    }

    public final void c0(Object obj) {
        this.p = obj;
    }

    public final com.facebook.i g() {
        return h(this);
    }

    public final com.facebook.g i() {
        return o(this);
    }

    public final AccessToken q() {
        return this.f9005f;
    }

    public final f s() {
        return this.n;
    }

    public final JSONObject t() {
        return this.f9008i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.f9005f;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.f9007h);
        sb.append(", graphObject: ");
        sb.append(this.f9008i);
        sb.append(", httpMethod: ");
        sb.append(this.f9006g);
        sb.append(", parameters: ");
        sb.append(this.m);
        sb.append("}");
        return sb.toString();
    }

    public final String u() {
        return this.f9007h;
    }

    public final com.facebook.j w() {
        return this.f9006g;
    }

    public final Bundle y() {
        return this.m;
    }

    final String z() {
        if (this.o == null) {
            String format = String.format("%s/%s", v.c(), v());
            d();
            Uri parse = Uri.parse(e(format, Boolean.TRUE));
            return String.format("%s?%s", parse.getPath(), parse.getQuery());
        }
        throw new FacebookException("Can't override URL for a batch request");
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, com.facebook.j jVar, f fVar) {
        this(accessToken, str, bundle, jVar, fVar, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, com.facebook.j jVar, f fVar, String str2) {
        this.l = true;
        this.r = false;
        this.f9005f = accessToken;
        this.f9007h = str;
        this.q = str2;
        W(fVar);
        Z(jVar);
        if (bundle != null) {
            this.m = new Bundle(bundle);
        } else {
            this.m = new Bundle();
        }
        if (this.q == null) {
            this.q = com.facebook.f.o();
        }
    }
}
