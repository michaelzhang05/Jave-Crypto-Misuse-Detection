package B6;

import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import x6.AbstractC4193a;

/* loaded from: classes5.dex */
public final class c implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1011a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f1012b = a.f1013b;

    /* loaded from: classes5.dex */
    private static final class a implements y6.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f1013b = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final String f1014c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ y6.f f1015a = AbstractC4193a.g(k.f1048a).a();

        private a() {
        }

        @Override // y6.f
        public String a() {
            return f1014c;
        }

        @Override // y6.f
        public boolean c() {
            return this.f1015a.c();
        }

        @Override // y6.f
        public int d(String name) {
            AbstractC3255y.i(name, "name");
            return this.f1015a.d(name);
        }

        @Override // y6.f
        public int e() {
            return this.f1015a.e();
        }

        @Override // y6.f
        public String f(int i8) {
            return this.f1015a.f(i8);
        }

        @Override // y6.f
        public List g(int i8) {
            return this.f1015a.g(i8);
        }

        @Override // y6.f
        public List getAnnotations() {
            return this.f1015a.getAnnotations();
        }

        @Override // y6.f
        public y6.j getKind() {
            return this.f1015a.getKind();
        }

        @Override // y6.f
        public y6.f h(int i8) {
            return this.f1015a.h(i8);
        }

        @Override // y6.f
        public boolean i(int i8) {
            return this.f1015a.i(i8);
        }

        @Override // y6.f
        public boolean isInline() {
            return this.f1015a.isInline();
        }
    }

    private c() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f1012b;
    }

    @Override // w6.InterfaceC4150a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        l.b(decoder);
        return new b((List) AbstractC4193a.g(k.f1048a).b(decoder));
    }

    @Override // w6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(z6.f encoder, b value) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(value, "value");
        l.c(encoder);
        AbstractC4193a.g(k.f1048a).d(encoder, value);
    }
}
