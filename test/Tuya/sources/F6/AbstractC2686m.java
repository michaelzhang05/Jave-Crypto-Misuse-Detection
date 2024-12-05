package f6;

import M5.AbstractC1239l;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2686m extends AbstractC2685l {

    /* renamed from: f6.m$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC2680g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f31143a;

        public a(Iterator it) {
            this.f31143a = it;
        }

        @Override // f6.InterfaceC2680g
        public Iterator iterator() {
            return this.f31143a;
        }
    }

    /* renamed from: f6.m$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f31144a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(Iterable it) {
            AbstractC3159y.i(it, "it");
            return it.iterator();
        }
    }

    /* renamed from: f6.m$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f31146a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function0 function0) {
            super(1);
            this.f31146a = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object it) {
            AbstractC3159y.i(it, "it");
            return this.f31146a.invoke();
        }
    }

    /* renamed from: f6.m$e */
    /* loaded from: classes5.dex */
    static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f31147a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj) {
            super(0);
            this.f31147a = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f31147a;
        }
    }

    public static InterfaceC2680g c(Iterator it) {
        AbstractC3159y.i(it, "<this>");
        return AbstractC2683j.d(new a(it));
    }

    public static InterfaceC2680g d(InterfaceC2680g interfaceC2680g) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        if (!(interfaceC2680g instanceof C2674a)) {
            return new C2674a(interfaceC2680g);
        }
        return interfaceC2680g;
    }

    public static InterfaceC2680g e() {
        return C2676c.f31119a;
    }

    private static final InterfaceC2680g f(InterfaceC2680g interfaceC2680g, Function1 function1) {
        if (interfaceC2680g instanceof C2691r) {
            return ((C2691r) interfaceC2680g).d(function1);
        }
        return new C2678e(interfaceC2680g, c.f31145a, function1);
    }

    public static InterfaceC2680g g(InterfaceC2680g interfaceC2680g) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        return f(interfaceC2680g, b.f31144a);
    }

    public static InterfaceC2680g h(Object obj, Function1 nextFunction) {
        AbstractC3159y.i(nextFunction, "nextFunction");
        if (obj == null) {
            return C2676c.f31119a;
        }
        return new C2679f(new e(obj), nextFunction);
    }

    public static InterfaceC2680g i(Function0 nextFunction) {
        AbstractC3159y.i(nextFunction, "nextFunction");
        return AbstractC2683j.d(new C2679f(nextFunction, new d(nextFunction)));
    }

    public static InterfaceC2680g j(Function0 seedFunction, Function1 nextFunction) {
        AbstractC3159y.i(seedFunction, "seedFunction");
        AbstractC3159y.i(nextFunction, "nextFunction");
        return new C2679f(seedFunction, nextFunction);
    }

    public static InterfaceC2680g k(Object... elements) {
        AbstractC3159y.i(elements, "elements");
        if (elements.length == 0) {
            return AbstractC2683j.e();
        }
        return AbstractC1239l.R(elements);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f6.m$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f31145a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
