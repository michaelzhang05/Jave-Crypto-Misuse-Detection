package A6;

import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.C3240i;
import x6.AbstractC4193a;

/* renamed from: A6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0988g extends j0 implements w6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0988g f565c = new C0988g();

    private C0988g() {
        super(AbstractC4193a.w(C3240i.f34178a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(boolean[] zArr) {
        AbstractC3255y.i(zArr, "<this>");
        return zArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean[] w() {
        return new boolean[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0997p, A6.AbstractC0976a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(z6.c decoder, int i8, C0986f builder, boolean z8) {
        AbstractC3255y.i(decoder, "decoder");
        AbstractC3255y.i(builder, "builder");
        builder.e(decoder.f(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C0986f p(boolean[] zArr) {
        AbstractC3255y.i(zArr, "<this>");
        return new C0986f(zArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(z6.d encoder, boolean[] content, int i8) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.s(a(), i9, content[i9]);
        }
    }
}
