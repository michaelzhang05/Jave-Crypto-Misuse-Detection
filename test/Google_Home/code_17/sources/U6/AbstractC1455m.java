package U6;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* renamed from: U6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1455m implements InterfaceC1444d, H7.c {
    @Override // U6.InterfaceC1444d
    public abstract AbstractC1460s d();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC1444d)) {
            return false;
        }
        return d().o(((InterfaceC1444d) obj).d());
    }

    public void f(OutputStream outputStream) {
        C1459q.a(outputStream).s(this);
    }

    @Override // H7.c
    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        f(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return d().hashCode();
    }

    public void j(OutputStream outputStream, String str) {
        C1459q.b(outputStream, str).s(this);
    }

    public byte[] k(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        j(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }
}
