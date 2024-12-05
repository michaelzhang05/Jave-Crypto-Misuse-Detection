package x6;

import kotlin.jvm.internal.AbstractC3159y;
import u6.AbstractC3808a;

/* loaded from: classes5.dex */
public final class A0 extends j0 implements t6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final A0 f39501c = new A0();

    private A0() {
        super(AbstractC3808a.s(L5.C.f6476b));
    }

    protected int A(long[] collectionSize) {
        AbstractC3159y.i(collectionSize, "$this$collectionSize");
        return L5.D.s(collectionSize);
    }

    protected long[] B() {
        return L5.D.g(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3956p, x6.AbstractC3935a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(w6.c decoder, int i8, z0 builder, boolean z8) {
        AbstractC3159y.i(decoder, "decoder");
        AbstractC3159y.i(builder, "builder");
        builder.e(L5.C.b(decoder.A(a(), i8).v()));
    }

    protected z0 D(long[] toBuilder) {
        AbstractC3159y.i(toBuilder, "$this$toBuilder");
        return new z0(toBuilder, null);
    }

    protected void E(w6.d encoder, long[] content, int i8) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.x(a(), i9).C(L5.D.q(content, i9));
        }
    }

    @Override // x6.AbstractC3935a
    public /* bridge */ /* synthetic */ int j(Object obj) {
        return A(((L5.D) obj).y());
    }

    @Override // x6.AbstractC3935a
    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return D(((L5.D) obj).y());
    }

    @Override // x6.j0
    public /* bridge */ /* synthetic */ Object w() {
        return L5.D.a(B());
    }

    @Override // x6.j0
    public /* bridge */ /* synthetic */ void z(w6.d dVar, Object obj, int i8) {
        E(dVar, ((L5.D) obj).y(), i8);
    }
}
