package x6;

import M5.AbstractC1246t;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import t6.InterfaceC3796a;
import w6.c;

/* loaded from: classes5.dex */
public abstract class s0 implements w6.e, w6.c {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f39603a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f39604b;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3796a f39606b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f39607c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3796a interfaceC3796a, Object obj) {
            super(0);
            this.f39606b = interfaceC3796a;
            this.f39607c = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            s0 s0Var = s0.this;
            InterfaceC3796a interfaceC3796a = this.f39606b;
            Object obj = this.f39607c;
            if (!interfaceC3796a.a().c() && !s0Var.w()) {
                return s0Var.s();
            }
            return s0Var.I(interfaceC3796a, obj);
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3796a f39609b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f39610c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3796a interfaceC3796a, Object obj) {
            super(0);
            this.f39609b = interfaceC3796a;
            this.f39610c = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return s0.this.I(this.f39609b, this.f39610c);
        }
    }

    private final Object Y(Object obj, Function0 function0) {
        X(obj);
        Object invoke = function0.invoke();
        if (!this.f39604b) {
            W();
        }
        this.f39604b = false;
        return invoke;
    }

    @Override // w6.c
    public final w6.e A(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return P(V(descriptor, i8), descriptor.h(i8));
    }

    @Override // w6.c
    public final double B(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return M(V(descriptor, i8));
    }

    @Override // w6.e
    public final byte C() {
        return K(W());
    }

    @Override // w6.e
    public final short D() {
        return S(W());
    }

    @Override // w6.e
    public final float E() {
        return O(W());
    }

    @Override // w6.c
    public int F(v6.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // w6.c
    public final short G(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return S(V(descriptor, i8));
    }

    @Override // w6.e
    public final double H() {
        return M(W());
    }

    protected Object I(InterfaceC3796a deserializer, Object obj) {
        AbstractC3159y.i(deserializer, "deserializer");
        return e(deserializer);
    }

    protected abstract boolean J(Object obj);

    protected abstract byte K(Object obj);

    protected abstract char L(Object obj);

    protected abstract double M(Object obj);

    protected abstract int N(Object obj, v6.f fVar);

    protected abstract float O(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public w6.e P(Object obj, v6.f inlineDescriptor) {
        AbstractC3159y.i(inlineDescriptor, "inlineDescriptor");
        X(obj);
        return this;
    }

    protected abstract int Q(Object obj);

    protected abstract long R(Object obj);

    protected abstract short S(Object obj);

    protected abstract String T(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object U() {
        return AbstractC1246t.z0(this.f39603a);
    }

    protected abstract Object V(v6.f fVar, int i8);

    protected final Object W() {
        ArrayList arrayList = this.f39603a;
        Object remove = arrayList.remove(AbstractC1246t.o(arrayList));
        this.f39604b = true;
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void X(Object obj) {
        this.f39603a.add(obj);
    }

    @Override // w6.e
    public abstract Object e(InterfaceC3796a interfaceC3796a);

    @Override // w6.c
    public final float f(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return O(V(descriptor, i8));
    }

    @Override // w6.e
    public final boolean g() {
        return J(W());
    }

    @Override // w6.e
    public final char h() {
        return L(W());
    }

    @Override // w6.c
    public final char i(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return L(V(descriptor, i8));
    }

    @Override // w6.c
    public final boolean j(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return J(V(descriptor, i8));
    }

    @Override // w6.e
    public w6.e k(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
        return P(W(), descriptor);
    }

    @Override // w6.e
    public final int l(v6.f enumDescriptor) {
        AbstractC3159y.i(enumDescriptor, "enumDescriptor");
        return N(W(), enumDescriptor);
    }

    @Override // w6.c
    public final byte m(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return K(V(descriptor, i8));
    }

    @Override // w6.e
    public final int o() {
        return Q(W());
    }

    @Override // w6.c
    public final String q(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return T(V(descriptor, i8));
    }

    @Override // w6.c
    public final Object r(v6.f descriptor, int i8, InterfaceC3796a deserializer, Object obj) {
        AbstractC3159y.i(descriptor, "descriptor");
        AbstractC3159y.i(deserializer, "deserializer");
        return Y(V(descriptor, i8), new b(deserializer, obj));
    }

    @Override // w6.e
    public final Void s() {
        return null;
    }

    @Override // w6.e
    public final String t() {
        return T(W());
    }

    @Override // w6.c
    public final int u(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return Q(V(descriptor, i8));
    }

    @Override // w6.e
    public final long v() {
        return R(W());
    }

    @Override // w6.c
    public final long x(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return R(V(descriptor, i8));
    }

    @Override // w6.c
    public final Object y(v6.f descriptor, int i8, InterfaceC3796a deserializer, Object obj) {
        AbstractC3159y.i(descriptor, "descriptor");
        AbstractC3159y.i(deserializer, "deserializer");
        return Y(V(descriptor, i8), new a(deserializer, obj));
    }

    @Override // w6.c
    public boolean z() {
        return c.a.b(this);
    }
}
