package t6;

import L5.I;
import L5.InterfaceC1227k;
import L5.o;
import M5.AbstractC1239l;
import M5.AbstractC1246t;
import e6.InterfaceC2643c;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.Y;
import u6.AbstractC3808a;
import v6.C3834a;
import v6.d;
import v6.j;
import x6.AbstractC3937b;

/* loaded from: classes5.dex */
public final class e extends AbstractC3937b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2643c f38253a;

    /* renamed from: b, reason: collision with root package name */
    private List f38254b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1227k f38255c;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: t6.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0885a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f38257a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0885a(e eVar) {
                super(1);
                this.f38257a = eVar;
            }

            public final void a(C3834a buildSerialDescriptor) {
                AbstractC3159y.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
                C3834a.b(buildSerialDescriptor, "type", AbstractC3808a.E(Y.f33766a).a(), null, false, 12, null);
                C3834a.b(buildSerialDescriptor, "value", v6.i.c("kotlinx.serialization.Polymorphic<" + this.f38257a.j().b() + '>', j.a.f38924a, new v6.f[0], null, 8, null), null, false, 12, null);
                buildSerialDescriptor.h(this.f38257a.f38254b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C3834a) obj);
                return I.f6487a;
            }
        }

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v6.f invoke() {
            return v6.b.c(v6.i.b("kotlinx.serialization.Polymorphic", d.a.f38892a, new v6.f[0], new C0885a(e.this)), e.this.j());
        }
    }

    public e(InterfaceC2643c baseClass) {
        AbstractC3159y.i(baseClass, "baseClass");
        this.f38253a = baseClass;
        this.f38254b = AbstractC1246t.m();
        this.f38255c = L5.l.a(o.f6505b, new a());
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return (v6.f) this.f38255c.getValue();
    }

    @Override // x6.AbstractC3937b
    public InterfaceC2643c j() {
        return this.f38253a;
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + j() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC2643c baseClass, Annotation[] classAnnotations) {
        this(baseClass);
        AbstractC3159y.i(baseClass, "baseClass");
        AbstractC3159y.i(classAnnotations, "classAnnotations");
        this.f38254b = AbstractC1239l.c(classAnnotations);
    }
}
