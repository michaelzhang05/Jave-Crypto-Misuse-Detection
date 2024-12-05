package L0;

import L0.G;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class E extends G.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f5330a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5331b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5332c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E(String str, String str2, boolean z8) {
        if (str != null) {
            this.f5330a = str;
            if (str2 != null) {
                this.f5331b = str2;
                this.f5332c = z8;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    @Override // L0.G.c
    public boolean b() {
        return this.f5332c;
    }

    @Override // L0.G.c
    public String c() {
        return this.f5331b;
    }

    @Override // L0.G.c
    public String d() {
        return this.f5330a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G.c)) {
            return false;
        }
        G.c cVar = (G.c) obj;
        if (this.f5330a.equals(cVar.d()) && this.f5331b.equals(cVar.c()) && this.f5332c == cVar.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i8;
        int hashCode = (((this.f5330a.hashCode() ^ 1000003) * 1000003) ^ this.f5331b.hashCode()) * 1000003;
        if (this.f5332c) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return hashCode ^ i8;
    }

    public String toString() {
        return "OsData{osRelease=" + this.f5330a + ", osCodeName=" + this.f5331b + ", isRooted=" + this.f5332c + "}";
    }
}
