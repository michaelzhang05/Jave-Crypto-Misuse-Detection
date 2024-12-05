package R6;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
class A0 implements Enumeration {

    /* renamed from: a, reason: collision with root package name */
    private C1343j f8762a;

    /* renamed from: b, reason: collision with root package name */
    private Object f8763b = a();

    public A0(byte[] bArr) {
        this.f8762a = new C1343j(bArr, true);
    }

    private Object a() {
        try {
            return this.f8762a.m();
        } catch (IOException e8) {
            throw new r("malformed DER construction: " + e8, e8);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        if (this.f8763b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.f8763b;
        if (obj != null) {
            this.f8763b = a();
            return obj;
        }
        throw new NoSuchElementException();
    }
}
