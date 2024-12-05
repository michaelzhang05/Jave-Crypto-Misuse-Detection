package R6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public class E extends AbstractC1348o {

    /* renamed from: b, reason: collision with root package name */
    private final int f8773b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC1348o[] f8774c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements Enumeration {

        /* renamed from: a, reason: collision with root package name */
        int f8775a = 0;

        a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            if (this.f8775a < E.this.f8842a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i8 = this.f8775a;
            E e8 = E.this;
            byte[] bArr = e8.f8842a;
            if (i8 < bArr.length) {
                int min = Math.min(bArr.length - i8, e8.f8773b);
                byte[] bArr2 = new byte[min];
                System.arraycopy(E.this.f8842a, this.f8775a, bArr2, 0, min);
                this.f8775a += min;
                return new C1330a0(bArr2);
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements Enumeration {

        /* renamed from: a, reason: collision with root package name */
        int f8777a = 0;

        b() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            if (this.f8777a < E.this.f8774c.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            if (this.f8777a < E.this.f8774c.length) {
                AbstractC1348o[] abstractC1348oArr = E.this.f8774c;
                int i8 = this.f8777a;
                this.f8777a = i8 + 1;
                return abstractC1348oArr[i8];
            }
            throw new NoSuchElementException();
        }
    }

    public E(byte[] bArr) {
        this(bArr, 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static E B(AbstractC1353u abstractC1353u) {
        int size = abstractC1353u.size();
        AbstractC1348o[] abstractC1348oArr = new AbstractC1348o[size];
        for (int i8 = 0; i8 < size; i8++) {
            abstractC1348oArr[i8] = AbstractC1348o.x(abstractC1353u.x(i8));
        }
        return new E(abstractC1348oArr);
    }

    private static byte[] D(AbstractC1348o[] abstractC1348oArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i8 = 0; i8 != abstractC1348oArr.length; i8++) {
            try {
                byteArrayOutputStream.write(abstractC1348oArr[i8].y());
            } catch (IOException e8) {
                throw new IllegalArgumentException("exception converting octets " + e8.toString());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public Enumeration C() {
        if (this.f8774c == null) {
            return new a();
        }
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        c1350q.p(z8, 36, C());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        Enumeration C8 = C();
        int i8 = 0;
        while (C8.hasMoreElements()) {
            i8 += ((InterfaceC1335d) C8.nextElement()).d().q();
        }
        return i8 + 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean t() {
        return true;
    }

    public E(byte[] bArr, int i8) {
        this(bArr, null, i8);
    }

    private E(byte[] bArr, AbstractC1348o[] abstractC1348oArr, int i8) {
        super(bArr);
        this.f8774c = abstractC1348oArr;
        this.f8773b = i8;
    }

    public E(AbstractC1348o[] abstractC1348oArr) {
        this(abstractC1348oArr, 1000);
    }

    public E(AbstractC1348o[] abstractC1348oArr, int i8) {
        this(D(abstractC1348oArr), abstractC1348oArr, i8);
    }
}
