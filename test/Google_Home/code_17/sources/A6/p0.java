package A6;

import kotlin.jvm.internal.AbstractC3255y;
import x6.AbstractC4193a;

/* loaded from: classes5.dex */
public final class p0 extends j0 implements w6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final p0 f590c = new p0();

    private p0() {
        super(AbstractC4193a.D(kotlin.jvm.internal.W.f34165a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(short[] sArr) {
        AbstractC3255y.i(sArr, "<this>");
        return sArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public short[] w() {
        return new short[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0997p, A6.AbstractC0976a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(z6.c decoder, int i8, o0 builder, boolean z8) {
        AbstractC3255y.i(decoder, "decoder");
        AbstractC3255y.i(builder, "builder");
        builder.e(decoder.l(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public o0 p(short[] sArr) {
        AbstractC3255y.i(sArr, "<this>");
        return new o0(sArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(z6.d encoder, short[] content, int i8) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.F(a(), i9, content[i9]);
        }
    }
}
