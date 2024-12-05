package j$.util.stream;

import j$.util.C3030g;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3042a implements Supplier, Consumer, BooleanSupplier, DoubleFunction, Function, LongFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33667a;

    /* renamed from: b, reason: collision with root package name */
    public Object f33668b;

    public /* synthetic */ C3042a(int i8) {
        this.f33667a = i8;
    }

    public /* synthetic */ C3042a(int i8, Object obj) {
        this.f33667a = i8;
        this.f33668b = obj;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f33667a) {
            case 2:
                ((InterfaceC3125q2) this.f33668b).accept((InterfaceC3125q2) obj);
                return;
            default:
                ((List) this.f33668b).add(obj);
                return;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f33667a) {
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d8) {
        Object apply = ((DoubleFunction) this.f33668b).apply(d8);
        if (apply == null) {
            return null;
        }
        if (apply instanceof G) {
            return F.w((G) apply);
        }
        if (apply instanceof DoubleStream) {
            return E.w((DoubleStream) apply);
        }
        C3030g.a("java.util.stream.DoubleStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j8) {
        Object apply = ((LongFunction) this.f33668b).apply(j8);
        if (apply == null) {
            return null;
        }
        if (apply instanceof InterfaceC3118p0) {
            return C3113o0.w((InterfaceC3118p0) apply);
        }
        if (apply instanceof LongStream) {
            return C3108n0.w((LongStream) apply);
        }
        C3030g.a("java.util.stream.LongStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object apply = ((Function) this.f33668b).apply(obj);
        if (apply == null) {
            return null;
        }
        if (apply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) apply);
        }
        if (apply instanceof java.util.stream.Stream) {
            return C3051b3.w((java.util.stream.Stream) apply);
        }
        if (apply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) apply);
        }
        if (apply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) apply);
        }
        if (apply instanceof G) {
            return F.w((G) apply);
        }
        if (apply instanceof DoubleStream) {
            return E.w((DoubleStream) apply);
        }
        if (apply instanceof InterfaceC3118p0) {
            return C3113o0.w((InterfaceC3118p0) apply);
        }
        if (apply instanceof LongStream) {
            return C3108n0.w((LongStream) apply);
        }
        C3030g.a("java.util.stream.*Stream", apply.getClass());
        throw null;
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f33667a) {
            case 0:
                return ((AbstractC3047b) this.f33668b).I();
            case 1:
                Set set = Collectors.f33480a;
                return new j$.util.v0((CharSequence) this.f33668b);
            default:
                return (Spliterator) this.f33668b;
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.f33667a) {
            case 3:
                C3121p3 c3121p3 = (C3121p3) this.f33668b;
                return c3121p3.f33742d.tryAdvance(c3121p3.f33743e);
            case 4:
                C3130r3 c3130r3 = (C3130r3) this.f33668b;
                return c3130r3.f33742d.tryAdvance(c3130r3.f33743e);
            case 5:
                C3140t3 c3140t3 = (C3140t3) this.f33668b;
                return c3140t3.f33742d.tryAdvance(c3140t3.f33743e);
            default:
                I3 i32 = (I3) this.f33668b;
                return i32.f33742d.tryAdvance(i32.f33743e);
        }
    }
}
