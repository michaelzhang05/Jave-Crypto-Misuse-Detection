package z6;

import L5.C1224h;
import g6.AbstractC2724D;
import kotlin.jvm.internal.AbstractC3159y;
import w6.AbstractC3853a;
import y6.AbstractC3999a;

/* loaded from: classes5.dex */
public final class w extends AbstractC3853a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4041a f40568a;

    /* renamed from: b, reason: collision with root package name */
    private final A6.b f40569b;

    public w(AbstractC4041a lexer, AbstractC3999a json) {
        AbstractC3159y.i(lexer, "lexer");
        AbstractC3159y.i(json, "json");
        this.f40568a = lexer;
        this.f40569b = json.e();
    }

    @Override // w6.AbstractC3853a, w6.e
    public byte C() {
        AbstractC4041a abstractC4041a = this.f40568a;
        String q8 = abstractC4041a.q();
        try {
            return AbstractC2724D.a(q8);
        } catch (IllegalArgumentException unused) {
            AbstractC4041a.x(abstractC4041a, "Failed to parse type 'UByte' for input '" + q8 + '\'', 0, null, 6, null);
            throw new C1224h();
        }
    }

    @Override // w6.AbstractC3853a, w6.e
    public short D() {
        AbstractC4041a abstractC4041a = this.f40568a;
        String q8 = abstractC4041a.q();
        try {
            return AbstractC2724D.j(q8);
        } catch (IllegalArgumentException unused) {
            AbstractC4041a.x(abstractC4041a, "Failed to parse type 'UShort' for input '" + q8 + '\'', 0, null, 6, null);
            throw new C1224h();
        }
    }

    @Override // w6.c
    public A6.b b() {
        return this.f40569b;
    }

    @Override // w6.AbstractC3853a, w6.e
    public int o() {
        AbstractC4041a abstractC4041a = this.f40568a;
        String q8 = abstractC4041a.q();
        try {
            return AbstractC2724D.d(q8);
        } catch (IllegalArgumentException unused) {
            AbstractC4041a.x(abstractC4041a, "Failed to parse type 'UInt' for input '" + q8 + '\'', 0, null, 6, null);
            throw new C1224h();
        }
    }

    @Override // w6.c
    public int p(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // w6.AbstractC3853a, w6.e
    public long v() {
        AbstractC4041a abstractC4041a = this.f40568a;
        String q8 = abstractC4041a.q();
        try {
            return AbstractC2724D.g(q8);
        } catch (IllegalArgumentException unused) {
            AbstractC4041a.x(abstractC4041a, "Failed to parse type 'ULong' for input '" + q8 + '\'', 0, null, 6, null);
            throw new C1224h();
        }
    }
}
