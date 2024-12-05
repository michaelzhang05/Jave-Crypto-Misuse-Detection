package com.stripe.android.customersheet;

import b3.C1970d;
import com.stripe.android.model.j;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final j f24812a;

    /* renamed from: b, reason: collision with root package name */
    private final C1970d f24813b;

    public h(j elementsSession, C1970d metadata) {
        AbstractC3255y.i(elementsSession, "elementsSession");
        AbstractC3255y.i(metadata, "metadata");
        this.f24812a = elementsSession;
        this.f24813b = metadata;
    }

    public final j a() {
        return this.f24812a;
    }

    public final C1970d b() {
        return this.f24813b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC3255y.d(this.f24812a, hVar.f24812a) && AbstractC3255y.d(this.f24813b, hVar.f24813b);
    }

    public int hashCode() {
        return (this.f24812a.hashCode() * 31) + this.f24813b.hashCode();
    }

    public String toString() {
        return "ElementsSessionWithMetadata(elementsSession=" + this.f24812a + ", metadata=" + this.f24813b + ")";
    }
}
