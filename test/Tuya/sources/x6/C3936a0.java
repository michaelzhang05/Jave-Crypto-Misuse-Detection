package x6;

import L5.InterfaceC1227k;
import M5.AbstractC1239l;
import M5.AbstractC1246t;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import v6.C3834a;
import v6.k;

/* renamed from: x6.a0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3936a0 implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Object f39544a;

    /* renamed from: b, reason: collision with root package name */
    private List f39545b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1227k f39546c;

    /* renamed from: x6.a0$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f39547a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3936a0 f39548b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x6.a0$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0913a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3936a0 f39549a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0913a(C3936a0 c3936a0) {
                super(1);
                this.f39549a = c3936a0;
            }

            public final void a(C3834a buildSerialDescriptor) {
                AbstractC3159y.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.h(this.f39549a.f39545b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C3834a) obj);
                return L5.I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, C3936a0 c3936a0) {
            super(0);
            this.f39547a = str;
            this.f39548b = c3936a0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v6.f invoke() {
            return v6.i.b(this.f39547a, k.d.f38929a, new v6.f[0], new C0913a(this.f39548b));
        }
    }

    public C3936a0(String serialName, Object objectInstance) {
        AbstractC3159y.i(serialName, "serialName");
        AbstractC3159y.i(objectInstance, "objectInstance");
        this.f39544a = objectInstance;
        this.f39545b = AbstractC1246t.m();
        this.f39546c = L5.l.a(L5.o.f6505b, new a(serialName, this));
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return (v6.f) this.f39546c.getValue();
    }

    @Override // t6.InterfaceC3796a
    public Object c(w6.e decoder) {
        int p8;
        AbstractC3159y.i(decoder, "decoder");
        v6.f a8 = a();
        w6.c d8 = decoder.d(a8);
        if (d8.z() || (p8 = d8.p(a())) == -1) {
            L5.I i8 = L5.I.f6487a;
            d8.a(a8);
            return this.f39544a;
        }
        throw new t6.h("Unexpected index " + p8);
    }

    @Override // t6.i
    public void e(w6.f encoder, Object value) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(value, "value");
        encoder.d(a()).a(a());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3936a0(String serialName, Object objectInstance, Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        AbstractC3159y.i(serialName, "serialName");
        AbstractC3159y.i(objectInstance, "objectInstance");
        AbstractC3159y.i(classAnnotations, "classAnnotations");
        this.f39545b = AbstractC1239l.c(classAnnotations);
    }
}
