package U6;

import H7.a;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: U6.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1464w extends AbstractC1460s implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC1444d[] f10483a;

    /* renamed from: b, reason: collision with root package name */
    protected final boolean f10484b;

    /* renamed from: U6.w$a */
    /* loaded from: classes5.dex */
    class a implements Enumeration {

        /* renamed from: a, reason: collision with root package name */
        private int f10485a = 0;

        a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            if (this.f10485a < AbstractC1464w.this.f10483a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i8 = this.f10485a;
            InterfaceC1444d[] interfaceC1444dArr = AbstractC1464w.this.f10483a;
            if (i8 < interfaceC1444dArr.length) {
                this.f10485a = i8 + 1;
                return interfaceC1444dArr[i8];
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1464w() {
        this.f10483a = C1446e.f10436d;
        this.f10484b = true;
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

    private static void B(InterfaceC1444d[] interfaceC1444dArr) {
        int i8;
        int length = interfaceC1444dArr.length;
        if (length < 2) {
            return;
        }
        InterfaceC1444d interfaceC1444d = interfaceC1444dArr[0];
        InterfaceC1444d interfaceC1444d2 = interfaceC1444dArr[1];
        byte[] u8 = u(interfaceC1444d);
        byte[] u9 = u(interfaceC1444d2);
        if (A(u9, u8)) {
            interfaceC1444d2 = interfaceC1444d;
            interfaceC1444d = interfaceC1444d2;
            u9 = u8;
            u8 = u9;
        }
        for (int i9 = 2; i9 < length; i9++) {
            InterfaceC1444d interfaceC1444d3 = interfaceC1444dArr[i9];
            byte[] u10 = u(interfaceC1444d3);
            if (A(u9, u10)) {
                interfaceC1444dArr[i9 - 2] = interfaceC1444d;
                interfaceC1444d = interfaceC1444d2;
                u8 = u9;
                interfaceC1444d2 = interfaceC1444d3;
                u9 = u10;
            } else if (A(u8, u10)) {
                interfaceC1444dArr[i9 - 2] = interfaceC1444d;
                interfaceC1444d = interfaceC1444d3;
                u8 = u10;
            } else {
                int i10 = i9 - 1;
                while (true) {
                    i8 = i10 - 1;
                    if (i8 <= 0) {
                        break;
                    }
                    InterfaceC1444d interfaceC1444d4 = interfaceC1444dArr[i10 - 2];
                    if (A(u(interfaceC1444d4), u10)) {
                        break;
                    }
                    interfaceC1444dArr[i8] = interfaceC1444d4;
                    i10 = i8;
                }
                interfaceC1444dArr[i8] = interfaceC1444d3;
            }
        }
        interfaceC1444dArr[length - 2] = interfaceC1444d;
        interfaceC1444dArr[length - 1] = interfaceC1444d2;
    }

    private static byte[] u(InterfaceC1444d interfaceC1444d) {
        try {
            return interfaceC1444d.d().k("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static AbstractC1464w v(AbstractC1467z abstractC1467z, boolean z8) {
        if (z8) {
            if (abstractC1467z.z()) {
                return y(abstractC1467z.v());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        AbstractC1460s v8 = abstractC1467z.v();
        if (abstractC1467z.z()) {
            if (abstractC1467z instanceof M) {
                return new K(v8);
            }
            return new u0(v8);
        }
        if (v8 instanceof AbstractC1464w) {
            AbstractC1464w abstractC1464w = (AbstractC1464w) v8;
            if (abstractC1467z instanceof M) {
                return abstractC1464w;
            }
            return (AbstractC1464w) abstractC1464w.t();
        }
        if (v8 instanceof AbstractC1462u) {
            InterfaceC1444d[] z9 = ((AbstractC1462u) v8).z();
            if (abstractC1467z instanceof M) {
                return new K(false, z9);
            }
            return new u0(false, z9);
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + abstractC1467z.getClass().getName());
    }

    public static AbstractC1464w y(Object obj) {
        if (obj != null && !(obj instanceof AbstractC1464w)) {
            if (obj instanceof InterfaceC1465x) {
                return y(((InterfaceC1465x) obj).d());
            }
            if (obj instanceof byte[]) {
                try {
                    return y(AbstractC1460s.p((byte[]) obj));
                } catch (IOException e8) {
                    throw new IllegalArgumentException("failed to construct set from byte[]: " + e8.getMessage());
                }
            }
            if (obj instanceof InterfaceC1444d) {
                AbstractC1460s d8 = ((InterfaceC1444d) obj).d();
                if (d8 instanceof AbstractC1464w) {
                    return (AbstractC1464w) d8;
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        return (AbstractC1464w) obj;
    }

    public InterfaceC1444d[] C() {
        return C1446e.b(this.f10483a);
    }

    @Override // U6.AbstractC1460s, U6.AbstractC1455m
    public int hashCode() {
        int length = this.f10483a.length;
        int i8 = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i8 += this.f10483a[length].d().hashCode();
            } else {
                return i8;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a.C0062a(C());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean l(AbstractC1460s abstractC1460s) {
        if (!(abstractC1460s instanceof AbstractC1464w)) {
            return false;
        }
        AbstractC1464w abstractC1464w = (AbstractC1464w) abstractC1460s;
        int size = size();
        if (abstractC1464w.size() != size) {
            return false;
        }
        f0 f0Var = (f0) r();
        f0 f0Var2 = (f0) abstractC1464w.r();
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC1460s d8 = f0Var.f10483a[i8].d();
            AbstractC1460s d9 = f0Var2.f10483a[i8].d();
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
        InterfaceC1444d[] interfaceC1444dArr;
        if (this.f10484b) {
            interfaceC1444dArr = this.f10483a;
        } else {
            interfaceC1444dArr = (InterfaceC1444d[]) this.f10483a.clone();
            B(interfaceC1444dArr);
        }
        return new f0(true, interfaceC1444dArr);
    }

    public int size() {
        return this.f10483a.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public AbstractC1460s t() {
        return new u0(this.f10484b, this.f10483a);
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
            stringBuffer.append(this.f10483a[i8]);
            i8++;
            if (i8 >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public Enumeration z() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1464w(InterfaceC1444d interfaceC1444d) {
        if (interfaceC1444d == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.f10483a = new InterfaceC1444d[]{interfaceC1444d};
        this.f10484b = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1464w(C1446e c1446e, boolean z8) {
        InterfaceC1444d[] g8;
        if (c1446e == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        if (!z8 || c1446e.f() < 2) {
            g8 = c1446e.g();
        } else {
            g8 = c1446e.c();
            B(g8);
        }
        this.f10483a = g8;
        this.f10484b = z8 || g8.length < 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1464w(boolean z8, InterfaceC1444d[] interfaceC1444dArr) {
        this.f10483a = interfaceC1444dArr;
        this.f10484b = z8 || interfaceC1444dArr.length < 2;
    }
}
