package R6;

/* renamed from: R6.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1352t extends AbstractC1351s {

    /* renamed from: a, reason: collision with root package name */
    protected final boolean f8848a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f8849b;

    /* renamed from: c, reason: collision with root package name */
    protected final byte[] f8850c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1352t(boolean z8, int i8, byte[] bArr) {
        this.f8848a = z8;
        this.f8849b = i8;
        this.f8850c = E7.a.d(bArr);
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        boolean z8 = this.f8848a;
        return ((z8 ? 1 : 0) ^ this.f8849b) ^ E7.a.k(this.f8850c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (!(abstractC1351s instanceof AbstractC1352t)) {
            return false;
        }
        AbstractC1352t abstractC1352t = (AbstractC1352t) abstractC1351s;
        if (this.f8848a != abstractC1352t.f8848a || this.f8849b != abstractC1352t.f8849b || !E7.a.a(this.f8850c, abstractC1352t.f8850c)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        return E0.b(this.f8849b) + E0.a(this.f8850c.length) + this.f8850c.length;
    }

    @Override // R6.AbstractC1351s
    public boolean t() {
        return this.f8848a;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (t()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("PRIVATE ");
        stringBuffer.append(Integer.toString(w()));
        stringBuffer.append("]");
        if (this.f8850c != null) {
            stringBuffer.append(" #");
            str = F7.b.c(this.f8850c);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }

    public int w() {
        return this.f8849b;
    }
}
