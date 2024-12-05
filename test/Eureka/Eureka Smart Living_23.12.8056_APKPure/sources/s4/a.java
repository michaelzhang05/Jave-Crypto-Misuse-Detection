package s4;

/* loaded from: classes.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f9250a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9251b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f9250a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f9251b = str2;
    }

    @Override // s4.f
    public String b() {
        return this.f9250a;
    }

    @Override // s4.f
    public String c() {
        return this.f9251b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f9250a.equals(fVar.b()) && this.f9251b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f9250a.hashCode() ^ 1000003) * 1000003) ^ this.f9251b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f9250a + ", version=" + this.f9251b + "}";
    }
}
