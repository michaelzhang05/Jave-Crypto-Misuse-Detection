package A6;

import kotlin.jvm.internal.AbstractC3255y;
import x6.AbstractC4193a;

/* loaded from: classes5.dex */
public final class x0 extends j0 implements w6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final x0 f633c = new x0();

    private x0() {
        super(AbstractC4193a.r(O5.A.f8262b));
    }

    protected int A(int[] collectionSize) {
        AbstractC3255y.i(collectionSize, "$this$collectionSize");
        return O5.B.p(collectionSize);
    }

    protected int[] B() {
        return O5.B.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0997p, A6.AbstractC0976a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(z6.c decoder, int i8, w0 builder, boolean z8) {
        AbstractC3255y.i(decoder, "decoder");
        AbstractC3255y.i(builder, "builder");
        builder.e(O5.A.b(decoder.D(a(), i8).o()));
    }

    protected w0 D(int[] toBuilder) {
        AbstractC3255y.i(toBuilder, "$this$toBuilder");
        return new w0(toBuilder, null);
    }

    protected void E(z6.d encoder, int[] content, int i8) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.v(a(), i9).z(O5.B.n(content, i9));
        }
    }

    @Override // A6.AbstractC0976a
    public /* bridge */ /* synthetic */ int j(Object obj) {
        return A(((O5.B) obj).y());
    }

    @Override // A6.AbstractC0976a
    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return D(((O5.B) obj).y());
    }

    @Override // A6.j0
    public /* bridge */ /* synthetic */ Object w() {
        return O5.B.c(B());
    }

    @Override // A6.j0
    public /* bridge */ /* synthetic */ void z(z6.d dVar, Object obj, int i8) {
        E(dVar, ((O5.B) obj).y(), i8);
    }
}
