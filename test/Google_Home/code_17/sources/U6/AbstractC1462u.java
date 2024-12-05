package U6;

import H7.a;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: U6.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1462u extends AbstractC1460s implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    InterfaceC1444d[] f10478a;

    /* renamed from: U6.u$a */
    /* loaded from: classes5.dex */
    class a implements Enumeration {

        /* renamed from: a, reason: collision with root package name */
        private int f10479a = 0;

        a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            if (this.f10479a < AbstractC1462u.this.f10478a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i8 = this.f10479a;
            InterfaceC1444d[] interfaceC1444dArr = AbstractC1462u.this.f10478a;
            if (i8 < interfaceC1444dArr.length) {
                this.f10479a = i8 + 1;
                return interfaceC1444dArr[i8];
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1462u() {
        this.f10478a = C1446e.f10436d;
    }

    public static AbstractC1462u u(Object obj) {
        if (obj != null && !(obj instanceof AbstractC1462u)) {
            if (obj instanceof InterfaceC1463v) {
                return u(((InterfaceC1463v) obj).d());
            }
            if (obj instanceof byte[]) {
                try {
                    return u(AbstractC1460s.p((byte[]) obj));
                } catch (IOException e8) {
                    throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e8.getMessage());
                }
            }
            if (obj instanceof InterfaceC1444d) {
                AbstractC1460s d8 = ((InterfaceC1444d) obj).d();
                if (d8 instanceof AbstractC1462u) {
                    return (AbstractC1462u) d8;
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        return (AbstractC1462u) obj;
    }

    @Override // U6.AbstractC1460s, U6.AbstractC1455m
    public int hashCode() {
        int length = this.f10478a.length;
        int i8 = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i8 = (i8 * 257) ^ this.f10478a[length].d().hashCode();
            } else {
                return i8;
            }
        }
    }

    public Iterator iterator() {
        return new a.C0062a(this.f10478a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean l(AbstractC1460s abstractC1460s) {
        if (!(abstractC1460s instanceof AbstractC1462u)) {
            return false;
        }
        AbstractC1462u abstractC1462u = (AbstractC1462u) abstractC1460s;
        int size = size();
        if (abstractC1462u.size() != size) {
            return false;
        }
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC1460s d8 = this.f10478a[i8].d();
            AbstractC1460s d9 = abstractC1462u.f10478a[i8].d();
            if (d8 != d9 && !d8.l(d9)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean q() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public AbstractC1460s r() {
        return new C1447e0(this.f10478a, false);
    }

    public int size() {
        return this.f10478a.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public AbstractC1460s t() {
        return new s0(this.f10478a, false);
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i8 = 0;
        while (true) {
            stringBuffer.append(this.f10478a[i8]);
            i8++;
            if (i8 >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public InterfaceC1444d v(int i8) {
        return this.f10478a[i8];
    }

    public Enumeration y() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterfaceC1444d[] z() {
        return this.f10478a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1462u(C1446e c1446e) {
        if (c1446e == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        this.f10478a = c1446e.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1462u(InterfaceC1444d[] interfaceC1444dArr, boolean z8) {
        this.f10478a = z8 ? C1446e.b(interfaceC1444dArr) : interfaceC1444dArr;
    }
}
