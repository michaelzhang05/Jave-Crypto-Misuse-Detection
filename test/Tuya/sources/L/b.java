package L;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private int f6018a = 1;

    public b a(Object obj) {
        int hashCode;
        int i8 = this.f6018a * 31;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        this.f6018a = i8 + hashCode;
        return this;
    }

    public int b() {
        return this.f6018a;
    }

    public final b c(boolean z8) {
        this.f6018a = (this.f6018a * 31) + (z8 ? 1 : 0);
        return this;
    }
}
