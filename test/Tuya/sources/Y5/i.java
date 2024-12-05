package y5;

import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final a f39899c = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f39900a;

    /* renamed from: b, reason: collision with root package name */
    public k f39901b;

    /* loaded from: classes5.dex */
    public static final class a {
        public final i a(String hash) {
            k kVar;
            AbstractC3159y.i(hash, "hash");
            List s02 = g6.n.s0(hash, new String[]{"-"}, false, 0, 6, null);
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
            a aVar = i.f39899c;
            sb.append((Object) "f.i");
            sb.append(": TCModelError, hash: ");
            sb.append(hash);
            throw new A5.e(sb.toString());
        }
    }

    public i(int i8, k restrictionType) {
        AbstractC3159y.i(restrictionType, "restrictionType");
        this.f39900a = i8;
        this.f39901b = restrictionType;
    }

    public final String a() {
        if (this.f39900a > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f39900a);
            sb.append('-');
            sb.append(this.f39901b.f39910a);
            return sb.toString();
        }
        throw new A5.e(AbstractC3159y.q("f.i", ": TCModelError, cannot hash invalid PurposeRestriction"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f39900a == iVar.f39900a && this.f39901b == iVar.f39901b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f39901b.hashCode() + (this.f39900a * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("PurposeRestriction(purposeId=");
        a8.append(this.f39900a);
        a8.append(", restrictionType=");
        a8.append(this.f39901b);
        a8.append(')');
        return a8.toString();
    }
}
