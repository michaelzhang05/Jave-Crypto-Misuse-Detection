package R6;

/* renamed from: R6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1329a extends AbstractC1351s {

    /* renamed from: a, reason: collision with root package name */
    protected final boolean f8799a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f8800b;

    /* renamed from: c, reason: collision with root package name */
    protected final byte[] f8801c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1329a(boolean z8, int i8, byte[] bArr) {
        this.f8799a = z8;
        this.f8800b = i8;
        this.f8801c = E7.a.d(bArr);
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        boolean z8 = this.f8799a;
        return ((z8 ? 1 : 0) ^ this.f8800b) ^ E7.a.k(this.f8801c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (!(abstractC1351s instanceof AbstractC1329a)) {
            return false;
        }
        AbstractC1329a abstractC1329a = (AbstractC1329a) abstractC1351s;
        if (this.f8799a != abstractC1329a.f8799a || this.f8800b != abstractC1329a.f8800b || !E7.a.a(this.f8801c, abstractC1329a.f8801c)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        return E0.b(this.f8800b) + E0.a(this.f8801c.length) + this.f8801c.length;
    }

    @Override // R6.AbstractC1351s
    public boolean t() {
        return this.f8799a;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (t()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(w()));
        stringBuffer.append("]");
        if (this.f8801c != null) {
            stringBuffer.append(" #");
            str = F7.b.c(this.f8801c);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }

    public int w() {
        return this.f8800b;
    }
}
