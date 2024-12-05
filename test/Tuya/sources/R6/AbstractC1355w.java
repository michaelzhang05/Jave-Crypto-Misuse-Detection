package R6;

import E7.a;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: R6.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1355w extends AbstractC1351s implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC1335d[] f8857a;

    /* renamed from: b, reason: collision with root package name */
    protected final boolean f8858b;

    /* renamed from: R6.w$a */
    /* loaded from: classes5.dex */
    class a implements Enumeration {

        /* renamed from: a, reason: collision with root package name */
        private int f8859a = 0;

        a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            if (this.f8859a < AbstractC1355w.this.f8857a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i8 = this.f8859a;
            InterfaceC1335d[] interfaceC1335dArr = AbstractC1355w.this.f8857a;
            if (i8 < interfaceC1335dArr.length) {
                this.f8859a = i8 + 1;
                return interfaceC1335dArr[i8];
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1355w() {
        this.f8857a = C1337e.f8810d;
        this.f8858b = true;
    }

    private static boolean A(byte[] bArr, byte[] bArr2) {
        int i8 = bArr[0] & (-33);
        int i9 = bArr2[0] & (-33);
        if (i8 != i9) {
            if (i8 >= i9) {
                return false;
            }
            return true;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i10 = 1; i10 < min; i10++) {
            byte b8 = bArr[i10];
            byte b9 = bArr2[i10];
            if (b8 != b9) {
                if ((b8 & 255) >= (b9 & 255)) {
                    return false;
                }
                return true;
            }
        }
        if ((bArr[min] & 255) > (bArr2[min] & 255)) {
            return false;
        }
        return true;
    }

    private static void B(InterfaceC1335d[] interfaceC1335dArr) {
        int i8;
        int length = interfaceC1335dArr.length;
        if (length < 2) {
            return;
        }
        InterfaceC1335d interfaceC1335d = interfaceC1335dArr[0];
        InterfaceC1335d interfaceC1335d2 = interfaceC1335dArr[1];
        byte[] w8 = w(interfaceC1335d);
        byte[] w9 = w(interfaceC1335d2);
        if (A(w9, w8)) {
            interfaceC1335d2 = interfaceC1335d;
            interfaceC1335d = interfaceC1335d2;
            w9 = w8;
            w8 = w9;
        }
        for (int i9 = 2; i9 < length; i9++) {
            InterfaceC1335d interfaceC1335d3 = interfaceC1335dArr[i9];
            byte[] w10 = w(interfaceC1335d3);
            if (A(w9, w10)) {
                interfaceC1335dArr[i9 - 2] = interfaceC1335d;
                interfaceC1335d = interfaceC1335d2;
                w8 = w9;
                interfaceC1335d2 = interfaceC1335d3;
                w9 = w10;
            } else if (A(w8, w10)) {
                interfaceC1335dArr[i9 - 2] = interfaceC1335d;
                interfaceC1335d = interfaceC1335d3;
                w8 = w10;
            } else {
                int i10 = i9 - 1;
                while (true) {
                    i8 = i10 - 1;
                    if (i8 <= 0) {
                        break;
                    }
                    InterfaceC1335d interfaceC1335d4 = interfaceC1335dArr[i10 - 2];
                    if (A(w(interfaceC1335d4), w10)) {
                        break;
                    }
                    interfaceC1335dArr[i8] = interfaceC1335d4;
                    i10 = i8;
                }
                interfaceC1335dArr[i8] = interfaceC1335d3;
            }
        }
        interfaceC1335dArr[length - 2] = interfaceC1335d;
        interfaceC1335dArr[length - 1] = interfaceC1335d2;
    }

    private static byte[] w(InterfaceC1335d interfaceC1335d) {
        try {
            return interfaceC1335d.d().l("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static AbstractC1355w x(AbstractC1358z abstractC1358z, boolean z8) {
        if (z8) {
            if (abstractC1358z.z()) {
                return y(abstractC1358z.x());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        AbstractC1351s x8 = abstractC1358z.x();
        if (abstractC1358z.z()) {
            if (abstractC1358z instanceof M) {
                return new K(x8);
            }
            return new u0(x8);
        }
        if (x8 instanceof AbstractC1355w) {
            AbstractC1355w abstractC1355w = (AbstractC1355w) x8;
            if (abstractC1358z instanceof M) {
                return abstractC1355w;
            }
            return (AbstractC1355w) abstractC1355w.v();
        }
        if (x8 instanceof AbstractC1353u) {
            InterfaceC1335d[] z9 = ((AbstractC1353u) x8).z();
            if (abstractC1358z instanceof M) {
                return new K(false, z9);
            }
            return new u0(false, z9);
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + abstractC1358z.getClass().getName());
    }

    public static AbstractC1355w y(Object obj) {
        if (obj != null && !(obj instanceof AbstractC1355w)) {
            if (obj instanceof InterfaceC1356x) {
                return y(((InterfaceC1356x) obj).d());
            }
            if (obj instanceof byte[]) {
                try {
                    return y(AbstractC1351s.s((byte[]) obj));
                } catch (IOException e8) {
                    throw new IllegalArgumentException("failed to construct set from byte[]: " + e8.getMessage());
                }
            }
            if (obj instanceof InterfaceC1335d) {
                AbstractC1351s d8 = ((InterfaceC1335d) obj).d();
                if (d8 instanceof AbstractC1355w) {
                    return (AbstractC1355w) d8;
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        return (AbstractC1355w) obj;
    }

    public InterfaceC1335d[] C() {
        return C1337e.b(this.f8857a);
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        int length = this.f8857a.length;
        int i8 = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i8 += this.f8857a[length].d().hashCode();
            } else {
                return i8;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a.C0037a(C());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (!(abstractC1351s instanceof AbstractC1355w)) {
            return false;
        }
        AbstractC1355w abstractC1355w = (AbstractC1355w) abstractC1351s;
        int size = size();
        if (abstractC1355w.size() != size) {
            return false;
        }
        f0 f0Var = (f0) u();
        f0 f0Var2 = (f0) abstractC1355w.u();
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC1351s d8 = f0Var.f8857a[i8].d();
            AbstractC1351s d9 = f0Var2.f8857a[i8].d();
            if (d8 != d9 && !d8.m(d9)) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        return this.f8857a.length;
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
            stringBuffer.append(this.f8857a[i8]);
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
        InterfaceC1335d[] interfaceC1335dArr;
        if (this.f8858b) {
            interfaceC1335dArr = this.f8857a;
        } else {
            interfaceC1335dArr = (InterfaceC1335d[]) this.f8857a.clone();
            B(interfaceC1335dArr);
        }
        return new f0(true, interfaceC1335dArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public AbstractC1351s v() {
        return new u0(this.f8858b, this.f8857a);
    }

    public Enumeration z() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1355w(InterfaceC1335d interfaceC1335d) {
        if (interfaceC1335d == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.f8857a = new InterfaceC1335d[]{interfaceC1335d};
        this.f8858b = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1355w(C1337e c1337e, boolean z8) {
        InterfaceC1335d[] g8;
        if (c1337e == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        if (!z8 || c1337e.f() < 2) {
            g8 = c1337e.g();
        } else {
            g8 = c1337e.c();
            B(g8);
        }
        this.f8857a = g8;
        this.f8858b = z8 || g8.length < 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1355w(boolean z8, InterfaceC1335d[] interfaceC1335dArr) {
        this.f8857a = interfaceC1335dArr;
        this.f8858b = z8 || interfaceC1335dArr.length < 2;
    }
}
