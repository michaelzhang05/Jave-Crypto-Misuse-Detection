package A6;

import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.C3248q;
import x6.AbstractC4193a;

/* renamed from: A6.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0999s extends j0 implements w6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0999s f597c = new C0999s();

    private C0999s() {
        super(AbstractC4193a.z(C3248q.f34190a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(double[] dArr) {
        AbstractC3255y.i(dArr, "<this>");
        return dArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public double[] w() {
        return new double[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0997p, A6.AbstractC0976a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(z6.c decoder, int i8, r builder, boolean z8) {
        AbstractC3255y.i(decoder, "decoder");
        AbstractC3255y.i(builder, "builder");
        builder.e(decoder.A(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public r p(double[] dArr) {
        AbstractC3255y.i(dArr, "<this>");
        return new r(dArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(z6.d encoder, double[] content, int i8) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.o(a(), i9, content[i9]);
        }
    }
}
