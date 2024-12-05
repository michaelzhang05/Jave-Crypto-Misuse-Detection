package org.apache.cordova.file;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import m5.j;
import o5.f;
import o5.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: h, reason: collision with root package name */
    private final Context f8536h;

    public d(String str, Context context, org.apache.cordova.c cVar, File file, j jVar) {
        super(Uri.fromFile(file).buildUpon().appendEncodedPath("").build(), str, cVar, jVar);
        this.f8536h = context;
    }

    private void E(Uri uri) {
        this.f8536h.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
    }

    private void F(c cVar, f fVar, File file, boolean z5) {
        String f6;
        if (z5 && (f6 = cVar.f(fVar)) != null) {
            File file2 = new File(f6);
            if (file.exists()) {
                if (file.list().length > 0) {
                    throw new o5.e("directory is not empty");
                }
                file.delete();
            }
            if (file2.renameTo(file)) {
                return;
            }
        }
        if (file.exists()) {
            if (file.list().length > 0) {
                throw new o5.e("directory is not empty");
            }
        } else if (!file.mkdir()) {
            throw new g("Couldn't create the destination directory");
        }
        for (f fVar2 : cVar.n(fVar)) {
            File file3 = new File(file, new File(fVar2.f8280c).getName());
            if (fVar2.f8281d) {
                F(cVar, fVar2, file3, false);
            } else {
                G(cVar, fVar2, file3, false);
            }
        }
        if (z5) {
            cVar.y(fVar);
        }
    }

    private void G(c cVar, f fVar, File file, boolean z5) {
        String f6;
        if (z5 && (f6 = cVar.f(fVar)) != null && new File(f6).renameTo(file)) {
            return;
        }
        this.f8530b.c(this.f8530b.j(cVar.B(fVar)), new FileOutputStream(file));
        if (z5) {
            cVar.z(fVar);
        }
    }

    private String I(String str) {
        if (str == null || !str.startsWith(this.f8529a.getPath())) {
            return null;
        }
        return str.substring(this.f8529a.getPath().length() - 1);
    }

    private boolean J(String str) {
        for (File file : this.f8536h.getExternalMediaDirs()) {
            if (file != null && str.startsWith(file.getAbsolutePath())) {
                return true;
            }
        }
        return str.startsWith(Environment.getExternalStorageDirectory().getAbsolutePath());
    }

    @Override // org.apache.cordova.file.c
    public f A(Uri uri) {
        if (!"file".equals(uri.getScheme())) {
            return null;
        }
        File file = new File(uri.getPath());
        Uri fromFile = Uri.fromFile(file);
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
        if (file.isDirectory()) {
            d6.appendEncodedPath("");
        }
        return f.b(d6.build());
    }

    @Override // org.apache.cordova.file.c
    public Uri B(f fVar) {
        return u(fVar.f8280c);
    }

    @Override // org.apache.cordova.file.c
    public long C(f fVar, long j6) {
        if (!new File(f(fVar)).exists()) {
            throw new FileNotFoundException("File at " + fVar.f8278a + " does not exist.");
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(f(fVar), "rw");
        try {
            if (randomAccessFile.length() < j6) {
                return randomAccessFile.length();
            }
            randomAccessFile.getChannel().truncate(j6);
            return j6;
        } finally {
            randomAccessFile.close();
        }
    }

    @Override // org.apache.cordova.file.c
    public long D(f fVar, String str, int i6, boolean z5) {
        boolean z6;
        if (i6 > 0) {
            C(fVar, i6);
            z6 = true;
        } else {
            z6 = false;
        }
        byte[] decode = z5 ? Base64.decode(str, 0) : str.getBytes(Charset.defaultCharset());
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(decode);
        try {
            int length = decode.length;
            byte[] bArr = new byte[length];
            String f6 = f(fVar);
            FileOutputStream fileOutputStream = new FileOutputStream(f6, z6);
            try {
                byteArrayInputStream.read(bArr, 0, length);
                fileOutputStream.write(bArr, 0, decode.length);
                fileOutputStream.flush();
                fileOutputStream.close();
                if (J(f6)) {
                    E(Uri.fromFile(new File(f6)));
                }
                return decode.length;
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (NullPointerException e6) {
            g gVar = new g(fVar.toString());
            gVar.initCause(e6);
            throw gVar;
        }
    }

    public String H(String str) {
        return new File(this.f8529a.getPath(), str).toString();
    }

    protected boolean K(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                K(file2);
            }
        }
        if (file.delete()) {
            return true;
        }
        throw new o5.c("could not delete: " + file.getName());
    }

    @Override // org.apache.cordova.file.c
    public f a(String str) {
        return o(I(str));
    }

    @Override // org.apache.cordova.file.c
    public boolean b(f fVar) {
        return new File(f(fVar)).exists();
    }

    @Override // org.apache.cordova.file.c
    public JSONObject c(f fVar, String str, c cVar, f fVar2, boolean z5) {
        if (!new File(f(fVar)).exists()) {
            throw new FileNotFoundException("The source does not exist");
        }
        f p6 = p(str, fVar2, fVar, fVar2.f8281d);
        Uri B = B(p6);
        Uri B2 = cVar.B(fVar2);
        if (B.equals(B2)) {
            throw new o5.e("Can't copy onto itself");
        }
        if (z5 && !cVar.b(fVar2)) {
            throw new o5.e("Source URL is read-only (cannot move)");
        }
        File file = new File(B.getPath());
        if (file.exists()) {
            if (!fVar2.f8281d && file.isDirectory()) {
                throw new o5.e("Can't copy/move a file to an existing directory");
            }
            if (fVar2.f8281d && file.isFile()) {
                throw new o5.e("Can't copy/move a directory to an existing file");
            }
        }
        if (fVar2.f8281d) {
            if (B.toString().startsWith(B2.toString() + '/')) {
                throw new o5.e("Can't copy directory into itself");
            }
            F(cVar, fVar2, file, z5);
        } else {
            G(cVar, fVar2, file, z5);
        }
        return s(p6);
    }

    @Override // org.apache.cordova.file.c
    public boolean e(f fVar) {
        return new File(f(fVar)).exists();
    }

    @Override // org.apache.cordova.file.c
    public String f(f fVar) {
        return H(fVar.f8280c);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // org.apache.cordova.file.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject h(o5.f r4, java.lang.String r5, org.json.JSONObject r6, boolean r7) {
        /*
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L15
            java.lang.String r1 = "create"
            boolean r1 = r6.optBoolean(r1)
            if (r1 == 0) goto L14
            java.lang.String r0 = "exclusive"
            boolean r0 = r6.optBoolean(r0)
            r6 = r0
            r0 = r1
            goto L16
        L14:
            r0 = r1
        L15:
            r6 = 0
        L16:
            java.lang.String r1 = ":"
            boolean r1 = r5.contains(r1)
            if (r1 != 0) goto Lc4
            java.lang.String r1 = "/"
            if (r7 == 0) goto L37
            boolean r2 = r5.endsWith(r1)
            if (r2 != 0) goto L37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = r2.toString()
        L37:
            boolean r2 = r5.startsWith(r1)
            if (r2 == 0) goto L42
            java.lang.String r4 = org.apache.cordova.file.c.v(r5)
            goto L5a
        L42:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r4.f8280c
            r2.append(r4)
            r2.append(r1)
            r2.append(r5)
            java.lang.String r4 = r2.toString()
            java.lang.String r4 = org.apache.cordova.file.c.v(r4)
        L5a:
            o5.f r4 = r3.o(r4)
            java.io.File r5 = new java.io.File
            java.lang.String r1 = r3.f(r4)
            r5.<init>(r1)
            if (r0 == 0) goto L92
            if (r6 == 0) goto L7a
            boolean r6 = r5.exists()
            if (r6 != 0) goto L72
            goto L7a
        L72:
            o5.c r4 = new o5.c
            java.lang.String r5 = "create/exclusive fails"
            r4.<init>(r5)
            throw r4
        L7a:
            if (r7 == 0) goto L80
            r5.mkdir()
            goto L83
        L80:
            r5.createNewFile()
        L83:
            boolean r5 = r5.exists()
            if (r5 == 0) goto L8a
            goto Laf
        L8a:
            o5.c r4 = new o5.c
            java.lang.String r5 = "create fails"
            r4.<init>(r5)
            throw r4
        L92:
            boolean r6 = r5.exists()
            if (r6 == 0) goto Lbc
            if (r7 == 0) goto La9
            boolean r5 = r5.isFile()
            if (r5 != 0) goto La1
            goto Laf
        La1:
            o5.i r4 = new o5.i
            java.lang.String r5 = "path doesn't exist or is file"
            r4.<init>(r5)
            throw r4
        La9:
            boolean r5 = r5.isDirectory()
            if (r5 != 0) goto Lb4
        Laf:
            org.json.JSONObject r4 = r3.s(r4)
            return r4
        Lb4:
            o5.i r4 = new o5.i
            java.lang.String r5 = "path doesn't exist or is directory"
            r4.<init>(r5)
            throw r4
        Lbc:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = "path does not exist"
            r4.<init>(r5)
            throw r4
        Lc4:
            o5.b r4 = new o5.b
            java.lang.String r5 = "This path has an invalid \":\" in it."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.file.d.h(o5.f, java.lang.String, org.json.JSONObject, boolean):org.json.JSONObject");
    }

    @Override // org.apache.cordova.file.c
    public JSONObject i(f fVar) {
        File file = new File(f(fVar));
        if (!file.exists()) {
            throw new FileNotFoundException("File at " + fVar.f8278a + " does not exist.");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", file.isDirectory() ? 0L : file.length());
            jSONObject.put("type", this.f8530b.f(Uri.fromFile(file)));
            jSONObject.put("name", file.getName());
            jSONObject.put("fullPath", fVar.f8280c);
            jSONObject.put("lastModifiedDate", file.lastModified());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // org.apache.cordova.file.c
    public long j() {
        return o5.a.c(this.f8529a.getPath());
    }

    @Override // org.apache.cordova.file.c
    public f[] n(f fVar) {
        File file = new File(f(fVar));
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return null;
        }
        f[] fVarArr = new f[listFiles.length];
        for (int i6 = 0; i6 < listFiles.length; i6++) {
            fVarArr[i6] = a(listFiles[i6].getPath());
        }
        return fVarArr;
    }

    @Override // org.apache.cordova.file.c
    public boolean y(f fVar) {
        return K(new File(f(fVar)));
    }

    @Override // org.apache.cordova.file.c
    public boolean z(f fVar) {
        File file = new File(f(fVar));
        if (!file.isDirectory() || file.list().length <= 0) {
            return file.delete();
        }
        throw new o5.e("You can't delete a directory that is not empty.");
    }
}
