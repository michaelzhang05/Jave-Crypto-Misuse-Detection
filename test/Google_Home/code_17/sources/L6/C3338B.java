package l6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: l6.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3338B {

    /* renamed from: a, reason: collision with root package name */
    public final Object f34524a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3368m f34525b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f34526c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f34527d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f34528e;

    public C3338B(Object obj, AbstractC3368m abstractC3368m, Function1 function1, Object obj2, Throwable th) {
        this.f34524a = obj;
        this.f34525b = abstractC3368m;
        this.f34526c = function1;
        this.f34527d = obj2;
        this.f34528e = th;
    }

    public static /* synthetic */ C3338B b(C3338B c3338b, Object obj, AbstractC3368m abstractC3368m, Function1 function1, Object obj2, Throwable th, int i8, Object obj3) {
        if ((i8 & 1) != 0) {
            obj = c3338b.f34524a;
        }
        if ((i8 & 2) != 0) {
            abstractC3368m = c3338b.f34525b;
        }
        AbstractC3368m abstractC3368m2 = abstractC3368m;
        if ((i8 & 4) != 0) {
            function1 = c3338b.f34526c;
        }
        Function1 function12 = function1;
        if ((i8 & 8) != 0) {
            obj2 = c3338b.f34527d;
        }
        Object obj4 = obj2;
        if ((i8 & 16) != 0) {
            th = c3338b.f34528e;
        }
        return c3338b.a(obj, abstractC3368m2, function12, obj4, th);
    }

    public final C3338B a(Object obj, AbstractC3368m abstractC3368m, Function1 function1, Object obj2, Throwable th) {
        return new C3338B(obj, abstractC3368m, function1, obj2, th);
    }

    public final boolean c() {
        if (this.f34528e != null) {
            return true;
        }
        return false;
    }

    public final void d(C3374p c3374p, Throwable th) {
        AbstractC3368m abstractC3368m = this.f34525b;
        if (abstractC3368m != null) {
            c3374p.n(abstractC3368m, th);
        }
        Function1 function1 = this.f34526c;
        if (function1 != null) {
            c3374p.o(function1, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3338B)) {
            return false;
        }
        C3338B c3338b = (C3338B) obj;
        if (AbstractC3255y.d(this.f34524a, c3338b.f34524a) && AbstractC3255y.d(this.f34525b, c3338b.f34525b) && AbstractC3255y.d(this.f34526c, c3338b.f34526c) && AbstractC3255y.d(this.f34527d, c3338b.f34527d) && AbstractC3255y.d(this.f34528e, c3338b.f34528e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Object obj = this.f34524a;
        int i8 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i9 = hashCode * 31;
        AbstractC3368m abstractC3368m = this.f34525b;
        if (abstractC3368m == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = abstractC3368m.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Function1 function1 = this.f34526c;
        if (function1 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = function1.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Object obj2 = this.f34527d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Throwable th = this.f34528e;
        if (th != null) {
            i8 = th.hashCode();
        }
        return i12 + i8;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f34524a + ", cancelHandler=" + this.f34525b + ", onCancellation=" + this.f34526c + ", idempotentResume=" + this.f34527d + ", cancelCause=" + this.f34528e + ')';
    }

    public /* synthetic */ C3338B(Object obj, AbstractC3368m abstractC3368m, Function1 function1, Object obj2, Throwable th, int i8, AbstractC3247p abstractC3247p) {
        this(obj, (i8 & 2) != 0 ? null : abstractC3368m, (i8 & 4) != 0 ? null : function1, (i8 & 8) != 0 ? null : obj2, (i8 & 16) != 0 ? null : th);
    }
}
