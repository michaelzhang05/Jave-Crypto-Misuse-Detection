package R6;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class O extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final C1357y f8788a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8789b = true;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f8790c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O(C1357y c1357y) {
        this.f8788a = c1357y;
    }

    private InterfaceC1349p a() {
        InterfaceC1335d b8 = this.f8788a.b();
        if (b8 == null) {
            return null;
        }
        if (b8 instanceof InterfaceC1349p) {
            return (InterfaceC1349p) b8;
        }
        throw new IOException("unknown object encountered: " + b8.getClass());
    }

    @Override // java.io.InputStream
    public int read() {
        InterfaceC1349p a8;
        if (this.f8790c == null) {
            if (!this.f8789b || (a8 = a()) == null) {
                return -1;
            }
            this.f8789b = false;
            this.f8790c = a8.a();
        }
        while (true) {
            int read = this.f8790c.read();
            if (read >= 0) {
                return read;
            }
            InterfaceC1349p a9 = a();
            if (a9 == null) {
                this.f8790c = null;
                return -1;
            }
            this.f8790c = a9.a();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        InterfaceC1349p a8;
        int i10 = 0;
        if (this.f8790c == null) {
            if (!this.f8789b || (a8 = a()) == null) {
                return -1;
            }
            this.f8789b = false;
            this.f8790c = a8.a();
        }
        while (true) {
            int read = this.f8790c.read(bArr, i8 + i10, i9 - i10);
            if (read >= 0) {
                i10 += read;
                if (i10 == i9) {
                    return i10;
                }
            } else {
                InterfaceC1349p a9 = a();
                if (a9 == null) {
                    this.f8790c = null;
                    if (i10 < 1) {
                        return -1;
                    }
                    return i10;
                }
                this.f8790c = a9.a();
            }
        }
    }
}
