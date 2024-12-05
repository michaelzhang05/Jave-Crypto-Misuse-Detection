package org.apache.cordova.file;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import m5.j;
import o5.f;
import o5.g;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: h, reason: collision with root package name */
    private final Context f8526h;

    public b(Context context, org.apache.cordova.c cVar, j jVar) {
        super(Uri.parse("content://"), "content", cVar, jVar);
        this.f8526h = context;
    }

    private Long G(Cursor cursor) {
        String string;
        int columnIndex = cursor.getColumnIndex("_size");
        if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(string));
    }

    @Override // org.apache.cordova.file.c
    public f A(Uri uri) {
        if (!"content".equals(uri.getScheme())) {
            return null;
        }
        String encodedPath = uri.getEncodedPath();
        if (encodedPath.length() > 0) {
            encodedPath = encodedPath.substring(1);
        }
        Uri.Builder appendPath = d().appendPath(uri.getAuthority());
        if (encodedPath.length() > 0) {
            appendPath.appendEncodedPath(encodedPath);
        }
        return f.b(appendPath.encodedQuery(uri.getEncodedQuery()).encodedFragment(uri.getEncodedFragment()).build());
    }

    @Override // org.apache.cordova.file.c
    public Uri B(f fVar) {
        String encodedPath = fVar.f8278a.getEncodedPath();
        String substring = encodedPath.substring(encodedPath.indexOf(this.f8532d) + 1 + this.f8532d.length() + 2);
        if (substring.length() < 2) {
            return null;
        }
        String str = "content://" + substring;
        String encodedQuery = fVar.f8278a.getEncodedQuery();
        if (encodedQuery != null) {
            str = str + '?' + encodedQuery;
        }
        String encodedFragment = fVar.f8278a.getEncodedFragment();
        if (encodedFragment != null) {
            str = str + '#' + encodedFragment;
        }
        return Uri.parse(str);
    }

    @Override // org.apache.cordova.file.c
    public long C(f fVar, long j6) {
        throw new g("Couldn't truncate file given its content URI");
    }

    @Override // org.apache.cordova.file.c
    public long D(f fVar, String str, int i6, boolean z5) {
        throw new g("Couldn't write to file given its content URI");
    }

    protected Long E(Cursor cursor) {
        String string;
        int columnIndex = cursor.getColumnIndex("date_modified");
        if (columnIndex == -1) {
            columnIndex = cursor.getColumnIndex("last_modified");
        }
        if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(string));
    }

    protected Cursor F(Uri uri) {
        try {
            return this.f8526h.getContentResolver().query(uri, null, null, null, null);
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // org.apache.cordova.file.c
    public f a(String str) {
        return null;
    }

    @Override // org.apache.cordova.file.c
    public boolean b(f fVar) {
        return true;
    }

    @Override // org.apache.cordova.file.c
    public String f(f fVar) {
        File i6 = this.f8530b.i(B(fVar));
        if (i6 == null) {
            return null;
        }
        return i6.getAbsolutePath();
    }

    @Override // org.apache.cordova.file.c
    public JSONObject h(f fVar, String str, JSONObject jSONObject, boolean z5) {
        throw new UnsupportedOperationException("getFile() not supported for content:. Use resolveLocalFileSystemURL instead.");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003a A[DONT_GENERATE] */
    @Override // org.apache.cordova.file.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject i(o5.f r8) {
        /*
            r7 = this;
            android.net.Uri r0 = r7.B(r8)
            org.apache.cordova.c r1 = r7.f8530b
            java.lang.String r1 = r1.f(r0)
            android.database.Cursor r2 = r7.F(r0)
            r3 = 0
            if (r2 == 0) goto L30
            boolean r5 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L64
            if (r5 == 0) goto L30
            java.lang.Long r0 = r7.G(r2)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L64
            if (r0 == 0) goto L23
            long r5 = r0.longValue()     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L64
            goto L25
        L23:
            r5 = -1
        L25:
            java.lang.Long r0 = r7.E(r2)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L64
            if (r0 == 0) goto L38
            long r3 = r0.longValue()     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L64
            goto L38
        L30:
            org.apache.cordova.c r5 = r7.f8530b     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L64
            org.apache.cordova.c$a r0 = r5.j(r0)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L64
            long r5 = r0.f8381d     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L64
        L38:
            if (r2 == 0) goto L3d
            r2.close()
        L3d:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r2 = "size"
            r0.put(r2, r5)     // Catch: org.json.JSONException -> L60
            java.lang.String r2 = "type"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L60
            java.lang.String r1 = "name"
            java.lang.String r2 = r7.f8532d     // Catch: org.json.JSONException -> L60
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L60
            java.lang.String r1 = "fullPath"
            java.lang.String r8 = r8.f8280c     // Catch: org.json.JSONException -> L60
            r0.put(r1, r8)     // Catch: org.json.JSONException -> L60
            java.lang.String r8 = "lastModifiedDate"
            r0.put(r8, r3)     // Catch: org.json.JSONException -> L60
            return r0
        L60:
            r8 = 0
            return r8
        L62:
            r8 = move-exception
            goto L6e
        L64:
            r8 = move-exception
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L62
            r0.<init>()     // Catch: java.lang.Throwable -> L62
            r0.initCause(r8)     // Catch: java.lang.Throwable -> L62
            throw r0     // Catch: java.lang.Throwable -> L62
        L6e:
            if (r2 == 0) goto L73
            r2.close()
        L73:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.file.b.i(o5.f):org.json.JSONObject");
    }

    @Override // org.apache.cordova.file.c
    public f[] n(f fVar) {
        throw new UnsupportedOperationException("readEntriesAtLocalURL() not supported for content:. Use resolveLocalFileSystemURL instead.");
    }

    @Override // org.apache.cordova.file.c
    public boolean y(f fVar) {
        throw new g("Cannot remove content url");
    }

    @Override // org.apache.cordova.file.c
    public boolean z(f fVar) {
        Uri B = B(fVar);
        try {
            this.f8526h.getContentResolver().delete(B, null, null);
            return true;
        } catch (UnsupportedOperationException e6) {
            g gVar = new g("Deleting not supported for content uri: " + B);
            gVar.initCause(e6);
            throw gVar;
        }
    }
}
