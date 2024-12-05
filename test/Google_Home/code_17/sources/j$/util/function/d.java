package j$.util.function;

import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f33403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f33404c;

    public /* synthetic */ d(Function function, Function function2, int i8) {
        this.f33402a = i8;
        this.f33403b = function;
        this.f33404c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f33402a) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f33402a) {
            case 0:
                return this.f33404c.apply(this.f33403b.apply(obj));
            default:
                return this.f33403b.apply(this.f33404c.apply(obj));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f33402a) {
            case 0:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
