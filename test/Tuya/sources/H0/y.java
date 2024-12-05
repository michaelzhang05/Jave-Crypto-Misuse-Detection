package H0;

import J0.B;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
class y implements C {

    /* renamed from: a, reason: collision with root package name */
    private final File f3429a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3430b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3431c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(String str, String str2, File file) {
        this.f3430b = str;
        this.f3431c = str2;
        this.f3429a = file;
    }

    private byte[] c() {
        byte[] bArr = new byte[8192];
        try {
            InputStream stream = getStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (stream == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (stream != null) {
                            stream.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int read = stream.read(bArr);
                            if (read > 0) {
                                gZIPOutputStream.write(bArr, 0, read);
                            } else {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                stream.close();
                                return byteArray;
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // H0.C
    public String a() {
        return this.f3431c;
    }

    @Override // H0.C
    public B.d.b b() {
        byte[] c8 = c();
        if (c8 != null) {
            return B.d.b.a().b(c8).c(this.f3430b).a();
        }
        return null;
    }

    @Override // H0.C
    public InputStream getStream() {
        if (this.f3429a.exists() && this.f3429a.isFile()) {
            try {
                return new FileInputStream(this.f3429a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
