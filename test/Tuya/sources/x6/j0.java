package x6;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class j0 extends AbstractC3956p {

    /* renamed from: b, reason: collision with root package name */
    private final v6.f f39578b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(t6.b primitiveSerializer) {
        super(primitiveSerializer, null);
        AbstractC3159y.i(primitiveSerializer, "primitiveSerializer");
        this.f39578b = new i0(primitiveSerializer.a());
    }

    @Override // x6.AbstractC3956p, t6.b, t6.i, t6.InterfaceC3796a
    public final v6.f a() {
        return this.f39578b;
    }

    @Override // x6.AbstractC3935a, t6.InterfaceC3796a
    public final Object c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        return k(decoder, null);
    }

    @Override // x6.AbstractC3956p, t6.i
    public final void e(w6.f encoder, Object obj) {
        AbstractC3159y.i(encoder, "encoder");
        int j8 = j(obj);
        v6.f fVar = this.f39578b;
        w6.d B8 = encoder.B(fVar, j8);
        z(B8, obj, j8);
        B8.a(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    public final Iterator i(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final h0 f() {
        return (h0) p(w());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final int g(h0 h0Var) {
        AbstractC3159y.i(h0Var, "<this>");
        return h0Var.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void h(h0 h0Var, int i8) {
        AbstractC3159y.i(h0Var, "<this>");
        h0Var.b(i8);
    }

    protected abstract Object w();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3956p
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void s(h0 h0Var, int i8, Object obj) {
        AbstractC3159y.i(h0Var, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final Object q(h0 h0Var) {
        AbstractC3159y.i(h0Var, "<this>");
        return h0Var.a();
    }

    protected abstract void z(w6.d dVar, Object obj, int i8);
}
