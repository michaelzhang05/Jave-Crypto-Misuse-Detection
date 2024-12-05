package p4;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: p4.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3760g extends o0 {

    /* renamed from: b, reason: collision with root package name */
    private final G f37520b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37521c;

    /* renamed from: d, reason: collision with root package name */
    private final B2.b f37522d;

    /* renamed from: e, reason: collision with root package name */
    private final C3759f f37523e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3760g(G identifier, v0 config, Function0 function0) {
        super(identifier);
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(config, "config");
        this.f37520b = identifier;
        this.f37521c = true;
        this.f37523e = new C3759f(config, function0, null, 4, null);
    }

    @Override // p4.o0, p4.k0
    public G a() {
        return this.f37520b;
    }

    @Override // p4.k0
    public B2.b b() {
        return this.f37522d;
    }

    @Override // p4.k0
    public boolean c() {
        return this.f37521c;
    }

    @Override // p4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3759f i() {
        return this.f37523e;
    }
}
