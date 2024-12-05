package A6;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class j0 extends AbstractC0997p {

    /* renamed from: b, reason: collision with root package name */
    private final y6.f f573b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(w6.b primitiveSerializer) {
        super(primitiveSerializer, null);
        AbstractC3255y.i(primitiveSerializer, "primitiveSerializer");
        this.f573b = new i0(primitiveSerializer.a());
    }

    @Override // A6.AbstractC0997p, w6.b, w6.i, w6.InterfaceC4150a
    public final y6.f a() {
        return this.f573b;
    }

    @Override // A6.AbstractC0976a, w6.InterfaceC4150a
    public final Object b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        return k(decoder, null);
    }

    @Override // A6.AbstractC0997p, w6.i
    public final void d(z6.f encoder, Object obj) {
        AbstractC3255y.i(encoder, "encoder");
        int j8 = j(obj);
        y6.f fVar = this.f573b;
        z6.d j9 = encoder.j(fVar, j8);
        z(j9, obj, j8);
        j9.b(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    public final Iterator i(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final h0 f() {
        return (h0) p(w());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final int g(h0 h0Var) {
        AbstractC3255y.i(h0Var, "<this>");
        return h0Var.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void h(h0 h0Var, int i8) {
        AbstractC3255y.i(h0Var, "<this>");
        h0Var.b(i8);
    }

    protected abstract Object w();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0997p
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void s(h0 h0Var, int i8, Object obj) {
        AbstractC3255y.i(h0Var, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final Object q(h0 h0Var) {
        AbstractC3255y.i(h0Var, "<this>");
        return h0Var.a();
    }

    protected abstract void z(z6.d dVar, Object obj, int i8);
}
