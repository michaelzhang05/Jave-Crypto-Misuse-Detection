package x6;

import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.C3144i;
import u6.AbstractC3808a;

/* renamed from: x6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3947g extends j0 implements t6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C3947g f39570c = new C3947g();

    private C3947g() {
        super(AbstractC3808a.w(C3144i.f33777a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(boolean[] zArr) {
        AbstractC3159y.i(zArr, "<this>");
        return zArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean[] w() {
        return new boolean[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3956p, x6.AbstractC3935a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(w6.c decoder, int i8, C3945f builder, boolean z8) {
        AbstractC3159y.i(decoder, "decoder");
        AbstractC3159y.i(builder, "builder");
        builder.e(decoder.j(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C3945f p(boolean[] zArr) {
        AbstractC3159y.i(zArr, "<this>");
        return new C3945f(zArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(w6.d encoder, boolean[] content, int i8) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.o(a(), i9, content[i9]);
        }
    }
}
