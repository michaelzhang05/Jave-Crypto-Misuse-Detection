package C6;

import O5.C1352h;
import j6.AbstractC3201D;
import kotlin.jvm.internal.AbstractC3255y;
import z6.AbstractC4233a;

/* loaded from: classes5.dex */
public final class w extends AbstractC4233a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1030a f1686a;

    /* renamed from: b, reason: collision with root package name */
    private final D6.b f1687b;

    public w(AbstractC1030a lexer, B6.a json) {
        AbstractC3255y.i(lexer, "lexer");
        AbstractC3255y.i(json, "json");
        this.f1686a = lexer;
        this.f1687b = json.e();
    }

    @Override // z6.AbstractC4233a, z6.e
    public byte C() {
        AbstractC1030a abstractC1030a = this.f1686a;
        String q8 = abstractC1030a.q();
        try {
            return AbstractC3201D.a(q8);
        } catch (IllegalArgumentException unused) {
            AbstractC1030a.x(abstractC1030a, "Failed to parse type 'UByte' for input '" + q8 + '\'', 0, null, 6, null);
            throw new C1352h();
        }
    }

    @Override // z6.AbstractC4233a, z6.e
    public short E() {
        AbstractC1030a abstractC1030a = this.f1686a;
        String q8 = abstractC1030a.q();
        try {
            return AbstractC3201D.j(q8);
        } catch (IllegalArgumentException unused) {
            AbstractC1030a.x(abstractC1030a, "Failed to parse type 'UShort' for input '" + q8 + '\'', 0, null, 6, null);
            throw new C1352h();
        }
    }

    @Override // z6.c
    public D6.b a() {
        return this.f1687b;
    }

    @Override // z6.c
    public int g(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // z6.AbstractC4233a, z6.e
    public int o() {
        AbstractC1030a abstractC1030a = this.f1686a;
        String q8 = abstractC1030a.q();
        try {
            return AbstractC3201D.d(q8);
        } catch (IllegalArgumentException unused) {
            AbstractC1030a.x(abstractC1030a, "Failed to parse type 'UInt' for input '" + q8 + '\'', 0, null, 6, null);
            throw new C1352h();
        }
    }

    @Override // z6.AbstractC4233a, z6.e
    public long u() {
        AbstractC1030a abstractC1030a = this.f1686a;
        String q8 = abstractC1030a.q();
        try {
            return AbstractC3201D.g(q8);
        } catch (IllegalArgumentException unused) {
            AbstractC1030a.x(abstractC1030a, "Failed to parse type 'ULong' for input '" + q8 + '\'', 0, null, 6, null);
            throw new C1352h();
        }
    }
}
