package v;

import android.content.Context;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C4074c extends AbstractC4079h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f40081a;

    /* renamed from: b, reason: collision with root package name */
    private final E.a f40082b;

    /* renamed from: c, reason: collision with root package name */
    private final E.a f40083c;

    /* renamed from: d, reason: collision with root package name */
    private final String f40084d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4074c(Context context, E.a aVar, E.a aVar2, String str) {
        if (context != null) {
            this.f40081a = context;
            if (aVar != null) {
                this.f40082b = aVar;
                if (aVar2 != null) {
                    this.f40083c = aVar2;
                    if (str != null) {
                        this.f40084d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // v.AbstractC4079h
    public Context b() {
        return this.f40081a;
    }

    @Override // v.AbstractC4079h
    public String c() {
        return this.f40084d;
    }

    @Override // v.AbstractC4079h
    public E.a d() {
        return this.f40083c;
    }

    @Override // v.AbstractC4079h
    public E.a e() {
        return this.f40082b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4079h)) {
            return false;
        }
        AbstractC4079h abstractC4079h = (AbstractC4079h) obj;
        if (this.f40081a.equals(abstractC4079h.b()) && this.f40082b.equals(abstractC4079h.e()) && this.f40083c.equals(abstractC4079h.d()) && this.f40084d.equals(abstractC4079h.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f40081a.hashCode() ^ 1000003) * 1000003) ^ this.f40082b.hashCode()) * 1000003) ^ this.f40083c.hashCode()) * 1000003) ^ this.f40084d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f40081a + ", wallClock=" + this.f40082b + ", monotonicClock=" + this.f40083c + ", backendName=" + this.f40084d + "}";
    }
}
