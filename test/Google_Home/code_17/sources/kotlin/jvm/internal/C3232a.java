package kotlin.jvm.internal;

import h6.InterfaceC2964d;
import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3232a implements InterfaceC3250t, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public C3232a(int i8, Object obj, Class cls, String str, String str2, int i9) {
        boolean z8;
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        if ((i9 & 1) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.isTopLevel = z8;
        this.arity = i8;
        this.flags = i9 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3232a)) {
            return false;
        }
        C3232a c3232a = (C3232a) obj;
        if (this.isTopLevel == c3232a.isTopLevel && this.arity == c3232a.arity && this.flags == c3232a.flags && AbstractC3255y.d(this.receiver, c3232a.receiver) && AbstractC3255y.d(this.owner, c3232a.owner) && this.name.equals(c3232a.name) && this.signature.equals(c3232a.signature)) {
            return true;
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC3250t
    public int getArity() {
        return this.arity;
    }

    public InterfaceC2964d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return U.c(cls);
        }
        return U.b(cls);
    }

    public int hashCode() {
        int i8;
        int i9;
        Object obj = this.receiver;
        int i10 = 0;
        if (obj != null) {
            i8 = obj.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = i8 * 31;
        Class cls = this.owner;
        if (cls != null) {
            i10 = cls.hashCode();
        }
        int hashCode = (((((i11 + i10) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31;
        if (this.isTopLevel) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return ((((hashCode + i9) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return U.i(this);
    }
}
