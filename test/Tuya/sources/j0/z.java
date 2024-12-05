package J0;

import J0.D;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class z extends D.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f4678a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4679b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4680c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4681d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4682e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4683f;

    /* renamed from: g, reason: collision with root package name */
    private final int f4684g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4685h;

    /* renamed from: i, reason: collision with root package name */
    private final String f4686i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(int i8, String str, int i9, long j8, long j9, boolean z8, int i10, String str2, String str3) {
        this.f4678a = i8;
        if (str != null) {
            this.f4679b = str;
            this.f4680c = i9;
            this.f4681d = j8;
            this.f4682e = j9;
            this.f4683f = z8;
            this.f4684g = i10;
            if (str2 != null) {
                this.f4685h = str2;
                if (str3 != null) {
                    this.f4686i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    @Override // J0.D.b
    public int a() {
        return this.f4678a;
    }

    @Override // J0.D.b
    public int b() {
        return this.f4680c;
    }

    @Override // J0.D.b
    public long d() {
        return this.f4682e;
    }

    @Override // J0.D.b
    public boolean e() {
        return this.f4683f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D.b)) {
            return false;
        }
        D.b bVar = (D.b) obj;
        if (this.f4678a == bVar.a() && this.f4679b.equals(bVar.g()) && this.f4680c == bVar.b() && this.f4681d == bVar.j() && this.f4682e == bVar.d() && this.f4683f == bVar.e() && this.f4684g == bVar.i() && this.f4685h.equals(bVar.f()) && this.f4686i.equals(bVar.h())) {
            return true;
        }
        return false;
    }

    @Override // J0.D.b
    public String f() {
        return this.f4685h;
    }

    @Override // J0.D.b
    public String g() {
        return this.f4679b;
    }

    @Override // J0.D.b
    public String h() {
        return this.f4686i;
    }

    public int hashCode() {
        int i8;
        int hashCode = (((((this.f4678a ^ 1000003) * 1000003) ^ this.f4679b.hashCode()) * 1000003) ^ this.f4680c) * 1000003;
        long j8 = this.f4681d;
        int i9 = (hashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f4682e;
        int i10 = (i9 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        if (this.f4683f) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return ((((((i10 ^ i8) * 1000003) ^ this.f4684g) * 1000003) ^ this.f4685h.hashCode()) * 1000003) ^ this.f4686i.hashCode();
    }

    @Override // J0.D.b
    public int i() {
        return this.f4684g;
    }

    @Override // J0.D.b
    public long j() {
        return this.f4681d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f4678a + ", model=" + this.f4679b + ", availableProcessors=" + this.f4680c + ", totalRam=" + this.f4681d + ", diskSpace=" + this.f4682e + ", isEmulator=" + this.f4683f + ", state=" + this.f4684g + ", manufacturer=" + this.f4685h + ", modelClass=" + this.f4686i + "}";
    }
}
