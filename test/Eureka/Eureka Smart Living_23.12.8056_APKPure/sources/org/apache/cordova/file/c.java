package org.apache.cordova.file;

import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import m5.j;
import o5.f;
import o5.g;
import org.apache.cordova.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: f, reason: collision with root package name */
    static String f8527f = "https";

    /* renamed from: g, reason: collision with root package name */
    static String f8528g = "localhost";

    /* renamed from: a, reason: collision with root package name */
    protected final Uri f8529a;

    /* renamed from: b, reason: collision with root package name */
    protected final org.apache.cordova.c f8530b;

    /* renamed from: c, reason: collision with root package name */
    protected final j f8531c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8532d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f8533e;

    /* loaded from: classes.dex */
    protected class a extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        long f8534a;

        public a(InputStream inputStream, long j6) {
            super(inputStream);
            this.f8534a = j6;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            long j6 = this.f8534a;
            if (j6 <= 0) {
                return -1;
            }
            this.f8534a = j6 - 1;
            return ((FilterInputStream) this).in.read();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i6, int i7) {
            long j6 = this.f8534a;
            if (j6 <= 0) {
                return -1;
            }
            if (i7 > j6) {
                i7 = (int) j6;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i6, i7);
            this.f8534a -= read;
            return read;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(InputStream inputStream, String str);
    }

    public c(Uri uri, String str, org.apache.cordova.c cVar, j jVar) {
        this.f8529a = uri;
        this.f8532d = str;
        this.f8530b = cVar;
        this.f8531c = jVar;
    }

    public static JSONObject t(f fVar, Uri uri) {
        try {
            String str = fVar.f8280c;
            String[] split = str.substring(0, str.length() - (str.endsWith("/") ? 1 : 0)).split("/+");
            String str2 = split[split.length - 1];
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isFile", !fVar.f8281d);
            jSONObject.put("isDirectory", fVar.f8281d);
            jSONObject.put("name", str2);
            jSONObject.put("fullPath", str);
            jSONObject.put("filesystemName", fVar.f8279b);
            jSONObject.put("filesystem", "temporary".equals(fVar.f8279b) ? 0 : 1);
            String uri2 = uri.toString();
            if (fVar.f8281d && !uri2.endsWith("/")) {
                uri2 = uri2 + "/";
            }
            jSONObject.put("nativeURL", uri2);
            return jSONObject;
        } catch (JSONException e6) {
            e6.printStackTrace();
            throw new RuntimeException(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String v(String str) {
        boolean startsWith = str.startsWith("/");
        if (startsWith) {
            str = str.replaceFirst("/+", "");
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(str.split("/+")));
        int i6 = 0;
        while (i6 < arrayList.size()) {
            if (((String) arrayList.get(i6)).equals("..")) {
                arrayList.remove(i6);
                if (i6 > 0) {
                    arrayList.remove(i6 - 1);
                    i6--;
                }
            }
            i6++;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            sb.append("/");
            sb.append(str2);
        }
        String sb2 = sb.toString();
        return startsWith ? sb2 : sb2.substring(1);
    }

    public abstract f A(Uri uri);

    public abstract Uri B(f fVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long C(f fVar, long j6);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long D(f fVar, String str, int i6, boolean z5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract f a(String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean b(f fVar);

    public JSONObject c(f fVar, String str, c cVar, f fVar2, boolean z5) {
        if (z5 && !cVar.b(fVar2)) {
            throw new g("Cannot move file at source URL");
        }
        f p6 = p(str, fVar2, fVar, fVar2.f8281d);
        c.a j6 = this.f8530b.j(cVar.B(fVar2));
        try {
            this.f8530b.c(j6, k(p6));
            if (z5) {
                cVar.z(fVar2);
            }
            return g(p6);
        } catch (IOException e6) {
            j6.f8379b.close();
            throw e6;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Uri.Builder d() {
        String lowerCase = this.f8531c.c("scheme", f8527f).toLowerCase();
        String lowerCase2 = this.f8531c.c("hostname", f8528g).toLowerCase();
        return new Uri.Builder().scheme(lowerCase).authority(lowerCase2).path(f.a(this.f8532d));
    }

    public boolean e(f fVar) {
        try {
            i(fVar);
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String f(f fVar);

    public JSONObject g(f fVar) {
        return s(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract JSONObject h(f fVar, String str, JSONObject jSONObject, boolean z5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract JSONObject i(f fVar);

    public long j() {
        return 0L;
    }

    public OutputStream k(f fVar) {
        return this.f8530b.l(B(fVar));
    }

    public JSONObject l(f fVar) {
        Uri uri = fVar.f8278a;
        String parent = new File(fVar.f8278a.getPath()).getParent();
        if (!"/".equals(parent)) {
            uri = fVar.f8278a.buildUpon().path(parent + '/').build();
        }
        return g(f.b(uri));
    }

    public JSONObject m() {
        if (this.f8533e == null) {
            this.f8533e = r(this.f8529a);
        }
        return this.f8533e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract f[] n(f fVar);

    public f o(String str) {
        Uri u5 = u(str);
        if (u5 != null) {
            return A(u5);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public f p(String str, f fVar, f fVar2, boolean z5) {
        String str2;
        if ("null".equals(str) || "".equals(str)) {
            str = fVar.f8278a.getLastPathSegment();
        }
        String uri = fVar2.f8278a.toString();
        if (uri.endsWith("/")) {
            str2 = uri + str;
        } else {
            str2 = uri + "/" + str;
        }
        if (z5) {
            str2 = str2 + '/';
        }
        return f.c(str2);
    }

    public JSONObject q(File file) {
        return r(Uri.fromFile(file));
    }

    public JSONObject r(Uri uri) {
        f A = A(uri);
        if (A == null) {
            return null;
        }
        return t(A, uri);
    }

    public JSONObject s(f fVar) {
        Uri B = B(fVar);
        if (B == null) {
            return null;
        }
        return t(fVar, B);
    }

    public Uri u(String str) {
        if (str == null) {
            return null;
        }
        String encodedPath = Uri.fromFile(new File(str)).getEncodedPath();
        if (encodedPath.startsWith("/")) {
            encodedPath = encodedPath.substring(1);
        }
        return this.f8529a.buildUpon().appendEncodedPath(encodedPath).build();
    }

    public final JSONArray w(f fVar) {
        f[] n6 = n(fVar);
        JSONArray jSONArray = new JSONArray();
        if (n6 != null) {
            for (f fVar2 : n6) {
                jSONArray.put(s(fVar2));
            }
        }
        return jSONArray;
    }

    public void x(f fVar, long j6, long j7, b bVar) {
        c.a j8 = this.f8530b.j(B(fVar));
        if (j7 < 0) {
            j7 = j8.f8381d;
        }
        long j9 = j7 - j6;
        if (j6 > 0) {
            try {
                j8.f8379b.skip(j6);
            } finally {
                j8.f8379b.close();
            }
        }
        InputStream inputStream = j8.f8379b;
        if (j7 < j8.f8381d) {
            inputStream = new a(inputStream, j9);
        }
        bVar.a(inputStream, j8.f8380c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean y(f fVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean z(f fVar);
}
