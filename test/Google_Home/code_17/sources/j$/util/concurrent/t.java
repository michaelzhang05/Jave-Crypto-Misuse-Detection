package j$.util.concurrent;

import j$.util.function.Consumer$CC;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements BiConsumer, BiFunction, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33382b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33383c;

    public /* synthetic */ t(int i8, Object obj, Object obj2) {
        this.f33381a = i8;
        this.f33382b = obj;
        this.f33383c = obj2;
    }

    public /* synthetic */ t(BiFunction biFunction, Function function) {
        this.f33381a = 2;
        this.f33383c = biFunction;
        this.f33382b = function;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        ((Consumer) this.f33382b).accept(obj);
        ((Consumer) this.f33383c).accept(obj);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f33381a) {
            case 0:
                break;
            default:
                ((BiConsumer) this.f33382b).accept(obj, obj2);
                ((BiConsumer) this.f33383c).accept(obj, obj2);
                return;
        }
        do {
            Object apply = ((BiFunction) this.f33383c).apply(obj, obj2);
            ConcurrentMap concurrentMap = (ConcurrentMap) this.f33382b;
            if (concurrentMap.replace(obj, obj2, apply)) {
                return;
            } else {
                obj2 = concurrentMap.get(obj);
            }
        } while (obj2 != null);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f33381a) {
            case 0:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
            default:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
        }
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return j$.com.android.tools.r8.a.b(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.f33382b).apply(((BiFunction) this.f33383c).apply(obj, obj2));
    }
}
