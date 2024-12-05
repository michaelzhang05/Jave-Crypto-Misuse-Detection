package H0;

import J0.B;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: H0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1174h implements C {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f3297a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3298b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3299c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1174h(String str, String str2, byte[] bArr) {
        this.f3298b = str;
        this.f3299c = str2;
        this.f3297a = bArr;
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
                    gZIPOutputStream.write(this.f3297a);
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
        byte[] bArr = this.f3297a;
        if (bArr != null && bArr.length != 0) {
            return false;
        }
        return true;
    }

    @Override // H0.C
    public String a() {
        return this.f3299c;
    }

    @Override // H0.C
    public B.d.b b() {
        byte[] c8 = c();
        if (c8 == null) {
            return null;
        }
        return B.d.b.a().b(c8).c(this.f3298b).a();
    }

    @Override // H0.C
    public InputStream getStream() {
        if (d()) {
            return null;
        }
        return new ByteArrayInputStream(this.f3297a);
    }
}
