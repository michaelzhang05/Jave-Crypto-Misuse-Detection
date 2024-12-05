package A6;

import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.C3243l;
import x6.AbstractC4193a;

/* renamed from: A6.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0995n extends j0 implements w6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0995n f584c = new C0995n();

    private C0995n() {
        super(AbstractC4193a.y(C3243l.f34181a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(char[] cArr) {
        AbstractC3255y.i(cArr, "<this>");
        return cArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public char[] w() {
        return new char[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0997p, A6.AbstractC0976a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(z6.c decoder, int i8, C0994m builder, boolean z8) {
        AbstractC3255y.i(decoder, "decoder");
        AbstractC3255y.i(builder, "builder");
        builder.e(decoder.m(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C0994m p(char[] cArr) {
        AbstractC3255y.i(cArr, "<this>");
        return new C0994m(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(z6.d encoder, char[] content, int i8) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.B(a(), i9, content[i9]);
        }
    }
}
