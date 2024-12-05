package l6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: l6.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3340D {

    /* renamed from: a, reason: collision with root package name */
    public final Object f34531a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f34532b;

    public C3340D(Object obj, Function1 function1) {
        this.f34531a = obj;
        this.f34532b = function1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3340D)) {
            return false;
        }
        C3340D c3340d = (C3340D) obj;
        if (AbstractC3255y.d(this.f34531a, c3340d.f34531a) && AbstractC3255y.d(this.f34532b, c3340d.f34532b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Object obj = this.f34531a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (hashCode * 31) + this.f34532b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f34531a + ", onCancellation=" + this.f34532b + ')';
    }
}
