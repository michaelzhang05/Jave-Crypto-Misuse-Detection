package b2;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final int f15195a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15196b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15197c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15198d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15199e;

    public q(int i8, String str, String str2, String str3, boolean z8) {
        this.f15195a = i8;
        this.f15196b = str;
        this.f15197c = str2;
        this.f15198d = str3;
        this.f15199e = z8;
    }

    public String a() {
        return this.f15198d;
    }

    public String b() {
        return this.f15197c;
    }

    public String c() {
        return this.f15196b;
    }

    public int d() {
        return this.f15195a;
    }

    public boolean e() {
        return this.f15199e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f15195a == qVar.f15195a && this.f15199e == qVar.f15199e && this.f15196b.equals(qVar.f15196b) && this.f15197c.equals(qVar.f15197c) && this.f15198d.equals(qVar.f15198d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i8;
        int i9 = this.f15195a;
        if (this.f15199e) {
            i8 = 64;
        } else {
            i8 = 0;
        }
        return i9 + i8 + (this.f15196b.hashCode() * this.f15197c.hashCode() * this.f15198d.hashCode());
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15196b);
        sb.append('.');
        sb.append(this.f15197c);
        sb.append(this.f15198d);
        sb.append(" (");
        sb.append(this.f15195a);
        if (this.f15199e) {
            str = " itf";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
