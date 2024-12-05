package com.stripe.android.customersheet;

import com.stripe.android.model.j;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final j f23757a;

    /* renamed from: b, reason: collision with root package name */
    private final Y2.d f23758b;

    public h(j elementsSession, Y2.d metadata) {
        AbstractC3159y.i(elementsSession, "elementsSession");
        AbstractC3159y.i(metadata, "metadata");
        this.f23757a = elementsSession;
        this.f23758b = metadata;
    }

    public final j a() {
        return this.f23757a;
    }

    public final Y2.d b() {
        return this.f23758b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC3159y.d(this.f23757a, hVar.f23757a) && AbstractC3159y.d(this.f23758b, hVar.f23758b);
    }

    public int hashCode() {
        return (this.f23757a.hashCode() * 31) + this.f23758b.hashCode();
    }

    public String toString() {
        return "ElementsSessionWithMetadata(elementsSession=" + this.f23757a + ", metadata=" + this.f23758b + ")";
    }
}
