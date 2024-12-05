package b1;

/* loaded from: classes.dex */
final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f3812a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3813b;

    /* renamed from: c, reason: collision with root package name */
    private final d f3814c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Integer num, Object obj, d dVar) {
        this.f3812a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f3813b = obj;
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f3814c = dVar;
    }

    @Override // b1.c
    public Integer a() {
        return this.f3812a;
    }

    @Override // b1.c
    public Object b() {
        return this.f3813b;
    }

    @Override // b1.c
    public d c() {
        return this.f3814c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f3812a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f3813b.equals(cVar.b()) && this.f3814c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f3812a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f3813b.hashCode()) * 1000003) ^ this.f3814c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f3812a + ", payload=" + this.f3813b + ", priority=" + this.f3814c + "}";
    }
}
