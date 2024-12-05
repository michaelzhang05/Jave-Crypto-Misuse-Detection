package s;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3981b extends g {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f39168a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3981b(Integer num) {
        this.f39168a = num;
    }

    @Override // s.g
    public Integer a() {
        return this.f39168a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        Integer num = this.f39168a;
        Integer a8 = ((g) obj).a();
        if (num == null) {
            if (a8 == null) {
                return true;
            }
            return false;
        }
        return num.equals(a8);
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f39168a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f39168a + "}";
    }
}
