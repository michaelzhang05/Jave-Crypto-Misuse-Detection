package w6;

import A6.AbstractC0978b;
import O5.I;
import O5.InterfaceC1355k;
import O5.o;
import P5.AbstractC1371l;
import P5.AbstractC1378t;
import h6.InterfaceC2963c;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.Y;
import x6.AbstractC4193a;
import y6.C4211a;
import y6.d;
import y6.j;

/* loaded from: classes5.dex */
public final class e extends AbstractC0978b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2963c f40380a;

    /* renamed from: b, reason: collision with root package name */
    private List f40381b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1355k f40382c;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: w6.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0919a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f40384a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0919a(e eVar) {
                super(1);
                this.f40384a = eVar;
            }

            public final void a(C4211a buildSerialDescriptor) {
                AbstractC3255y.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
                C4211a.b(buildSerialDescriptor, "type", AbstractC4193a.E(Y.f34167a).a(), null, false, 12, null);
                C4211a.b(buildSerialDescriptor, "value", y6.i.c("kotlinx.serialization.Polymorphic<" + this.f40384a.j().b() + '>', j.a.f41055a, new y6.f[0], null, 8, null), null, false, 12, null);
                buildSerialDescriptor.h(this.f40384a.f40381b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4211a) obj);
                return I.f8278a;
            }
        }

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y6.f invoke() {
            return y6.b.c(y6.i.b("kotlinx.serialization.Polymorphic", d.a.f41023a, new y6.f[0], new C0919a(e.this)), e.this.j());
        }
    }

    public e(InterfaceC2963c baseClass) {
        AbstractC3255y.i(baseClass, "baseClass");
        this.f40380a = baseClass;
        this.f40381b = AbstractC1378t.m();
        this.f40382c = O5.l.a(o.f8296b, new a());
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return (y6.f) this.f40382c.getValue();
    }

    @Override // A6.AbstractC0978b
    public InterfaceC2963c j() {
        return this.f40380a;
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + j() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC2963c baseClass, Annotation[] classAnnotations) {
        this(baseClass);
        AbstractC3255y.i(baseClass, "baseClass");
        AbstractC3255y.i(classAnnotations, "classAnnotations");
        this.f40381b = AbstractC1371l.c(classAnnotations);
    }
}
