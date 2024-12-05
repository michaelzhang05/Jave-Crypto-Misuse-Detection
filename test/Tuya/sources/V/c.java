package v;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f38585a;

    /* renamed from: b, reason: collision with root package name */
    private final E.a f38586b;

    /* renamed from: c, reason: collision with root package name */
    private final E.a f38587c;

    /* renamed from: d, reason: collision with root package name */
    private final String f38588d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, E.a aVar, E.a aVar2, String str) {
        if (context != null) {
            this.f38585a = context;
            if (aVar != null) {
                this.f38586b = aVar;
                if (aVar2 != null) {
                    this.f38587c = aVar2;
                    if (str != null) {
                        this.f38588d = str;
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

    @Override // v.h
    public Context b() {
        return this.f38585a;
    }

    @Override // v.h
    public String c() {
        return this.f38588d;
    }

    @Override // v.h
    public E.a d() {
        return this.f38587c;
    }

    @Override // v.h
    public E.a e() {
        return this.f38586b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f38585a.equals(hVar.b()) && this.f38586b.equals(hVar.e()) && this.f38587c.equals(hVar.d()) && this.f38588d.equals(hVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f38585a.hashCode() ^ 1000003) * 1000003) ^ this.f38586b.hashCode()) * 1000003) ^ this.f38587c.hashCode()) * 1000003) ^ this.f38588d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f38585a + ", wallClock=" + this.f38586b + ", monotonicClock=" + this.f38587c + ", backendName=" + this.f38588d + "}";
    }
}
