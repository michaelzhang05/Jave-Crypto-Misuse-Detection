package Y1;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f12862a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12863b;

    /* renamed from: c, reason: collision with root package name */
    private final q f12864c;

    /* renamed from: d, reason: collision with root package name */
    private final Object[] f12865d;

    public i(String str, String str2, q qVar, Object... objArr) {
        this.f12862a = str;
        this.f12863b = str2;
        this.f12864c = qVar;
        this.f12865d = objArr;
    }

    public q a() {
        return this.f12864c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] b() {
        return this.f12865d;
    }

    public String c() {
        return this.f12863b;
    }

    public String d() {
        return this.f12862a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f12862a.equals(iVar.f12862a) && this.f12863b.equals(iVar.f12863b) && this.f12864c.equals(iVar.f12864c) && Arrays.equals(this.f12865d, iVar.f12865d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12862a.hashCode() ^ Integer.rotateLeft(this.f12863b.hashCode(), 8)) ^ Integer.rotateLeft(this.f12864c.hashCode(), 16)) ^ Integer.rotateLeft(Arrays.hashCode(this.f12865d), 24);
    }

    public String toString() {
        return this.f12862a + " : " + this.f12863b + ' ' + this.f12864c + ' ' + Arrays.toString(this.f12865d);
    }
}
