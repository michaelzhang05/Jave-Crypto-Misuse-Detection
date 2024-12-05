package U6;

/* renamed from: U6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1438a extends AbstractC1460s {

    /* renamed from: a, reason: collision with root package name */
    protected final boolean f10425a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f10426b;

    /* renamed from: c, reason: collision with root package name */
    protected final byte[] f10427c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1438a(boolean z8, int i8, byte[] bArr) {
        this.f10425a = z8;
        this.f10426b = i8;
        this.f10427c = H7.a.d(bArr);
    }

    @Override // U6.AbstractC1460s, U6.AbstractC1455m
    public int hashCode() {
        boolean z8 = this.f10425a;
        return ((z8 ? 1 : 0) ^ this.f10426b) ^ H7.a.k(this.f10427c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean l(AbstractC1460s abstractC1460s) {
        if (!(abstractC1460s instanceof AbstractC1438a)) {
            return false;
        }
        AbstractC1438a abstractC1438a = (AbstractC1438a) abstractC1460s;
        if (this.f10425a != abstractC1438a.f10425a || this.f10426b != abstractC1438a.f10426b || !H7.a.a(this.f10427c, abstractC1438a.f10427c)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        return E0.b(this.f10426b) + E0.a(this.f10427c.length) + this.f10427c.length;
    }

    @Override // U6.AbstractC1460s
    public boolean q() {
        return this.f10425a;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (q()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(u()));
        stringBuffer.append("]");
        if (this.f10427c != null) {
            stringBuffer.append(" #");
            str = I7.b.c(this.f10427c);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }

    public int u() {
        return this.f10426b;
    }
}
