package m4;

import kotlin.jvm.internal.AbstractC3159y;
import m4.k0;

/* loaded from: classes4.dex */
public abstract class n0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    private final G f35620a;

    public n0(G identifier) {
        AbstractC3159y.i(identifier, "identifier");
        this.f35620a = identifier;
    }

    @Override // m4.k0
    public G a() {
        return this.f35620a;
    }

    @Override // m4.k0
    public boolean g() {
        return k0.a.a(this);
    }
}
