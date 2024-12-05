package B5;

import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final a f943c = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f944a;

    /* renamed from: b, reason: collision with root package name */
    public k f945b;

    /* loaded from: classes5.dex */
    public static final class a {
        public final i a(String hash) {
            k kVar;
            AbstractC3255y.i(hash, "hash");
            List s02 = j6.n.s0(hash, new String[]{"-"}, false, 0, 6, null);
            if (s02.size() == 2) {
                int parseInt = Integer.parseInt((String) s02.get(0));
                int parseInt2 = Integer.parseInt((String) s02.get(1));
                if (parseInt2 != 1) {
                    if (parseInt2 != 2) {
                        kVar = k.NOT_ALLOWED;
                    } else {
                        kVar = k.REQUIRE_LI;
                    }
                } else {
                    kVar = k.REQUIRE_CONSENT;
                }
                return new i(parseInt, kVar);
            }
            StringBuilder sb = new StringBuilder();
            a aVar = i.f943c;
            sb.append((Object) "f.i");
            sb.append(": TCModelError, hash: ");
            sb.append(hash);
            throw new D5.e(sb.toString());
        }
    }

    public i(int i8, k restrictionType) {
        AbstractC3255y.i(restrictionType, "restrictionType");
        this.f944a = i8;
        this.f945b = restrictionType;
    }

    public final String a() {
        if (this.f944a > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f944a);
            sb.append('-');
            sb.append(this.f945b.f954a);
            return sb.toString();
        }
        throw new D5.e(AbstractC3255y.q("f.i", ": TCModelError, cannot hash invalid PurposeRestriction"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f944a == iVar.f944a && this.f945b == iVar.f945b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f945b.hashCode() + (this.f944a * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("PurposeRestriction(purposeId=");
        a8.append(this.f944a);
        a8.append(", restrictionType=");
        a8.append(this.f945b);
        a8.append(')');
        return a8.toString();
    }
}
