package x6;

import kotlin.jvm.internal.AbstractC3159y;
import u6.AbstractC3808a;

/* loaded from: classes5.dex */
public final class x0 extends j0 implements t6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final x0 f39638c = new x0();

    private x0() {
        super(AbstractC3808a.r(L5.A.f6471b));
    }

    protected int A(int[] collectionSize) {
        AbstractC3159y.i(collectionSize, "$this$collectionSize");
        return L5.B.s(collectionSize);
    }

    protected int[] B() {
        return L5.B.g(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3956p, x6.AbstractC3935a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(w6.c decoder, int i8, w0 builder, boolean z8) {
        AbstractC3159y.i(decoder, "decoder");
        AbstractC3159y.i(builder, "builder");
        builder.e(L5.A.b(decoder.A(a(), i8).o()));
    }

    protected w0 D(int[] toBuilder) {
        AbstractC3159y.i(toBuilder, "$this$toBuilder");
        return new w0(toBuilder, null);
    }

    protected void E(w6.d encoder, int[] content, int i8) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.x(a(), i9).z(L5.B.q(content, i9));
        }
    }

    @Override // x6.AbstractC3935a
    public /* bridge */ /* synthetic */ int j(Object obj) {
        return A(((L5.B) obj).y());
    }

    @Override // x6.AbstractC3935a
    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return D(((L5.B) obj).y());
    }

    @Override // x6.j0
    public /* bridge */ /* synthetic */ Object w() {
        return L5.B.a(B());
    }

    @Override // x6.j0
    public /* bridge */ /* synthetic */ void z(w6.d dVar, Object obj, int i8) {
        E(dVar, ((L5.B) obj).y(), i8);
    }
}
