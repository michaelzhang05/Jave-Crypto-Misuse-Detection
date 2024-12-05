package org.apache.cordova.file;

import android.content.res.AssetManager;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import m5.j;
import m5.o;
import o5.f;
import o5.g;
import o5.i;
import org.apache.cordova.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: i, reason: collision with root package name */
    private static Object f8521i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private static boolean f8522j;

    /* renamed from: k, reason: collision with root package name */
    private static Map f8523k;

    /* renamed from: l, reason: collision with root package name */
    private static Map f8524l;

    /* renamed from: h, reason: collision with root package name */
    private final AssetManager f8525h;

    public a(AssetManager assetManager, org.apache.cordova.c cVar, j jVar) {
        super(Uri.parse("file:///android_asset/"), "assets", cVar, jVar);
        this.f8525h = assetManager;
    }

    private long E(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        G();
        Map map = f8524l;
        if (map != null) {
            Long l6 = (Long) map.get(str);
            if (l6 != null) {
                return l6.longValue();
            }
            throw new FileNotFoundException("Asset not found: " + str);
        }
        c.a aVar = null;
        try {
            try {
                aVar = this.f8530b.j(u(str));
                long j6 = aVar.f8381d;
                if (j6 < 0) {
                    j6 = aVar.f8379b.available();
                }
                try {
                    aVar.f8379b.close();
                } catch (IOException e6) {
                    o.a("AssetFilesystem", e6.getLocalizedMessage());
                }
                return j6;
            } catch (IOException e7) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("File not found: " + str);
                fileNotFoundException.initCause(e7);
                throw fileNotFoundException;
            }
        } catch (Throwable th) {
            if (aVar != null) {
                try {
                    aVar.f8379b.close();
                } catch (IOException e8) {
                    o.a("AssetFilesystem", e8.getLocalizedMessage());
                }
            }
            throw th;
        }
    }

    private boolean F(String str) {
        try {
            return H(str).length != 0;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069 A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #9 {, blocks: (B:4:0x0003, B:12:0x0028, B:14:0x0065, B:16:0x0069, B:20:0x002d, B:21:0x0033, B:26:0x0044, B:29:0x0049, B:34:0x0059, B:37:0x005e, B:44:0x007b, B:41:0x0089, B:47:0x0080, B:53:0x008a), top: B:3:0x0003, inners: #1, #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void G() {
        /*
            r6 = this;
            java.lang.Object r0 = org.apache.cordova.file.a.f8521i
            monitor-enter(r0)
            java.util.Map r1 = org.apache.cordova.file.a.f8523k     // Catch: java.lang.Throwable -> L8c
            if (r1 != 0) goto L8a
            r1 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L41 java.lang.ClassNotFoundException -> L50
            android.content.res.AssetManager r3 = r6.f8525h     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L41 java.lang.ClassNotFoundException -> L50
            java.lang.String r4 = "cdvasset.manifest"
            java.io.InputStream r3 = r3.open(r4)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L41 java.lang.ClassNotFoundException -> L50
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L41 java.lang.ClassNotFoundException -> L50
            java.lang.Object r1 = r2.readObject()     // Catch: java.io.IOException -> L37 java.lang.ClassNotFoundException -> L3a java.lang.Throwable -> L78
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.io.IOException -> L37 java.lang.ClassNotFoundException -> L3a java.lang.Throwable -> L78
            org.apache.cordova.file.a.f8523k = r1     // Catch: java.io.IOException -> L37 java.lang.ClassNotFoundException -> L3a java.lang.Throwable -> L78
            java.lang.Object r1 = r2.readObject()     // Catch: java.io.IOException -> L37 java.lang.ClassNotFoundException -> L3a java.lang.Throwable -> L78
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.io.IOException -> L37 java.lang.ClassNotFoundException -> L3a java.lang.Throwable -> L78
            org.apache.cordova.file.a.f8524l = r1     // Catch: java.io.IOException -> L37 java.lang.ClassNotFoundException -> L3a java.lang.Throwable -> L78
            r1 = 1
            org.apache.cordova.file.a.f8522j = r1     // Catch: java.io.IOException -> L37 java.lang.ClassNotFoundException -> L3a java.lang.Throwable -> L78
            r2.close()     // Catch: java.io.IOException -> L2c java.lang.Throwable -> L8c
            goto L65
        L2c:
            r1 = move-exception
            java.lang.String r2 = "AssetFilesystem"
            java.lang.String r1 = r1.getLocalizedMessage()     // Catch: java.lang.Throwable -> L8c
        L33:
            m5.o.a(r2, r1)     // Catch: java.lang.Throwable -> L8c
            goto L65
        L37:
            r1 = r2
            goto L42
        L3a:
            r1 = move-exception
            goto L54
        L3c:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L79
        L41:
        L42:
            if (r1 == 0) goto L65
            r1.close()     // Catch: java.io.IOException -> L48 java.lang.Throwable -> L8c
            goto L65
        L48:
            r1 = move-exception
            java.lang.String r2 = "AssetFilesystem"
            java.lang.String r1 = r1.getLocalizedMessage()     // Catch: java.lang.Throwable -> L8c
            goto L33
        L50:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L54:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L65
            r2.close()     // Catch: java.io.IOException -> L5d java.lang.Throwable -> L8c
            goto L65
        L5d:
            r1 = move-exception
            java.lang.String r2 = "AssetFilesystem"
            java.lang.String r1 = r1.getLocalizedMessage()     // Catch: java.lang.Throwable -> L8c
            goto L33
        L65:
            java.util.Map r1 = org.apache.cordova.file.a.f8523k     // Catch: java.lang.Throwable -> L8c
            if (r1 != 0) goto L8a
            java.lang.String r1 = "AssetFilesystem"
            java.lang.String r2 = "Asset manifest not found. Recursive copies and directory listing will be slow."
            m5.o.g(r1, r2)     // Catch: java.lang.Throwable -> L8c
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L8c
            r1.<init>()     // Catch: java.lang.Throwable -> L8c
            org.apache.cordova.file.a.f8523k = r1     // Catch: java.lang.Throwable -> L8c
            goto L8a
        L78:
            r1 = move-exception
        L79:
            if (r2 == 0) goto L89
            r2.close()     // Catch: java.io.IOException -> L7f java.lang.Throwable -> L8c
            goto L89
        L7f:
            r2 = move-exception
            java.lang.String r3 = "AssetFilesystem"
            java.lang.String r2 = r2.getLocalizedMessage()     // Catch: java.lang.Throwable -> L8c
            m5.o.a(r3, r2)     // Catch: java.lang.Throwable -> L8c
        L89:
            throw r1     // Catch: java.lang.Throwable -> L8c
        L8a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            return
        L8c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.file.a.G():void");
    }

    private String[] H(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        G();
        String[] strArr = (String[]) f8523k.get(str);
        if (strArr != null) {
            return strArr;
        }
        if (f8522j) {
            return new String[0];
        }
        String[] list = this.f8525h.list(str);
        f8523k.put(str, list);
        return list;
    }

    @Override // org.apache.cordova.file.c
    public f A(Uri uri) {
        if (!"file".equals(uri.getScheme())) {
            return null;
        }
        Uri fromFile = Uri.fromFile(new File(uri.getPath()));
        String encodedPath = this.f8529a.getEncodedPath();
        String substring = encodedPath.substring(0, encodedPath.length() - 1);
        if (!fromFile.getEncodedPath().startsWith(substring)) {
            return null;
        }
        String substring2 = fromFile.getEncodedPath().substring(substring.length());
        if (!substring2.isEmpty()) {
            substring2 = substring2.substring(1);
        }
        Uri.Builder d6 = d();
        if (!substring2.isEmpty()) {
            d6.appendEncodedPath(substring2);
        }
        if (F(substring2) || uri.getPath().endsWith("/")) {
            d6.appendEncodedPath("");
        }
        return f.b(d6.build());
    }

    @Override // org.apache.cordova.file.c
    public Uri B(f fVar) {
        return u(fVar.f8280c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.apache.cordova.file.c
    public long C(f fVar, long j6) {
        throw new g("Assets are read-only");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.apache.cordova.file.c
    public long D(f fVar, String str, int i6, boolean z5) {
        throw new g("Assets are read-only");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.apache.cordova.file.c
    public f a(String str) {
        return null;
    }

    @Override // org.apache.cordova.file.c
    public boolean b(f fVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.apache.cordova.file.c
    public String f(f fVar) {
        return new File(this.f8529a.getPath(), fVar.f8280c).toString();
    }

    @Override // org.apache.cordova.file.c
    public JSONObject h(f fVar, String str, JSONObject jSONObject, boolean z5) {
        String v5;
        if (jSONObject != null && jSONObject.optBoolean("create")) {
            throw new UnsupportedOperationException("Assets are read-only");
        }
        if (z5 && !str.endsWith("/")) {
            str = str + "/";
        }
        if (str.startsWith("/")) {
            v5 = c.v(str);
        } else {
            v5 = c.v(fVar.f8280c + "/" + str);
        }
        f o6 = o(v5);
        i(o6);
        boolean F = F(o6.f8280c);
        if (z5 && !F) {
            throw new i("path doesn't exist or is file");
        }
        if (z5 || !F) {
            return s(o6);
        }
        throw new i("path doesn't exist or is directory");
    }

    @Override // org.apache.cordova.file.c
    public JSONObject i(f fVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", fVar.f8281d ? 0L : E(fVar.f8280c));
            jSONObject.put("type", fVar.f8281d ? "text/directory" : this.f8530b.f(B(fVar)));
            jSONObject.put("name", new File(fVar.f8280c).getName());
            jSONObject.put("fullPath", fVar.f8280c);
            jSONObject.put("lastModifiedDate", 0);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // org.apache.cordova.file.c
    public f[] n(f fVar) {
        String substring = fVar.f8280c.substring(1);
        if (substring.endsWith("/")) {
            substring = substring.substring(0, substring.length() - 1);
        }
        try {
            String[] H = H(substring);
            f[] fVarArr = new f[H.length];
            for (int i6 = 0; i6 < H.length; i6++) {
                fVarArr[i6] = o(new File(fVar.f8280c, H[i6]).getPath());
            }
            return fVarArr;
        } catch (IOException e6) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException();
            fileNotFoundException.initCause(e6);
            throw fileNotFoundException;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.apache.cordova.file.c
    public boolean y(f fVar) {
        throw new g("Assets are read-only");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.apache.cordova.file.c
    public boolean z(f fVar) {
        throw new g("Assets are read-only");
    }
}
