package R6;

/* renamed from: R6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1333c extends AbstractC1351s {

    /* renamed from: b, reason: collision with root package name */
    public static final C1333c f8806b = new C1333c((byte) 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1333c f8807c = new C1333c((byte) -1);

    /* renamed from: a, reason: collision with root package name */
    private final byte f8808a;

    private C1333c(byte b8) {
        this.f8808a = b8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1333c w(byte[] bArr) {
        if (bArr.length == 1) {
            byte b8 = bArr[0];
            if (b8 != -1) {
                if (b8 != 0) {
                    return new C1333c(b8);
                }
                return f8806b;
            }
            return f8807c;
        }
        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        return x() ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (!(abstractC1351s instanceof C1333c) || x() != ((C1333c) abstractC1351s).x()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        c1350q.j(z8, 1, this.f8808a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean t() {
        return false;
    }

    public String toString() {
        if (x()) {
            return "TRUE";
        }
        return "FALSE";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public AbstractC1351s u() {
        if (x()) {
            return f8807c;
        }
        return f8806b;
    }

    public boolean x() {
        if (this.f8808a != 0) {
            return true;
        }
        return false;
    }
}
