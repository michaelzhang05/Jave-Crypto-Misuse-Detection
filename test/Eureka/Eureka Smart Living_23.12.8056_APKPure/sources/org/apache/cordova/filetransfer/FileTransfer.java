package org.apache.cordova.filetransfer;

import android.net.Uri;
import android.webkit.CookieManager;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import m5.o;
import org.apache.cordova.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FileTransfer extends org.apache.cordova.b {
    public static int ABORTED_ERR = 4;
    public static int CONNECTION_ERR = 3;
    public static int FILE_NOT_FOUND_ERR = 1;
    public static int INVALID_URL_ERR = 2;
    public static int NOT_MODIFIED_ERR = 5;

    /* renamed from: c, reason: collision with root package name */
    private static HashMap f8544c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f8545a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8546b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.c f8547c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f8548d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f8549e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ JSONObject f8550f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f8551g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ JSONObject f8552h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f8553i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f8554j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f8555k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f8556l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f8557m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f8558n;

        a(e eVar, String str, org.apache.cordova.c cVar, Uri uri, String str2, JSONObject jSONObject, String str3, JSONObject jSONObject2, String str4, String str5, String str6, boolean z5, boolean z6, String str7) {
            this.f8545a = eVar;
            this.f8546b = str;
            this.f8547c = cVar;
            this.f8548d = uri;
            this.f8549e = str2;
            this.f8550f = jSONObject;
            this.f8551g = str3;
            this.f8552h = jSONObject2;
            this.f8553i = str4;
            this.f8554j = str5;
            this.f8555k = str6;
            this.f8556l = z5;
            this.f8557m = z6;
            this.f8558n = str7;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:233:0x03b3
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[Catch: IOException -> 0x0059, all -> 0x03d1, FileNotFoundException -> 0x03db, JSONException -> 0x0418, TRY_LEAVE, TryCatch #17 {IOException -> 0x0059, blocks: (B:263:0x004e, B:17:0x0061, B:20:0x0072, B:23:0x007b, B:27:0x0085, B:28:0x008b, B:30:0x0091, B:33:0x00a1), top: B:262:0x004e }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[Catch: IOException -> 0x0059, all -> 0x03d1, FileNotFoundException -> 0x03db, JSONException -> 0x0418, TRY_ENTER, TRY_LEAVE, TryCatch #17 {IOException -> 0x0059, blocks: (B:263:0x004e, B:17:0x0061, B:20:0x0072, B:23:0x007b, B:27:0x0085, B:28:0x008b, B:30:0x0091, B:33:0x00a1), top: B:262:0x004e }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007b A[Catch: IOException -> 0x0059, all -> 0x03d1, FileNotFoundException -> 0x03db, JSONException -> 0x0418, TRY_ENTER, TRY_LEAVE, TryCatch #17 {IOException -> 0x0059, blocks: (B:263:0x004e, B:17:0x0061, B:20:0x0072, B:23:0x007b, B:27:0x0085, B:28:0x008b, B:30:0x0091, B:33:0x00a1), top: B:262:0x004e }] */
        /* JADX WARN: Removed duplicated region for block: B:244:0x0195 A[Catch: IOException -> 0x03ca, all -> 0x03d1, FileNotFoundException -> 0x03db, JSONException -> 0x0418, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x03ca, blocks: (B:47:0x0161, B:56:0x01a3, B:244:0x0195), top: B:46:0x0161 }] */
        /* JADX WARN: Removed duplicated region for block: B:248:0x017d  */
        /* JADX WARN: Removed duplicated region for block: B:254:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0091 A[Catch: IOException -> 0x0059, JSONException -> 0x00dc, all -> 0x03d1, FileNotFoundException -> 0x03db, TryCatch #17 {IOException -> 0x0059, blocks: (B:263:0x004e, B:17:0x0061, B:20:0x0072, B:23:0x007b, B:27:0x0085, B:28:0x008b, B:30:0x0091, B:33:0x00a1), top: B:262:0x004e }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x018a A[Catch: IOException -> 0x015a, all -> 0x03d1, FileNotFoundException -> 0x03db, JSONException -> 0x0418, TRY_ENTER, TRY_LEAVE, TryCatch #18 {IOException -> 0x015a, blocks: (B:45:0x0152, B:55:0x018a, B:210:0x01b4, B:200:0x03c1, B:201:0x03c9, B:246:0x019c), top: B:44:0x0152 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 1261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.filetransfer.FileTransfer.a.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f8560a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8561b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.c f8562c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f8563d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f8564e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ JSONObject f8565f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f8566g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f8567h;

        b(e eVar, String str, org.apache.cordova.c cVar, Uri uri, boolean z5, JSONObject jSONObject, String str2, String str3) {
            this.f8560a = eVar;
            this.f8561b = str;
            this.f8562c = cVar;
            this.f8563d = uri;
            this.f8564e = z5;
            this.f8565f = jSONObject;
            this.f8566g = str2;
            this.f8567h = str3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:145:0x03d2, code lost:
        
            if (r3 != null) goto L190;
         */
        /* JADX WARN: Code restructure failed: missing block: B:146:0x0349, code lost:
        
            r3.delete();
            r2 = r2;
            r5 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:162:0x0391, code lost:
        
            if (r3 != null) goto L190;
         */
        /* JADX WARN: Code restructure failed: missing block: B:178:0x0347, code lost:
        
            if (r3 != null) goto L190;
         */
        /* JADX WARN: Code restructure failed: missing block: B:194:0x0310, code lost:
        
            if (r3 != null) goto L190;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:135:0x03ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:156:0x0379 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:172:0x032f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:188:0x02f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x027e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r2v21 */
        /* JADX WARN: Type inference failed for: r2v22 */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v25 */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v27 */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v31 */
        /* JADX WARN: Type inference failed for: r2v32 */
        /* JADX WARN: Type inference failed for: r2v33 */
        /* JADX WARN: Type inference failed for: r5v12, types: [java.net.URLConnection] */
        /* JADX WARN: Type inference failed for: r5v15, types: [java.net.URLConnection] */
        /* JADX WARN: Type inference failed for: r5v16, types: [java.net.URLConnection] */
        /* JADX WARN: Type inference failed for: r5v36 */
        /* JADX WARN: Type inference failed for: r5v37 */
        /* JADX WARN: Type inference failed for: r5v38 */
        /* JADX WARN: Type inference failed for: r5v39 */
        /* JADX WARN: Type inference failed for: r5v40 */
        /* JADX WARN: Type inference failed for: r5v41 */
        /* JADX WARN: Type inference failed for: r5v42 */
        /* JADX WARN: Type inference failed for: r5v43 */
        /* JADX WARN: Type inference failed for: r5v44 */
        /* JADX WARN: Type inference failed for: r5v45 */
        /* JADX WARN: Type inference failed for: r5v46 */
        /* JADX WARN: Type inference failed for: r5v47 */
        /* JADX WARN: Type inference failed for: r5v48 */
        /* JADX WARN: Type inference failed for: r5v49 */
        /* JADX WARN: Type inference failed for: r5v50 */
        /* JADX WARN: Type inference failed for: r5v51 */
        /* JADX WARN: Type inference failed for: r5v52 */
        /* JADX WARN: Type inference failed for: r5v57 */
        /* JADX WARN: Type inference failed for: r5v58 */
        /* JADX WARN: Type inference failed for: r5v59 */
        /* JADX WARN: Type inference failed for: r5v60 */
        /* JADX WARN: Type inference failed for: r5v61 */
        /* JADX WARN: Type inference failed for: r5v62 */
        /* JADX WARN: Type inference failed for: r5v63 */
        /* JADX WARN: Type inference failed for: r5v64 */
        /* JADX WARN: Type inference failed for: r5v9, types: [java.net.URLConnection] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 1049
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.filetransfer.FileTransfer.b.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f8569a;

        c(e eVar) {
            this.f8569a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f8569a) {
                File file = this.f8569a.f8573c;
                if (file != null) {
                    file.delete();
                }
                int i6 = FileTransfer.ABORTED_ERR;
                e eVar = this.f8569a;
                this.f8569a.a(new org.apache.cordova.f(f.a.ERROR, FileTransfer.j(i6, eVar.f8571a, eVar.f8572b, null, -1, null)));
                e eVar2 = this.f8569a;
                eVar2.f8576f = true;
                HttpURLConnection httpURLConnection = eVar2.f8575e;
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception e6) {
                        o.d("FileTransfer", "CB-8431 Catch workaround for fatal exception", e6);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends GZIPInputStream {
        public d(InputStream inputStream) {
            super(inputStream);
        }

        public Inflater g() {
            return ((GZIPInputStream) this).inf;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        String f8571a;

        /* renamed from: b, reason: collision with root package name */
        String f8572b;

        /* renamed from: c, reason: collision with root package name */
        File f8573c;

        /* renamed from: d, reason: collision with root package name */
        org.apache.cordova.a f8574d;

        /* renamed from: e, reason: collision with root package name */
        HttpURLConnection f8575e;

        /* renamed from: f, reason: collision with root package name */
        boolean f8576f;

        e(String str, String str2, org.apache.cordova.a aVar) {
            this.f8571a = str;
            this.f8572b = str2;
            this.f8574d = aVar;
        }

        void a(org.apache.cordova.f fVar) {
            synchronized (this) {
                if (!this.f8576f) {
                    this.f8574d.sendPluginResult(fVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f extends h {

        /* renamed from: a, reason: collision with root package name */
        private long f8577a;

        public f(InputStream inputStream) {
            super(inputStream);
            this.f8577a = 0L;
        }

        private int q(int i6) {
            if (i6 != -1) {
                this.f8577a += i6;
            }
            return i6;
        }

        @Override // org.apache.cordova.filetransfer.FileTransfer.h
        public long g() {
            return this.f8577a;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            return q(super.read());
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i6, int i7) {
            return q(super.read(bArr, i6, i7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g extends h {

        /* renamed from: a, reason: collision with root package name */
        private d f8578a;

        public g(d dVar) {
            super(dVar);
            this.f8578a = dVar;
        }

        @Override // org.apache.cordova.filetransfer.FileTransfer.h
        public long g() {
            return this.f8578a.g().getBytesRead();
        }
    }

    /* loaded from: classes.dex */
    private static abstract class h extends FilterInputStream {
        public h(InputStream inputStream) {
            super(inputStream);
        }

        public abstract long g();
    }

    private void h(String str) {
        e eVar;
        synchronized (f8544c) {
            eVar = (e) f8544c.remove(str);
        }
        if (eVar != null) {
            this.f8371cordova.getThreadPool().execute(new c(eVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(URLConnection uRLConnection, JSONObject jSONObject) {
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                String replaceAll = obj.replaceAll("\\n", "").replaceAll("\\s+", "").replaceAll(":", "").replaceAll("[^\\x20-\\x7E]+", "");
                JSONArray optJSONArray = jSONObject.optJSONArray(obj);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                    optJSONArray.put(jSONObject.getString(obj).replaceAll("\\s+", " ").replaceAll("\\n", " ").replaceAll("[^\\x20-\\x7E]+", " "));
                }
                uRLConnection.setRequestProperty(replaceAll, optJSONArray.getString(0));
                for (int i6 = 1; i6 < optJSONArray.length(); i6++) {
                    uRLConnection.addRequestProperty(obj, optJSONArray.getString(i6));
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject j(int i6, String str, String str2, String str3, Integer num, Throwable th) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("code", i6);
                jSONObject2.put("source", str);
                jSONObject2.put("target", str2);
                if (str3 != null) {
                    jSONObject2.put("body", str3);
                }
                if (num != null) {
                    jSONObject2.put("http_status", num);
                }
                if (th == null) {
                    return jSONObject2;
                }
                String message = th.getMessage();
                if (message == null || "".equals(message)) {
                    message = th.toString();
                }
                jSONObject2.put("exception", message);
                return jSONObject2;
            } catch (JSONException e6) {
                e = e6;
                jSONObject = jSONObject2;
                o.d("FileTransfer", e.getMessage(), e);
                return jSONObject;
            }
        } catch (JSONException e7) {
            e = e7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject k(int i6, String str, String str2, URLConnection uRLConnection, Throwable th) {
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        String str3 = null;
        if (uRLConnection != null) {
            try {
                if (uRLConnection instanceof HttpURLConnection) {
                    i7 = ((HttpURLConnection) uRLConnection).getResponseCode();
                    InputStream errorStream = ((HttpURLConnection) uRLConnection).getErrorStream();
                    if (errorStream != null) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, "UTF-8"));
                        try {
                            String readLine = bufferedReader.readLine();
                            while (readLine != null) {
                                sb.append(readLine);
                                readLine = bufferedReader.readLine();
                                if (readLine != null) {
                                    sb.append('\n');
                                }
                            }
                            String sb2 = sb.toString();
                            try {
                                str3 = sb2;
                            } catch (Throwable th2) {
                                th = th2;
                                str3 = sb2;
                                o.h("FileTransfer", "Error getting HTTP status code from connection.", th);
                                return j(i6, str, str2, str3, Integer.valueOf(i7), th);
                            }
                        } finally {
                            bufferedReader.close();
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return j(i6, str, str2, str3, Integer.valueOf(i7), th);
    }

    private void l(String str, String str2, JSONArray jSONArray, org.apache.cordova.a aVar) {
        o.a("FileTransfer", "download " + str + " to " + str2);
        org.apache.cordova.c resourceApi = this.webView.getResourceApi();
        String string = jSONArray.getString(3);
        JSONObject optJSONObject = jSONArray.optJSONObject(4);
        Uri o6 = resourceApi.o(Uri.parse(str));
        int h6 = org.apache.cordova.c.h(o6);
        boolean z5 = ((h6 == 6) || h6 == 5) ? false : true;
        if (h6 == -1) {
            JSONObject j6 = j(INVALID_URL_ERR, str, str2, null, 0, null);
            o.c("FileTransfer", "Unsupported URI: " + o6);
            aVar.sendPluginResult(new org.apache.cordova.f(f.a.IO_EXCEPTION, j6));
            return;
        }
        Boolean bool = z5 ? Boolean.TRUE : null;
        if (bool == null) {
            try {
                org.apache.cordova.e eVar = (org.apache.cordova.e) this.webView.getClass().getMethod("getPluginManager", new Class[0]).invoke(this.webView, new Object[0]);
                bool = (Boolean) eVar.getClass().getMethod("shouldAllowRequest", String.class).invoke(eVar, str);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        if (Boolean.TRUE.equals(bool)) {
            e eVar2 = new e(str, str2, aVar);
            synchronized (f8544c) {
                f8544c.put(string, eVar2);
            }
            this.f8371cordova.getThreadPool().execute(new b(eVar2, str2, resourceApi, o6, z5, optJSONObject, str, string));
            return;
        }
        o.g("FileTransfer", "The Source URL is not in the Allow List: '" + str + "'");
        aVar.sendPluginResult(new org.apache.cordova.f(f.a.IO_EXCEPTION, j(CONNECTION_ERR, str, str2, null, 401, null)));
    }

    private static String m(JSONArray jSONArray, int i6, String str) {
        String optString;
        return (jSONArray.length() <= i6 || (optString = jSONArray.optString(i6)) == null || "null".equals(optString)) ? str : optString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String n(String str) {
        String str2;
        boolean z5 = false;
        try {
            Method method = this.webView.getClass().getMethod("getCookieManager", new Class[0]);
            Class<?> returnType = method.getReturnType();
            str2 = (String) returnType.getMethod("getCookie", String.class).invoke(returnType.cast(method.invoke(this.webView, new Object[0])), str);
            z5 = true;
        } catch (ClassCastException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            str2 = null;
        }
        return (z5 || CookieManager.getInstance() == null) ? str2 : CookieManager.getInstance().getCookie(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h o(URLConnection uRLConnection) {
        String contentEncoding = uRLConnection.getContentEncoding();
        return (contentEncoding == null || !contentEncoding.equalsIgnoreCase("gzip")) ? new f(uRLConnection.getInputStream()) : new g(new d(uRLConnection.getInputStream()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private void q(String str, String str2, JSONArray jSONArray, org.apache.cordova.a aVar) {
        int i6;
        boolean z5;
        o.a("FileTransfer", "upload " + str + " to " + str2);
        String m6 = m(jSONArray, 2, "file");
        String m7 = m(jSONArray, 3, "image.jpg");
        String m8 = m(jSONArray, 4, "image/jpeg");
        JSONObject jSONObject = jSONArray.optJSONObject(5) == null ? new JSONObject() : jSONArray.optJSONObject(5);
        boolean z6 = jSONArray.optBoolean(7) || jSONArray.isNull(7);
        JSONObject optJSONObject = jSONArray.optJSONObject(8) == null ? jSONObject.optJSONObject("headers") : jSONArray.optJSONObject(8);
        String string = jSONArray.getString(9);
        String m9 = m(jSONArray, 10, "POST");
        org.apache.cordova.c resourceApi = this.webView.getResourceApi();
        o.a("FileTransfer", "fileKey: " + m6);
        o.a("FileTransfer", "fileName: " + m7);
        o.a("FileTransfer", "mimeType: " + m8);
        o.a("FileTransfer", "params: " + jSONObject);
        o.a("FileTransfer", "chunkedMode: " + z6);
        o.a("FileTransfer", "headers: " + optJSONObject);
        o.a("FileTransfer", "objectId: " + string);
        o.a("FileTransfer", "httpMethod: " + m9);
        Uri o6 = resourceApi.o(Uri.parse(str2));
        int h6 = org.apache.cordova.c.h(o6);
        if (h6 == 6) {
            i6 = 5;
            z5 = true;
        } else {
            i6 = 5;
            z5 = false;
        }
        if (h6 == i6 || z5) {
            e eVar = new e(str, str2, aVar);
            synchronized (f8544c) {
                f8544c.put(string, eVar);
            }
            this.f8371cordova.getThreadPool().execute(new a(eVar, str, resourceApi, o6, m9, optJSONObject, str2, jSONObject, m6, m7, m8, z6, z5, string));
            return;
        }
        JSONObject j6 = j(INVALID_URL_ERR, str, str2, null, 0, null);
        o.c("FileTransfer", "Unsupported URI: " + o6);
        aVar.sendPluginResult(new org.apache.cordova.f(f.a.IO_EXCEPTION, j6));
    }

    @Override // org.apache.cordova.b
    public boolean execute(String str, JSONArray jSONArray, org.apache.cordova.a aVar) {
        if (!str.equals("upload") && !str.equals("download")) {
            if (!str.equals("abort")) {
                return false;
            }
            h(jSONArray.getString(0));
            aVar.success();
            return true;
        }
        String string = jSONArray.getString(0);
        String string2 = jSONArray.getString(1);
        if (str.equals("upload")) {
            q(string, string2, jSONArray, aVar);
        } else {
            l(string, string2, jSONArray, aVar);
        }
        return true;
    }
}
