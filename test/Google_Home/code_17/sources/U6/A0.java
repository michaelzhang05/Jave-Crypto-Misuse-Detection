package U6;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
class A0 implements Enumeration {

    /* renamed from: a, reason: collision with root package name */
    private C1452j f10388a;

    /* renamed from: b, reason: collision with root package name */
    private Object f10389b = a();

    public A0(byte[] bArr) {
        this.f10388a = new C1452j(bArr, true);
    }

    private Object a() {
        try {
            return this.f10388a.o();
        } catch (IOException e8) {
            throw new r("malformed DER construction: " + e8, e8);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        if (this.f10389b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.f10389b;
        if (obj != null) {
            this.f10389b = a();
            return obj;
        }
        throw new NoSuchElementException();
    }
}
