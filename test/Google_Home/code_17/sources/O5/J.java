package O5;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class J implements InterfaceC1355k, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private Function0 f8279a;

    /* renamed from: b, reason: collision with root package name */
    private Object f8280b;

    public J(Function0 initializer) {
        AbstractC3255y.i(initializer, "initializer");
        this.f8279a = initializer;
        this.f8280b = E.f8272a;
    }

    @Override // O5.InterfaceC1355k
    public Object getValue() {
        if (this.f8280b == E.f8272a) {
            Function0 function0 = this.f8279a;
            AbstractC3255y.f(function0);
            this.f8280b = function0.invoke();
            this.f8279a = null;
        }
        return this.f8280b;
    }

    @Override // O5.InterfaceC1355k
    public boolean isInitialized() {
        if (this.f8280b != E.f8272a) {
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
