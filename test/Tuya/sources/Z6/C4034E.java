package z6;

import kotlin.jvm.internal.AbstractC3159y;
import y6.AbstractC3999a;
import y6.AbstractC4007i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z6.E, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4034E extends AbstractC4043c {

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC4007i f40485f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4034E(AbstractC3999a json, AbstractC4007i value) {
        super(json, value, null);
        AbstractC3159y.i(json, "json");
        AbstractC3159y.i(value, "value");
        this.f40485f = value;
        X("primitive");
    }

    @Override // z6.AbstractC4043c
    protected AbstractC4007i e0(String tag) {
        AbstractC3159y.i(tag, "tag");
        if (tag == "primitive") {
            return s0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // w6.c
    public int p(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
        return 0;
    }

    @Override // z6.AbstractC4043c
    public AbstractC4007i s0() {
        return this.f40485f;
    }
}
