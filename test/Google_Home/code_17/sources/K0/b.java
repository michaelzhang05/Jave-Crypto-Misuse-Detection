package K0;

/* loaded from: classes3.dex */
final class b extends i {

    /* renamed from: b, reason: collision with root package name */
    private final String f4989b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4990c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4991d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4992e;

    /* renamed from: f, reason: collision with root package name */
    private final long f4993f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, String str2, String str3, String str4, long j8) {
        if (str != null) {
            this.f4989b = str;
            if (str2 != null) {
                this.f4990c = str2;
                if (str3 != null) {
                    this.f4991d = str3;
                    if (str4 != null) {
                        this.f4992e = str4;
                        this.f4993f = j8;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }

    @Override // K0.i
    public String c() {
        return this.f4990c;
    }

    @Override // K0.i
    public String d() {
        return this.f4991d;
    }

    @Override // K0.i
    public String e() {
        return this.f4989b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f4989b.equals(iVar.e()) && this.f4990c.equals(iVar.c()) && this.f4991d.equals(iVar.d()) && this.f4992e.equals(iVar.g()) && this.f4993f == iVar.f()) {
            return true;
        }
        return false;
    }

    @Override // K0.i
    public long f() {
        return this.f4993f;
    }

    @Override // K0.i
    public String g() {
        return this.f4992e;
    }

    public int hashCode() {
        int hashCode = (((((((this.f4989b.hashCode() ^ 1000003) * 1000003) ^ this.f4990c.hashCode()) * 1000003) ^ this.f4991d.hashCode()) * 1000003) ^ this.f4992e.hashCode()) * 1000003;
        long j8 = this.f4993f;
        return hashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f4989b + ", parameterKey=" + this.f4990c + ", parameterValue=" + this.f4991d + ", variantId=" + this.f4992e + ", templateVersion=" + this.f4993f + "}";
    }
}
