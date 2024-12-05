package U6;

/* renamed from: U6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1442c extends AbstractC1460s {

    /* renamed from: b, reason: collision with root package name */
    public static final C1442c f10432b = new C1442c((byte) 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1442c f10433c = new C1442c((byte) -1);

    /* renamed from: a, reason: collision with root package name */
    private final byte f10434a;

    private C1442c(byte b8) {
        this.f10434a = b8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1442c u(byte[] bArr) {
        if (bArr.length == 1) {
            byte b8 = bArr[0];
            if (b8 != -1) {
                if (b8 != 0) {
                    return new C1442c(b8);
                }
                return f10432b;
            }
            return f10433c;
        }
        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
    }

    @Override // U6.AbstractC1460s, U6.AbstractC1455m
    public int hashCode() {
        return v() ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean l(AbstractC1460s abstractC1460s) {
        if (!(abstractC1460s instanceof C1442c) || v() != ((C1442c) abstractC1460s).v()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        c1459q.j(z8, 1, this.f10434a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean q() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public AbstractC1460s r() {
        if (v()) {
            return f10433c;
        }
        return f10432b;
    }

    public String toString() {
        if (v()) {
            return "TRUE";
        }
        return "FALSE";
    }

    public boolean v() {
        if (this.f10434a != 0) {
            return true;
        }
        return false;
    }
}
