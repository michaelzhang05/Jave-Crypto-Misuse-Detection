package O2;

import kotlin.jvm.internal.AbstractC3255y;
import w2.AbstractC4144k;

/* loaded from: classes4.dex */
public final class a extends AbstractC4144k {

    /* renamed from: f, reason: collision with root package name */
    private final String f7842f;

    /* renamed from: g, reason: collision with root package name */
    private final R2.a f7843g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, R2.a accountStatus) {
        super(null, null, 0, null, null, 31, null);
        AbstractC3255y.i(accountStatus, "accountStatus");
        this.f7842f = str;
        this.f7843g = accountStatus;
    }

    @Override // w2.AbstractC4144k
    public String a() {
        return "alreadyLoggedIntoLinkError";
    }

    @Override // w2.AbstractC4144k
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3255y.d(this.f7842f, aVar.f7842f) && this.f7843g == aVar.f7843g) {
            return true;
        }
        return false;
    }

    @Override // w2.AbstractC4144k
    public int hashCode() {
        int hashCode;
        String str = this.f7842f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 31) + this.f7843g.hashCode();
    }

    @Override // w2.AbstractC4144k, java.lang.Throwable
    public String toString() {
        return "AlreadyLoggedInLinkException(email=" + this.f7842f + ", accountStatus=" + this.f7843g + ")";
    }
}
