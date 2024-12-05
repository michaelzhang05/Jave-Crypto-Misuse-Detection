package z6;

import kotlin.jvm.internal.AbstractC3159y;
import y6.AbstractC3999a;
import y6.AbstractC4007i;
import y6.C4000b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z6.I, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4038I extends AbstractC4043c {

    /* renamed from: f, reason: collision with root package name */
    private final C4000b f40493f;

    /* renamed from: g, reason: collision with root package name */
    private final int f40494g;

    /* renamed from: h, reason: collision with root package name */
    private int f40495h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4038I(AbstractC3999a json, C4000b value) {
        super(json, value, null);
        AbstractC3159y.i(json, "json");
        AbstractC3159y.i(value, "value");
        this.f40493f = value;
        this.f40494g = s0().size();
        this.f40495h = -1;
    }

    @Override // x6.V
    protected String a0(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return String.valueOf(i8);
    }

    @Override // z6.AbstractC4043c
    protected AbstractC4007i e0(String tag) {
        AbstractC3159y.i(tag, "tag");
        return s0().get(Integer.parseInt(tag));
    }

    @Override // w6.c
    public int p(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
        int i8 = this.f40495h;
        if (i8 < this.f40494g - 1) {
            int i9 = i8 + 1;
            this.f40495h = i9;
            return i9;
        }
        return -1;
    }

    @Override // z6.AbstractC4043c
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public C4000b s0() {
        return this.f40493f;
    }
}
