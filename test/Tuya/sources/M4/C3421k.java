package m4;

import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* renamed from: m4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3421k extends o0 {

    /* renamed from: b, reason: collision with root package name */
    private final G f35574b;

    /* renamed from: c, reason: collision with root package name */
    private final C3434y f35575c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f35576d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f35577e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3421k(G identifier, C3434y controller) {
        super(identifier);
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(controller, "controller");
        this.f35574b = identifier;
        this.f35575c = controller;
        this.f35576d = true;
    }

    @Override // m4.o0, m4.k0
    public G a() {
        return this.f35574b;
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f35577e;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f35576d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3421k)) {
            return false;
        }
        C3421k c3421k = (C3421k) obj;
        if (AbstractC3159y.d(this.f35574b, c3421k.f35574b) && AbstractC3159y.d(this.f35575c, c3421k.f35575c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f35574b.hashCode() * 31) + this.f35575c.hashCode();
    }

    @Override // m4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3434y i() {
        return this.f35575c;
    }

    public String toString() {
        return "AdministrativeAreaElement(identifier=" + this.f35574b + ", controller=" + this.f35575c + ")";
    }
}
