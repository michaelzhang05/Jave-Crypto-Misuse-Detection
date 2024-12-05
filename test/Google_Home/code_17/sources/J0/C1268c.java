package J0;

import java.io.File;

/* renamed from: J0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1268c extends AbstractC1286v {

    /* renamed from: a, reason: collision with root package name */
    private final L0.F f4663a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4664b;

    /* renamed from: c, reason: collision with root package name */
    private final File f4665c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1268c(L0.F f8, String str, File file) {
        if (f8 != null) {
            this.f4663a = f8;
            if (str != null) {
                this.f4664b = str;
                if (file != null) {
                    this.f4665c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    @Override // J0.AbstractC1286v
    public L0.F b() {
        return this.f4663a;
    }

    @Override // J0.AbstractC1286v
    public File c() {
        return this.f4665c;
    }

    @Override // J0.AbstractC1286v
    public String d() {
        return this.f4664b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1286v)) {
            return false;
        }
        AbstractC1286v abstractC1286v = (AbstractC1286v) obj;
        if (this.f4663a.equals(abstractC1286v.b()) && this.f4664b.equals(abstractC1286v.d()) && this.f4665c.equals(abstractC1286v.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f4663a.hashCode() ^ 1000003) * 1000003) ^ this.f4664b.hashCode()) * 1000003) ^ this.f4665c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f4663a + ", sessionId=" + this.f4664b + ", reportFile=" + this.f4665c + "}";
    }
}
