package R6;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* renamed from: R6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1346m implements InterfaceC1335d, E7.c {
    @Override // R6.InterfaceC1335d
    public abstract AbstractC1351s d();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC1335d)) {
            return false;
        }
        return d().r(((InterfaceC1335d) obj).d());
    }

    @Override // E7.c
    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        h(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public void h(OutputStream outputStream) {
        C1350q.a(outputStream).s(this);
    }

    public int hashCode() {
        return d().hashCode();
    }

    public void i(OutputStream outputStream, String str) {
        C1350q.b(outputStream, str).s(this);
    }

    public byte[] l(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        i(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }
}
