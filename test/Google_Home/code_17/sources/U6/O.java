package U6;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class O extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final C1466y f10414a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10415b = true;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f10416c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O(C1466y c1466y) {
        this.f10414a = c1466y;
    }

    private InterfaceC1458p a() {
        InterfaceC1444d b8 = this.f10414a.b();
        if (b8 == null) {
            return null;
        }
        if (b8 instanceof InterfaceC1458p) {
            return (InterfaceC1458p) b8;
        }
        throw new IOException("unknown object encountered: " + b8.getClass());
    }

    @Override // java.io.InputStream
    public int read() {
        InterfaceC1458p a8;
        if (this.f10416c == null) {
            if (!this.f10415b || (a8 = a()) == null) {
                return -1;
            }
            this.f10415b = false;
            this.f10416c = a8.c();
        }
        while (true) {
            int read = this.f10416c.read();
            if (read >= 0) {
                return read;
            }
            InterfaceC1458p a9 = a();
            if (a9 == null) {
                this.f10416c = null;
                return -1;
            }
            this.f10416c = a9.c();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        InterfaceC1458p a8;
        int i10 = 0;
        if (this.f10416c == null) {
            if (!this.f10415b || (a8 = a()) == null) {
                return -1;
            }
            this.f10415b = false;
            this.f10416c = a8.c();
        }
        while (true) {
            int read = this.f10416c.read(bArr, i8 + i10, i9 - i10);
            if (read >= 0) {
                i10 += read;
                if (i10 == i9) {
                    return i10;
                }
            } else {
                InterfaceC1458p a9 = a();
                if (a9 == null) {
                    this.f10416c = null;
                    if (i10 < 1) {
                        return -1;
                    }
                    return i10;
                }
                this.f10416c = a9.c();
            }
        }
    }
}
