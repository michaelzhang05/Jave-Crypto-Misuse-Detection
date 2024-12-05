package s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3980a extends AbstractC3983d {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f39164a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f39165b;

    /* renamed from: c, reason: collision with root package name */
    private final f f39166c;

    /* renamed from: d, reason: collision with root package name */
    private final g f39167d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3980a(Integer num, Object obj, f fVar, g gVar, AbstractC3984e abstractC3984e) {
        this.f39164a = num;
        if (obj != null) {
            this.f39165b = obj;
            if (fVar != null) {
                this.f39166c = fVar;
                this.f39167d = gVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Override // s.AbstractC3983d
    public Integer a() {
        return this.f39164a;
    }

    @Override // s.AbstractC3983d
    public AbstractC3984e b() {
        return null;
    }

    @Override // s.AbstractC3983d
    public Object c() {
        return this.f39165b;
    }

    @Override // s.AbstractC3983d
    public f d() {
        return this.f39166c;
    }

    @Override // s.AbstractC3983d
    public g e() {
        return this.f39167d;
    }

    public boolean equals(Object obj) {
        g gVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3983d)) {
            return false;
        }
        AbstractC3983d abstractC3983d = (AbstractC3983d) obj;
        Integer num = this.f39164a;
        if (num != null ? num.equals(abstractC3983d.a()) : abstractC3983d.a() == null) {
            if (this.f39165b.equals(abstractC3983d.c()) && this.f39166c.equals(abstractC3983d.d()) && ((gVar = this.f39167d) != null ? gVar.equals(abstractC3983d.e()) : abstractC3983d.e() == null)) {
                abstractC3983d.b();
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f39164a;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f39165b.hashCode()) * 1000003) ^ this.f39166c.hashCode()) * 1000003;
        g gVar = this.f39167d;
        if (gVar != null) {
            i8 = gVar.hashCode();
        }
        return (hashCode2 ^ i8) * 1000003;
    }

    public String toString() {
        return "Event{code=" + this.f39164a + ", payload=" + this.f39165b + ", priority=" + this.f39166c + ", productData=" + this.f39167d + ", eventContext=" + ((Object) null) + "}";
    }
}
