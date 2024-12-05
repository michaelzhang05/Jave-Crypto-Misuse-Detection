package m4;

import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* renamed from: m4.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3430u extends o0 {

    /* renamed from: b, reason: collision with root package name */
    private final G f35728b;

    /* renamed from: c, reason: collision with root package name */
    private final C3434y f35729c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f35730d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f35731e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3430u(G identifier, C3434y controller) {
        super(identifier);
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(controller, "controller");
        this.f35728b = identifier;
        this.f35729c = controller;
        this.f35730d = true;
    }

    @Override // m4.o0, m4.k0
    public G a() {
        return this.f35728b;
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f35731e;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f35730d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3430u)) {
            return false;
        }
        C3430u c3430u = (C3430u) obj;
        if (AbstractC3159y.d(this.f35728b, c3430u.f35728b) && AbstractC3159y.d(this.f35729c, c3430u.f35729c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f35728b.hashCode() * 31) + this.f35729c.hashCode();
    }

    @Override // m4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3434y i() {
        return this.f35729c;
    }

    public String toString() {
        return "CountryElement(identifier=" + this.f35728b + ", controller=" + this.f35729c + ")";
    }
}
