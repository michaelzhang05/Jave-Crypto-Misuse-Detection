package B6;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Y;
import x6.AbstractC4193a;

/* loaded from: classes5.dex */
public final class w implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final w f1069a = new w();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f1070b = a.f1071b;

    /* loaded from: classes5.dex */
    private static final class a implements y6.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f1071b = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final String f1072c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ y6.f f1073a = AbstractC4193a.i(AbstractC4193a.E(Y.f34167a), k.f1048a).a();

        private a() {
        }

        @Override // y6.f
        public String a() {
            return f1072c;
        }

        @Override // y6.f
        public boolean c() {
            return this.f1073a.c();
        }

        @Override // y6.f
        public int d(String name) {
            AbstractC3255y.i(name, "name");
            return this.f1073a.d(name);
        }

        @Override // y6.f
        public int e() {
            return this.f1073a.e();
        }

        @Override // y6.f
        public String f(int i8) {
            return this.f1073a.f(i8);
        }

        @Override // y6.f
        public List g(int i8) {
            return this.f1073a.g(i8);
        }

        @Override // y6.f
        public List getAnnotations() {
            return this.f1073a.getAnnotations();
        }

        @Override // y6.f
        public y6.j getKind() {
            return this.f1073a.getKind();
        }

        @Override // y6.f
        public y6.f h(int i8) {
            return this.f1073a.h(i8);
        }

        @Override // y6.f
        public boolean i(int i8) {
            return this.f1073a.i(i8);
        }

        @Override // y6.f
        public boolean isInline() {
            return this.f1073a.isInline();
        }
    }

    private w() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f1070b;
    }

    @Override // w6.InterfaceC4150a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public v b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        l.g(decoder);
        return new v((Map) AbstractC4193a.i(AbstractC4193a.E(Y.f34167a), k.f1048a).b(decoder));
    }

    @Override // w6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(z6.f encoder, v value) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(value, "value");
        l.h(encoder);
        AbstractC4193a.i(AbstractC4193a.E(Y.f34167a), k.f1048a).d(encoder, value);
    }
}
