package R6;

import E7.a;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: R6.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1353u extends AbstractC1351s implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    InterfaceC1335d[] f8852a;

    /* renamed from: R6.u$a */
    /* loaded from: classes5.dex */
    class a implements Enumeration {

        /* renamed from: a, reason: collision with root package name */
        private int f8853a = 0;

        a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            if (this.f8853a < AbstractC1353u.this.f8852a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i8 = this.f8853a;
            InterfaceC1335d[] interfaceC1335dArr = AbstractC1353u.this.f8852a;
            if (i8 < interfaceC1335dArr.length) {
                this.f8853a = i8 + 1;
                return interfaceC1335dArr[i8];
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1353u() {
        this.f8852a = C1337e.f8810d;
    }

    public static AbstractC1353u w(Object obj) {
        if (obj != null && !(obj instanceof AbstractC1353u)) {
            if (obj instanceof InterfaceC1354v) {
                return w(((InterfaceC1354v) obj).d());
            }
            if (obj instanceof byte[]) {
                try {
                    return w(AbstractC1351s.s((byte[]) obj));
                } catch (IOException e8) {
                    throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e8.getMessage());
                }
            }
            if (obj instanceof InterfaceC1335d) {
                AbstractC1351s d8 = ((InterfaceC1335d) obj).d();
                if (d8 instanceof AbstractC1353u) {
                    return (AbstractC1353u) d8;
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        return (AbstractC1353u) obj;
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        int length = this.f8852a.length;
        int i8 = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i8 = (i8 * 257) ^ this.f8852a[length].d().hashCode();
            } else {
                return i8;
            }
        }
    }

    public Iterator iterator() {
        return new a.C0037a(this.f8852a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (!(abstractC1351s instanceof AbstractC1353u)) {
            return false;
        }
        AbstractC1353u abstractC1353u = (AbstractC1353u) abstractC1351s;
        int size = size();
        if (abstractC1353u.size() != size) {
            return false;
        }
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC1351s d8 = this.f8852a[i8].d();
            AbstractC1351s d9 = abstractC1353u.f8852a[i8].d();
            if (d8 != d9 && !d8.m(d9)) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        return this.f8852a.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean t() {
        return true;
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
            stringBuffer.append(this.f8852a[i8]);
            i8++;
            if (i8 >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public AbstractC1351s u() {
        return new C1338e0(this.f8852a, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public AbstractC1351s v() {
        return new s0(this.f8852a, false);
    }

    public InterfaceC1335d x(int i8) {
        return this.f8852a[i8];
    }

    public Enumeration y() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterfaceC1335d[] z() {
        return this.f8852a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1353u(C1337e c1337e) {
        if (c1337e == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        this.f8852a = c1337e.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1353u(InterfaceC1335d[] interfaceC1335dArr, boolean z8) {
        this.f8852a = z8 ? C1337e.b(interfaceC1335dArr) : interfaceC1335dArr;
    }
}
