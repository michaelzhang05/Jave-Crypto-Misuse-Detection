package org.apache.cordova.file;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o0.e;
import org.apache.cordova.f;
import org.apache.cordova.file.FileUtils;
import org.apache.cordova.file.c;
import org.apache.cordova.file.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FileUtils extends org.apache.cordova.b {
    public static int ABORT_ERR = 3;
    public static final int ACTION_GET_DIRECTORY = 2;
    public static final int ACTION_GET_FILE = 0;
    public static final int ACTION_READ_ENTRIES = 3;
    public static final int ACTION_WRITE = 1;
    public static int ENCODING_ERR = 5;
    public static int INVALID_MODIFICATION_ERR = 9;
    public static int INVALID_STATE_ERR = 7;
    public static int NOT_FOUND_ERR = 1;
    public static int NOT_READABLE_ERR = 4;
    public static int NO_MODIFICATION_ALLOWED_ERR = 6;
    public static int PATH_EXISTS_ERR = 12;
    public static int QUOTA_EXCEEDED_ERR = 10;
    public static final int READ = 4;
    public static int SECURITY_ERR = 2;
    public static int SYNTAX_ERR = 8;
    public static int TYPE_MISMATCH_ERR = 11;
    public static int UNKNOWN_ERR = 1000;
    public static final int WRITE = 3;

    /* renamed from: f, reason: collision with root package name */
    private static FileUtils f8449f;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8450c = false;

    /* renamed from: d, reason: collision with root package name */
    private org.apache.cordova.file.e f8451d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f8452e;

    /* loaded from: classes.dex */
    class a implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8453a;

        a(org.apache.cordova.a aVar) {
            this.f8453a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            this.f8453a.sendPluginResult(new org.apache.cordova.f(f.a.OK, (float) FileUtils.this.P(jSONArray.getString(0), jSONArray.getInt(1))));
        }
    }

    /* loaded from: classes.dex */
    class a0 implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8455a;

        a0(org.apache.cordova.a aVar) {
            this.f8455a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            int i6 = jSONArray.getInt(1);
            int i7 = jSONArray.getInt(2);
            FileUtils.this.readFileAs(jSONArray.getString(0), i6, i7, this.f8455a, null, -1);
        }
    }

    /* loaded from: classes.dex */
    class b implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8457a;

        b(org.apache.cordova.a aVar) {
            this.f8457a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            this.f8457a.success(FileUtils.this.I());
        }
    }

    /* loaded from: classes.dex */
    class b0 implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8459a;

        b0(org.apache.cordova.a aVar) {
            this.f8459a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            int i6 = jSONArray.getInt(1);
            int i7 = jSONArray.getInt(2);
            FileUtils.this.readFileAs(jSONArray.getString(0), i6, i7, this.f8459a, null, 6);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8461a;

        c(org.apache.cordova.a aVar) {
            this.f8461a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f8461a.success(FileUtils.this.J());
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
        }
    }

    /* loaded from: classes.dex */
    class c0 implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8463a;

        c0(org.apache.cordova.a aVar) {
            this.f8463a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            int i6 = jSONArray.getInt(1);
            int i7 = jSONArray.getInt(2);
            FileUtils.this.readFileAs(jSONArray.getString(0), i6, i7, this.f8463a, null, 7);
        }
    }

    /* loaded from: classes.dex */
    class d implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8465a;

        d(org.apache.cordova.a aVar) {
            this.f8465a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            FileUtils.this.K(jSONArray.getInt(0), jSONArray.optLong(1), this.f8465a);
        }
    }

    /* loaded from: classes.dex */
    class d0 implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8467a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8468b;

        d0(String str, org.apache.cordova.a aVar) {
            this.f8467a = str;
            this.f8468b = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            String string = jSONArray.getString(0);
            String string2 = FileUtils.this.L(string).getString("nativeURL");
            String string3 = jSONArray.getString(1);
            int i6 = jSONArray.getInt(2);
            Boolean valueOf = Boolean.valueOf(jSONArray.getBoolean(3));
            if (FileUtils.this.D(string2, 3)) {
                FileUtils.this.z(this.f8467a, 1, this.f8468b);
            } else {
                this.f8468b.sendPluginResult(new org.apache.cordova.f(f.a.OK, (float) FileUtils.this.write(string, string3, i6, valueOf.booleanValue())));
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8470a;

        e(org.apache.cordova.a aVar) {
            this.f8470a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            this.f8470a.success(FileUtils.this.L(jSONArray.getString(0)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface e0 {
        void a(JSONArray jSONArray);
    }

    /* loaded from: classes.dex */
    class f implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8472a;

        f(org.apache.cordova.a aVar) {
            this.f8472a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            this.f8472a.success(FileUtils.this.v(jSONArray.getString(0)));
        }
    }

    /* loaded from: classes.dex */
    class g implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8474a;

        g(org.apache.cordova.a aVar) {
            this.f8474a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            this.f8474a.success(FileUtils.this.x(jSONArray.getString(0)));
        }
    }

    /* loaded from: classes.dex */
    class h implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8476a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8477b;

        h(String str, org.apache.cordova.a aVar) {
            this.f8476a = str;
            this.f8477b = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            String string = jSONArray.getString(0);
            String string2 = jSONArray.getString(1);
            String string3 = FileUtils.this.L(string).getString("nativeURL");
            boolean optBoolean = jSONArray.isNull(2) ? false : jSONArray.getJSONObject(2).optBoolean("create", false);
            if (optBoolean && FileUtils.this.D(string3, 3)) {
                FileUtils.this.z(this.f8476a, 2, this.f8477b);
            } else if (optBoolean || !FileUtils.this.D(string3, 4)) {
                this.f8477b.success(FileUtils.this.u(string, string2, jSONArray.optJSONObject(2), true));
            } else {
                FileUtils.this.y(this.f8476a, 2, this.f8477b);
            }
        }
    }

    /* loaded from: classes.dex */
    class i implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8479a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8480b;

        i(org.apache.cordova.a aVar, String str) {
            this.f8479a = aVar;
            this.f8480b = str;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            String string = jSONArray.getString(0);
            String string2 = jSONArray.getString(1);
            if (!string.contains("__cdvfile_")) {
                String string3 = FileUtils.this.L(string).getString("nativeURL");
                boolean optBoolean = jSONArray.isNull(2) ? false : jSONArray.getJSONObject(2).optBoolean("create", false);
                if (optBoolean && FileUtils.this.D(string3, 3)) {
                    FileUtils.this.z(this.f8480b, 0, this.f8479a);
                    return;
                } else if (!optBoolean && FileUtils.this.D(string3, 4)) {
                    FileUtils.this.y(this.f8480b, 0, this.f8479a);
                    return;
                }
            }
            this.f8479a.success(FileUtils.this.u(string, string2, jSONArray.optJSONObject(2), false));
        }
    }

    /* loaded from: classes.dex */
    class j implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8482a;

        j(org.apache.cordova.a aVar) {
            this.f8482a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            if (FileUtils.this.G(jSONArray.getString(0))) {
                this.f8482a.success();
            } else {
                this.f8482a.error(FileUtils.NO_MODIFICATION_ALLOWED_ERR);
            }
        }
    }

    /* loaded from: classes.dex */
    class k implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8484a;

        k(org.apache.cordova.a aVar) {
            this.f8484a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            this.f8484a.sendPluginResult(new org.apache.cordova.f(f.a.OK, o5.a.e()));
        }
    }

    /* loaded from: classes.dex */
    class l implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8486a;

        l(org.apache.cordova.a aVar) {
            this.f8486a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            if (FileUtils.this.H(jSONArray.getString(0))) {
                this.f8486a.success();
            } else {
                this.f8486a.error(FileUtils.NO_MODIFICATION_ALLOWED_ERR);
            }
        }
    }

    /* loaded from: classes.dex */
    class m implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8488a;

        m(org.apache.cordova.a aVar) {
            this.f8488a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            this.f8488a.success(FileUtils.this.O(jSONArray.getString(0), jSONArray.getString(1), jSONArray.getString(2), true));
        }
    }

    /* loaded from: classes.dex */
    class n implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8490a;

        n(org.apache.cordova.a aVar) {
            this.f8490a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            this.f8490a.success(FileUtils.this.O(jSONArray.getString(0), jSONArray.getString(1), jSONArray.getString(2), false));
        }
    }

    /* loaded from: classes.dex */
    class o implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8492a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8493b;

        o(String str, org.apache.cordova.a aVar) {
            this.f8492a = str;
            this.f8493b = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            String string = jSONArray.getString(0);
            if (FileUtils.this.D(FileUtils.this.L(string).getString("nativeURL"), 4)) {
                FileUtils.this.y(this.f8492a, 3, this.f8493b);
            } else {
                this.f8493b.success(FileUtils.this.E(string));
            }
        }
    }

    /* loaded from: classes.dex */
    class p implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8495a;

        p(org.apache.cordova.a aVar) {
            this.f8495a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            this.f8495a.success(FileUtils.this.filesystemPathForURL(jSONArray.getString(0)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class q implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8497a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f8498b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8499c;

        q(String str, e0 e0Var, org.apache.cordova.a aVar) {
            this.f8497a = str;
            this.f8498b = e0Var;
            this.f8499c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            org.apache.cordova.a aVar;
            int i6;
            try {
                this.f8498b.a(new JSONArray(this.f8497a));
            } catch (Exception e6) {
                if (!(e6 instanceof o5.b)) {
                    if (e6 instanceof FileNotFoundException) {
                        aVar = this.f8499c;
                        i6 = FileUtils.NOT_FOUND_ERR;
                    } else if (e6 instanceof o5.c) {
                        aVar = this.f8499c;
                        i6 = FileUtils.PATH_EXISTS_ERR;
                    } else if (e6 instanceof o5.g) {
                        aVar = this.f8499c;
                        i6 = FileUtils.NO_MODIFICATION_ALLOWED_ERR;
                    } else {
                        if (!(e6 instanceof o5.e)) {
                            if (!(e6 instanceof MalformedURLException)) {
                                if (!(e6 instanceof IOException)) {
                                    if (e6 instanceof o5.i) {
                                        aVar = this.f8499c;
                                        i6 = FileUtils.TYPE_MISMATCH_ERR;
                                    } else if (e6 instanceof JSONException) {
                                        this.f8499c.sendPluginResult(new org.apache.cordova.f(f.a.JSON_EXCEPTION));
                                        return;
                                    } else if (e6 instanceof SecurityException) {
                                        aVar = this.f8499c;
                                        i6 = FileUtils.SECURITY_ERR;
                                    } else {
                                        e6.printStackTrace();
                                        aVar = this.f8499c;
                                        i6 = FileUtils.UNKNOWN_ERR;
                                    }
                                }
                            }
                        }
                        aVar = this.f8499c;
                        i6 = FileUtils.INVALID_MODIFICATION_ERR;
                    }
                    aVar.error(i6);
                }
                aVar = this.f8499c;
                i6 = FileUtils.ENCODING_ERR;
                aVar.error(i6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class r implements c.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8501a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8502b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8503c;

        r(int i6, String str, org.apache.cordova.a aVar) {
            this.f8501a = i6;
            this.f8502b = str;
            this.f8503c = aVar;
        }

        @Override // org.apache.cordova.file.c.b
        public void a(InputStream inputStream, String str) {
            org.apache.cordova.f fVar;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr, 0, 8192);
                    if (read <= 0) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                int i6 = this.f8501a;
                if (i6 == 1) {
                    fVar = new org.apache.cordova.f(f.a.OK, byteArrayOutputStream.toString(this.f8502b));
                } else if (i6 == 6) {
                    fVar = new org.apache.cordova.f(f.a.OK, byteArrayOutputStream.toByteArray());
                } else if (i6 != 7) {
                    fVar = new org.apache.cordova.f(f.a.OK, "data:" + str + ";base64," + new String(Base64.encode(byteArrayOutputStream.toByteArray(), 2), "US-ASCII"));
                } else {
                    fVar = new org.apache.cordova.f(f.a.OK, byteArrayOutputStream.toByteArray(), true);
                }
                this.f8503c.sendPluginResult(fVar);
            } catch (IOException e6) {
                m5.o.a("FileUtils", e6.getLocalizedMessage());
                this.f8503c.sendPluginResult(new org.apache.cordova.f(f.a.IO_EXCEPTION, FileUtils.NOT_READABLE_ERR));
            }
        }
    }

    /* loaded from: classes.dex */
    class s implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e.a f8505a;

        s(e.a aVar) {
            this.f8505a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            this.f8505a.c().success(FileUtils.this.u(jSONArray.getString(0), jSONArray.getString(1), jSONArray.optJSONObject(2), false));
        }
    }

    /* loaded from: classes.dex */
    class t implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e.a f8507a;

        t(e.a aVar) {
            this.f8507a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            this.f8507a.c().success(FileUtils.this.u(jSONArray.getString(0), jSONArray.getString(1), jSONArray.optJSONObject(2), true));
        }
    }

    /* loaded from: classes.dex */
    class u implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e.a f8509a;

        u(e.a aVar) {
            this.f8509a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            this.f8509a.c().sendPluginResult(new org.apache.cordova.f(f.a.OK, (float) FileUtils.this.write(jSONArray.getString(0), jSONArray.getString(1), jSONArray.getInt(2), Boolean.valueOf(jSONArray.getBoolean(3)).booleanValue())));
        }
    }

    /* loaded from: classes.dex */
    class v implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8511a;

        v(org.apache.cordova.a aVar) {
            this.f8511a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            this.f8511a.sendPluginResult(new org.apache.cordova.f(f.a.OK, (float) o5.a.b()));
        }
    }

    /* loaded from: classes.dex */
    class w implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e.a f8513a;

        w(e.a aVar) {
            this.f8513a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            this.f8513a.c().success(FileUtils.this.E(jSONArray.getString(0)));
        }
    }

    /* loaded from: classes.dex */
    class x implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8515a;

        x(org.apache.cordova.a aVar) {
            this.f8515a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            this.f8515a.sendPluginResult(new org.apache.cordova.f(f.a.OK, o5.a.d(jSONArray.getString(0))));
        }
    }

    /* loaded from: classes.dex */
    class y implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8517a;

        y(org.apache.cordova.a aVar) {
            this.f8517a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            this.f8517a.sendPluginResult(new org.apache.cordova.f(f.a.OK, o5.a.d(jSONArray.getString(0))));
        }
    }

    /* loaded from: classes.dex */
    class z implements e0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f8519a;

        z(org.apache.cordova.a aVar) {
            this.f8519a = aVar;
        }

        @Override // org.apache.cordova.file.FileUtils.e0
        public void a(JSONArray jSONArray) {
            String string = jSONArray.getString(1);
            int i6 = jSONArray.getInt(2);
            int i7 = jSONArray.getInt(3);
            FileUtils.this.readFileAs(jSONArray.getString(0), i6, i7, this.f8519a, string, 1);
        }
    }

    private boolean A() {
        return Build.VERSION.SDK_INT >= 33 ? m5.p.a(this, "android.permission.READ_MEDIA_IMAGES") && m5.p.a(this, "android.permission.READ_MEDIA_VIDEO") && m5.p.a(this, "android.permission.READ_MEDIA_AUDIO") : m5.p.a(this, "android.permission.READ_EXTERNAL_STORAGE");
    }

    private boolean B() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return m5.p.a(this, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WebResourceResponse C(String str) {
        File file;
        String str2 = "persistent";
        if (!str.startsWith(o5.f.a("persistent"))) {
            str2 = "temporary";
            if (!str.startsWith(o5.f.a("temporary"))) {
                str2 = "files";
                if (!str.startsWith(o5.f.a("files"))) {
                    str2 = "documents";
                    if (!str.startsWith(o5.f.a("documents"))) {
                        str2 = "cache";
                        if (!str.startsWith(o5.f.a("cache"))) {
                            str2 = "root";
                            if (!str.startsWith(o5.f.a("root"))) {
                                str2 = "files-external";
                                if (!str.startsWith(o5.f.a("files-external"))) {
                                    str2 = "sdcard";
                                    if (!str.startsWith(o5.f.a("sdcard"))) {
                                        str2 = "cache-external";
                                        if (!str.startsWith(o5.f.a("cache-external"))) {
                                            str2 = str.startsWith(o5.f.a("assets")) ? "assets" : null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean z5 = str2 == "assets";
        if (str2 != null) {
            Iterator it = this.f8452e.iterator();
            while (it.hasNext()) {
                org.apache.cordova.file.c cVar = (org.apache.cordova.file.c) it.next();
                if (cVar.f8532d.equals(str2)) {
                    String replace = str.replace(o5.f.a(str2) + "/", cVar.f8529a.toString().replace("file://", ""));
                    if (z5) {
                        replace = replace.replace("/android_asset/", "");
                        file = null;
                    } else {
                        file = new File(replace);
                    }
                    try {
                        InputStream fileInputStream = !z5 ? new FileInputStream(file) : this.webView.getContext().getAssets().open(replace);
                        if (!z5) {
                            replace = file.toString();
                        }
                        return new WebResourceResponse(w(Uri.parse(replace)), null, fileInputStream);
                    } catch (FileNotFoundException | IOException e6) {
                        Log.e("FileUtils", e6.getMessage());
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean D(String str, int i6) {
        JSONObject J = J();
        ArrayList arrayList = new ArrayList();
        arrayList.add(J.getString("applicationDirectory"));
        arrayList.add(J.getString("applicationStorageDirectory"));
        if (J.has("externalApplicationStorageDirectory")) {
            arrayList.add(J.getString("externalApplicationStorageDirectory"));
        }
        if (i6 == 4 && A()) {
            return false;
        }
        if (i6 == 3 && B()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONArray E(String str) {
        try {
            o5.f c6 = o5.f.c(str);
            org.apache.cordova.file.c r5 = r(c6);
            if (r5 != null) {
                return r5.w(c6);
            }
            throw new MalformedURLException("No installed handlers for this URL");
        } catch (IllegalArgumentException e6) {
            MalformedURLException malformedURLException = new MalformedURLException("Unrecognized filesystem URL");
            malformedURLException.initCause(e6);
            throw malformedURLException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G(String str) {
        try {
            o5.f c6 = o5.f.c(str);
            if ("".equals(c6.f8280c) || "/".equals(c6.f8280c)) {
                throw new o5.g("You can't delete the root directory");
            }
            org.apache.cordova.file.c r5 = r(c6);
            if (r5 != null) {
                return r5.z(c6);
            }
            throw new MalformedURLException("No installed handlers for this URL");
        } catch (IllegalArgumentException e6) {
            MalformedURLException malformedURLException = new MalformedURLException("Unrecognized filesystem URL");
            malformedURLException.initCause(e6);
            throw malformedURLException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean H(String str) {
        try {
            o5.f c6 = o5.f.c(str);
            if ("".equals(c6.f8280c) || "/".equals(c6.f8280c)) {
                throw new o5.g("You can't delete the root directory");
            }
            org.apache.cordova.file.c r5 = r(c6);
            if (r5 != null) {
                return r5.y(c6);
            }
            throw new MalformedURLException("No installed handlers for this URL");
        } catch (IllegalArgumentException e6) {
            MalformedURLException malformedURLException = new MalformedURLException("Unrecognized filesystem URL");
            malformedURLException.initCause(e6);
            throw malformedURLException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONArray I() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f8452e.iterator();
        while (it.hasNext()) {
            jSONArray.put(((org.apache.cordova.file.c) it.next()).m());
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject J() {
        androidx.appcompat.app.c activity = this.f8371cordova.getActivity();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("applicationDirectory", "file:///android_asset/");
        jSONObject.put("applicationStorageDirectory", N(activity.getFilesDir().getParentFile()));
        jSONObject.put("dataDirectory", N(activity.getFilesDir()));
        jSONObject.put("cacheDirectory", N(activity.getCacheDir()));
        if (Environment.getExternalStorageState().equals("mounted")) {
            try {
                jSONObject.put("externalApplicationStorageDirectory", N(activity.getExternalFilesDir(null).getParentFile()));
                jSONObject.put("externalDataDirectory", N(activity.getExternalFilesDir(null)));
                jSONObject.put("externalCacheDirectory", N(activity.getExternalCacheDir()));
                jSONObject.put("externalRootDirectory", N(Environment.getExternalStorageDirectory()));
            } catch (NullPointerException unused) {
                m5.o.a("FileUtils", "Unable to access these paths, most liklely due to USB storage");
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(int i6, long j6, org.apache.cordova.a aVar) {
        org.apache.cordova.file.c cVar;
        org.apache.cordova.f fVar;
        try {
            cVar = (org.apache.cordova.file.c) this.f8452e.get(i6);
        } catch (ArrayIndexOutOfBoundsException unused) {
            cVar = null;
        }
        if (cVar == null) {
            fVar = new org.apache.cordova.f(f.a.ERROR, NOT_FOUND_ERR);
        } else {
            if ((j6 > 0 ? cVar.j() : 0L) >= j6) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", cVar.f8532d);
                jSONObject.put("root", cVar.m());
                aVar.success(jSONObject);
                return;
            }
            fVar = new org.apache.cordova.f(f.a.ERROR, QUOTA_EXCEEDED_ERR);
        }
        aVar.sendPluginResult(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject L(String str) {
        boolean z5;
        if (str == null) {
            throw new MalformedURLException("Unrecognized filesystem URL");
        }
        Uri parse = Uri.parse(str);
        o5.f b6 = o5.f.b(parse);
        if (b6 == null) {
            b6 = resolveNativeUri(parse);
            z5 = true;
        } else {
            z5 = false;
        }
        try {
            org.apache.cordova.file.c r5 = r(b6);
            if (r5 == null) {
                throw new MalformedURLException("No installed handlers for this URL");
            }
            if (!r5.e(b6)) {
                throw new FileNotFoundException();
            }
            if (!z5) {
                b6 = r5.A(r5.B(b6));
            }
            return r5.g(b6);
        } catch (IllegalArgumentException e6) {
            MalformedURLException malformedURLException = new MalformedURLException("Unrecognized filesystem URL");
            malformedURLException.initCause(e6);
            throw malformedURLException;
        }
    }

    private void M(e0 e0Var, String str, org.apache.cordova.a aVar) {
        this.f8371cordova.getThreadPool().execute(new q(str, e0Var, aVar));
    }

    private static String N(File file) {
        return Uri.fromFile(file).toString() + '/';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject O(String str, String str2, String str3, boolean z5) {
        if (str == null || str2 == null) {
            throw new FileNotFoundException();
        }
        o5.f c6 = o5.f.c(str);
        o5.f c7 = o5.f.c(str2);
        org.apache.cordova.file.c r5 = r(c6);
        org.apache.cordova.file.c r6 = r(c7);
        if (str3 == null || !str3.contains(":")) {
            return r6.c(c7, str3, r5, c6, z5);
        }
        throw new o5.b("Bad file name");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long P(String str, long j6) {
        try {
            o5.f c6 = o5.f.c(str);
            org.apache.cordova.file.c r5 = r(c6);
            if (r5 != null) {
                return r5.C(c6, j6);
            }
            throw new MalformedURLException("No installed handlers for this URL");
        } catch (IllegalArgumentException e6) {
            MalformedURLException malformedURLException = new MalformedURLException("Unrecognized filesystem URL");
            malformedURLException.initCause(e6);
            throw malformedURLException;
        }
    }

    @Deprecated
    public static JSONObject getEntry(File file) {
        if (getFilePlugin() != null) {
            return getFilePlugin().getEntryForFile(file);
        }
        return null;
    }

    public static FileUtils getFilePlugin() {
        return f8449f;
    }

    private org.apache.cordova.file.c q(String str) {
        String str2;
        Iterator it = this.f8452e.iterator();
        while (it.hasNext()) {
            org.apache.cordova.file.c cVar = (org.apache.cordova.file.c) it.next();
            if (cVar != null && (str2 = cVar.f8532d) != null && str2.equals(str)) {
                return cVar;
            }
        }
        return null;
    }

    private org.apache.cordova.file.c r(o5.f fVar) {
        if (fVar == null) {
            return null;
        }
        return q(fVar.f8279b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject u(String str, String str2, JSONObject jSONObject, boolean z5) {
        try {
            o5.f c6 = o5.f.c(str);
            org.apache.cordova.file.c r5 = r(c6);
            if (r5 != null) {
                return r5.h(c6, str2, jSONObject, z5);
            }
            throw new MalformedURLException("No installed handlers for this URL");
        } catch (IllegalArgumentException e6) {
            MalformedURLException malformedURLException = new MalformedURLException("Unrecognized filesystem URL");
            malformedURLException.initCause(e6);
            throw malformedURLException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject v(String str) {
        try {
            o5.f c6 = o5.f.c(str);
            org.apache.cordova.file.c r5 = r(c6);
            if (r5 != null) {
                return r5.i(c6);
            }
            throw new MalformedURLException("No installed handlers for this URL");
        } catch (IllegalArgumentException e6) {
            MalformedURLException malformedURLException = new MalformedURLException("Unrecognized filesystem URL");
            malformedURLException.initCause(e6);
            throw malformedURLException;
        }
    }

    private String w(Uri uri) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject x(String str) {
        try {
            o5.f c6 = o5.f.c(str);
            org.apache.cordova.file.c r5 = r(c6);
            if (r5 != null) {
                return r5.l(c6);
            }
            throw new MalformedURLException("No installed handlers for this URL");
        } catch (IllegalArgumentException e6) {
            MalformedURLException malformedURLException = new MalformedURLException("Unrecognized filesystem URL");
            malformedURLException.initCause(e6);
            throw malformedURLException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(String str, int i6, org.apache.cordova.a aVar) {
        int c6 = this.f8451d.c(str, i6, aVar);
        if (Build.VERSION.SDK_INT >= 33) {
            m5.p.c(this, c6, new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO"});
        } else {
            m5.p.b(this, c6, "android.permission.READ_EXTERNAL_STORAGE");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(String str, int i6, org.apache.cordova.a aVar) {
        if (Build.VERSION.SDK_INT < 33) {
            m5.p.b(this, this.f8451d.c(str, i6, aVar), "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }

    protected void F(String[] strArr, HashMap hashMap) {
        StringBuilder sb;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            if (!hashSet.contains(str)) {
                String str2 = (String) hashMap.get(str);
                if (str2 != null) {
                    File file = new File(str2);
                    if (file.mkdirs() || file.isDirectory()) {
                        registerFilesystem(new org.apache.cordova.file.d(str, this.webView.getContext(), this.webView.getResourceApi(), file, this.f8369a));
                        hashSet.add(str);
                    } else {
                        sb = new StringBuilder();
                        sb.append("Unable to create root dir for filesystem \"");
                        sb.append(str);
                        sb.append("\", skipping");
                    }
                } else {
                    sb = new StringBuilder();
                    sb.append("Unrecognized extra filesystem identifier: ");
                    sb.append(str);
                }
                m5.o.a("FileUtils", sb.toString());
            }
        }
    }

    @Override // org.apache.cordova.b
    public boolean execute(String str, String str2, org.apache.cordova.a aVar) {
        e0 pVar;
        if (!this.f8450c) {
            aVar.sendPluginResult(new org.apache.cordova.f(f.a.ERROR, "File plugin is not configured. Please see the README.md file for details on how to update config.xml"));
            return true;
        }
        if (str.equals("testSaveLocationExists")) {
            pVar = new k(aVar);
        } else if (str.equals("getFreeDiskSpace")) {
            pVar = new v(aVar);
        } else if (str.equals("testFileExists")) {
            pVar = new x(aVar);
        } else if (str.equals("testDirectoryExists")) {
            pVar = new y(aVar);
        } else if (str.equals("readAsText")) {
            pVar = new z(aVar);
        } else if (str.equals("readAsDataURL")) {
            pVar = new a0(aVar);
        } else if (str.equals("readAsArrayBuffer")) {
            pVar = new b0(aVar);
        } else if (str.equals("readAsBinaryString")) {
            pVar = new c0(aVar);
        } else if (str.equals("write")) {
            pVar = new d0(str2, aVar);
        } else if (str.equals("truncate")) {
            pVar = new a(aVar);
        } else if (str.equals("requestAllFileSystems")) {
            pVar = new b(aVar);
        } else {
            if (str.equals("requestAllPaths")) {
                this.f8371cordova.getThreadPool().execute(new c(aVar));
                return true;
            }
            if (str.equals("requestFileSystem")) {
                pVar = new d(aVar);
            } else if (str.equals("resolveLocalFileSystemURI")) {
                pVar = new e(aVar);
            } else if (str.equals("getFileMetadata")) {
                pVar = new f(aVar);
            } else if (str.equals("getParent")) {
                pVar = new g(aVar);
            } else if (str.equals("getDirectory")) {
                pVar = new h(str2, aVar);
            } else if (str.equals("getFile")) {
                pVar = new i(aVar, str2);
            } else if (str.equals("remove")) {
                pVar = new j(aVar);
            } else if (str.equals("removeRecursively")) {
                pVar = new l(aVar);
            } else if (str.equals("moveTo")) {
                pVar = new m(aVar);
            } else if (str.equals("copyTo")) {
                pVar = new n(aVar);
            } else if (str.equals("readEntries")) {
                pVar = new o(str2, aVar);
            } else {
                if (!str.equals("_getLocalFilesystemPath")) {
                    return false;
                }
                pVar = new p(aVar);
            }
        }
        M(pVar, str2, aVar);
        return true;
    }

    public String filesystemPathForURL(String str) {
        try {
            o5.f c6 = o5.f.c(str);
            org.apache.cordova.file.c r5 = r(c6);
            if (r5 != null) {
                return r5.f(c6);
            }
            throw new MalformedURLException("No installed handlers for this URL");
        } catch (IllegalArgumentException e6) {
            MalformedURLException malformedURLException = new MalformedURLException("Unrecognized filesystem URL");
            malformedURLException.initCause(e6);
            throw malformedURLException;
        }
    }

    public o5.f filesystemURLforLocalPath(String str) {
        Iterator it = this.f8452e.iterator();
        o5.f fVar = null;
        int i6 = 0;
        while (it.hasNext()) {
            o5.f a6 = ((org.apache.cordova.file.c) it.next()).a(str);
            if (a6 != null && (fVar == null || a6.f8280c.length() < i6)) {
                i6 = a6.f8280c.length();
                fVar = a6;
            }
        }
        return fVar;
    }

    public JSONObject getEntryForFile(File file) {
        Iterator it = this.f8452e.iterator();
        while (it.hasNext()) {
            JSONObject q6 = ((org.apache.cordova.file.c) it.next()).q(file);
            if (q6 != null) {
                return q6;
            }
        }
        return null;
    }

    @Override // org.apache.cordova.b
    public m5.i getPathHandler() {
        return new m5.i(new e.b() { // from class: o5.d
            @Override // o0.e.b
            public final WebResourceResponse a(String str) {
                WebResourceResponse C;
                C = FileUtils.this.C(str);
                return C;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a6  */
    @Override // org.apache.cordova.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initialize(m5.h r17, m5.k r18) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.file.FileUtils.initialize(m5.h, m5.k):void");
    }

    @Override // org.apache.cordova.b
    public void onRequestPermissionResult(int i6, String[] strArr, int[] iArr) {
        e0 sVar;
        e.a d6 = this.f8451d.d(i6);
        if (d6 == null) {
            m5.o.a("FileUtils", "Received permission callback for unknown request code");
            return;
        }
        for (int i7 : iArr) {
            if (i7 == -1) {
                d6.c().sendPluginResult(new org.apache.cordova.f(f.a.ERROR, SECURITY_ERR));
                return;
            }
        }
        int b6 = d6.b();
        if (b6 == 0) {
            sVar = new s(d6);
        } else if (b6 == 1) {
            sVar = new u(d6);
        } else if (b6 == 2) {
            sVar = new t(d6);
        } else if (b6 != 3) {
            return;
        } else {
            sVar = new w(d6);
        }
        M(sVar, d6.d(), d6.c());
    }

    public void readFileAs(String str, int i6, int i7, org.apache.cordova.a aVar, String str2, int i8) {
        org.apache.cordova.f fVar;
        try {
            o5.f c6 = o5.f.c(str);
            org.apache.cordova.file.c r5 = r(c6);
            if (r5 == null) {
                throw new MalformedURLException("No installed handlers for this URL");
            }
            r5.x(c6, i6, i7, new r(i8, str2, aVar));
        } catch (FileNotFoundException unused) {
            fVar = new org.apache.cordova.f(f.a.IO_EXCEPTION, NOT_FOUND_ERR);
            aVar.sendPluginResult(fVar);
        } catch (IOException e6) {
            m5.o.a("FileUtils", e6.getLocalizedMessage());
            fVar = new org.apache.cordova.f(f.a.IO_EXCEPTION, NOT_READABLE_ERR);
            aVar.sendPluginResult(fVar);
        } catch (IllegalArgumentException e7) {
            MalformedURLException malformedURLException = new MalformedURLException("Unrecognized filesystem URL");
            malformedURLException.initCause(e7);
            throw malformedURLException;
        }
    }

    public void registerFilesystem(org.apache.cordova.file.c cVar) {
        if (cVar == null || q(cVar.f8532d) != null) {
            return;
        }
        this.f8452e.add(cVar);
    }

    @Override // org.apache.cordova.b
    public Uri remapUri(Uri uri) {
        if (!"cdvfile".equals(uri.getScheme())) {
            return null;
        }
        try {
            o5.f b6 = o5.f.b(uri);
            org.apache.cordova.file.c r5 = r(b6);
            if (r5 != null && r5.f(b6) != null) {
                return Uri.parse("file://" + r5.f(b6));
            }
        } catch (IllegalArgumentException unused) {
        }
        return null;
    }

    public o5.f resolveNativeUri(Uri uri) {
        Iterator it = this.f8452e.iterator();
        o5.f fVar = null;
        while (it.hasNext()) {
            o5.f A = ((org.apache.cordova.file.c) it.next()).A(uri);
            if (A != null && (fVar == null || A.f8278a.toString().length() < fVar.toString().length())) {
                fVar = A;
            }
        }
        return fVar;
    }

    protected HashMap s(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        HashMap hashMap = new HashMap();
        hashMap.put("files", applicationContext.getFilesDir().getAbsolutePath());
        hashMap.put("documents", new File(applicationContext.getFilesDir(), "Documents").getAbsolutePath());
        hashMap.put("cache", applicationContext.getCacheDir().getAbsolutePath());
        hashMap.put("root", "/");
        if (Environment.getExternalStorageState().equals("mounted")) {
            try {
                hashMap.put("files-external", applicationContext.getExternalFilesDir(null).getAbsolutePath());
                hashMap.put("sdcard", Environment.getExternalStorageDirectory().getAbsolutePath());
                hashMap.put("cache-external", applicationContext.getExternalCacheDir().getAbsolutePath());
            } catch (NullPointerException unused) {
                m5.o.a("FileUtils", "External storage unavailable, check to see if USB Mass Storage Mode is on");
            }
        }
        return hashMap;
    }

    protected String[] t(Activity activity) {
        return this.f8369a.c("androidextrafilesystems", "files,files-external,documents,sdcard,cache,cache-external,assets,root").split(",");
    }

    public long write(String str, String str2, int i6, boolean z5) {
        try {
            o5.f c6 = o5.f.c(str);
            org.apache.cordova.file.c r5 = r(c6);
            if (r5 != null) {
                return r5.D(c6, str2, i6, z5);
            }
            throw new MalformedURLException("No installed handlers for this URL");
        } catch (IllegalArgumentException e6) {
            MalformedURLException malformedURLException = new MalformedURLException("Unrecognized filesystem URL");
            malformedURLException.initCause(e6);
            throw malformedURLException;
        }
    }
}
