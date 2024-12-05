package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final u1.b f4615a;

    /* renamed from: b, reason: collision with root package name */
    private final s1.c f4616b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ m(u1.b bVar, s1.c cVar, u1.m mVar) {
        this.f4615a = bVar;
        this.f4616b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof m)) {
            m mVar = (m) obj;
            if (v1.m.a(this.f4615a, mVar.f4615a) && v1.m.a(this.f4616b, mVar.f4616b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return v1.m.b(this.f4615a, this.f4616b);
    }

    public final String toString() {
        return v1.m.c(this).a("key", this.f4615a).a("feature", this.f4616b).toString();
    }
}
