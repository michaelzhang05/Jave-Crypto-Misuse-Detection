package A6;

import O5.InterfaceC1355k;
import P5.AbstractC1371l;
import P5.AbstractC1378t;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import y6.C4211a;
import y6.k;

/* renamed from: A6.a0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0977a0 implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Object f539a;

    /* renamed from: b, reason: collision with root package name */
    private List f540b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1355k f541c;

    /* renamed from: A6.a0$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f542a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0977a0 f543b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: A6.a0$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0005a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0977a0 f544a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0005a(C0977a0 c0977a0) {
                super(1);
                this.f544a = c0977a0;
            }

            public final void a(C4211a buildSerialDescriptor) {
                AbstractC3255y.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.h(this.f544a.f540b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4211a) obj);
                return O5.I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, C0977a0 c0977a0) {
            super(0);
            this.f542a = str;
            this.f543b = c0977a0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y6.f invoke() {
            return y6.i.b(this.f542a, k.d.f41060a, new y6.f[0], new C0005a(this.f543b));
        }
    }

    public C0977a0(String serialName, Object objectInstance) {
        AbstractC3255y.i(serialName, "serialName");
        AbstractC3255y.i(objectInstance, "objectInstance");
        this.f539a = objectInstance;
        this.f540b = AbstractC1378t.m();
        this.f541c = O5.l.a(O5.o.f8296b, new a(serialName, this));
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return (y6.f) this.f541c.getValue();
    }

    @Override // w6.InterfaceC4150a
    public Object b(z6.e decoder) {
        int g8;
        AbstractC3255y.i(decoder, "decoder");
        y6.f a8 = a();
        z6.c d8 = decoder.d(a8);
        if (d8.w() || (g8 = d8.g(a())) == -1) {
            O5.I i8 = O5.I.f8278a;
            d8.b(a8);
            return this.f539a;
        }
        throw new w6.h("Unexpected index " + g8);
    }

    @Override // w6.i
    public void d(z6.f encoder, Object value) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(value, "value");
        encoder.d(a()).b(a());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0977a0(String serialName, Object objectInstance, Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        AbstractC3255y.i(serialName, "serialName");
        AbstractC3255y.i(objectInstance, "objectInstance");
        AbstractC3255y.i(classAnnotations, "classAnnotations");
        this.f540b = AbstractC1371l.c(classAnnotations);
    }
}
