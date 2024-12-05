package J0;

import L0.F;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: J0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1273h implements G {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f4674a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4675b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4676c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1273h(String str, String str2, byte[] bArr) {
        this.f4675b = str;
        this.f4676c = str2;
        this.f4674a = bArr;
    }

    private byte[] c() {
        if (d()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f4674a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean d() {
        byte[] bArr = this.f4674a;
        if (bArr != null && bArr.length != 0) {
            return false;
        }
        return true;
    }

    @Override // J0.G
    public String a() {
        return this.f4676c;
    }

    @Override // J0.G
    public F.d.b b() {
        byte[] c8 = c();
        if (c8 == null) {
            return null;
        }
        return F.d.b.a().b(c8).c(this.f4675b).a();
    }

    @Override // J0.G
    public InputStream getStream() {
        if (d()) {
            return null;
        }
        return new ByteArrayInputStream(this.f4674a);
    }
}
