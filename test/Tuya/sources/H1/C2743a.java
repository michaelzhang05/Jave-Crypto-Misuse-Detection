package h1;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2743a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f31349a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31350b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2743a(String str, String str2) {
        if (str != null) {
            this.f31349a = str;
            if (str2 != null) {
                this.f31350b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // h1.f
    public String b() {
        return this.f31349a;
    }

    @Override // h1.f
    public String c() {
        return this.f31350b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f31349a.equals(fVar.b()) && this.f31350b.equals(fVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f31349a.hashCode() ^ 1000003) * 1000003) ^ this.f31350b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f31349a + ", version=" + this.f31350b + "}";
    }
}
