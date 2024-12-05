package i7;

import H7.h;
import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* renamed from: i7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3011b extends BasicPermission {

    /* renamed from: a, reason: collision with root package name */
    private final String f33027a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33028b;

    public C3011b(String str, String str2) {
        super(str, str2);
        this.f33027a = str2;
        this.f33028b = a(str2);
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
        if (!(obj instanceof C3011b)) {
            return false;
        }
        C3011b c3011b = (C3011b) obj;
        if (this.f33028b == c3011b.f33028b && getName().equals(c3011b.getName())) {
            return true;
        }
        return false;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public String getActions() {
        return this.f33027a;
    }

    public int hashCode() {
        return getName().hashCode() + this.f33028b;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public boolean implies(Permission permission) {
        if (!(permission instanceof C3011b) || !getName().equals(permission.getName())) {
            return false;
        }
        int i8 = this.f33028b;
        int i9 = ((C3011b) permission).f33028b;
        if ((i8 & i9) != i9) {
            return false;
        }
        return true;
    }
}
