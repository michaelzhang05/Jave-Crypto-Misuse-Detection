package A6;

import kotlin.jvm.internal.AbstractC3255y;
import x6.AbstractC4193a;

/* loaded from: classes5.dex */
public final class P extends j0 implements w6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final P f521c = new P();

    private P() {
        super(AbstractC4193a.C(kotlin.jvm.internal.A.f34155a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(long[] jArr) {
        AbstractC3255y.i(jArr, "<this>");
        return jArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public long[] w() {
        return new long[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0997p, A6.AbstractC0976a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(z6.c decoder, int i8, O builder, boolean z8) {
        AbstractC3255y.i(decoder, "decoder");
        AbstractC3255y.i(builder, "builder");
        builder.e(decoder.y(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public O p(long[] jArr) {
        AbstractC3255y.i(jArr, "<this>");
        return new O(jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(z6.d encoder, long[] content, int i8) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.A(a(), i9, content[i9]);
        }
    }
}
