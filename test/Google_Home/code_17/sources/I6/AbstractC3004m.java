package i6;

import P5.AbstractC1371l;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3004m extends AbstractC3003l {

    /* renamed from: i6.m$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC2998g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f33006a;

        public a(Iterator it) {
            this.f33006a = it;
        }

        @Override // i6.InterfaceC2998g
        public Iterator iterator() {
            return this.f33006a;
        }
    }

    /* renamed from: i6.m$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33007a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(Iterable it) {
            AbstractC3255y.i(it, "it");
            return it.iterator();
        }
    }

    /* renamed from: i6.m$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f33009a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function0 function0) {
            super(1);
            this.f33009a = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object it) {
            AbstractC3255y.i(it, "it");
            return this.f33009a.invoke();
        }
    }

    /* renamed from: i6.m$e */
    /* loaded from: classes5.dex */
    static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f33010a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj) {
            super(0);
            this.f33010a = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f33010a;
        }
    }

    public static InterfaceC2998g c(Iterator it) {
        AbstractC3255y.i(it, "<this>");
        return AbstractC3001j.d(new a(it));
    }

    public static InterfaceC2998g d(InterfaceC2998g interfaceC2998g) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        if (!(interfaceC2998g instanceof C2992a)) {
            return new C2992a(interfaceC2998g);
        }
        return interfaceC2998g;
    }

    public static InterfaceC2998g e() {
        return C2994c.f32982a;
    }

    private static final InterfaceC2998g f(InterfaceC2998g interfaceC2998g, Function1 function1) {
        if (interfaceC2998g instanceof C3009r) {
            return ((C3009r) interfaceC2998g).d(function1);
        }
        return new C2996e(interfaceC2998g, c.f33008a, function1);
    }

    public static InterfaceC2998g g(InterfaceC2998g interfaceC2998g) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        return f(interfaceC2998g, b.f33007a);
    }

    public static InterfaceC2998g h(Object obj, Function1 nextFunction) {
        AbstractC3255y.i(nextFunction, "nextFunction");
        if (obj == null) {
            return C2994c.f32982a;
        }
        return new C2997f(new e(obj), nextFunction);
    }

    public static InterfaceC2998g i(Function0 nextFunction) {
        AbstractC3255y.i(nextFunction, "nextFunction");
        return AbstractC3001j.d(new C2997f(nextFunction, new d(nextFunction)));
    }

    public static InterfaceC2998g j(Function0 seedFunction, Function1 nextFunction) {
        AbstractC3255y.i(seedFunction, "seedFunction");
        AbstractC3255y.i(nextFunction, "nextFunction");
        return new C2997f(seedFunction, nextFunction);
    }

    public static InterfaceC2998g k(Object... elements) {
        AbstractC3255y.i(elements, "elements");
        if (elements.length == 0) {
            return AbstractC3001j.e();
        }
        return AbstractC1371l.R(elements);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i6.m$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f33008a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
