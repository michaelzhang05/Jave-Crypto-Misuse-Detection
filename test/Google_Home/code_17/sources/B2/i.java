package b2;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f15147a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15148b;

    /* renamed from: c, reason: collision with root package name */
    private final q f15149c;

    /* renamed from: d, reason: collision with root package name */
    private final Object[] f15150d;

    public i(String str, String str2, q qVar, Object... objArr) {
        this.f15147a = str;
        this.f15148b = str2;
        this.f15149c = qVar;
        this.f15150d = objArr;
    }

    public q a() {
        return this.f15149c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] b() {
        return this.f15150d;
    }

    public String c() {
        return this.f15148b;
    }

    public String d() {
        return this.f15147a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f15147a.equals(iVar.f15147a) && this.f15148b.equals(iVar.f15148b) && this.f15149c.equals(iVar.f15149c) && Arrays.equals(this.f15150d, iVar.f15150d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f15147a.hashCode() ^ Integer.rotateLeft(this.f15148b.hashCode(), 8)) ^ Integer.rotateLeft(this.f15149c.hashCode(), 16)) ^ Integer.rotateLeft(Arrays.hashCode(this.f15150d), 24);
    }

    public String toString() {
        return this.f15147a + " : " + this.f15148b + ' ' + this.f15149c + ' ' + Arrays.toString(this.f15150d);
    }
}
