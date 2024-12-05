package p4;

import kotlin.jvm.internal.AbstractC3255y;
import p4.k0;

/* loaded from: classes4.dex */
public abstract class n0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    private final G f37646a;

    public n0(G identifier) {
        AbstractC3255y.i(identifier, "identifier");
        this.f37646a = identifier;
    }

    @Override // p4.k0
    public G a() {
        return this.f37646a;
    }

    @Override // p4.k0
    public boolean g() {
        return k0.a.a(this);
    }
}
