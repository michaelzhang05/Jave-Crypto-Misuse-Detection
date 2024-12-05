package x6;

import kotlin.jvm.internal.AbstractC3159y;
import u6.AbstractC3808a;

/* loaded from: classes5.dex */
public final class u0 extends j0 implements t6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final u0 f39617c = new u0();

    private u0() {
        super(AbstractC3808a.q(L5.y.f6525b));
    }

    protected int A(byte[] collectionSize) {
        AbstractC3159y.i(collectionSize, "$this$collectionSize");
        return L5.z.s(collectionSize);
    }

    protected byte[] B() {
        return L5.z.g(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3956p, x6.AbstractC3935a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(w6.c decoder, int i8, t0 builder, boolean z8) {
        AbstractC3159y.i(decoder, "decoder");
        AbstractC3159y.i(builder, "builder");
        builder.e(L5.y.b(decoder.A(a(), i8).C()));
    }

    protected t0 D(byte[] toBuilder) {
        AbstractC3159y.i(toBuilder, "$this$toBuilder");
        return new t0(toBuilder, null);
    }

    protected void E(w6.d encoder, byte[] content, int i8) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.x(a(), i9).l(L5.z.q(content, i9));
        }
    }

    @Override // x6.AbstractC3935a
    public /* bridge */ /* synthetic */ int j(Object obj) {
        return A(((L5.z) obj).y());
    }

    @Override // x6.AbstractC3935a
    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return D(((L5.z) obj).y());
    }

    @Override // x6.j0
    public /* bridge */ /* synthetic */ Object w() {
        return L5.z.a(B());
    }

    @Override // x6.j0
    public /* bridge */ /* synthetic */ void z(w6.d dVar, Object obj, int i8) {
        E(dVar, ((L5.z) obj).y(), i8);
    }
}
