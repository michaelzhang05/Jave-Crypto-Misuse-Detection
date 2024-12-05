package x6;

import kotlin.jvm.internal.AbstractC3159y;
import x6.C;

/* loaded from: classes5.dex */
public abstract class E {

    /* loaded from: classes5.dex */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t6.b f39510a;

        a(t6.b bVar) {
            this.f39510a = bVar;
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // t6.InterfaceC3796a
        public Object c(w6.e decoder) {
            AbstractC3159y.i(decoder, "decoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // x6.C
        public t6.b[] d() {
            return new t6.b[]{this.f39510a};
        }

        @Override // t6.i
        public void e(w6.f encoder, Object obj) {
            AbstractC3159y.i(encoder, "encoder");
            throw new IllegalStateException("unsupported".toString());
        }
    }

    public static final v6.f a(String name, t6.b primitiveSerializer) {
        AbstractC3159y.i(name, "name");
        AbstractC3159y.i(primitiveSerializer, "primitiveSerializer");
        return new D(name, new a(primitiveSerializer));
    }
}
