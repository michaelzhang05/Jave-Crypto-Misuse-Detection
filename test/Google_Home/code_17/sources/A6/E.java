package A6;

import A6.C;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class E {

    /* loaded from: classes5.dex */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w6.b f505a;

        a(w6.b bVar) {
            this.f505a = bVar;
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // w6.InterfaceC4150a
        public Object b(z6.e decoder) {
            AbstractC3255y.i(decoder, "decoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // w6.i
        public void d(z6.f encoder, Object obj) {
            AbstractC3255y.i(encoder, "encoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // A6.C
        public w6.b[] e() {
            return new w6.b[]{this.f505a};
        }
    }

    public static final y6.f a(String name, w6.b primitiveSerializer) {
        AbstractC3255y.i(name, "name");
        AbstractC3255y.i(primitiveSerializer, "primitiveSerializer");
        return new D(name, new a(primitiveSerializer));
    }
}
