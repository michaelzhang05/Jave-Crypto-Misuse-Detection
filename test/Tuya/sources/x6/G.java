package x6;

import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.C3158x;
import u6.AbstractC3808a;

/* loaded from: classes5.dex */
public final class G extends j0 implements t6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final G f39517c = new G();

    private G() {
        super(AbstractC3808a.B(C3158x.f33791a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(int[] iArr) {
        AbstractC3159y.i(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int[] w() {
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3956p, x6.AbstractC3935a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(w6.c decoder, int i8, F builder, boolean z8) {
        AbstractC3159y.i(decoder, "decoder");
        AbstractC3159y.i(builder, "builder");
        builder.e(decoder.u(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public F p(int[] iArr) {
        AbstractC3159y.i(iArr, "<this>");
        return new F(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(w6.d encoder, int[] content, int i8) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.v(a(), i9, content[i9]);
        }
    }
}
