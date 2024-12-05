package j1;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3175a extends AbstractC3180f {

    /* renamed from: a, reason: collision with root package name */
    private final String f33895a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33896b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3175a(String str, String str2) {
        if (str != null) {
            this.f33895a = str;
            if (str2 != null) {
                this.f33896b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // j1.AbstractC3180f
    public String b() {
        return this.f33895a;
    }

    @Override // j1.AbstractC3180f
    public String c() {
        return this.f33896b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3180f)) {
            return false;
        }
        AbstractC3180f abstractC3180f = (AbstractC3180f) obj;
        if (this.f33895a.equals(abstractC3180f.b()) && this.f33896b.equals(abstractC3180f.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f33895a.hashCode() ^ 1000003) * 1000003) ^ this.f33896b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f33895a + ", version=" + this.f33896b + "}";
    }
}
