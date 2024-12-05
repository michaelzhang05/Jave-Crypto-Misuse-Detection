package C6;

import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class I extends AbstractC1032c {

    /* renamed from: f, reason: collision with root package name */
    private final B6.b f1611f;

    /* renamed from: g, reason: collision with root package name */
    private final int f1612g;

    /* renamed from: h, reason: collision with root package name */
    private int f1613h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(B6.a json, B6.b value) {
        super(json, value, null);
        AbstractC3255y.i(json, "json");
        AbstractC3255y.i(value, "value");
        this.f1611f = value;
        this.f1612g = s0().size();
        this.f1613h = -1;
    }

    @Override // A6.V
    protected String a0(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return String.valueOf(i8);
    }

    @Override // C6.AbstractC1032c
    protected B6.i e0(String tag) {
        AbstractC3255y.i(tag, "tag");
        return s0().get(Integer.parseInt(tag));
    }

    @Override // z6.c
    public int g(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
        int i8 = this.f1613h;
        if (i8 < this.f1612g - 1) {
            int i9 = i8 + 1;
            this.f1613h = i9;
            return i9;
        }
        return -1;
    }

    @Override // C6.AbstractC1032c
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public B6.b s0() {
        return this.f1611f;
    }
}
