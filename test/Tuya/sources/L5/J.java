package L5;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class J implements InterfaceC1227k, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private Function0 f6488a;

    /* renamed from: b, reason: collision with root package name */
    private Object f6489b;

    public J(Function0 initializer) {
        AbstractC3159y.i(initializer, "initializer");
        this.f6488a = initializer;
        this.f6489b = E.f6481a;
    }

    @Override // L5.InterfaceC1227k
    public Object getValue() {
        if (this.f6489b == E.f6481a) {
            Function0 function0 = this.f6488a;
            AbstractC3159y.f(function0);
            this.f6489b = function0.invoke();
            this.f6488a = null;
        }
        return this.f6489b;
    }

    @Override // L5.InterfaceC1227k
    public boolean isInitialized() {
        if (this.f6489b != E.f6481a) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
