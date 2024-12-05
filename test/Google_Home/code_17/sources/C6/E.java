package C6;

import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class E extends AbstractC1032c {

    /* renamed from: f, reason: collision with root package name */
    private final B6.i f1603f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(B6.a json, B6.i value) {
        super(json, value, null);
        AbstractC3255y.i(json, "json");
        AbstractC3255y.i(value, "value");
        this.f1603f = value;
        X("primitive");
    }

    @Override // C6.AbstractC1032c
    protected B6.i e0(String tag) {
        AbstractC3255y.i(tag, "tag");
        if (tag == "primitive") {
            return s0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // z6.c
    public int g(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
        return 0;
    }

    @Override // C6.AbstractC1032c
    public B6.i s0() {
        return this.f1603f;
    }
}
