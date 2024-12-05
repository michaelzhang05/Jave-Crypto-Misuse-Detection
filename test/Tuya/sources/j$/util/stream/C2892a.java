package j$.util.stream;

import j$.util.C2880g;
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
public final /* synthetic */ class C2892a implements Supplier, Consumer, BooleanSupplier, DoubleFunction, Function, LongFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32473a;

    /* renamed from: b, reason: collision with root package name */
    public Object f32474b;

    public /* synthetic */ C2892a(int i8) {
        this.f32473a = i8;
    }

    public /* synthetic */ C2892a(int i8, Object obj) {
        this.f32473a = i8;
        this.f32474b = obj;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f32473a) {
            case 2:
                ((InterfaceC2975q2) this.f32474b).accept((InterfaceC2975q2) obj);
                return;
            default:
                ((List) this.f32474b).add(obj);
                return;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f32473a) {
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
        Object apply = ((DoubleFunction) this.f32474b).apply(d8);
        if (apply == null) {
            return null;
        }
        if (apply instanceof G) {
            return F.w((G) apply);
        }
        if (apply instanceof DoubleStream) {
            return E.w((DoubleStream) apply);
        }
        C2880g.a("java.util.stream.DoubleStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j8) {
        Object apply = ((LongFunction) this.f32474b).apply(j8);
        if (apply == null) {
            return null;
        }
        if (apply instanceof InterfaceC2968p0) {
            return C2963o0.w((InterfaceC2968p0) apply);
        }
        if (apply instanceof LongStream) {
            return C2958n0.w((LongStream) apply);
        }
        C2880g.a("java.util.stream.LongStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object apply = ((Function) this.f32474b).apply(obj);
        if (apply == null) {
            return null;
        }
        if (apply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) apply);
        }
        if (apply instanceof java.util.stream.Stream) {
            return C2901b3.w((java.util.stream.Stream) apply);
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
        if (apply instanceof InterfaceC2968p0) {
            return C2963o0.w((InterfaceC2968p0) apply);
        }
        if (apply instanceof LongStream) {
            return C2958n0.w((LongStream) apply);
        }
        C2880g.a("java.util.stream.*Stream", apply.getClass());
        throw null;
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f32473a) {
            case 0:
                return ((AbstractC2897b) this.f32474b).I();
            case 1:
                Set set = Collectors.f32286a;
                return new j$.util.v0((CharSequence) this.f32474b);
            default:
                return (Spliterator) this.f32474b;
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.f32473a) {
            case 3:
                C2971p3 c2971p3 = (C2971p3) this.f32474b;
                return c2971p3.f32548d.tryAdvance(c2971p3.f32549e);
            case 4:
                C2980r3 c2980r3 = (C2980r3) this.f32474b;
                return c2980r3.f32548d.tryAdvance(c2980r3.f32549e);
            case 5:
                C2990t3 c2990t3 = (C2990t3) this.f32474b;
                return c2990t3.f32548d.tryAdvance(c2990t3.f32549e);
            default:
                I3 i32 = (I3) this.f32474b;
                return i32.f32548d.tryAdvance(i32.f32549e);
        }
    }
}
