package f7;

import E7.h;
import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* renamed from: f7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2693b extends BasicPermission {

    /* renamed from: a, reason: collision with root package name */
    private final String f31164a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31165b;

    public C2693b(String str, String str2) {
        super(str, str2);
        this.f31164a = str2;
        this.f31165b = a(str2);
    }

    private int a(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(h.e(str), " ,");
        int i8 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                i8 |= 1;
            } else if (nextToken.equals("ecimplicitlyca")) {
                i8 |= 2;
            } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                i8 |= 4;
            } else if (nextToken.equals("dhdefaultparams")) {
                i8 |= 8;
            } else if (nextToken.equals("acceptableeccurves")) {
                i8 |= 16;
            } else if (nextToken.equals("additionalecparameters")) {
                i8 |= 32;
            } else if (nextToken.equals("all")) {
                i8 = 63;
            }
        }
        if (i8 != 0) {
            return i8;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2693b)) {
            return false;
        }
        C2693b c2693b = (C2693b) obj;
        if (this.f31165b == c2693b.f31165b && getName().equals(c2693b.getName())) {
            return true;
        }
        return false;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public String getActions() {
        return this.f31164a;
    }

    public int hashCode() {
        return getName().hashCode() + this.f31165b;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public boolean implies(Permission permission) {
        if (!(permission instanceof C2693b) || !getName().equals(permission.getName())) {
            return false;
        }
        int i8 = this.f31165b;
        int i9 = ((C2693b) permission).f31165b;
        if ((i8 & i9) != i9) {
            return false;
        }
        return true;
    }
}
