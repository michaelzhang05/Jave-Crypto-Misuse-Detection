package l1;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final String f34357a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34358b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34359c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34360d;

    public u(String processName, int i8, int i9, boolean z8) {
        AbstractC3255y.i(processName, "processName");
        this.f34357a = processName;
        this.f34358b = i8;
        this.f34359c = i9;
        this.f34360d = z8;
    }

    public final int a() {
        return this.f34359c;
    }

    public final int b() {
        return this.f34358b;
    }

    public final String c() {
        return this.f34357a;
    }

    public final boolean d() {
        return this.f34360d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (AbstractC3255y.d(this.f34357a, uVar.f34357a) && this.f34358b == uVar.f34358b && this.f34359c == uVar.f34359c && this.f34360d == uVar.f34360d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f34357a.hashCode() * 31) + this.f34358b) * 31) + this.f34359c) * 31;
        boolean z8 = this.f34360d;
        int i8 = z8;
        if (z8 != 0) {
            i8 = 1;
        }
        return hashCode + i8;
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f34357a + ", pid=" + this.f34358b + ", importance=" + this.f34359c + ", isDefaultProcess=" + this.f34360d + ')';
    }
}
