package J0;

import L0.F;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
class B implements G {

    /* renamed from: a, reason: collision with root package name */
    private final File f4624a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4625b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4626c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(String str, String str2, File file) {
        this.f4625b = str;
        this.f4626c = str2;
        this.f4624a = file;
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

    @Override // J0.G
    public String a() {
        return this.f4626c;
    }

    @Override // J0.G
    public F.d.b b() {
        byte[] c8 = c();
        if (c8 != null) {
            return F.d.b.a().b(c8).c(this.f4625b).a();
        }
        return null;
    }

    @Override // J0.G
    public InputStream getStream() {
        if (this.f4624a.exists() && this.f4624a.isFile()) {
            try {
                return new FileInputStream(this.f4624a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
