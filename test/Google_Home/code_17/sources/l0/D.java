package L0;

import L0.G;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class D extends G.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f5321a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5322b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5323c;

    /* renamed from: d, reason: collision with root package name */
    private final long f5324d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5325e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f5326f;

    /* renamed from: g, reason: collision with root package name */
    private final int f5327g;

    /* renamed from: h, reason: collision with root package name */
    private final String f5328h;

    /* renamed from: i, reason: collision with root package name */
    private final String f5329i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D(int i8, String str, int i9, long j8, long j9, boolean z8, int i10, String str2, String str3) {
        this.f5321a = i8;
        if (str != null) {
            this.f5322b = str;
            this.f5323c = i9;
            this.f5324d = j8;
            this.f5325e = j9;
            this.f5326f = z8;
            this.f5327g = i10;
            if (str2 != null) {
                this.f5328h = str2;
                if (str3 != null) {
                    this.f5329i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    @Override // L0.G.b
    public int a() {
        return this.f5321a;
    }

    @Override // L0.G.b
    public int b() {
        return this.f5323c;
    }

    @Override // L0.G.b
    public long d() {
        return this.f5325e;
    }

    @Override // L0.G.b
    public boolean e() {
        return this.f5326f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G.b)) {
            return false;
        }
        G.b bVar = (G.b) obj;
        if (this.f5321a == bVar.a() && this.f5322b.equals(bVar.g()) && this.f5323c == bVar.b() && this.f5324d == bVar.j() && this.f5325e == bVar.d() && this.f5326f == bVar.e() && this.f5327g == bVar.i() && this.f5328h.equals(bVar.f()) && this.f5329i.equals(bVar.h())) {
            return true;
        }
        return false;
    }

    @Override // L0.G.b
    public String f() {
        return this.f5328h;
    }

    @Override // L0.G.b
    public String g() {
        return this.f5322b;
    }

    @Override // L0.G.b
    public String h() {
        return this.f5329i;
    }

    public int hashCode() {
        int i8;
        int hashCode = (((((this.f5321a ^ 1000003) * 1000003) ^ this.f5322b.hashCode()) * 1000003) ^ this.f5323c) * 1000003;
        long j8 = this.f5324d;
        int i9 = (hashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f5325e;
        int i10 = (i9 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        if (this.f5326f) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return ((((((i10 ^ i8) * 1000003) ^ this.f5327g) * 1000003) ^ this.f5328h.hashCode()) * 1000003) ^ this.f5329i.hashCode();
    }

    @Override // L0.G.b
    public int i() {
        return this.f5327g;
    }

    @Override // L0.G.b
    public long j() {
        return this.f5324d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f5321a + ", model=" + this.f5322b + ", availableProcessors=" + this.f5323c + ", totalRam=" + this.f5324d + ", diskSpace=" + this.f5325e + ", isEmulator=" + this.f5326f + ", state=" + this.f5327g + ", manufacturer=" + this.f5328h + ", modelClass=" + this.f5329i + "}";
    }
}
