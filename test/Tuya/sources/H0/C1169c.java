package H0;

import java.io.File;

/* renamed from: H0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1169c extends AbstractC1184s {

    /* renamed from: a, reason: collision with root package name */
    private final J0.B f3287a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3288b;

    /* renamed from: c, reason: collision with root package name */
    private final File f3289c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1169c(J0.B b8, String str, File file) {
        if (b8 != null) {
            this.f3287a = b8;
            if (str != null) {
                this.f3288b = str;
                if (file != null) {
                    this.f3289c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    @Override // H0.AbstractC1184s
    public J0.B b() {
        return this.f3287a;
    }

    @Override // H0.AbstractC1184s
    public File c() {
        return this.f3289c;
    }

    @Override // H0.AbstractC1184s
    public String d() {
        return this.f3288b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1184s)) {
            return false;
        }
        AbstractC1184s abstractC1184s = (AbstractC1184s) obj;
        if (this.f3287a.equals(abstractC1184s.b()) && this.f3288b.equals(abstractC1184s.d()) && this.f3289c.equals(abstractC1184s.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f3287a.hashCode() ^ 1000003) * 1000003) ^ this.f3288b.hashCode()) * 1000003) ^ this.f3289c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f3287a + ", sessionId=" + this.f3288b + ", reportFile=" + this.f3289c + "}";
    }
}
