package org.apache.cordova;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import t3.b0;

/* loaded from: classes.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f8372e = {"_data"};

    /* renamed from: f, reason: collision with root package name */
    public static Thread f8373f;

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f8374a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentResolver f8375b;

    /* renamed from: c, reason: collision with root package name */
    private final e f8376c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8377d = true;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f8378a;

        /* renamed from: b, reason: collision with root package name */
        public final InputStream f8379b;

        /* renamed from: c, reason: collision with root package name */
        public final String f8380c;

        /* renamed from: d, reason: collision with root package name */
        public final long f8381d;

        /* renamed from: e, reason: collision with root package name */
        public final AssetFileDescriptor f8382e;

        public a(Uri uri, InputStream inputStream, String str, long j6, AssetFileDescriptor assetFileDescriptor) {
            this.f8378a = uri;
            this.f8379b = inputStream;
            this.f8380c = str;
            this.f8381d = j6;
            this.f8382e = assetFileDescriptor;
        }
    }

    public c(Context context, e eVar) {
        this.f8375b = context.getContentResolver();
        this.f8374a = context.getAssets();
        this.f8376c = eVar;
    }

    private void a() {
        if (this.f8377d) {
            Thread currentThread = Thread.currentThread();
            if (currentThread == Looper.getMainLooper().getThread()) {
                throw new IllegalStateException("Do not perform IO operations on the UI thread. Use CordovaInterface.getThreadPool() instead.");
            }
            if (currentThread == f8373f) {
                throw new IllegalStateException("Tried to perform an IO operation on the WebCore thread. Use CordovaInterface.getThreadPool() instead.");
            }
        }
    }

    private static void b(Uri uri) {
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("Relative URIs are not supported.");
        }
    }

    private String e(Uri uri) {
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int indexOf = schemeSpecificPart.indexOf(44);
        if (indexOf == -1) {
            return null;
        }
        String[] split = schemeSpecificPart.substring(0, indexOf).split(";");
        if (split.length > 0) {
            return split[0];
        }
        return null;
    }

    private String g(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = str.substring(lastIndexOf + 1);
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        return lowerCase.equals("3ga") ? "audio/3gpp" : lowerCase.equals("js") ? "text/javascript" : MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
    }

    public static int h(Uri uri) {
        b(uri);
        String scheme = uri.getScheme();
        if ("content".equalsIgnoreCase(scheme)) {
            return 2;
        }
        if ("android.resource".equalsIgnoreCase(scheme)) {
            return 3;
        }
        if ("file".equalsIgnoreCase(scheme)) {
            return uri.getPath().startsWith("/android_asset/") ? 1 : 0;
        }
        if ("data".equalsIgnoreCase(scheme)) {
            return 4;
        }
        if ("http".equalsIgnoreCase(scheme)) {
            return 5;
        }
        if ("https".equalsIgnoreCase(scheme)) {
            return 6;
        }
        return "cdvplugin".equalsIgnoreCase(scheme) ? 7 : -1;
    }

    private a n(Uri uri) {
        byte[] bytes;
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int indexOf = schemeSpecificPart.indexOf(44);
        if (indexOf == -1) {
            return null;
        }
        String[] split = schemeSpecificPart.substring(0, indexOf).split(";");
        String str = split.length > 0 ? split[0] : null;
        boolean z5 = false;
        for (int i6 = 1; i6 < split.length; i6++) {
            if ("base64".equalsIgnoreCase(split[i6])) {
                z5 = true;
            }
        }
        String substring = schemeSpecificPart.substring(indexOf + 1);
        if (z5) {
            bytes = Base64.decode(substring, 0);
        } else {
            try {
                bytes = substring.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                bytes = substring.getBytes();
            }
        }
        return new a(uri, new ByteArrayInputStream(bytes), str, bytes.length, null);
    }

    public void c(a aVar, OutputStream outputStream) {
        a();
        try {
            InputStream inputStream = aVar.f8379b;
            if ((inputStream instanceof FileInputStream) && (outputStream instanceof FileOutputStream)) {
                FileChannel channel = ((FileInputStream) inputStream).getChannel();
                FileChannel channel2 = ((FileOutputStream) outputStream).getChannel();
                long j6 = aVar.f8381d;
                AssetFileDescriptor assetFileDescriptor = aVar.f8382e;
                channel.position(assetFileDescriptor != null ? assetFileDescriptor.getStartOffset() : 0L);
                channel2.transferFrom(channel, 0L, j6);
            } else {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr, 0, 8192);
                    if (read <= 0) {
                        break;
                    } else {
                        outputStream.write(bArr, 0, read);
                    }
                }
            }
        } finally {
            aVar.f8379b.close();
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    public HttpURLConnection d(Uri uri) {
        a();
        return (HttpURLConnection) new URL(uri.toString()).openConnection();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[ExcHandler: IOException -> 0x0046, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String f(android.net.Uri r3) {
        /*
            r2 = this;
            int r0 = h(r3)
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L3d;
                case 2: goto L36;
                case 3: goto L36;
                case 4: goto L31;
                case 5: goto L8;
                case 6: goto L8;
                default: goto L7;
            }
        L7:
            goto L46
        L8:
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> L46
            java.lang.String r3 = r3.toString()     // Catch: java.io.IOException -> L46
            r0.<init>(r3)     // Catch: java.io.IOException -> L46
            java.net.URLConnection r3 = r0.openConnection()     // Catch: java.io.IOException -> L46
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.io.IOException -> L46
            r0 = 0
            r3.setDoInput(r0)     // Catch: java.io.IOException -> L46
            java.lang.String r1 = "HEAD"
            r3.setRequestMethod(r1)     // Catch: java.io.IOException -> L46
            java.lang.String r1 = "Content-Type"
            java.lang.String r3 = r3.getHeaderField(r1)     // Catch: java.io.IOException -> L46
            if (r3 == 0) goto L30
            java.lang.String r1 = ";"
            java.lang.String[] r3 = r3.split(r1)     // Catch: java.io.IOException -> L46
            r3 = r3[r0]     // Catch: java.io.IOException -> L46
        L30:
            return r3
        L31:
            java.lang.String r3 = r2.e(r3)
            return r3
        L36:
            android.content.ContentResolver r0 = r2.f8375b
            java.lang.String r3 = r0.getType(r3)
            return r3
        L3d:
            java.lang.String r3 = r3.getPath()
            java.lang.String r3 = r2.g(r3)
            return r3
        L46:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.c.f(android.net.Uri):java.lang.String");
    }

    public File i(Uri uri) {
        a();
        int h6 = h(uri);
        if (h6 == 0) {
            return new File(uri.getPath());
        }
        if (h6 != 2) {
            return null;
        }
        ContentResolver contentResolver = this.f8375b;
        String[] strArr = f8372e;
        Cursor query = contentResolver.query(uri, strArr, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            int columnIndex = query.getColumnIndex(strArr[0]);
            if (columnIndex != -1 && query.getCount() > 0) {
                query.moveToFirst();
                String string = query.getString(columnIndex);
                if (string != null) {
                    return new File(string);
                }
            }
            return null;
        } finally {
            query.close();
        }
    }

    public a j(Uri uri) {
        return k(uri, false);
    }

    public a k(Uri uri, boolean z5) {
        InputStream open;
        long available;
        if (!z5) {
            a();
        }
        switch (h(uri)) {
            case 0:
                FileInputStream fileInputStream = new FileInputStream(uri.getPath());
                return new a(uri, fileInputStream, g(uri.getPath()), fileInputStream.getChannel().size(), null);
            case 1:
                String substring = uri.getPath().substring(15);
                AssetFileDescriptor assetFileDescriptor = null;
                try {
                    assetFileDescriptor = this.f8374a.openFd(substring);
                    open = assetFileDescriptor.createInputStream();
                    available = assetFileDescriptor.getLength();
                } catch (FileNotFoundException unused) {
                    open = this.f8374a.open(substring);
                    available = open.available();
                }
                return new a(uri, open, g(substring), available, assetFileDescriptor);
            case 2:
            case 3:
                String type = this.f8375b.getType(uri);
                AssetFileDescriptor openAssetFileDescriptor = this.f8375b.openAssetFileDescriptor(uri, "r");
                return new a(uri, openAssetFileDescriptor.createInputStream(), type, openAssetFileDescriptor.getLength(), openAssetFileDescriptor);
            case 4:
                a n6 = n(uri);
                if (n6 != null) {
                    return n6;
                }
                break;
            case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
            case 6:
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection.setDoInput(true);
                String headerField = httpURLConnection.getHeaderField("Content-Type");
                if (headerField != null) {
                    headerField = headerField.split(";")[0];
                }
                return new a(uri, "gzip".equals(httpURLConnection.getContentEncoding()) ? new GZIPInputStream(httpURLConnection.getInputStream()) : httpURLConnection.getInputStream(), headerField, httpURLConnection.getContentLength(), null);
            case 7:
                b f6 = this.f8376c.f(uri.getHost());
                if (f6 != null) {
                    return f6.handleOpenForRead(uri);
                }
                throw new FileNotFoundException("Invalid plugin ID in URI: " + uri);
        }
        throw new FileNotFoundException("URI not supported by CordovaResourceApi: " + uri);
    }

    public OutputStream l(Uri uri) {
        return m(uri, false);
    }

    public OutputStream m(Uri uri, boolean z5) {
        a();
        int h6 = h(uri);
        if (h6 == 0) {
            File file = new File(uri.getPath());
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            return new FileOutputStream(file, z5);
        }
        if (h6 == 2 || h6 == 3) {
            return this.f8375b.openAssetFileDescriptor(uri, z5 ? "wa" : "w").createOutputStream();
        }
        throw new FileNotFoundException("URI not supported by CordovaResourceApi: " + uri);
    }

    public Uri o(Uri uri) {
        b(uri);
        Uri w5 = this.f8376c.w(uri);
        return w5 != null ? w5 : uri;
    }
}
