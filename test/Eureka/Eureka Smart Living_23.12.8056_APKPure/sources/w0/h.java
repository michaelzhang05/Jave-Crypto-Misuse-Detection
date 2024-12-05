package w0;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final j f9727a = new j();

    public static void b(String str, String str2) {
        HttpURLConnection httpURLConnection;
        String str3;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                throw new IOException("No file to download. Server replied HTTP code: " + responseCode);
            }
            String str4 = "";
            String headerField = httpURLConnection.getHeaderField("Content-Disposition");
            int contentLength = httpURLConnection.getContentLength();
            if (headerField != null) {
                int indexOf = headerField.indexOf("filename=");
                if (indexOf > 0) {
                    str4 = headerField.substring(indexOf + 10, headerField.length() - 1);
                }
            } else {
                str4 = str.substring(str.lastIndexOf("/") + 1);
            }
            if (str4.contains("SQLite.db") || !str4.substring(str4.length() - 3).equals(".db")) {
                str3 = str4;
            } else {
                str3 = str4.substring(0, str4.length() - 3) + "SQLite.db";
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(str2 + File.separator + str3);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    fileOutputStream.close();
                    inputStream.close();
                    System.out.println("File " + str4 + " downloaded (" + contentLength + ")");
                    httpURLConnection.disconnect();
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e7) {
            e = e7;
            httpURLConnection2 = httpURLConnection;
            throw new Exception(e);
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }

    public void a(Context context, String str) {
        String str2;
        context.getAssets();
        String substring = str.substring(str.lastIndexOf(47) + 1);
        Boolean bool = Boolean.FALSE;
        if (!substring.contains("SQLite.db")) {
            if (this.f9727a.m(substring).equals("db")) {
                str2 = substring.substring(0, substring.length() - 3) + "SQLite.db";
            } else {
                str2 = substring;
            }
            if (this.f9727a.p(substring, ".zip")) {
                bool = Boolean.TRUE;
            }
            substring = str2;
        }
        File cacheDir = context.getCacheDir();
        String absolutePath = cacheDir.getAbsolutePath();
        String str3 = absolutePath + File.separator + substring;
        File file = new File(this.f9727a.l(context));
        try {
            if (this.f9727a.q(str3).booleanValue()) {
                this.f9727a.k(absolutePath, substring);
            }
            b(str, absolutePath);
            if (bool.booleanValue()) {
                this.f9727a.u(absolutePath, null, str3, Boolean.TRUE);
                this.f9727a.k(absolutePath, substring);
            }
            this.f9727a.s(cacheDir, file);
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }
}
