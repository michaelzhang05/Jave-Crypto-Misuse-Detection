package A6;

import kotlin.jvm.internal.AbstractC3255y;
import x6.AbstractC4193a;

/* loaded from: classes5.dex */
public final class A0 extends j0 implements w6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final A0 f496c = new A0();

    private A0() {
        super(AbstractC4193a.s(O5.C.f8267b));
    }

    protected int A(long[] collectionSize) {
        AbstractC3255y.i(collectionSize, "$this$collectionSize");
        return O5.D.p(collectionSize);
    }

    protected long[] B() {
        return O5.D.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0997p, A6.AbstractC0976a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(z6.c decoder, int i8, z0 builder, boolean z8) {
        AbstractC3255y.i(decoder, "decoder");
        AbstractC3255y.i(builder, "builder");
        builder.e(O5.C.b(decoder.D(a(), i8).u()));
    }

    protected z0 D(long[] toBuilder) {
        AbstractC3255y.i(toBuilder, "$this$toBuilder");
        return new z0(toBuilder, null);
    }

    protected void E(z6.d encoder, long[] content, int i8) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.v(a(), i9).D(O5.D.n(content, i9));
        }
    }

    @Override // A6.AbstractC0976a
    public /* bridge */ /* synthetic */ int j(Object obj) {
        return A(((O5.D) obj).y());
    }

    @Override // A6.AbstractC0976a
    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return D(((O5.D) obj).y());
    }

    @Override // A6.j0
    public /* bridge */ /* synthetic */ Object w() {
        return O5.D.c(B());
    }

    @Override // A6.j0
    public /* bridge */ /* synthetic */ void z(z6.d dVar, Object obj, int i8) {
        E(dVar, ((O5.D) obj).y(), i8);
    }
}
