package U6;

/* renamed from: U6.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1461t extends AbstractC1460s {

    /* renamed from: a, reason: collision with root package name */
    protected final boolean f10474a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f10475b;

    /* renamed from: c, reason: collision with root package name */
    protected final byte[] f10476c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1461t(boolean z8, int i8, byte[] bArr) {
        this.f10474a = z8;
        this.f10475b = i8;
        this.f10476c = H7.a.d(bArr);
    }

    @Override // U6.AbstractC1460s, U6.AbstractC1455m
    public int hashCode() {
        boolean z8 = this.f10474a;
        return ((z8 ? 1 : 0) ^ this.f10475b) ^ H7.a.k(this.f10476c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean l(AbstractC1460s abstractC1460s) {
        if (!(abstractC1460s instanceof AbstractC1461t)) {
            return false;
        }
        AbstractC1461t abstractC1461t = (AbstractC1461t) abstractC1460s;
        if (this.f10474a != abstractC1461t.f10474a || this.f10475b != abstractC1461t.f10475b || !H7.a.a(this.f10476c, abstractC1461t.f10476c)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public int n() {
        return E0.b(this.f10475b) + E0.a(this.f10476c.length) + this.f10476c.length;
    }

    @Override // U6.AbstractC1460s
    public boolean q() {
        return this.f10474a;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (q()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("PRIVATE ");
        stringBuffer.append(Integer.toString(u()));
        stringBuffer.append("]");
        if (this.f10476c != null) {
            stringBuffer.append(" #");
            str = I7.b.c(this.f10476c);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }

    public int u() {
        return this.f10475b;
    }
}
