package e1;

import android.content.Context;

/* loaded from: classes.dex */
final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6494a;

    /* renamed from: b, reason: collision with root package name */
    private final n1.a f6495b;

    /* renamed from: c, reason: collision with root package name */
    private final n1.a f6496c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6497d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, n1.a aVar, n1.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f6494a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f6495b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f6496c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f6497d = str;
    }

    @Override // e1.h
    public Context b() {
        return this.f6494a;
    }

    @Override // e1.h
    public String c() {
        return this.f6497d;
    }

    @Override // e1.h
    public n1.a d() {
        return this.f6496c;
    }

    @Override // e1.h
    public n1.a e() {
        return this.f6495b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f6494a.equals(hVar.b()) && this.f6495b.equals(hVar.e()) && this.f6496c.equals(hVar.d()) && this.f6497d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.f6494a.hashCode() ^ 1000003) * 1000003) ^ this.f6495b.hashCode()) * 1000003) ^ this.f6496c.hashCode()) * 1000003) ^ this.f6497d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f6494a + ", wallClock=" + this.f6495b + ", monotonicClock=" + this.f6496c + ", backendName=" + this.f6497d + "}";
    }
}
