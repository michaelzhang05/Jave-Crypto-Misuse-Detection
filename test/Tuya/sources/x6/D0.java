package x6;

import kotlin.jvm.internal.AbstractC3159y;
import u6.AbstractC3808a;

/* loaded from: classes5.dex */
public final class D0 extends j0 implements t6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final D0 f39509c = new D0();

    private D0() {
        super(AbstractC3808a.t(L5.F.f6482b));
    }

    protected int A(short[] collectionSize) {
        AbstractC3159y.i(collectionSize, "$this$collectionSize");
        return L5.G.s(collectionSize);
    }

    protected short[] B() {
        return L5.G.g(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3956p, x6.AbstractC3935a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(w6.c decoder, int i8, C0 builder, boolean z8) {
        AbstractC3159y.i(decoder, "decoder");
        AbstractC3159y.i(builder, "builder");
        builder.e(L5.F.b(decoder.A(a(), i8).D()));
    }

    protected C0 D(short[] toBuilder) {
        AbstractC3159y.i(toBuilder, "$this$toBuilder");
        return new C0(toBuilder, null);
    }

    protected void E(w6.d encoder, short[] content, int i8) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.x(a(), i9).h(L5.G.q(content, i9));
        }
    }

    @Override // x6.AbstractC3935a
    public /* bridge */ /* synthetic */ int j(Object obj) {
        return A(((L5.G) obj).y());
    }

    @Override // x6.AbstractC3935a
    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return D(((L5.G) obj).y());
    }

    @Override // x6.j0
    public /* bridge */ /* synthetic */ Object w() {
        return L5.G.a(B());
    }

    @Override // x6.j0
    public /* bridge */ /* synthetic */ void z(w6.d dVar, Object obj, int i8) {
        E(dVar, ((L5.G) obj).y(), i8);
    }
}
