package Y1;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final int f12910a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12911b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12912c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12913d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f12914e;

    public q(int i8, String str, String str2, String str3, boolean z8) {
        this.f12910a = i8;
        this.f12911b = str;
        this.f12912c = str2;
        this.f12913d = str3;
        this.f12914e = z8;
    }

    public String a() {
        return this.f12913d;
    }

    public String b() {
        return this.f12912c;
    }

    public String c() {
        return this.f12911b;
    }

    public int d() {
        return this.f12910a;
    }

    public boolean e() {
        return this.f12914e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f12910a == qVar.f12910a && this.f12914e == qVar.f12914e && this.f12911b.equals(qVar.f12911b) && this.f12912c.equals(qVar.f12912c) && this.f12913d.equals(qVar.f12913d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i8;
        int i9 = this.f12910a;
        if (this.f12914e) {
            i8 = 64;
        } else {
            i8 = 0;
        }
        return i9 + i8 + (this.f12911b.hashCode() * this.f12912c.hashCode() * this.f12913d.hashCode());
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12911b);
        sb.append('.');
        sb.append(this.f12912c);
        sb.append(this.f12913d);
        sb.append(" (");
        sb.append(this.f12910a);
        if (this.f12914e) {
            str = " itf";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
