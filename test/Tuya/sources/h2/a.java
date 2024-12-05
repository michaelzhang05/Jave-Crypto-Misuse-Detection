package H2;

import kotlin.jvm.internal.AbstractC3159y;
import r2.f;
import t2.AbstractC3790k;

/* loaded from: classes4.dex */
public final class a extends AbstractC3790k {

    /* renamed from: f, reason: collision with root package name */
    private final String f3440f;

    /* renamed from: g, reason: collision with root package name */
    private final String f3441g;

    /* renamed from: h, reason: collision with root package name */
    private final String f3442h;

    /* renamed from: i, reason: collision with root package name */
    private final String f3443i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f stripeError, String str) {
        super(stripeError, str, 402, null, null, 24, null);
        AbstractC3159y.i(stripeError, "stripeError");
        this.f3440f = stripeError.r();
        this.f3441g = stripeError.k();
        this.f3442h = stripeError.f();
        this.f3443i = stripeError.e();
    }

    @Override // t2.AbstractC3790k
    public String a() {
        return "cardError";
    }
}
