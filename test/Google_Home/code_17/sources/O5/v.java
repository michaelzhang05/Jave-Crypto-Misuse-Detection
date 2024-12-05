package O5;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class v implements InterfaceC1355k, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private Function0 f8310a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f8311b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f8312c;

    public v(Function0 initializer, Object obj) {
        AbstractC3255y.i(initializer, "initializer");
        this.f8310a = initializer;
        this.f8311b = E.f8272a;
        this.f8312c = obj == null ? this : obj;
    }

    @Override // O5.InterfaceC1355k
    public Object getValue() {
        Object obj;
        Object obj2 = this.f8311b;
        E e8 = E.f8272a;
        if (obj2 != e8) {
            return obj2;
        }
        synchronized (this.f8312c) {
            obj = this.f8311b;
            if (obj == e8) {
                Function0 function0 = this.f8310a;
                AbstractC3255y.f(function0);
                obj = function0.invoke();
                this.f8311b = obj;
                this.f8310a = null;
            }
        }
        return obj;
    }

    @Override // O5.InterfaceC1355k
    public boolean isInitialized() {
        if (this.f8311b != E.f8272a) {
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

    public /* synthetic */ v(Function0 function0, Object obj, int i8, AbstractC3247p abstractC3247p) {
        this(function0, (i8 & 2) != 0 ? null : obj);
    }
}
