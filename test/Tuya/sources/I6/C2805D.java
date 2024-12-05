package i6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: i6.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2805D {

    /* renamed from: a, reason: collision with root package name */
    public final Object f31679a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f31680b;

    public C2805D(Object obj, Function1 function1) {
        this.f31679a = obj;
        this.f31680b = function1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2805D)) {
            return false;
        }
        C2805D c2805d = (C2805D) obj;
        if (AbstractC3159y.d(this.f31679a, c2805d.f31679a) && AbstractC3159y.d(this.f31680b, c2805d.f31680b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Object obj = this.f31679a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (hashCode * 31) + this.f31680b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f31679a + ", onCancellation=" + this.f31680b + ')';
    }
}
