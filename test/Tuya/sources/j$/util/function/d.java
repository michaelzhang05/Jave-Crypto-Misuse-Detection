package j$.util.function;

import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f32209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f32210c;

    public /* synthetic */ d(Function function, Function function2, int i8) {
        this.f32208a = i8;
        this.f32209b = function;
        this.f32210c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f32208a) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f32208a) {
            case 0:
                return this.f32210c.apply(this.f32209b.apply(obj));
            default:
                return this.f32209b.apply(this.f32210c.apply(obj));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f32208a) {
            case 0:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
