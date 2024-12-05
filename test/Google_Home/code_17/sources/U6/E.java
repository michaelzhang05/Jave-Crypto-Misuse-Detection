package U6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public class E extends AbstractC1457o {

    /* renamed from: b, reason: collision with root package name */
    private final int f10399b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC1457o[] f10400c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements Enumeration {

        /* renamed from: a, reason: collision with root package name */
        int f10401a = 0;

        a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            if (this.f10401a < E.this.f10468a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i8 = this.f10401a;
            E e8 = E.this;
            byte[] bArr = e8.f10468a;
            if (i8 < bArr.length) {
                int min = Math.min(bArr.length - i8, e8.f10399b);
                byte[] bArr2 = new byte[min];
                System.arraycopy(E.this.f10468a, this.f10401a, bArr2, 0, min);
                this.f10401a += min;
                return new C1439a0(bArr2);
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements Enumeration {

        /* renamed from: a, reason: collision with root package name */
        int f10403a = 0;

        b() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            if (this.f10403a < E.this.f10400c.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            if (this.f10403a < E.this.f10400c.length) {
                AbstractC1457o[] abstractC1457oArr = E.this.f10400c;
                int i8 = this.f10403a;
                this.f10403a = i8 + 1;
                return abstractC1457oArr[i8];
            }
            throw new NoSuchElementException();
        }
    }

    public E(byte[] bArr) {
        this(bArr, 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static E B(AbstractC1462u abstractC1462u) {
        int size = abstractC1462u.size();
        AbstractC1457o[] abstractC1457oArr = new AbstractC1457o[size];
        for (int i8 = 0; i8 < size; i8++) {
            abstractC1457oArr[i8] = AbstractC1457o.v(abstractC1462u.v(i8));
        }
        return new E(abstractC1457oArr);
    }

    private static byte[] D(AbstractC1457o[] abstractC1457oArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i8 = 0; i8 != abstractC1457oArr.length; i8++) {
            try {
                byteArrayOutputStream.write(abstractC1457oArr[i8].y());
            } catch (IOException e8) {
                throw new IllegalArgumentException("exception converting octets " + e8.toString());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public Enumeration C() {
        if (this.f10400c == null) {
            return new a();
        }
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        c1459q.p(z8, 36, C());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        Enumeration C8 = C();
        int i8 = 0;
        while (C8.hasMoreElements()) {
            i8 += ((InterfaceC1444d) C8.nextElement()).d().n();
        }
        return i8 + 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean q() {
        return true;
    }

    public E(byte[] bArr, int i8) {
        this(bArr, null, i8);
    }

    private E(byte[] bArr, AbstractC1457o[] abstractC1457oArr, int i8) {
        super(bArr);
        this.f10400c = abstractC1457oArr;
        this.f10399b = i8;
    }

    public E(AbstractC1457o[] abstractC1457oArr) {
        this(abstractC1457oArr, 1000);
    }

    public E(AbstractC1457o[] abstractC1457oArr, int i8) {
        this(D(abstractC1457oArr), abstractC1457oArr, i8);
    }
}
