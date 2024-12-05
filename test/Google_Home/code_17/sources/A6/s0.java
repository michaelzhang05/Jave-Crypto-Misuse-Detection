package A6;

import P5.AbstractC1378t;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import w6.InterfaceC4150a;
import z6.c;

/* loaded from: classes5.dex */
public abstract class s0 implements z6.e, z6.c {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f598a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f599b;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4150a f601b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f602c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC4150a interfaceC4150a, Object obj) {
            super(0);
            this.f601b = interfaceC4150a;
            this.f602c = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            s0 s0Var = s0.this;
            InterfaceC4150a interfaceC4150a = this.f601b;
            Object obj = this.f602c;
            if (!interfaceC4150a.a().c() && !s0Var.v()) {
                return s0Var.r();
            }
            return s0Var.I(interfaceC4150a, obj);
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4150a f604b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f605c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC4150a interfaceC4150a, Object obj) {
            super(0);
            this.f604b = interfaceC4150a;
            this.f605c = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return s0.this.I(this.f604b, this.f605c);
        }
    }

    private final Object Y(Object obj, Function0 function0) {
        X(obj);
        Object invoke = function0.invoke();
        if (!this.f599b) {
            W();
        }
        this.f599b = false;
        return invoke;
    }

    @Override // z6.c
    public final double A(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return M(V(descriptor, i8));
    }

    @Override // z6.c
    public int B(y6.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // z6.e
    public final byte C() {
        return K(W());
    }

    @Override // z6.c
    public final z6.e D(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return P(V(descriptor, i8), descriptor.h(i8));
    }

    @Override // z6.e
    public final short E() {
        return S(W());
    }

    @Override // z6.e
    public final float F() {
        return O(W());
    }

    @Override // z6.c
    public final float G(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return O(V(descriptor, i8));
    }

    @Override // z6.e
    public final double H() {
        return M(W());
    }

    protected Object I(InterfaceC4150a deserializer, Object obj) {
        AbstractC3255y.i(deserializer, "deserializer");
        return s(deserializer);
    }

    protected abstract boolean J(Object obj);

    protected abstract byte K(Object obj);

    protected abstract char L(Object obj);

    protected abstract double M(Object obj);

    protected abstract int N(Object obj, y6.f fVar);

    protected abstract float O(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public z6.e P(Object obj, y6.f inlineDescriptor) {
        AbstractC3255y.i(inlineDescriptor, "inlineDescriptor");
        X(obj);
        return this;
    }

    protected abstract int Q(Object obj);

    protected abstract long R(Object obj);

    protected abstract short S(Object obj);

    protected abstract String T(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object U() {
        return AbstractC1378t.z0(this.f598a);
    }

    protected abstract Object V(y6.f fVar, int i8);

    protected final Object W() {
        ArrayList arrayList = this.f598a;
        Object remove = arrayList.remove(AbstractC1378t.o(arrayList));
        this.f599b = true;
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void X(Object obj) {
        this.f598a.add(obj);
    }

    @Override // z6.c
    public final String e(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return T(V(descriptor, i8));
    }

    @Override // z6.c
    public final boolean f(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return J(V(descriptor, i8));
    }

    @Override // z6.e
    public final boolean h() {
        return J(W());
    }

    @Override // z6.e
    public z6.e i(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
        return P(W(), descriptor);
    }

    @Override // z6.e
    public final char j() {
        return L(W());
    }

    @Override // z6.c
    public final byte k(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return K(V(descriptor, i8));
    }

    @Override // z6.c
    public final short l(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return S(V(descriptor, i8));
    }

    @Override // z6.c
    public final char m(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return L(V(descriptor, i8));
    }

    @Override // z6.e
    public final int o() {
        return Q(W());
    }

    @Override // z6.c
    public final int p(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return Q(V(descriptor, i8));
    }

    @Override // z6.c
    public final Object q(y6.f descriptor, int i8, InterfaceC4150a deserializer, Object obj) {
        AbstractC3255y.i(descriptor, "descriptor");
        AbstractC3255y.i(deserializer, "deserializer");
        return Y(V(descriptor, i8), new a(deserializer, obj));
    }

    @Override // z6.e
    public final Void r() {
        return null;
    }

    @Override // z6.e
    public abstract Object s(InterfaceC4150a interfaceC4150a);

    @Override // z6.e
    public final String t() {
        return T(W());
    }

    @Override // z6.e
    public final long u() {
        return R(W());
    }

    @Override // z6.c
    public boolean w() {
        return c.a.b(this);
    }

    @Override // z6.c
    public final Object x(y6.f descriptor, int i8, InterfaceC4150a deserializer, Object obj) {
        AbstractC3255y.i(descriptor, "descriptor");
        AbstractC3255y.i(deserializer, "deserializer");
        return Y(V(descriptor, i8), new b(deserializer, obj));
    }

    @Override // z6.c
    public final long y(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return R(V(descriptor, i8));
    }

    @Override // z6.e
    public final int z(y6.f enumDescriptor) {
        AbstractC3255y.i(enumDescriptor, "enumDescriptor");
        return N(W(), enumDescriptor);
    }
}
