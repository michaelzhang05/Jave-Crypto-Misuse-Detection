package A6;

import kotlin.jvm.internal.AbstractC3255y;
import x6.AbstractC4193a;

/* loaded from: classes5.dex */
public final class A extends j0 implements w6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final A f495c = new A();

    private A() {
        super(AbstractC4193a.A(kotlin.jvm.internal.r.f34191a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(float[] fArr) {
        AbstractC3255y.i(fArr, "<this>");
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public float[] w() {
        return new float[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0997p, A6.AbstractC0976a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(z6.c decoder, int i8, C1006z builder, boolean z8) {
        AbstractC3255y.i(decoder, "decoder");
        AbstractC3255y.i(builder, "builder");
        builder.e(decoder.G(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C1006z p(float[] fArr) {
        AbstractC3255y.i(fArr, "<this>");
        return new C1006z(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(z6.d encoder, float[] content, int i8) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.w(a(), i9, content[i9]);
        }
    }
}
